import java.util.EnumSet;

public class bzy extends bzo {
   protected final bsz a;
   private final double b;
   private final boolean c;
   private enk d;
   private double e;
   private double f;
   private double g;
   private int h;
   private int i;
   private final int j = 20;
   private long k;
   private static final long l = 20L;

   public bzy(bsz $$0, double $$1, boolean $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.a(EnumSet.of(bzo.a.a, bzo.a.b));
   }

   @Override
   public boolean a() {
      long $$0 = this.a.dP().Y();
      if ($$0 - this.k < 20L) {
         return false;
      } else {
         this.k = $$0;
         bsq $$1 = this.a.p();
         if ($$1 == null) {
            return false;
         } else if (!$$1.bD()) {
            return false;
         } else {
            this.d = this.a.K().a($$1, 0);
            return this.d != null ? true : this.a.i($$1);
         }
      }
   }

   @Override
   public boolean b() {
      bsq $$0 = this.a.p();
      if ($$0 == null) {
         return false;
      } else if (!$$0.bD()) {
         return false;
      } else if (!this.c) {
         return !this.a.K().l();
      } else {
         return !this.a.a($$0.dp()) ? false : !($$0 instanceof cly) || !$$0.N_() && !((cly)$$0).f();
      }
   }

   @Override
   public void c() {
      this.a.K().a(this.d, this.b);
      this.a.v(true);
      this.h = 0;
      this.i = 0;
   }

   @Override
   public void d() {
      bsq $$0 = this.a.p();
      if (!bsb.e.test($$0)) {
         this.a.h(null);
      }

      this.a.v(false);
      this.a.K().n();
   }

   @Override
   public boolean R_() {
      return true;
   }

   @Override
   public void e() {
      bsq $$0 = this.a.p();
      if ($$0 != null) {
         this.a.G().a($$0, 30.0F, 30.0F);
         this.h = Math.max(this.h - 1, 0);
         if ((this.c || this.a.M().a($$0))
            && this.h <= 0
            && (this.e == 0.0 && this.f == 0.0 && this.g == 0.0 || $$0.i(this.e, this.f, this.g) >= 1.0 || this.a.el().i() < 0.05F)) {
            this.e = $$0.du();
            this.f = $$0.dw();
            this.g = $$0.dA();
            this.h = 4 + this.a.el().a(7);
            double $$1 = this.a.g((brw)$$0);
            if ($$1 > 1024.0) {
               this.h += 10;
            } else if ($$1 > 256.0) {
               this.h += 5;
            }

            if (!this.a.K().a($$0, this.b)) {
               this.h += 15;
            }

            this.h = this.a(this.h);
         }

         this.i = Math.max(this.i - 1, 0);
         this.a($$0);
      }
   }

   protected void a(bsq $$0) {
      if (this.b($$0)) {
         this.h();
         this.a.a(bpv.a);
         this.a.C($$0);
      }
   }

   protected void h() {
      this.i = this.a(20);
   }

   protected boolean i() {
      return this.i <= 0;
   }

   protected boolean b(bsq $$0) {
      return this.i() && this.a.i($$0) && this.a.M().a($$0);
   }

   protected int k() {
      return this.i;
   }

   protected int l() {
      return this.a(20);
   }
}
