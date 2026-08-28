import java.util.EnumSet;

public class cba<T extends cjq & cju & cjd> extends bzz {
   public static final bpr a = azh.a(1, 2);
   private final T b;
   private cba.a c = cba.a.a;
   private final double d;
   private final float e;
   private int f;
   private int g;
   private int h;

   public cba(T $$0, double $$1, float $$2) {
      this.b = $$0;
      this.d = $$1;
      this.e = $$2 * $$2;
      this.a(EnumSet.of(bzz.a.a, bzz.a.b));
   }

   @Override
   public boolean a() {
      return this.i() && this.h();
   }

   private boolean h() {
      return this.b.b(cuf.vW);
   }

   @Override
   public boolean b() {
      return this.i() && (this.a() || !this.b.K().l()) && this.h();
   }

   private boolean i() {
      return this.b.p() != null && this.b.p().bE();
   }

   @Override
   public void d() {
      super.d();
      this.b.v(false);
      this.b.h(null);
      this.f = 0;
      if (this.b.fs()) {
         this.b.fy();
         this.b.b(false);
         this.b.fu().b(kn.E, cwp.a);
      }
   }

   @Override
   public boolean R_() {
      return true;
   }

   @Override
   public void e() {
      btb $$0 = this.b.p();
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
               this.h = a.a(this.b.dT());
            }
         } else {
            this.h = 0;
            this.b.K().n();
         }

         this.b.G().a($$0, 30.0F, 30.0F);
         if (this.c == cba.a.a) {
            if (!$$4) {
               this.b.c(cne.a(this.b, cuf.vW));
               this.c = cba.a.b;
               this.b.b(true);
            }
         } else if (this.c == cba.a.b) {
            if (!this.b.fs()) {
               this.c = cba.a.a;
            }

            int $$5 = this.b.fw();
            cuc $$6 = this.b.fu();
            if ($$5 >= csp.a(this.b)) {
               this.b.fx();
               this.c = cba.a.c;
               this.g = 20 + this.b.dT().a(20);
               this.b.b(false);
            }
         } else if (this.c == cba.a.c) {
            this.g--;
            if (this.g == 0) {
               this.c = cba.a.d;
            }
         } else if (this.c == cba.a.d && $$1) {
            this.b.a($$0, 1.0F);
            this.c = cba.a.a;
         }
      }
   }

   private boolean k() {
      return this.c == cba.a.a;
   }

   static enum a {
      a,
      b,
      c,
      d;
   }
}
