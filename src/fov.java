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

public class fov extends fop {
   final Supplier<gfk> f;

   fov(UUID $$0, Instant $$1, UUID $$2, Supplier<gfk> $$3) {
      super($$0, $$1, $$2);
      this.f = $$3;
   }

   public Supplier<gfk> a() {
      return this.f;
   }

   public fov c() {
      fov $$0 = new fov(this.a, this.b, this.c, this.f);
      $$0.d = this.d;
      $$0.e = this.e;
      return $$0;
   }

   @Override
   public fcz a(fcz $$0, fou $$1) {
      return new fhe($$0, $$1, this);
   }

   public static class a extends fop.a<fov> {
      public a(fov $$0, AbuseReportLimits $$1) {
         super($$0, $$1);
      }

      public a(UUID $$0, Supplier<gfk> $$1, AbuseReportLimits $$2) {
         super(new fov(UUID.randomUUID(), Instant.now(), $$0, $$1), $$2);
      }

      @Override
      public boolean b() {
         return StringUtils.isNotEmpty(this.g()) || this.h() != null;
      }

      @Nullable
      @Override
      public fop.b c() {
         if (this.a.e == null) {
            return fop.b.a;
         } else {
            return this.a.d.length() > this.b.maxOpinionCommentsLength() ? fop.b.d : null;
         }
      }

      @Override
      public Either<fop.c, fop.b> a(fou $$0) {
         fop.b $$1 = this.c();
         if ($$1 != null) {
            return Either.right($$1);
         } else {
            String $$2 = Objects.requireNonNull(this.a.e).a();
            ReportedEntity $$3 = new ReportedEntity(this.a.c);
            gfk $$4 = this.a.f.get();
            String $$5 = $$4.b();
            AbuseReport $$6 = AbuseReport.skin(this.a.d, $$2, $$5, $$3, this.a.b);
            return Either.left(new fop.c(this.a.a, fot.b, $$6));
         }
      }
   }
}
