import java.util.UUID;
import javax.annotation.Nullable;

public record adn(UUID b, int c, @Nullable xg d, xn.a e, @Nullable wu f, wy g, wq.a h) implements zb<abm> {
   public static final ys<wf, adn> a = zb.a(adn::a, adn::new);

   private adn(wf $$0) {
      this($$0.n(), $$0.l(), $$0.c(xg::a), new xn.a($$0), vu.a($$0, ww.d), wy.a($$0), wq.a.a.decode($$0));
   }

   private void a(wf $$0) {
      $$0.a(this.b);
      $$0.c(this.c);
      $$0.a(this.d, xg::a);
      this.e.a($$0);
      vu.a($$0, this.f, ww.d);
      wy.a($$0, this.g);
      wq.a.a.encode($$0, this.h);
   }

   @Override
   public zd<adn> a() {
      return afx.aa;
   }

   public void a(abm $$0) {
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
   public xg f() {
      return this.d;
   }

   public xn.a g() {
      return this.e;
   }

   @Nullable
   public wu h() {
      return this.f;
   }

   public wy i() {
      return this.g;
   }

   public wq.a j() {
      return this.h;
   }
}
