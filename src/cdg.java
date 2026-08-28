import java.util.EnumSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cdg extends cby {
   private static final cfr c = cfr.b().d();
   private final cfr d;
   protected final bvi a;
   private final double e;
   private double f;
   private double g;
   private double h;
   private double i;
   private double j;
   @Nullable
   protected com b;
   private int k;
   private boolean l;
   private final Predicate<cwb> m;
   private final boolean n;

   public cdg(bvi $$0, double $$1, Predicate<cwb> $$2, boolean $$3) {
      this.a = $$0;
      this.e = $$1;
      this.m = $$2;
      this.n = $$3;
      this.a(EnumSet.of(cby.a.a, cby.a.b));
      this.d = c.c().a(this::a);
   }

   @Override
   public boolean b() {
      if (this.k > 0) {
         this.k--;
         return false;
      } else {
         this.b = this.a.dX().a(this.d.a(this.a.h(bwi.E)), this.a);
         return this.b != null;
      }
   }

   private boolean a(bva $$0) {
      return this.m.test($$0.fb()) || this.m.test($$0.fc());
   }

   @Override
   public boolean c() {
      if (this.h()) {
         if (this.a.g(this.b) < 36.0) {
            if (this.b.i(this.f, this.g, this.h) > 0.010000000000000002) {
               return false;
            }

            if (Math.abs((double)this.b.dP() - this.i) > 5.0 || Math.abs((double)this.b.dN() - this.j) > 5.0) {
               return false;
            }
         } else {
            this.f = this.b.dC();
            this.g = this.b.dE();
            this.h = this.b.dI();
         }

         this.i = (double)this.b.dP();
         this.j = (double)this.b.dN();
      }

      return this.b();
   }

   protected boolean h() {
      return this.n;
   }

   @Override
   public void d() {
      this.f = this.b.dC();
      this.g = this.b.dE();
      this.h = this.b.dI();
      this.l = true;
   }

   @Override
   public void e() {
      this.b = null;
      this.a.P().o();
      this.k = b(100);
      this.l = false;
   }

   @Override
   public void a() {
      this.a.K().a(this.b, (float)(this.a.ae() + 20), (float)this.a.ad());
      if (this.a.g(this.b) < 6.25) {
         this.a.P().o();
      } else {
         this.a.P().a(this.b, this.e);
      }
   }

   public boolean i() {
      return this.l;
   }
}
