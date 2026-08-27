import java.util.EnumSet;

public class bsf<T extends cal & cap & bzy> extends bre {
   public static final bhm a = atw.a(1, 2);
   private final T b;
   private bsf.a c = bsf.a.a;
   private final double d;
   private final float e;
   private int f;
   private int g;
   private int h;

   public bsf(T $$0, double $$1, float $$2) {
      this.b = $$0;
      this.d = $$1;
      this.e = $$2 * $$2;
      this.a(EnumSet.of(bre.a.a, bre.a.b));
   }

   @Override
   public boolean a() {
      return this.i() && this.h();
   }

   private boolean h() {
      return this.b.b(ckm.uZ);
   }

   @Override
   public boolean b() {
      return this.i() && (this.a() || !this.b.L().l()) && this.h();
   }

   private boolean i() {
      return this.b.q() != null && this.b.q().bv();
   }

   @Override
   public void d() {
      super.d();
      this.b.v(false);
      this.b.h(null);
      this.f = 0;
      if (this.b.fn()) {
         this.b.ft();
         this.b.b(false);
         cir.a(this.b.fp(), false);
      }
   }

   @Override
   public boolean R_() {
      return true;
   }

   @Override
   public void e() {
      bkj $$0 = this.b.q();
      if ($$0 != null) {
         boolean $$1 = this.b.M().a($$0);
         boolean $$2 = this.f > 0;
         if ($$1 != $$2) {
            this.f = 0;
         }

         if ($$1) {
            this.f++;
         } else {
            this.f--;
         }

         double $$3 = this.b.f($$0);
         boolean $$4 = ($$3 > (double)this.e || this.f < 5) && this.g == 0;
         if ($$4) {
            this.h--;
            if (this.h <= 0) {
               this.b.L().a($$0, this.k() ? this.d : this.d * 0.5);
               this.h = a.a(this.b.ef());
            }
         } else {
            this.h = 0;
            this.b.L().n();
         }

         this.b.G().a($$0, 30.0F, 30.0F);
         if (this.c == bsf.a.a) {
            if (!$$4) {
               this.b.c(cdq.a(this.b, ckm.uZ));
               this.c = bsf.a.b;
               this.b.b(true);
            }
         } else if (this.c == bsf.a.b) {
            if (!this.b.fn()) {
               this.c = bsf.a.a;
            }

            int $$5 = this.b.fr();
            ckj $$6 = this.b.fp();
            if ($$5 >= cir.k($$6)) {
               this.b.fs();
               this.c = bsf.a.c;
               this.g = 20 + this.b.ef().a(20);
               this.b.b(false);
            }
         } else if (this.c == bsf.a.c) {
            this.g--;
            if (this.g == 0) {
               this.c = bsf.a.d;
            }
         } else if (this.c == bsf.a.d && $$1) {
            this.b.a($$0, 1.0F);
            ckj $$7 = this.b.b(cdq.a(this.b, ckm.uZ));
            cir.a($$7, false);
            this.c = bsf.a.a;
         }
      }
   }

   private boolean k() {
      return this.c == bsf.a.a;
   }

   static enum a {
      a,
      b,
      c,
      d;
   }
}
