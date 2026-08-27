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

public class frc extends fqx {
   final Supplier<ght> f;

   frc(UUID $$0, Instant $$1, UUID $$2, Supplier<ght> $$3) {
      super($$0, $$1, $$2);
      this.f = $$3;
   }

   public Supplier<ght> a() {
      return this.f;
   }

   public frc c() {
      frc $$0 = new frc(this.a, this.b, this.c, this.f);
      $$0.d = this.d;
      $$0.e = this.e;
      return $$0;
   }

   @Override
   public ffe a(ffe $$0, frb $$1) {
      return new fjj($$0, $$1, this);
   }

   public static class a extends fqx.a<frc> {
      public a(frc $$0, AbuseReportLimits $$1) {
         super($$0, $$1);
      }

      public a(UUID $$0, Supplier<ght> $$1, AbuseReportLimits $$2) {
         super(new frc(UUID.randomUUID(), Instant.now(), $$0, $$1), $$2);
      }

      @Override
      public boolean b() {
         return StringUtils.isNotEmpty(this.g()) || this.h() != null;
      }

      @Nullable
      @Override
      public fqx.b c() {
         if (this.a.e == null) {
            return fqx.b.a;
         } else {
            return this.a.d.length() > this.b.maxOpinionCommentsLength() ? fqx.b.d : null;
         }
      }

      @Override
      public Either<fqx.c, fqx.b> a(frb $$0) {
         fqx.b $$1 = this.c();
         if ($$1 != null) {
            return Either.right($$1);
         } else {
            String $$2 = Objects.requireNonNull(this.a.e).a();
            ReportedEntity $$3 = new ReportedEntity(this.a.c);
            ght $$4 = this.a.f.get();
            String $$5 = $$4.b();
            AbuseReport $$6 = AbuseReport.skin(this.a.d, $$2, $$5, $$3, this.a.b);
            return Either.left(new fqx.c(this.a.a, fra.b, $$6));
         }
      }
   }
}
