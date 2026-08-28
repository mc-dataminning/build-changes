import java.util.UUID;
import javax.annotation.Nullable;

public record adn(UUID b, int c, @Nullable xa d, xh.a e, @Nullable wo f, ws g, wk.a h) implements yv<abk> {
   public static final ym<vz, adn> a = yv.a(adn::a, adn::new);

   private adn(vz $$0) {
      this($$0.n(), $$0.l(), $$0.c(xa::a), new xh.a($$0), vl.a($$0, wq.d), ws.a($$0), wk.a.a.decode($$0));
   }

   private void a(vz $$0) {
      $$0.a(this.b);
      $$0.c(this.c);
      $$0.a(this.d, xa::a);
      this.e.a($$0);
      vl.a($$0, this.f, wq.d);
      ws.a($$0, this.g);
      wk.a.a.encode($$0, this.h);
   }

   @Override
   public yx<adn> a() {
      return agd.ab;
   }

   public void a(abk $$0) {
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
   public xa f() {
      return this.d;
   }

   public xh.a g() {
      return this.e;
   }

   @Nullable
   public wo h() {
      return this.f;
   }

   public ws i() {
      return this.g;
   }

   public wk.a j() {
      return this.h;
   }
}
