import java.util.UUID;
import javax.annotation.Nullable;

public record aej(UUID b, int c, @Nullable yb d, yi.a e, @Nullable xp f, xt g, xl.a h) implements zw<aci> {
   public static final zn<xa, aej> a = zw.a(aej::a, aej::new);

   private aej(xa $$0) {
      this($$0.n(), $$0.l(), $$0.c(yb::a), new yi.a($$0), wm.a($$0, xr.d), xt.a($$0), xl.a.a.decode($$0));
   }

   private void a(xa $$0) {
      $$0.a(this.b);
      $$0.c(this.c);
      $$0.a(this.d, yb::a);
      this.e.a($$0);
      wm.a($$0, this.f, xr.d);
      xt.a($$0, this.g);
      xl.a.a.encode($$0, this.h);
   }

   @Override
   public zy<aej> a() {
      return agu.aa;
   }

   public void a(aci $$0) {
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
   public yb f() {
      return this.d;
   }

   public yi.a g() {
      return this.e;
   }

   @Nullable
   public xp h() {
      return this.f;
   }

   public xt i() {
      return this.g;
   }

   public xl.a j() {
      return this.h;
   }
}
