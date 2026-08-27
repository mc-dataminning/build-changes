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

public class fka extends fjv {
   final Supplier<gae> f;

   fka(UUID $$0, Instant $$1, UUID $$2, Supplier<gae> $$3) {
      super($$0, $$1, $$2);
      this.f = $$3;
   }

   public Supplier<gae> a() {
      return this.f;
   }

   public fka c() {
      fka $$0 = new fka(this.a, this.b, this.c, this.f);
      $$0.d = this.d;
      $$0.e = this.e;
      return $$0;
   }

   @Override
   public eyk a(eyk $$0, fjz $$1) {
      return new fcn($$0, $$1, this);
   }

   public static class a extends fjv.a<fka> {
      public a(fka $$0, AbuseReportLimits $$1) {
         super($$0, $$1);
      }

      public a(UUID $$0, Supplier<gae> $$1, AbuseReportLimits $$2) {
         super(new fka(UUID.randomUUID(), Instant.now(), $$0, $$1), $$2);
      }

      @Override
      public boolean b() {
         return StringUtils.isNotEmpty(this.g()) || this.h() != null;
      }

      @Nullable
      @Override
      public fjv.b c() {
         if (this.a.e == null) {
            return fjv.b.a;
         } else {
            return this.a.d.length() > this.b.maxOpinionCommentsLength() ? fjv.b.d : null;
         }
      }

      @Override
      public Either<fjv.c, fjv.b> a(fjz $$0) {
         fjv.b $$1 = this.c();
         if ($$1 != null) {
            return Either.right($$1);
         } else {
            String $$2 = Objects.requireNonNull(this.a.e).a();
            ReportedEntity $$3 = new ReportedEntity(this.a.c);
            gae $$4 = this.a.f.get();
            String $$5 = $$4.b();
            AbuseReport $$6 = AbuseReport.skin(this.a.d, $$2, $$5, $$3, this.a.b);
            return Either.left(new fjv.c(this.a.a, fjy.b, $$6));
         }
      }
   }
}
