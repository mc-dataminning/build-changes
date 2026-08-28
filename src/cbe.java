import java.util.EnumSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cbe extends bzw {
   private static final cdp c = cdp.b().a(10.0).d();
   private final cdp d;
   protected final bth a;
   private final double e;
   private double f;
   private double g;
   private double h;
   private double i;
   private double j;
   @Nullable
   protected cmh b;
   private int k;
   private boolean l;
   private final Predicate<cua> m;
   private final boolean n;

   public cbe(bth $$0, double $$1, Predicate<cua> $$2, boolean $$3) {
      this.a = $$0;
      this.e = $$1;
      this.m = $$2;
      this.n = $$3;
      this.a(EnumSet.of(bzw.a.a, bzw.a.b));
      this.d = c.c().a(this::a);
   }

   @Override
   public boolean a() {
      if (this.k > 0) {
         this.k--;
         return false;
      } else {
         this.b = this.a.dP().a(this.d, this.a);
         return this.b != null;
      }
   }

   private boolean a(bsy $$0) {
      return this.m.test($$0.eT()) || this.m.test($$0.eU());
   }

   @Override
   public boolean b() {
      if (this.h()) {
         if (this.a.g(this.b) < 36.0) {
            if (this.b.i(this.f, this.g, this.h) > 0.010000000000000002) {
               return false;
            }

            if (Math.abs((double)this.b.dH() - this.i) > 5.0 || Math.abs((double)this.b.dF() - this.j) > 5.0) {
               return false;
            }
         } else {
            this.f = this.b.du();
            this.g = this.b.dw();
            this.h = this.b.dA();
         }

         this.i = (double)this.b.dH();
         this.j = (double)this.b.dF();
      }

      return this.a();
   }

   protected boolean h() {
      return this.n;
   }

   @Override
   public void c() {
      this.f = this.b.du();
      this.g = this.b.dw();
      this.h = this.b.dA();
      this.l = true;
   }

   @Override
   public void d() {
      this.b = null;
      this.a.K().n();
      this.k = b(100);
      this.l = false;
   }

   @Override
   public void e() {
      this.a.G().a(this.b, (float)(this.a.ab() + 20), (float)this.a.aa());
      if (this.a.g(this.b) < 6.25) {
         this.a.K().n();
      } else {
         this.a.K().a(this.b, this.e);
      }
   }

   public boolean i() {
      return this.l;
   }
}
