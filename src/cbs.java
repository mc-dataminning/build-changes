import java.util.EnumSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cbs extends cak {
   private static final ced c = ced.b().a(10.0).d();
   private final ced d;
   protected final btu a;
   private final double e;
   private double f;
   private double g;
   private double h;
   private double i;
   private double j;
   @Nullable
   protected cmv b;
   private int k;
   private boolean l;
   private final Predicate<cuo> m;
   private final boolean n;

   public cbs(btu $$0, double $$1, Predicate<cuo> $$2, boolean $$3) {
      this.a = $$0;
      this.e = $$1;
      this.m = $$2;
      this.n = $$3;
      this.a(EnumSet.of(cak.a.a, cak.a.b));
      this.d = c.c().a(this::a);
   }

   @Override
   public boolean b() {
      if (this.k > 0) {
         this.k--;
         return false;
      } else {
         this.b = this.a.dQ().a(this.d, this.a);
         return this.b != null;
      }
   }

   private boolean a(btl $$0) {
      return this.m.test($$0.eU()) || this.m.test($$0.eV());
   }

   @Override
   public boolean c() {
      if (this.h()) {
         if (this.a.g(this.b) < 36.0) {
            if (this.b.i(this.f, this.g, this.h) > 0.010000000000000002) {
               return false;
            }

            if (Math.abs((double)this.b.dI() - this.i) > 5.0 || Math.abs((double)this.b.dG() - this.j) > 5.0) {
               return false;
            }
         } else {
            this.f = this.b.dv();
            this.g = this.b.dx();
            this.h = this.b.dB();
         }

         this.i = (double)this.b.dI();
         this.j = (double)this.b.dG();
      }

      return this.b();
   }

   protected boolean h() {
      return this.n;
   }

   @Override
   public void d() {
      this.f = this.b.dv();
      this.g = this.b.dx();
      this.h = this.b.dB();
      this.l = true;
   }

   @Override
   public void e() {
      this.b = null;
      this.a.J().n();
      this.k = b(100);
      this.l = false;
   }

   @Override
   public void a() {
      this.a.F().a(this.b, (float)(this.a.ab() + 20), (float)this.a.aa());
      if (this.a.g(this.b) < 6.25) {
         this.a.J().n();
      } else {
         this.a.J().a(this.b, this.e);
      }
   }

   public boolean i() {
      return this.l;
   }
}
