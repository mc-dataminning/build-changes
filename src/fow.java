import com.mojang.authlib.minecraft.report.AbuseReport;
import com.mojang.authlib.minecraft.report.AbuseReportLimits;
import com.mojang.authlib.minecraft.report.ReportedEntity;
import com.mojang.datafixers.util.Either;
import java.time.Instant;
import java.util.Objects;
import java.util.UUID;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.apache.commons.lang3.StringUtils;

public class fow extends foq {
   final Supplier<gfl> f;

   fow(UUID $$0, Instant $$1, UUID $$2, Supplier<gfl> $$3) {
      super($$0, $$1, $$2);
      this.f = $$3;
   }

   public Supplier<gfl> a() {
      return this.f;
   }

   public fow c() {
      fow $$0 = new fow(this.a, this.b, this.c, this.f);
      $$0.d = this.d;
      $$0.e = this.e;
      return $$0;
   }

   @Override
   public fda a(fda $$0, fov $$1) {
      return new fhf($$0, $$1, this);
   }

   public static class a extends foq.a<fow> {
      public a(fow $$0, AbuseReportLimits $$1) {
         super($$0, $$1);
      }

      public a(UUID $$0, Supplier<gfl> $$1, AbuseReportLimits $$2) {
         super(new fow(UUID.randomUUID(), Instant.now(), $$0, $$1), $$2);
      }

      @Override
      public boolean b() {
         return StringUtils.isNotEmpty(this.g()) || this.h() != null;
      }

      @Nullable
      @Override
      public foq.b c() {
         if (this.a.e == null) {
            return foq.b.a;
         } else {
            return this.a.d.length() > this.b.maxOpinionCommentsLength() ? foq.b.d : null;
         }
      }

      @Override
      public Either<foq.c, foq.b> a(fov $$0) {
         foq.b $$1 = this.c();
         if ($$1 != null) {
            return Either.right($$1);
         } else {
            String $$2 = Objects.requireNonNull(this.a.e).a();
            ReportedEntity $$3 = new ReportedEntity(this.a.c);
            gfl $$4 = this.a.f.get();
            String $$5 = $$4.b();
            AbuseReport $$6 = AbuseReport.skin(this.a.d, $$2, $$5, $$3, this.a.b);
            return Either.left(new foq.c(this.a.a, fou.b, $$6));
         }
      }
   }
}
