import java.util.EnumSet;

public class cbn<T extends ckc & ckg & cjp> extends cam {
   public static final bqe a = azy.a(1, 2);
   private final T b;
   private cbn.a c = cbn.a.a;
   private final double d;
   private final float e;
   private int f;
   private int g;
   private int h;

   public cbn(T $$0, double $$1, float $$2) {
      this.b = $$0;
      this.d = $$1;
      this.e = $$2 * $$2;
      this.a(EnumSet.of(cam.a.a, cam.a.b));
   }

   @Override
   public boolean a() {
      return this.i() && this.h();
   }

   private boolean h() {
      return this.b.b(cur.vT);
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
         this.b.fx().b(km.E, cxc.a);
      }
   }

   @Override
   public boolean R_() {
      return true;
   }

   @Override
   public void e() {
      bto $$0 = this.b.p();
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
         if (this.c == cbn.a.a) {
            if (!$$4) {
               this.b.c(cnq.a(this.b, cur.vT));
               this.c = cbn.a.b;
               this.b.b(true);
            }
         } else if (this.c == cbn.a.b) {
            if (!this.b.fv()) {
               this.c = cbn.a.a;
            }

            int $$5 = this.b.fz();
            cuo $$6 = this.b.fx();
            if ($$5 >= ctb.l($$6)) {
               this.b.fA();
               this.c = cbn.a.c;
               this.g = 20 + this.b.el().a(20);
               this.b.b(false);
            }
         } else if (this.c == cbn.a.c) {
            this.g--;
            if (this.g == 0) {
               this.c = cbn.a.d;
            }
         } else if (this.c == cbn.a.d && $$1) {
            this.b.a($$0, 1.0F);
            this.c = cbn.a.a;
         }
      }
   }

   private boolean k() {
      return this.c == cbn.a.a;
   }

   static enum a {
      a,
      b,
      c,
      d;
   }
}
