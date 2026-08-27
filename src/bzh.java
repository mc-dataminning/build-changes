import java.util.EnumSet;

public class bzh extends byx {
   protected final bsi a;
   private final double b;
   private final boolean c;
   private emo d;
   private double e;
   private double f;
   private double g;
   private int h;
   private int i;
   private final int j = 20;
   private long k;
   private static final long l = 20L;

   public bzh(bsi $$0, double $$1, boolean $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.a(EnumSet.of(byx.a.a, byx.a.b));
   }

   @Override
   public boolean a() {
      long $$0 = this.a.dN().Y();
      if ($$0 - this.k < 20L) {
         return false;
      } else {
         this.k = $$0;
         bsa $$1 = this.a.p();
         if ($$1 == null) {
            return false;
         } else if (!$$1.bB()) {
            return false;
         } else {
            this.d = this.a.K().a($$1, 0);
            return this.d != null ? true : this.a.i($$1);
         }
      }
   }

   @Override
   public boolean b() {
      bsa $$0 = this.a.p();
      if ($$0 == null) {
         return false;
      } else if (!$$0.bB()) {
         return false;
      } else if (!this.c) {
         return !this.a.K().l();
      } else {
         return !this.a.a($$0.dn()) ? false : !($$0 instanceof clh) || !$$0.N_() && !((clh)$$0).f();
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
      bsa $$0 = this.a.p();
      if (!brm.e.test($$0)) {
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
      bsa $$0 = this.a.p();
      if ($$0 != null) {
         this.a.G().a($$0, 30.0F, 30.0F);
         this.h = Math.max(this.h - 1, 0);
         if ((this.c || this.a.M().a($$0))
            && this.h <= 0
            && (this.e == 0.0 && this.f == 0.0 && this.g == 0.0 || $$0.i(this.e, this.f, this.g) >= 1.0 || this.a.ej().i() < 0.05F)) {
            this.e = $$0.ds();
            this.f = $$0.du();
            this.g = $$0.dy();
            this.h = 4 + this.a.ej().a(7);
            double $$1 = this.a.g((brh)$$0);
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

   protected void a(bsa $$0) {
      if (this.b($$0)) {
         this.h();
         this.a.a(bpl.a);
         this.a.C($$0);
      }
   }

   protected void h() {
      this.i = this.a(20);
   }

   protected boolean i() {
      return this.i <= 0;
   }

   protected boolean b(bsa $$0) {
      return this.i() && this.a.i($$0) && this.a.M().a($$0);
   }

   protected int k() {
      return this.i;
   }

   protected int l() {
      return this.a(20);
   }
}
