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

public class fox extends fos {
   final Supplier<gfm> f;

   fox(UUID $$0, Instant $$1, UUID $$2, Supplier<gfm> $$3) {
      super($$0, $$1, $$2);
      this.f = $$3;
   }

   public Supplier<gfm> a() {
      return this.f;
   }

   public fox c() {
      fox $$0 = new fox(this.a, this.b, this.c, this.f);
      $$0.d = this.d;
      $$0.e = this.e;
      return $$0;
   }

   @Override
   public fdb a(fdb $$0, fow $$1) {
      return new fhg($$0, $$1, this);
   }

   public static class a extends fos.a<fox> {
      public a(fox $$0, AbuseReportLimits $$1) {
         super($$0, $$1);
      }

      public a(UUID $$0, Supplier<gfm> $$1, AbuseReportLimits $$2) {
         super(new fox(UUID.randomUUID(), Instant.now(), $$0, $$1), $$2);
      }

      @Override
      public boolean b() {
         return StringUtils.isNotEmpty(this.g()) || this.h() != null;
      }

      @Nullable
      @Override
      public fos.b c() {
         if (this.a.e == null) {
            return fos.b.a;
         } else {
            return this.a.d.length() > this.b.maxOpinionCommentsLength() ? fos.b.d : null;
         }
      }

      @Override
      public Either<fos.c, fos.b> a(fow $$0) {
         fos.b $$1 = this.c();
         if ($$1 != null) {
            return Either.right($$1);
         } else {
            String $$2 = Objects.requireNonNull(this.a.e).a();
            ReportedEntity $$3 = new ReportedEntity(this.a.c);
            gfm $$4 = this.a.f.get();
            String $$5 = $$4.b();
            AbuseReport $$6 = AbuseReport.skin(this.a.d, $$2, $$5, $$3, this.a.b);
            return Either.left(new fos.c(this.a.a, fov.b, $$6));
         }
      }
   }
}
