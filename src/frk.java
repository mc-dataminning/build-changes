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

public class frk extends frf {
   final Supplier<gia> f;

   frk(UUID $$0, Instant $$1, UUID $$2, Supplier<gia> $$3) {
      super($$0, $$1, $$2);
      this.f = $$3;
   }

   public Supplier<gia> a() {
      return this.f;
   }

   public frk c() {
      frk $$0 = new frk(this.a, this.b, this.c, this.f);
      $$0.d = this.d;
      $$0.e = this.e;
      return $$0;
   }

   @Override
   public ffl a(ffl $$0, frj $$1) {
      return new fjq($$0, $$1, this);
   }

   public static class a extends frf.a<frk> {
      public a(frk $$0, AbuseReportLimits $$1) {
         super($$0, $$1);
      }

      public a(UUID $$0, Supplier<gia> $$1, AbuseReportLimits $$2) {
         super(new frk(UUID.randomUUID(), Instant.now(), $$0, $$1), $$2);
      }

      @Override
      public boolean b() {
         return StringUtils.isNotEmpty(this.g()) || this.h() != null;
      }

      @Nullable
      @Override
      public frf.b c() {
         if (this.a.e == null) {
            return frf.b.a;
         } else {
            return this.a.d.length() > this.b.maxOpinionCommentsLength() ? frf.b.d : null;
         }
      }

      @Override
      public Either<frf.c, frf.b> a(frj $$0) {
         frf.b $$1 = this.c();
         if ($$1 != null) {
            return Either.right($$1);
         } else {
            String $$2 = Objects.requireNonNull(this.a.e).a();
            ReportedEntity $$3 = new ReportedEntity(this.a.c);
            gia $$4 = this.a.f.get();
            String $$5 = $$4.b();
            AbuseReport $$6 = AbuseReport.skin(this.a.d, $$2, $$5, $$3, this.a.b);
            return Either.left(new frf.c(this.a.a, fri.b, $$6));
         }
      }
   }
}
