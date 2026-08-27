import com.mojang.authlib.minecraft.report.AbuseReport;
import com.mojang.authlib.minecraft.report.AbuseReportLimits;
import com.mojang.authlib.minecraft.report.ReportedEntity;
import com.mojang.datafixers.util.Either;
import java.time.Instant;
import java.util.UUID;
import javax.annotation.Nullable;
import org.apache.commons.lang3.StringUtils;

public class fmm extends fmn {
   private final String f;

   fmm(UUID $$0, Instant $$1, UUID $$2, String $$3) {
      super($$0, $$1, $$2);
      this.f = $$3;
   }

   public String a() {
      return this.f;
   }

   public fmm c() {
      fmm $$0 = new fmm(this.a, this.b, this.c, this.f);
      $$0.d = this.d;
      return $$0;
   }

   @Override
   public faz a(faz $$0, fmr $$1) {
      return new ffb($$0, $$1, this);
   }

   public static class a extends fmn.a<fmm> {
      public a(fmm $$0, AbuseReportLimits $$1) {
         super($$0, $$1);
      }

      public a(UUID $$0, String $$1, AbuseReportLimits $$2) {
         super(new fmm(UUID.randomUUID(), Instant.now(), $$0, $$1), $$2);
      }

      @Override
      public boolean b() {
         return StringUtils.isNotEmpty(this.g());
      }

      @Nullable
      @Override
      public fmn.b c() {
         return this.a.d.length() > this.b.maxOpinionCommentsLength() ? fmn.b.d : null;
      }

      @Override
      public Either<fmn.c, fmn.b> a(fmr $$0) {
         fmn.b $$1 = this.c();
         if ($$1 != null) {
            return Either.right($$1);
         } else {
            ReportedEntity $$2 = new ReportedEntity(this.a.c);
            AbuseReport $$3 = AbuseReport.name(this.a.d, $$2, this.a.b);
            return Either.left(new fmn.c(this.a.a, fmq.c, $$3));
         }
      }
   }
}
