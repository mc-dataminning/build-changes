import java.util.EnumSet;

public class bzy<T extends cin & cir & cia> extends byx {
   public static final box a = ayy.a(1, 2);
   private final T b;
   private bzy.a c = bzy.a.a;
   private final double d;
   private final float e;
   private int f;
   private int g;
   private int h;

   public bzy(T $$0, double $$1, float $$2) {
      this.b = $$0;
      this.d = $$1;
      this.e = $$2 * $$2;
      this.a(EnumSet.of(byx.a.a, byx.a.b));
   }

   @Override
   public boolean a() {
      return this.i() && this.h();
   }

   private boolean h() {
      return this.b.b(ctc.vT);
   }

   @Override
   public boolean b() {
      return this.i() && (this.a() || !this.b.K().l()) && this.h();
   }

   private boolean i() {
      return this.b.p() != null && this.b.p().bB();
   }

   @Override
   public void d() {
      super.d();
      this.b.v(false);
      this.b.h(null);
      this.f = 0;
      if (this.b.ft()) {
         this.b.fz();
         this.b.b(false);
         this.b.fv().b(ka.C, cvl.a);
      }
   }

   @Override
   public boolean R_() {
      return true;
   }

   @Override
   public void e() {
      bsa $$0 = this.b.p();
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

         double $$3 = this.b.g($$0);
         boolean $$4 = ($$3 > (double)this.e || this.f < 5) && this.g == 0;
         if ($$4) {
            this.h--;
            if (this.h <= 0) {
               this.b.K().a($$0, this.k() ? this.d : this.d * 0.5);
               this.h = a.a(this.b.ej());
            }
         } else {
            this.h = 0;
            this.b.K().n();
         }

         this.b.G().a($$0, 30.0F, 30.0F);
         if (this.c == bzy.a.a) {
            if (!$$4) {
               this.b.c(cmb.a(this.b, ctc.vT));
               this.c = bzy.a.b;
               this.b.b(true);
            }
         } else if (this.c == bzy.a.b) {
            if (!this.b.ft()) {
               this.c = bzy.a.a;
            }

            int $$5 = this.b.fx();
            csz $$6 = this.b.fv();
            if ($$5 >= crm.l($$6)) {
               this.b.fy();
               this.c = bzy.a.c;
               this.g = 20 + this.b.ej().a(20);
               this.b.b(false);
            }
         } else if (this.c == bzy.a.c) {
            this.g--;
            if (this.g == 0) {
               this.c = bzy.a.d;
            }
         } else if (this.c == bzy.a.d && $$1) {
            this.b.a($$0, 1.0F);
            this.c = bzy.a.a;
         }
      }
   }

   private boolean k() {
      return this.c == bzy.a.a;
   }

   static enum a {
      a,
      b,
      c,
      d;
   }
}
