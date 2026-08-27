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

public class fma extends flv {
   final Supplier<gch> f;

   fma(UUID $$0, Instant $$1, UUID $$2, Supplier<gch> $$3) {
      super($$0, $$1, $$2);
      this.f = $$3;
   }

   public Supplier<gch> a() {
      return this.f;
   }

   public fma c() {
      fma $$0 = new fma(this.a, this.b, this.c, this.f);
      $$0.d = this.d;
      $$0.e = this.e;
      return $$0;
   }

   @Override
   public fah a(fah $$0, flz $$1) {
      return new fem($$0, $$1, this);
   }

   public static class a extends flv.a<fma> {
      public a(fma $$0, AbuseReportLimits $$1) {
         super($$0, $$1);
      }

      public a(UUID $$0, Supplier<gch> $$1, AbuseReportLimits $$2) {
         super(new fma(UUID.randomUUID(), Instant.now(), $$0, $$1), $$2);
      }

      @Override
      public boolean b() {
         return StringUtils.isNotEmpty(this.g()) || this.h() != null;
      }

      @Nullable
      @Override
      public flv.b c() {
         if (this.a.e == null) {
            return flv.b.a;
         } else {
            return this.a.d.length() > this.b.maxOpinionCommentsLength() ? flv.b.d : null;
         }
      }

      @Override
      public Either<flv.c, flv.b> a(flz $$0) {
         flv.b $$1 = this.c();
         if ($$1 != null) {
            return Either.right($$1);
         } else {
            String $$2 = Objects.requireNonNull(this.a.e).a();
            ReportedEntity $$3 = new ReportedEntity(this.a.c);
            gch $$4 = this.a.f.get();
            String $$5 = $$4.b();
            AbuseReport $$6 = AbuseReport.skin(this.a.d, $$2, $$5, $$3, this.a.b);
            return Either.left(new flv.c(this.a.a, fly.b, $$6));
         }
      }
   }
}
