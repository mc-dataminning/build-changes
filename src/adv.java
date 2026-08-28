import java.util.UUID;
import javax.annotation.Nullable;

public record adv(UUID b, int c, @Nullable xl d, xs.a e, @Nullable wz f, xd g, wv.a h) implements zg<abu> {
   public static final yx<wk, adv> a = zg.a(adv::a, adv::new);

   private adv(wk $$0) {
      this($$0.n(), $$0.l(), $$0.c(xl::a), new xs.a($$0), vw.a($$0, xb.d), xd.a($$0), wv.a.a.decode($$0));
   }

   private void a(wk $$0) {
      $$0.a(this.b);
      $$0.c(this.c);
      $$0.a(this.d, xl::a);
      this.e.a($$0);
      vw.a($$0, this.f, xb.d);
      xd.a($$0, this.g);
      wv.a.a.encode($$0, this.h);
   }

   @Override
   public zi<adv> a() {
      return agg.aa;
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
   public xl f() {
      return this.d;
   }

   public xs.a g() {
      return this.e;
   }

   @Nullable
   public wz h() {
      return this.f;
   }

   public xd i() {
      return this.g;
   }

   public wv.a j() {
      return this.h;
   }
}
