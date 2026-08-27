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

public class fsh extends fsc {
   final Supplier<giy> f;

   fsh(UUID $$0, Instant $$1, UUID $$2, Supplier<giy> $$3) {
      super($$0, $$1, $$2);
      this.f = $$3;
   }

   public Supplier<giy> a() {
      return this.f;
   }

   public fsh c() {
      fsh $$0 = new fsh(this.a, this.b, this.c, this.f);
      $$0.d = this.d;
      $$0.e = this.e;
      return $$0;
   }

   @Override
   public fgh a(fgh $$0, fsg $$1) {
      return new fkm($$0, $$1, this);
   }

   public static class a extends fsc.a<fsh> {
      public a(fsh $$0, AbuseReportLimits $$1) {
         super($$0, $$1);
      }

      public a(UUID $$0, Supplier<giy> $$1, AbuseReportLimits $$2) {
         super(new fsh(UUID.randomUUID(), Instant.now(), $$0, $$1), $$2);
      }

      @Override
      public boolean b() {
         return StringUtils.isNotEmpty(this.g()) || this.h() != null;
      }

      @Nullable
      @Override
      public fsc.b c() {
         if (this.a.e == null) {
            return fsc.b.a;
         } else {
            return this.a.d.length() > this.b.maxOpinionCommentsLength() ? fsc.b.d : null;
         }
      }

      @Override
      public Either<fsc.c, fsc.b> a(fsg $$0) {
         fsc.b $$1 = this.c();
         if ($$1 != null) {
            return Either.right($$1);
         } else {
            String $$2 = Objects.requireNonNull(this.a.e).a();
            ReportedEntity $$3 = new ReportedEntity(this.a.c);
            giy $$4 = this.a.f.get();
            String $$5 = $$4.b();
            AbuseReport $$6 = AbuseReport.skin(this.a.d, $$2, $$5, $$3, this.a.b);
            return Either.left(new fsc.c(this.a.a, fsf.b, $$6));
         }
      }
   }
}
