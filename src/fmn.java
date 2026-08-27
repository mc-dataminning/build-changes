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

public class fmn extends fmi {
   final Supplier<gcu> f;

   fmn(UUID $$0, Instant $$1, UUID $$2, Supplier<gcu> $$3) {
      super($$0, $$1, $$2);
      this.f = $$3;
   }

   public Supplier<gcu> a() {
      return this.f;
   }

   public fmn c() {
      fmn $$0 = new fmn(this.a, this.b, this.c, this.f);
      $$0.d = this.d;
      $$0.e = this.e;
      return $$0;
   }

   @Override
   public fau a(fau $$0, fmm $$1) {
      return new fez($$0, $$1, this);
   }

   public static class a extends fmi.a<fmn> {
      public a(fmn $$0, AbuseReportLimits $$1) {
         super($$0, $$1);
      }

      public a(UUID $$0, Supplier<gcu> $$1, AbuseReportLimits $$2) {
         super(new fmn(UUID.randomUUID(), Instant.now(), $$0, $$1), $$2);
      }

      @Override
      public boolean b() {
         return StringUtils.isNotEmpty(this.g()) || this.h() != null;
      }

      @Nullable
      @Override
      public fmi.b c() {
         if (this.a.e == null) {
            return fmi.b.a;
         } else {
            return this.a.d.length() > this.b.maxOpinionCommentsLength() ? fmi.b.d : null;
         }
      }

      @Override
      public Either<fmi.c, fmi.b> a(fmm $$0) {
         fmi.b $$1 = this.c();
         if ($$1 != null) {
            return Either.right($$1);
         } else {
            String $$2 = Objects.requireNonNull(this.a.e).a();
            ReportedEntity $$3 = new ReportedEntity(this.a.c);
            gcu $$4 = this.a.f.get();
            String $$5 = $$4.b();
            AbuseReport $$6 = AbuseReport.skin(this.a.d, $$2, $$5, $$3, this.a.b);
            return Either.left(new fmi.c(this.a.a, fml.b, $$6));
         }
      }
   }
}
