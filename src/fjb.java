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

public interface fjb {
   static fjb a(fjf $$0, UserApiService $$1) {
      return new fjb.b($$0, $$1);
   }

   CompletableFuture<Unit> a(UUID var1, AbuseReport var2);

   boolean a();

   default AbuseReportLimits b() {
      return AbuseReportLimits.DEFAULTS;
   }

   public static class a extends ue {
      public a(tf $$0, Throwable $$1) {
         super($$0, $$1);
      }
   }

   public static record b(fjf a, UserApiService b) implements fjb {
      private static final tf c = tf.c("gui.abuseReport.send.service_unavailable");
      private static final tf d = tf.c("gui.abuseReport.send.http_error");
      private static final tf e = tf.c("gui.abuseReport.send.json_error");

      @Override
      public CompletableFuture<Unit> a(UUID $$0, AbuseReport $$1) {
         return CompletableFuture.supplyAsync(() -> {
            AbuseReportRequest $$2 = new AbuseReportRequest(1, $$0, $$1, this.a.b(), this.a.c(), this.a.d());

            try {
               this.b.reportAbuse($$2);
               return Unit.INSTANCE;
            } catch (MinecraftClientHttpException var6) {
               tf $$4 = this.a(var6);
               throw new CompletionException(new fjb.a($$4, var6));
            } catch (MinecraftClientException var7) {
               tf $$6 = this.a(var7);
               throw new CompletionException(new fjb.a($$6, var7));
            }
         }, ac.g());
      }

      @Override
      public boolean a() {
         return this.b.canSendReports();
      }

      private tf a(MinecraftClientHttpException $$0) {
         return tf.a("gui.abuseReport.send.error_message", $$0.getMessage());
      }

      private tf a(MinecraftClientException $$0) {
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

      public fjf c() {
         return this.a;
      }

      public UserApiService d() {
         return this.b;
      }
   }
}
