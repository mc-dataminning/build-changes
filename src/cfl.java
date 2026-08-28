import java.util.EnumSet;

public class cfl extends cfb {
   protected final byn a;
   private final double b;
   private final boolean c;
   private eyo d;
   private double e;
   private double f;
   private double g;
   private int h;
   private int i;
   private final int j = 20;
   private long k;
   private static final long l = 20L;

   public cfl(byn $$0, double $$1, boolean $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.a(EnumSet.of(cfb.a.a, cfb.a.b));
   }

   @Override
   public boolean b() {
      long $$0 = this.a.dV().ae();
      if ($$0 - this.k < 20L) {
         return false;
      } else {
         this.k = $$0;
         byf $$1 = this.a.e();
         if ($$1 == null) {
            return false;
         } else if (!$$1.bJ()) {
            return false;
         } else {
            this.d = this.a.N().a($$1, 0);
            return this.d != null ? true : this.a.h($$1);
         }
      }
   }

   @Override
   public boolean c() {
      byf $$0 = this.a.e();
      if ($$0 == null) {
         return false;
      } else if (!$$0.bJ()) {
         return false;
      } else if (!this.c) {
         return !this.a.N().k();
      } else if (!this.a.a($$0.dv())) {
         return false;
      } else {
         if ($$0 instanceof csi $$1 && ($$1.ak() || $$1.gz())) {
            return false;
         }

         return true;
      }
   }

   @Override
   public void d() {
      this.a.N().a(this.d, this.b);
      this.a.v(true);
      this.h = 0;
      this.i = 0;
   }

   @Override
   public void e() {
      byf $$0 = this.a.e();
      if (!bxl.e.test($$0)) {
         this.a.g(null);
      }

      this.a.v(false);
      this.a.N().m();
   }

   @Override
   public boolean W_() {
      return true;
   }

   @Override
   public void a() {
      byf $$0 = this.a.e();
      if ($$0 != null) {
         this.a.I().a($$0, 30.0F, 30.0F);
         this.h = Math.max(this.h - 1, 0);
         if ((this.c || this.a.O().a($$0))
            && this.h <= 0
            && (this.e == 0.0 && this.f == 0.0 && this.g == 0.0 || $$0.h(this.e, this.f, this.g) >= 1.0 || this.a.dY().i() < 0.05F)) {
            this.e = $$0.dA();
            this.f = $$0.dC();
            this.g = $$0.dG();
            this.h = 4 + this.a.dY().a(7);
            double $$1 = this.a.g((bxe)$$0);
            if ($$1 > 1024.0) {
               this.h += 10;
            } else if ($$1 > 256.0) {
               this.h += 5;
            }

            if (!this.a.N().a($$0, this.b)) {
               this.h += 15;
            }

            this.h = this.a(this.h);
         }

         this.i = Math.max(this.i - 1, 0);
         this.a($$0);
      }
   }

   protected void a(byf $$0) {
      if (this.b($$0)) {
         this.h();
         this.a.a(bvb.a);
         this.a.c(a(this.a), $$0);
      }
   }

   protected void h() {
      this.i = this.a(20);
   }

   protected boolean i() {
      return this.i <= 0;
   }

   protected boolean b(byf $$0) {
      return this.i() && this.a.h($$0) && this.a.O().a($$0);
   }

   protected int k() {
      return this.i;
   }

   protected int l() {
      return this.a(20);
   }
}
