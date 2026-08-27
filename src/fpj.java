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

public class fpj extends fpe {
   final Supplier<gga> f;

   fpj(UUID $$0, Instant $$1, UUID $$2, Supplier<gga> $$3) {
      super($$0, $$1, $$2);
      this.f = $$3;
   }

   public Supplier<gga> a() {
      return this.f;
   }

   public fpj c() {
      fpj $$0 = new fpj(this.a, this.b, this.c, this.f);
      $$0.d = this.d;
      $$0.e = this.e;
      return $$0;
   }

   @Override
   public fdm a(fdm $$0, fpi $$1) {
      return new fhr($$0, $$1, this);
   }

   public static class a extends fpe.a<fpj> {
      public a(fpj $$0, AbuseReportLimits $$1) {
         super($$0, $$1);
      }

      public a(UUID $$0, Supplier<gga> $$1, AbuseReportLimits $$2) {
         super(new fpj(UUID.randomUUID(), Instant.now(), $$0, $$1), $$2);
      }

      @Override
      public boolean b() {
         return StringUtils.isNotEmpty(this.g()) || this.h() != null;
      }

      @Nullable
      @Override
      public fpe.b c() {
         if (this.a.e == null) {
            return fpe.b.a;
         } else {
            return this.a.d.length() > this.b.maxOpinionCommentsLength() ? fpe.b.d : null;
         }
      }

      @Override
      public Either<fpe.c, fpe.b> a(fpi $$0) {
         fpe.b $$1 = this.c();
         if ($$1 != null) {
            return Either.right($$1);
         } else {
            String $$2 = Objects.requireNonNull(this.a.e).a();
            ReportedEntity $$3 = new ReportedEntity(this.a.c);
            gga $$4 = this.a.f.get();
            String $$5 = $$4.b();
            AbuseReport $$6 = AbuseReport.skin(this.a.d, $$2, $$5, $$3, this.a.b);
            return Either.left(new fpe.c(this.a.a, fph.b, $$6));
         }
      }
   }
}
