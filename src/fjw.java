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

public class fjw extends fjr {
   final Supplier<gaa> f;

   fjw(UUID $$0, Instant $$1, UUID $$2, Supplier<gaa> $$3) {
      super($$0, $$1, $$2);
      this.f = $$3;
   }

   public Supplier<gaa> a() {
      return this.f;
   }

   public fjw c() {
      fjw $$0 = new fjw(this.a, this.b, this.c, this.f);
      $$0.d = this.d;
      $$0.e = this.e;
      return $$0;
   }

   @Override
   public eye a(eye $$0, fjv $$1) {
      return new fci($$0, $$1, this);
   }

   public static class a extends fjr.a<fjw> {
      public a(fjw $$0, AbuseReportLimits $$1) {
         super($$0, $$1);
      }

      public a(UUID $$0, Supplier<gaa> $$1, AbuseReportLimits $$2) {
         super(new fjw(UUID.randomUUID(), Instant.now(), $$0, $$1), $$2);
      }

      @Override
      public boolean b() {
         return StringUtils.isNotEmpty(this.g()) || this.h() != null;
      }

      @Nullable
      @Override
      public fjr.b c() {
         if (this.a.e == null) {
            return fjr.b.a;
         } else {
            return this.a.d.length() > this.b.maxOpinionCommentsLength() ? fjr.b.d : null;
         }
      }

      @Override
      public Either<fjr.c, fjr.b> a(fjv $$0) {
         fjr.b $$1 = this.c();
         if ($$1 != null) {
            return Either.right($$1);
         } else {
            String $$2 = Objects.requireNonNull(this.a.e).a();
            ReportedEntity $$3 = new ReportedEntity(this.a.c);
            gaa $$4 = this.a.f.get();
            String $$5 = $$4.b();
            AbuseReport $$6 = AbuseReport.skin(this.a.d, $$2, $$5, $$3, this.a.b);
            return Either.left(new fjr.c(this.a.a, fju.b, $$6));
         }
      }
   }
}
