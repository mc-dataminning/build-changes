import java.util.EnumSet;

public class ccq extends ccg {
   protected final bvq a;
   private final double b;
   private final boolean c;
   private eto d;
   private double e;
   private double f;
   private double g;
   private int h;
   private int i;
   private final int j = 20;
   private long k;
   private static final long l = 20L;

   public ccq(bvq $$0, double $$1, boolean $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.a(EnumSet.of(ccg.a.a, ccg.a.b));
   }

   @Override
   public boolean b() {
      long $$0 = this.a.dV().ad();
      if ($$0 - this.k < 20L) {
         return false;
      } else {
         this.k = $$0;
         bvi $$1 = this.a.O_();
         if ($$1 == null) {
            return false;
         } else if (!$$1.bL()) {
            return false;
         } else {
            this.d = this.a.P().a($$1, 0);
            return this.d != null ? true : this.a.i($$1);
         }
      }
   }

   @Override
   public boolean c() {
      bvi $$0 = this.a.O_();
      if ($$0 == null) {
         return false;
      } else if (!$$0.bL()) {
         return false;
      } else if (!this.c) {
         return !this.a.P().k();
      } else {
         return !this.a.a($$0.dv()) ? false : !($$0 instanceof coy) || !$$0.Z_() && !((coy)$$0).b();
      }
   }

   @Override
   public void d() {
      this.a.P().a(this.d, this.b);
      this.a.w(true);
      this.h = 0;
      this.i = 0;
   }

   @Override
   public void e() {
      bvi $$0 = this.a.O_();
      if (!bur.e.test($$0)) {
         this.a.h(null);
      }

      this.a.w(false);
      this.a.P().m();
   }

   @Override
   public boolean V_() {
      return true;
   }

   @Override
   public void a() {
      bvi $$0 = this.a.O_();
      if ($$0 != null) {
         this.a.L().a($$0, 30.0F, 30.0F);
         this.h = Math.max(this.h - 1, 0);
         if ((this.c || this.a.Q().a($$0))
            && this.h <= 0
            && (this.e == 0.0 && this.f == 0.0 && this.g == 0.0 || $$0.i(this.e, this.f, this.g) >= 1.0 || this.a.dY().i() < 0.05F)) {
            this.e = $$0.dA();
            this.f = $$0.dC();
            this.g = $$0.dG();
            this.h = 4 + this.a.dY().a(7);
            double $$1 = this.a.g((bum)$$0);
            if ($$1 > 1024.0) {
               this.h += 10;
            } else if ($$1 > 256.0) {
               this.h += 5;
            }

            if (!this.a.P().a($$0, this.b)) {
               this.h += 15;
            }

            this.h = this.a(this.h);
         }

         this.i = Math.max(this.i - 1, 0);
         this.a($$0);
      }
   }

   protected void a(bvi $$0) {
      if (this.b($$0)) {
         this.h();
         this.a.a(bsk.a);
         this.a.c(a(this.a), $$0);
      }
   }

   protected void h() {
      this.i = this.a(20);
   }

   protected boolean i() {
      return this.i <= 0;
   }

   protected boolean b(bvi $$0) {
      return this.i() && this.a.i($$0) && this.a.Q().a($$0);
   }

   protected int k() {
      return this.i;
   }

   protected int l() {
      return this.a(20);
   }
}
