import com.mojang.authlib.exceptions.MinecraftClientException;
import com.mojang.authlib.exceptions.MinecraftClientHttpException;
import com.mojang.authlib.minecraft.UserApiService;
import com.mojang.authlib.minecraft.report.AbuseReport;
import com.mojang.authlib.minecraft.report.AbuseReportLimits;
import com.mojang.authlib.yggdrasil.request.AbuseReportRequest;
import com.mojang.datafixers.util.Unit;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;

public interface ffm {
   static ffm a(ffq $$0, UserApiService $$1) {
      return new ffm.b($$0, $$1);
   }

   CompletableFuture<Unit> a(UUID var1, AbuseReport var2);

   boolean a();

   default AbuseReportLimits b() {
      return AbuseReportLimits.DEFAULTS;
   }

   public static class a extends tv {
      public a(sw $$0, Throwable $$1) {
         super($$0, $$1);
      }
   }

   public static record b(ffq a, UserApiService b) implements ffm {
      private static final sw c = sw.c("gui.abuseReport.send.service_unavailable");
      private static final sw d = sw.c("gui.abuseReport.send.http_error");
      private static final sw e = sw.c("gui.abuseReport.send.json_error");

      @Override
      public CompletableFuture<Unit> a(UUID $$0, AbuseReport $$1) {
         return CompletableFuture.supplyAsync(() -> {
            AbuseReportRequest $$2 = new AbuseReportRequest(1, $$0, $$1, this.a.b(), this.a.c(), this.a.d());

            try {
               this.b.reportAbuse($$2);
               return Unit.INSTANCE;
            } catch (MinecraftClientHttpException var6) {
               sw $$4 = this.a(var6);
               throw new CompletionException(new ffm.a($$4, var6));
            } catch (MinecraftClientException var7) {
               sw $$6 = this.a(var7);
               throw new CompletionException(new ffm.a($$6, var7));
            }
         }, ac.g());
      }

      @Override
      public boolean a() {
         return this.b.canSendReports();
      }

      private sw a(MinecraftClientHttpException $$0) {
         return sw.a("gui.abuseReport.send.error_message", $$0.getMessage());
      }

      private sw a(MinecraftClientException $$0) {
         return switch ($$0.getType()) {
            case SERVICE_UNAVAILABLE -> c;
            case HTTP_ERROR -> d;
            case JSON_ERROR -> e;
            default -> throw new IncompatibleClassChangeError();
         };
      }

      @Override
      public AbuseReportLimits b() {
         return this.b.getAbuseReportLimits();
      }

      public ffq c() {
         return this.a;
      }

      public UserApiService d() {
         return this.b;
      }
   }
}
