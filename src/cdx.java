import java.util.EnumSet;

public class cdx<T extends cms & cmw & cmf> extends ccw {
   public static final bsj a = bab.a(1, 2);
   private final T b;
   private cdx.a c = cdx.a.a;
   private final double d;
   private final float e;
   private int f;
   private int g;
   private int h;

   public cdx(T $$0, double $$1, float $$2) {
      this.b = $$0;
      this.d = $$1;
      this.e = $$2 * $$2;
      this.a(EnumSet.of(ccw.a.a, ccw.a.b));
   }

   @Override
   public boolean b() {
      return this.i() && this.h();
   }

   private boolean h() {
      return this.b.b(cxl.wX);
   }

   @Override
   public boolean c() {
      return this.i() && (this.b() || !this.b.O().k()) && this.h();
   }

   private boolean i() {
      return this.b.f() != null && this.b.f().bJ();
   }

   @Override
   public void e() {
      super.e();
      this.b.v(false);
      this.b.h(null);
      this.f = 0;
      if (this.b.fB()) {
         this.b.fH();
         this.b.b(false);
         this.b.fD().b(kv.P, czk.a);
      }
   }

   @Override
   public boolean Q_() {
      return true;
   }

   @Override
   public void a() {
      bvy $$0 = this.b.f();
      if ($$0 != null) {
         boolean $$1 = this.b.P().a($$0);
         boolean $$2 = this.f > 0;
         if ($$1 != $$2) {
            this.f = 0;
         }

         if ($$1) {
            this.f++;
         } else {
            this.f--;
         }

         double $$3 = this.b.g((bva)$$0);
         boolean $$4 = ($$3 > (double)this.e || this.f < 5) && this.g == 0;
         if ($$4) {
            this.h--;
            if (this.h <= 0) {
               this.b.O().a($$0, this.k() ? this.d : this.d * 0.5);
               this.h = a.a(this.b.dX());
            }
         } else {
            this.h = 0;
            this.b.O().m();
         }

         this.b.J().a($$0, 30.0F, 30.0F);
         if (this.c == cdx.a.a) {
            if (!$$4) {
               this.b.c(cqm.a(this.b, cxl.wX));
               this.c = cdx.a.b;
               this.b.b(true);
            }
         } else if (this.c == cdx.a.b) {
            if (!this.b.fB()) {
               this.c = cdx.a.a;
            }

            int $$5 = this.b.fF();
            cxh $$6 = this.b.fD();
            if ($$5 >= cvz.b($$6, this.b)) {
               this.b.fG();
               this.c = cdx.a.c;
               this.g = 20 + this.b.dX().a(20);
               this.b.b(false);
            }
         } else if (this.c == cdx.a.c) {
            this.g--;
            if (this.g == 0) {
               this.c = cdx.a.d;
            }
         } else if (this.c == cdx.a.d && $$1) {
            this.b.a($$0, 1.0F);
            this.c = cdx.a.a;
         }
      }
   }

   private boolean k() {
      return this.c == cdx.a.a;
   }

   static enum a {
      a,
      b,
      c,
      d;
   }
}
