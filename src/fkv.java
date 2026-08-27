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

public class fkv extends fkq {
   final Supplier<gba> f;

   fkv(UUID $$0, Instant $$1, UUID $$2, Supplier<gba> $$3) {
      super($$0, $$1, $$2);
      this.f = $$3;
   }

   public Supplier<gba> a() {
      return this.f;
   }

   public fkv c() {
      fkv $$0 = new fkv(this.a, this.b, this.c, this.f);
      $$0.d = this.d;
      $$0.e = this.e;
      return $$0;
   }

   @Override
   public ezd a(ezd $$0, fku $$1) {
      return new fdh($$0, $$1, this);
   }

   public static class a extends fkq.a<fkv> {
      public a(fkv $$0, AbuseReportLimits $$1) {
         super($$0, $$1);
      }

      public a(UUID $$0, Supplier<gba> $$1, AbuseReportLimits $$2) {
         super(new fkv(UUID.randomUUID(), Instant.now(), $$0, $$1), $$2);
      }

      @Override
      public boolean b() {
         return StringUtils.isNotEmpty(this.g()) || this.h() != null;
      }

      @Nullable
      @Override
      public fkq.b c() {
         if (this.a.e == null) {
            return fkq.b.a;
         } else {
            return this.a.d.length() > this.b.maxOpinionCommentsLength() ? fkq.b.d : null;
         }
      }

      @Override
      public Either<fkq.c, fkq.b> a(fku $$0) {
         fkq.b $$1 = this.c();
         if ($$1 != null) {
            return Either.right($$1);
         } else {
            String $$2 = Objects.requireNonNull(this.a.e).a();
            ReportedEntity $$3 = new ReportedEntity(this.a.c);
            gba $$4 = this.a.f.get();
            String $$5 = $$4.b();
            AbuseReport $$6 = AbuseReport.skin(this.a.d, $$2, $$5, $$3, this.a.b);
            return Either.left(new fkq.c(this.a.a, fkt.b, $$6));
         }
      }
   }
}
