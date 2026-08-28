import java.util.Optional;
import javax.annotation.Nullable;

public record agn(ji<dvp> a, ala<dbt> b, long c, dbq d, @Nullable dbq e, boolean f, boolean g, Optional<jh> h, int i) {
   private static final zj<ww, ji<dvp>> j = zh.b(lq.aE);

   public agn(ww $$0) {
      this(
         j.decode($$0), $$0.a(lq.aS), $$0.readLong(), dbq.a($$0.readByte()), dbq.b($$0.readByte()), $$0.readBoolean(), $$0.readBoolean(), $$0.b(wl::h), $$0.l()
      );
   }

   public void a(ww $$0) {
      j.encode($$0, this.a);
      $$0.b(this.b);
      $$0.b(this.c);
      $$0.k(this.d.a());
      $$0.k(dbq.a(this.e));
      $$0.a(this.f);
      $$0.a(this.g);
      $$0.a(this.h, wl::a);
      $$0.c(this.i);
   }
}
