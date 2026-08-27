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

public class ftj extends fte {
   final Supplier<gkb> f;

   ftj(UUID $$0, Instant $$1, UUID $$2, Supplier<gkb> $$3) {
      super($$0, $$1, $$2);
      this.f = $$3;
   }

   public Supplier<gkb> a() {
      return this.f;
   }

   public ftj c() {
      ftj $$0 = new ftj(this.a, this.b, this.c, this.f);
      $$0.d = this.d;
      $$0.e = this.e;
      return $$0;
   }

   @Override
   public fhh a(fhh $$0, fti $$1) {
      return new flm($$0, $$1, this);
   }

   public static class a extends fte.a<ftj> {
      public a(ftj $$0, AbuseReportLimits $$1) {
         super($$0, $$1);
      }

      public a(UUID $$0, Supplier<gkb> $$1, AbuseReportLimits $$2) {
         super(new ftj(UUID.randomUUID(), Instant.now(), $$0, $$1), $$2);
      }

      @Override
      public boolean b() {
         return StringUtils.isNotEmpty(this.g()) || this.h() != null;
      }

      @Nullable
      @Override
      public fte.b c() {
         if (this.a.e == null) {
            return fte.b.a;
         } else {
            return this.a.d.length() > this.b.maxOpinionCommentsLength() ? fte.b.d : null;
         }
      }

      @Override
      public Either<fte.c, fte.b> a(fti $$0) {
         fte.b $$1 = this.c();
         if ($$1 != null) {
            return Either.right($$1);
         } else {
            String $$2 = Objects.requireNonNull(this.a.e).a();
            ReportedEntity $$3 = new ReportedEntity(this.a.c);
            gkb $$4 = this.a.f.get();
            String $$5 = $$4.b();
            AbuseReport $$6 = AbuseReport.skin(this.a.d, $$2, $$5, $$3, this.a.b);
            return Either.left(new fte.c(this.a.a, fth.b, $$6));
         }
      }
   }
}
