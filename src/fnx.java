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

public class fnx extends fns {
   final Supplier<geo> f;

   fnx(UUID $$0, Instant $$1, UUID $$2, Supplier<geo> $$3) {
      super($$0, $$1, $$2);
      this.f = $$3;
   }

   public Supplier<geo> a() {
      return this.f;
   }

   public fnx c() {
      fnx $$0 = new fnx(this.a, this.b, this.c, this.f);
      $$0.d = this.d;
      $$0.e = this.e;
      return $$0;
   }

   @Override
   public fcc a(fcc $$0, fnw $$1) {
      return new fgh($$0, $$1, this);
   }

   public static class a extends fns.a<fnx> {
      public a(fnx $$0, AbuseReportLimits $$1) {
         super($$0, $$1);
      }

      public a(UUID $$0, Supplier<geo> $$1, AbuseReportLimits $$2) {
         super(new fnx(UUID.randomUUID(), Instant.now(), $$0, $$1), $$2);
      }

      @Override
      public boolean b() {
         return StringUtils.isNotEmpty(this.g()) || this.h() != null;
      }

      @Nullable
      @Override
      public fns.b c() {
         if (this.a.e == null) {
            return fns.b.a;
         } else {
            return this.a.d.length() > this.b.maxOpinionCommentsLength() ? fns.b.d : null;
         }
      }

      @Override
      public Either<fns.c, fns.b> a(fnw $$0) {
         fns.b $$1 = this.c();
         if ($$1 != null) {
            return Either.right($$1);
         } else {
            String $$2 = Objects.requireNonNull(this.a.e).a();
            ReportedEntity $$3 = new ReportedEntity(this.a.c);
            geo $$4 = this.a.f.get();
            String $$5 = $$4.b();
            AbuseReport $$6 = AbuseReport.skin(this.a.d, $$2, $$5, $$3, this.a.b);
            return Either.left(new fns.c(this.a.a, fnv.b, $$6));
         }
      }
   }
}
