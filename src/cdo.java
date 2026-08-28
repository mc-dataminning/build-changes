import java.util.EnumSet;

public class cdo extends cde {
   protected final bwo a;
   private final double b;
   private final boolean c;
   private eul d;
   private double e;
   private double f;
   private double g;
   private int h;
   private int i;
   private final int j = 20;
   private long k;
   private static final long l = 20L;

   public cdo(bwo $$0, double $$1, boolean $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.a(EnumSet.of(cde.a.a, cde.a.b));
   }

   @Override
   public boolean b() {
      long $$0 = this.a.dW().ac();
      if ($$0 - this.k < 20L) {
         return false;
      } else {
         this.k = $$0;
         bwg $$1 = this.a.O_();
         if ($$1 == null) {
            return false;
         } else if (!$$1.bL()) {
            return false;
         } else {
            this.d = this.a.L().a($$1, 0);
            return this.d != null ? true : this.a.i($$1);
         }
      }
   }

   @Override
   public boolean c() {
      bwg $$0 = this.a.O_();
      if ($$0 == null) {
         return false;
      } else if (!$$0.bL()) {
         return false;
      } else if (!this.c) {
         return !this.a.L().m();
      } else {
         return !this.a.a($$0.dw()) ? false : !($$0 instanceof cpx) || !$$0.aa_() && !((cpx)$$0).b();
      }
   }

   @Override
   public void d() {
      this.a.L().a(this.d, this.b);
      this.a.w(true);
      this.h = 0;
      this.i = 0;
   }

   @Override
   public void e() {
      bwg $$0 = this.a.O_();
      if (!bvp.e.test($$0)) {
         this.a.h(null);
      }

      this.a.w(false);
      this.a.L().o();
   }

   @Override
   public boolean V_() {
      return true;
   }

   @Override
   public void a() {
      bwg $$0 = this.a.O_();
      if ($$0 != null) {
         this.a.H().a($$0, 30.0F, 30.0F);
         this.h = Math.max(this.h - 1, 0);
         if ((this.c || this.a.N().a($$0))
            && this.h <= 0
            && (this.e == 0.0 && this.f == 0.0 && this.g == 0.0 || $$0.i(this.e, this.f, this.g) >= 1.0 || this.a.dZ().i() < 0.05F)) {
            this.e = $$0.dB();
            this.f = $$0.dD();
            this.g = $$0.dH();
            this.h = 4 + this.a.dZ().a(7);
            double $$1 = this.a.g((bvk)$$0);
            if ($$1 > 1024.0) {
               this.h += 10;
            } else if ($$1 > 256.0) {
               this.h += 5;
            }

            if (!this.a.L().a($$0, this.b)) {
               this.h += 15;
            }

            this.h = this.a(this.h);
         }

         this.i = Math.max(this.i - 1, 0);
         this.a($$0);
      }
   }

   protected void a(bwg $$0) {
      if (this.b($$0)) {
         this.h();
         this.a.a(bti.a);
         this.a.c(a(this.a), $$0);
      }
   }

   protected void h() {
      this.i = this.a(20);
   }

   protected boolean i() {
      return this.i <= 0;
   }

   protected boolean b(bwg $$0) {
      return this.i() && this.a.i($$0) && this.a.N().a($$0);
   }

   protected int k() {
      return this.i;
   }

   protected int l() {
      return this.a(20);
   }
}
