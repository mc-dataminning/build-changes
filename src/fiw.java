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

public interface fiw {
   static fiw a(fja $$0, UserApiService $$1) {
      return new fiw.b($$0, $$1);
   }

   CompletableFuture<Unit> a(UUID var1, AbuseReport var2);

   boolean a();

   default AbuseReportLimits b() {
      return AbuseReportLimits.DEFAULTS;
   }

   public static class a extends ud {
      public a(te $$0, Throwable $$1) {
         super($$0, $$1);
      }
   }

   public static record b(fja a, UserApiService b) implements fiw {
      private static final te c = te.c("gui.abuseReport.send.service_unavailable");
      private static final te d = te.c("gui.abuseReport.send.http_error");
      private static final te e = te.c("gui.abuseReport.send.json_error");

      @Override
      public CompletableFuture<Unit> a(UUID $$0, AbuseReport $$1) {
         return CompletableFuture.supplyAsync(() -> {
            AbuseReportRequest $$2 = new AbuseReportRequest(1, $$0, $$1, this.a.b(), this.a.c(), this.a.d());

            try {
               this.b.reportAbuse($$2);
               return Unit.INSTANCE;
            } catch (MinecraftClientHttpException var6) {
               te $$4 = this.a(var6);
               throw new CompletionException(new fiw.a($$4, var6));
            } catch (MinecraftClientException var7) {
               te $$6 = this.a(var7);
               throw new CompletionException(new fiw.a($$6, var7));
            }
         }, ac.g());
      }

      @Override
      public boolean a() {
         return this.b.canSendReports();
      }

      private te a(MinecraftClientHttpException $$0) {
         return te.a("gui.abuseReport.send.error_message", $$0.getMessage());
      }

      private te a(MinecraftClientException $$0) {
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

      public fja c() {
         return this.a;
      }

      public UserApiService d() {
         return this.b;
      }
   }
}
