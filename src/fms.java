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

public class fms extends fmn {
   final Supplier<gcz> f;

   fms(UUID $$0, Instant $$1, UUID $$2, Supplier<gcz> $$3) {
      super($$0, $$1, $$2);
      this.f = $$3;
   }

   public Supplier<gcz> a() {
      return this.f;
   }

   public fms c() {
      fms $$0 = new fms(this.a, this.b, this.c, this.f);
      $$0.d = this.d;
      $$0.e = this.e;
      return $$0;
   }

   @Override
   public faz a(faz $$0, fmr $$1) {
      return new ffe($$0, $$1, this);
   }

   public static class a extends fmn.a<fms> {
      public a(fms $$0, AbuseReportLimits $$1) {
         super($$0, $$1);
      }

      public a(UUID $$0, Supplier<gcz> $$1, AbuseReportLimits $$2) {
         super(new fms(UUID.randomUUID(), Instant.now(), $$0, $$1), $$2);
      }

      @Override
      public boolean b() {
         return StringUtils.isNotEmpty(this.g()) || this.h() != null;
      }

      @Nullable
      @Override
      public fmn.b c() {
         if (this.a.e == null) {
            return fmn.b.a;
         } else {
            return this.a.d.length() > this.b.maxOpinionCommentsLength() ? fmn.b.d : null;
         }
      }

      @Override
      public Either<fmn.c, fmn.b> a(fmr $$0) {
         fmn.b $$1 = this.c();
         if ($$1 != null) {
            return Either.right($$1);
         } else {
            String $$2 = Objects.requireNonNull(this.a.e).a();
            ReportedEntity $$3 = new ReportedEntity(this.a.c);
            gcz $$4 = this.a.f.get();
            String $$5 = $$4.b();
            AbuseReport $$6 = AbuseReport.skin(this.a.d, $$2, $$5, $$3, this.a.b);
            return Either.left(new fmn.c(this.a.a, fmq.b, $$6));
         }
      }
   }
}
