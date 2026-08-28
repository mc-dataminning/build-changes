import java.util.UUID;
import javax.annotation.Nullable;

public record aej(UUID b, int c, @Nullable xw d, yd.a e, @Nullable xk f, xo g, xg.a h) implements zr<acg> {
   public static final zi<wv, aej> a = zr.a(aej::a, aej::new);

   private aej(wv $$0) {
      this($$0.n(), $$0.l(), $$0.c(xw::a), new yd.a($$0), wh.a($$0, xm.d), xo.a($$0), xg.a.a.decode($$0));
   }

   private void a(wv $$0) {
      $$0.a(this.b);
      $$0.c(this.c);
      $$0.a(this.d, xw::a);
      this.e.a($$0);
      wh.a($$0, this.f, xm.d);
      xo.a($$0, this.g);
      xg.a.a.encode($$0, this.h);
   }

   @Override
   public zt<aej> a() {
      return agz.ab;
   }

   public void a(acg $$0) {
      $$0.a(this);
   }

   @Override
   public boolean c() {
      return true;
   }

   public int e() {
      return this.c;
   }

   @Nullable
   public xw f() {
      return this.d;
   }

   public yd.a g() {
      return this.e;
   }

   @Nullable
   public xk h() {
      return this.f;
   }

   public xo i() {
      return this.g;
   }

   public xg.a j() {
      return this.h;
   }
}
