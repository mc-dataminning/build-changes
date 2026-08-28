import java.util.EnumSet;

public class ceo<T extends cnj & cnn & cmw> extends cdn {
   public static final btb a = bam.a(1, 2);
   private final T b;
   private ceo.a c = ceo.a.a;
   private final double d;
   private final float e;
   private int f;
   private int g;
   private int h;

   public ceo(T $$0, double $$1, float $$2) {
      this.b = $$0;
      this.d = $$1;
      this.e = $$2 * $$2;
      this.a(EnumSet.of(cdn.a.a, cdn.a.b));
   }

   @Override
   public boolean b() {
      return this.i() && this.h();
   }

   private boolean h() {
      return this.b.b(cyc.wZ);
   }

   @Override
   public boolean c() {
      return this.i() && (this.b() || !this.b.O().k()) && this.h();
   }

   private boolean i() {
      return this.b.f() != null && this.b.f().bK();
   }

   @Override
   public void e() {
      super.e();
      this.b.v(false);
      this.b.h(null);
      this.f = 0;
      if (this.b.fy()) {
         this.b.fE();
         this.b.b(false);
         this.b.fA().b(kx.P, daa.a);
      }
   }

   @Override
   public boolean Q_() {
      return true;
   }

   @Override
   public void a() {
      bwr $$0 = this.b.f();
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

         double $$3 = this.b.g((bvs)$$0);
         boolean $$4 = ($$3 > (double)this.e || this.f < 5) && this.g == 0;
         if ($$4) {
            this.h--;
            if (this.h <= 0) {
               this.b.O().a($$0, this.k() ? this.d : this.d * 0.5);
               this.h = a.a(this.b.dY());
            }
         } else {
            this.h = 0;
            this.b.O().m();
         }

         this.b.J().a($$0, 30.0F, 30.0F);
         if (this.c == ceo.a.a) {
            if (!$$4) {
               this.b.c(crd.a(this.b, cyc.wZ));
               this.c = ceo.a.b;
               this.b.b(true);
            }
         } else if (this.c == ceo.a.b) {
            if (!this.b.fy()) {
               this.c = ceo.a.a;
            }

            int $$5 = this.b.fC();
            cxy $$6 = this.b.fA();
            if ($$5 >= cwq.b($$6, this.b)) {
               this.b.fD();
               this.c = ceo.a.c;
               this.g = 20 + this.b.dY().a(20);
               this.b.b(false);
            }
         } else if (this.c == ceo.a.c) {
            this.g--;
            if (this.g == 0) {
               this.c = ceo.a.d;
            }
         } else if (this.c == ceo.a.d && $$1) {
            this.b.a($$0, 1.0F);
            this.c = ceo.a.a;
         }
      }
   }

   private boolean k() {
      return this.c == ceo.a.a;
   }

   static enum a {
      a,
      b,
      c,
      d;
   }
}
