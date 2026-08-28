import java.util.EnumSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cdk extends ccc {
   private static final cfv c = cfv.b().d();
   private final cfv d;
   protected final bvm a;
   private final double e;
   private double f;
   private double g;
   private double h;
   private double i;
   private double j;
   @Nullable
   protected cor b;
   private int k;
   private boolean l;
   private final Predicate<cwf> m;
   private final boolean n;

   public cdk(bvm $$0, double $$1, Predicate<cwf> $$2, boolean $$3) {
      this.a = $$0;
      this.e = $$1;
      this.m = $$2;
      this.n = $$3;
      this.a(EnumSet.of(ccc.a.a, ccc.a.b));
      this.d = c.c().a(this::a);
   }

   @Override
   public boolean b() {
      if (this.k > 0) {
         this.k--;
         return false;
      } else {
         this.b = this.a.dY().a(this.d.a(this.a.h(bwm.E)), this.a);
         return this.b != null;
      }
   }

   private boolean a(bve $$0) {
      return this.m.test($$0.fc()) || this.m.test($$0.fd());
   }

   @Override
   public boolean c() {
      if (this.h()) {
         if (this.a.g(this.b) < 36.0) {
            if (this.b.i(this.f, this.g, this.h) > 0.010000000000000002) {
               return false;
            }

            if (Math.abs((double)this.b.dQ() - this.i) > 5.0 || Math.abs((double)this.b.dO() - this.j) > 5.0) {
               return false;
            }
         } else {
            this.f = this.b.dD();
            this.g = this.b.dF();
            this.h = this.b.dJ();
         }

         this.i = (double)this.b.dQ();
         this.j = (double)this.b.dO();
      }

      return this.b();
   }

   protected boolean h() {
      return this.n;
   }

   @Override
   public void d() {
      this.f = this.b.dD();
      this.g = this.b.dF();
      this.h = this.b.dJ();
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
