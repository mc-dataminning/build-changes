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

public class fth extends ftc {
   final Supplier<gjy> f;

   fth(UUID $$0, Instant $$1, UUID $$2, Supplier<gjy> $$3) {
      super($$0, $$1, $$2);
      this.f = $$3;
   }

   public Supplier<gjy> a() {
      return this.f;
   }

   public fth c() {
      fth $$0 = new fth(this.a, this.b, this.c, this.f);
      $$0.d = this.d;
      $$0.e = this.e;
      return $$0;
   }

   @Override
   public fhf a(fhf $$0, ftg $$1) {
      return new flk($$0, $$1, this);
   }

   public static class a extends ftc.a<fth> {
      public a(fth $$0, AbuseReportLimits $$1) {
         super($$0, $$1);
      }

      public a(UUID $$0, Supplier<gjy> $$1, AbuseReportLimits $$2) {
         super(new fth(UUID.randomUUID(), Instant.now(), $$0, $$1), $$2);
      }

      @Override
      public boolean b() {
         return StringUtils.isNotEmpty(this.g()) || this.h() != null;
      }

      @Nullable
      @Override
      public ftc.b c() {
         if (this.a.e == null) {
            return ftc.b.a;
         } else {
            return this.a.d.length() > this.b.maxOpinionCommentsLength() ? ftc.b.d : null;
         }
      }

      @Override
      public Either<ftc.c, ftc.b> a(ftg $$0) {
         ftc.b $$1 = this.c();
         if ($$1 != null) {
            return Either.right($$1);
         } else {
            String $$2 = Objects.requireNonNull(this.a.e).a();
            ReportedEntity $$3 = new ReportedEntity(this.a.c);
            gjy $$4 = this.a.f.get();
            String $$5 = $$4.b();
            AbuseReport $$6 = AbuseReport.skin(this.a.d, $$2, $$5, $$3, this.a.b);
            return Either.left(new ftc.c(this.a.a, ftf.b, $$6));
         }
      }
   }
}
