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

public class fkc extends fjx {
   final Supplier<gag> f;

   fkc(UUID $$0, Instant $$1, UUID $$2, Supplier<gag> $$3) {
      super($$0, $$1, $$2);
      this.f = $$3;
   }

   public Supplier<gag> a() {
      return this.f;
   }

   public fkc c() {
      fkc $$0 = new fkc(this.a, this.b, this.c, this.f);
      $$0.d = this.d;
      $$0.e = this.e;
      return $$0;
   }

   @Override
   public eym a(eym $$0, fkb $$1) {
      return new fcp($$0, $$1, this);
   }

   public static class a extends fjx.a<fkc> {
      public a(fkc $$0, AbuseReportLimits $$1) {
         super($$0, $$1);
      }

      public a(UUID $$0, Supplier<gag> $$1, AbuseReportLimits $$2) {
         super(new fkc(UUID.randomUUID(), Instant.now(), $$0, $$1), $$2);
      }

      @Override
      public boolean b() {
         return StringUtils.isNotEmpty(this.g()) || this.h() != null;
      }

      @Nullable
      @Override
      public fjx.b c() {
         if (this.a.e == null) {
            return fjx.b.a;
         } else {
            return this.a.d.length() > this.b.maxOpinionCommentsLength() ? fjx.b.d : null;
         }
      }

      @Override
      public Either<fjx.c, fjx.b> a(fkb $$0) {
         fjx.b $$1 = this.c();
         if ($$1 != null) {
            return Either.right($$1);
         } else {
            String $$2 = Objects.requireNonNull(this.a.e).a();
            ReportedEntity $$3 = new ReportedEntity(this.a.c);
            gag $$4 = this.a.f.get();
            String $$5 = $$4.b();
            AbuseReport $$6 = AbuseReport.skin(this.a.d, $$2, $$5, $$3, this.a.b);
            return Either.left(new fjx.c(this.a.a, fka.b, $$6));
         }
      }
   }
}
