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

public class fjq extends fjl {
   final Supplier<fzu> f;

   fjq(UUID $$0, Instant $$1, UUID $$2, Supplier<fzu> $$3) {
      super($$0, $$1, $$2);
      this.f = $$3;
   }

   public Supplier<fzu> a() {
      return this.f;
   }

   public fjq c() {
      fjq $$0 = new fjq(this.a, this.b, this.c, this.f);
      $$0.d = this.d;
      $$0.e = this.e;
      return $$0;
   }

   @Override
   public eya a(eya $$0, fjp $$1) {
      return new fcd($$0, $$1, this);
   }

   public static class a extends fjl.a<fjq> {
      public a(fjq $$0, AbuseReportLimits $$1) {
         super($$0, $$1);
      }

      public a(UUID $$0, Supplier<fzu> $$1, AbuseReportLimits $$2) {
         super(new fjq(UUID.randomUUID(), Instant.now(), $$0, $$1), $$2);
      }

      @Override
      public boolean b() {
         return StringUtils.isNotEmpty(this.g()) || this.h() != null;
      }

      @Nullable
      @Override
      public fjl.b c() {
         if (this.a.e == null) {
            return fjl.b.a;
         } else {
            return this.a.d.length() > this.b.maxOpinionCommentsLength() ? fjl.b.d : null;
         }
      }

      @Override
      public Either<fjl.c, fjl.b> a(fjp $$0) {
         fjl.b $$1 = this.c();
         if ($$1 != null) {
            return Either.right($$1);
         } else {
            String $$2 = Objects.requireNonNull(this.a.e).a();
            ReportedEntity $$3 = new ReportedEntity(this.a.c);
            fzu $$4 = this.a.f.get();
            String $$5 = $$4.b();
            AbuseReport $$6 = AbuseReport.skin(this.a.d, $$2, $$5, $$3, this.a.b);
            return Either.left(new fjl.c(this.a.a, fjo.b, $$6));
         }
      }
   }
}
