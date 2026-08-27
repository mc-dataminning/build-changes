import java.util.EnumSet;

public class bqg extends bpw {
   protected final bjk a;
   private final double b;
   private final boolean c;
   private eaw d;
   private double e;
   private double f;
   private double g;
   private int h;
   private int i;
   private final int j = 20;
   private long k;
   private static final long l = 20L;

   public bqg(bjk $$0, double $$1, boolean $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.a(EnumSet.of(bpw.a.a, bpw.a.b));
   }

   @Override
   public boolean a() {
      long $$0 = this.a.dK().V();
      if ($$0 - this.k < 20L) {
         return false;
      } else {
         this.k = $$0;
         bjb $$1 = this.a.j();
         if ($$1 == null) {
            return false;
         } else if (!$$1.bv()) {
            return false;
         } else {
            this.d = this.a.H().a($$1, 0);
            return this.d != null ? true : this.a.i($$1);
         }
      }
   }

   @Override
   public boolean b() {
      bjb $$0 = this.a.j();
      if ($$0 == null) {
         return false;
      } else if (!$$0.bv()) {
         return false;
      } else if (!this.c) {
         return !this.a.H().l();
      } else {
         return !this.a.a($$0.dk()) ? false : !($$0 instanceof cbp) || !$$0.G_() && !((cbp)$$0).f();
      }
   }

   @Override
   public void c() {
      this.a.H().a(this.d, this.b);
      this.a.v(true);
      this.h = 0;
      this.i = 0;
   }

   @Override
   public void d() {
      bjb $$0 = this.a.j();
      if (!bio.e.test($$0)) {
         this.a.h(null);
      }

      this.a.v(false);
      this.a.H().n();
   }

   @Override
   public boolean K_() {
      return true;
   }

   @Override
   public void e() {
      bjb $$0 = this.a.j();
      if ($$0 != null) {
         this.a.D().a($$0, 30.0F, 30.0F);
         this.h = Math.max(this.h - 1, 0);
         if ((this.c || this.a.J().a($$0))
            && this.h <= 0
            && (this.e == 0.0 && this.f == 0.0 && this.g == 0.0 || $$0.i(this.e, this.f, this.g) >= 1.0 || this.a.ee().i() < 0.05F)) {
            this.e = $$0.dp();
            this.f = $$0.dr();
            this.g = $$0.dv();
            this.h = 4 + this.a.ee().a(7);
            double $$1 = this.a.f((bil)$$0);
            if ($$1 > 1024.0) {
               this.h += 10;
            } else if ($$1 > 256.0) {
               this.h += 5;
            }

            if (!this.a.H().a($$0, this.b)) {
               this.h += 15;
            }

            this.h = this.a(this.h);
         }

         this.i = Math.max(this.i - 1, 0);
         this.a($$0);
      }
   }

   protected void a(bjb $$0) {
      if (this.b($$0)) {
         this.h();
         this.a.a(bgs.a);
         this.a.C($$0);
      }
   }

   protected void h() {
      this.i = this.a(20);
   }

   protected boolean i() {
      return this.i <= 0;
   }

   protected boolean b(bjb $$0) {
      return this.i() && this.a.i($$0) && this.a.J().a($$0);
   }

   protected int k() {
      return this.i;
   }

   protected int l() {
      return this.a(20);
   }
}
