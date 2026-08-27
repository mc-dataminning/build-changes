import java.util.EnumSet;

public class cam<T extends cjd & cji & cip> extends bzl {
   public static final bpl a = azl.a(1, 2);
   private final T b;
   private cam.a c = cam.a.a;
   private final double d;
   private final float e;
   private int f;
   private int g;
   private int h;

   public cam(T $$0, double $$1, float $$2) {
      this.b = $$0;
      this.d = $$1;
      this.e = $$2 * $$2;
      this.a(EnumSet.of(bzl.a.a, bzl.a.b));
   }

   @Override
   public boolean a() {
      return this.i() && this.h();
   }

   private boolean h() {
      return this.b.b(cuk.xE);
   }

   @Override
   public boolean b() {
      return this.i() && (this.a() || !this.b.J().l()) && this.h();
   }

   private boolean i() {
      return this.b.p() != null && this.b.p().bI();
   }

   @Override
   public void d() {
      super.d();
      this.b.v(false);
      this.b.h(null);
      this.f = 0;
      if (this.b.fE()) {
         this.b.fK();
         this.b.b(false);
         this.b.fG().b(ke.C, cxe.a);
      }
   }

   @Override
   public boolean S_() {
      return true;
   }

   @Override
   public void e() {
      bso $$0 = this.b.p();
      if ($$0 != null) {
         boolean $$1 = this.b.K().a($$0);
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
               this.b.J().a($$0, this.k() ? this.d : this.d * 0.5);
               this.h = a.a(this.b.et());
            }
         } else {
            this.h = 0;
            this.b.J().n();
         }

         this.b.F().a($$0, 30.0F, 30.0F);
         if (this.c == cam.a.a) {
            if (!$$4) {
               this.b.c(cmu.a(this.b, cuk.xE));
               this.c = cam.a.b;
               this.b.b(true);
            }
         } else if (this.c == cam.a.b) {
            if (!this.b.fE()) {
               this.c = cam.a.a;
            }

            int $$5 = this.b.fI();
            cuh $$6 = this.b.fG();
            if ($$5 >= css.l($$6)) {
               this.b.fJ();
               this.c = cam.a.c;
               this.g = 20 + this.b.et().a(20);
               this.b.b(false);
            }
         } else if (this.c == cam.a.c) {
            this.g--;
            if (this.g == 0) {
               this.c = cam.a.d;
            }
         } else if (this.c == cam.a.d && $$1) {
            this.b.a($$0, 1.0F);
            this.c = cam.a.a;
         }
      }
   }

   private boolean k() {
      return this.c == cam.a.a;
   }

   static enum a {
      a,
      b,
      c,
      d;
   }
}
