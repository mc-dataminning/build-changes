import java.util.Optional;
import javax.annotation.Nullable;

public record agr(ji<dvu> a, ale<dby> b, long c, dbv d, @Nullable dbv e, boolean f, boolean g, Optional<jh> h, int i) {
   private static final zn<xa, ji<dvu>> j = zl.b(lq.aE);

   public agr(xa $$0) {
      this(
         j.decode($$0), $$0.a(lq.aS), $$0.readLong(), dbv.a($$0.readByte()), dbv.b($$0.readByte()), $$0.readBoolean(), $$0.readBoolean(), $$0.b(wm::h), $$0.l()
      );
   }

   public void a(xa $$0) {
      j.encode($$0, this.a);
      $$0.b(this.b);
      $$0.b(this.c);
      $$0.k(this.d.a());
      $$0.k(dbv.a(this.e));
      $$0.a(this.f);
      $$0.a(this.g);
      $$0.a(this.h, wm::a);
      $$0.c(this.i);
   }
}
