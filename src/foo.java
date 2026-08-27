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

public class foo extends foj {
   final Supplier<gff> f;

   foo(UUID $$0, Instant $$1, UUID $$2, Supplier<gff> $$3) {
      super($$0, $$1, $$2);
      this.f = $$3;
   }

   public Supplier<gff> a() {
      return this.f;
   }

   public foo c() {
      foo $$0 = new foo(this.a, this.b, this.c, this.f);
      $$0.d = this.d;
      $$0.e = this.e;
      return $$0;
   }

   @Override
   public fct a(fct $$0, fon $$1) {
      return new fgy($$0, $$1, this);
   }

   public static class a extends foj.a<foo> {
      public a(foo $$0, AbuseReportLimits $$1) {
         super($$0, $$1);
      }

      public a(UUID $$0, Supplier<gff> $$1, AbuseReportLimits $$2) {
         super(new foo(UUID.randomUUID(), Instant.now(), $$0, $$1), $$2);
      }

      @Override
      public boolean b() {
         return StringUtils.isNotEmpty(this.g()) || this.h() != null;
      }

      @Nullable
      @Override
      public foj.b c() {
         if (this.a.e == null) {
            return foj.b.a;
         } else {
            return this.a.d.length() > this.b.maxOpinionCommentsLength() ? foj.b.d : null;
         }
      }

      @Override
      public Either<foj.c, foj.b> a(fon $$0) {
         foj.b $$1 = this.c();
         if ($$1 != null) {
            return Either.right($$1);
         } else {
            String $$2 = Objects.requireNonNull(this.a.e).a();
            ReportedEntity $$3 = new ReportedEntity(this.a.c);
            gff $$4 = this.a.f.get();
            String $$5 = $$4.b();
            AbuseReport $$6 = AbuseReport.skin(this.a.d, $$2, $$5, $$3, this.a.b);
            return Either.left(new foj.c(this.a.a, fom.b, $$6));
         }
      }
   }
}
