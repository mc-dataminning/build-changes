import java.util.UUID;
import javax.annotation.Nullable;

public record adw(UUID b, int c, @Nullable xk d, xr.a e, @Nullable wy f, xc g, wu.a h) implements zf<abu> {
   public static final yw<wj, adw> a = zf.a(adw::a, adw::new);

   private adw(wj $$0) {
      this($$0.n(), $$0.l(), $$0.c(xk::a), new xr.a($$0), vu.a($$0, xa.d), xc.a($$0), wu.a.a.decode($$0));
   }

   private void a(wj $$0) {
      $$0.a(this.b);
      $$0.c(this.c);
      $$0.a(this.d, xk::a);
      this.e.a($$0);
      vu.a($$0, this.f, xa.d);
      xc.a($$0, this.g);
      wu.a.a.encode($$0, this.h);
   }

   @Override
   public zh<adw> a() {
      return agn.ab;
   }

   public void a(abu $$0) {
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
   public xk f() {
      return this.d;
   }

   public xr.a g() {
      return this.e;
   }

   @Nullable
   public wy h() {
      return this.f;
   }

   public xc i() {
      return this.g;
   }

   public wu.a j() {
      return this.h;
   }
}
