import java.util.EnumSet;

public class cap<T extends cje & cji & cir> extends bzo {
   public static final bph a = aze.a(1, 2);
   private final T b;
   private cap.a c = cap.a.a;
   private final double d;
   private final float e;
   private int f;
   private int g;
   private int h;

   public cap(T $$0, double $$1, float $$2) {
      this.b = $$0;
      this.d = $$1;
      this.e = $$2 * $$2;
      this.a(EnumSet.of(bzo.a.a, bzo.a.b));
   }

   @Override
   public boolean a() {
      return this.i() && this.h();
   }

   private boolean h() {
      return this.b.b(ctt.vT);
   }

   @Override
   public boolean b() {
      return this.i() && (this.a() || !this.b.K().l()) && this.h();
   }

   private boolean i() {
      return this.b.p() != null && this.b.p().bD();
   }

   @Override
   public void d() {
      super.d();
      this.b.v(false);
      this.b.h(null);
      this.f = 0;
      if (this.b.fv()) {
         this.b.fB();
         this.b.b(false);
         this.b.fx().b(kb.D, cwe.a);
      }
   }

   @Override
   public boolean R_() {
      return true;
   }

   @Override
   public void e() {
      bsq $$0 = this.b.p();
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
               this.h = a.a(this.b.el());
            }
         } else {
            this.h = 0;
            this.b.K().n();
         }

         this.b.G().a($$0, 30.0F, 30.0F);
         if (this.c == cap.a.a) {
            if (!$$4) {
               this.b.c(cms.a(this.b, ctt.vT));
               this.c = cap.a.b;
               this.b.b(true);
            }
         } else if (this.c == cap.a.b) {
            if (!this.b.fv()) {
               this.c = cap.a.a;
            }

            int $$5 = this.b.fz();
            ctq $$6 = this.b.fx();
            if ($$5 >= csd.l($$6)) {
               this.b.fA();
               this.c = cap.a.c;
               this.g = 20 + this.b.el().a(20);
               this.b.b(false);
            }
         } else if (this.c == cap.a.c) {
            this.g--;
            if (this.g == 0) {
               this.c = cap.a.d;
            }
         } else if (this.c == cap.a.d && $$1) {
            this.b.a($$0, 1.0F);
            this.c = cap.a.a;
         }
      }
   }

   private boolean k() {
      return this.c == cap.a.a;
   }

   static enum a {
      a,
      b,
      c,
      d;
   }
}
