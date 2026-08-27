import java.util.EnumSet;

public class bzc<T extends chr & chv & che> extends byb {
   public static final bob a = ayv.a(1, 2);
   private final T b;
   private bzc.a c = bzc.a.a;
   private final double d;
   private final float e;
   private int f;
   private int g;
   private int h;

   public bzc(T $$0, double $$1, float $$2) {
      this.b = $$0;
      this.d = $$1;
      this.e = $$2 * $$2;
      this.a(EnumSet.of(byb.a.a, byb.a.b));
   }

   @Override
   public boolean a() {
      return this.i() && this.h();
   }

   private boolean h() {
      return this.b.b(csg.vT);
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
         this.b.fv().b(jz.v, cup.a);
      }
   }

   @Override
   public boolean R_() {
      return true;
   }

   @Override
   public void e() {
      bre $$0 = this.b.p();
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
         if (this.c == bzc.a.a) {
            if (!$$4) {
               this.b.c(clf.a(this.b, csg.vT));
               this.c = bzc.a.b;
               this.b.b(true);
            }
         } else if (this.c == bzc.a.b) {
            if (!this.b.ft()) {
               this.c = bzc.a.a;
            }

            int $$5 = this.b.fx();
            csd $$6 = this.b.fv();
            if ($$5 >= cqq.l($$6)) {
               this.b.fy();
               this.c = bzc.a.c;
               this.g = 20 + this.b.ej().a(20);
               this.b.b(false);
            }
         } else if (this.c == bzc.a.c) {
            this.g--;
            if (this.g == 0) {
               this.c = bzc.a.d;
            }
         } else if (this.c == bzc.a.d && $$1) {
            this.b.a($$0, 1.0F);
            this.c = bzc.a.a;
         }
      }
   }

   private boolean k() {
      return this.c == bzc.a.a;
   }

   static enum a {
      a,
      b,
      c,
      d;
   }
}
