import java.util.EnumSet;

public class cea<T extends cms & cmw & cmf> extends ccz {
   public static final bsp a = bbg.a(1, 2);
   private final T b;
   private cea.a c = cea.a.a;
   private final double d;
   private final float e;
   private int f;
   private int g;
   private int h;

   public cea(T $$0, double $$1, float $$2) {
      this.b = $$0;
      this.d = $$1;
      this.e = $$2 * $$2;
      this.a(EnumSet.of(ccz.a.a, ccz.a.b));
   }

   @Override
   public boolean b() {
      return this.i() && this.h();
   }

   private boolean h() {
      return this.b.b(cxo.wL);
   }

   @Override
   public boolean c() {
      return this.i() && (this.b() || !this.b.L().m()) && this.h();
   }

   private boolean i() {
      return this.b.O_() != null && this.b.O_().bL();
   }

   @Override
   public void e() {
      super.e();
      this.b.w(false);
      this.b.h(null);
      this.f = 0;
      if (this.b.fx()) {
         this.b.fD();
         this.b.b(false);
         this.b.fz().b(ku.O, czp.a);
      }
   }

   @Override
   public boolean V_() {
      return true;
   }

   @Override
   public void a() {
      bwb $$0 = this.b.O_();
      if ($$0 != null) {
         boolean $$1 = this.b.N().a($$0);
         boolean $$2 = this.f > 0;
         if ($$1 != $$2) {
            this.f = 0;
         }

         if ($$1) {
            this.f++;
         } else {
            this.f--;
         }

         double $$3 = this.b.g((bvf)$$0);
         boolean $$4 = ($$3 > (double)this.e || this.f < 5) && this.g == 0;
         if ($$4) {
            this.h--;
            if (this.h <= 0) {
               this.b.L().a($$0, this.k() ? this.d : this.d * 0.5);
               this.h = a.a(this.b.dY());
            }
         } else {
            this.h = 0;
            this.b.L().o();
         }

         this.b.H().a($$0, 30.0F, 30.0F);
         if (this.c == cea.a.a) {
            if (!$$4) {
               this.b.c(cqn.a(this.b, cxo.wL));
               this.c = cea.a.b;
               this.b.b(true);
            }
         } else if (this.c == cea.a.b) {
            if (!this.b.fx()) {
               this.c = cea.a.a;
            }

            int $$5 = this.b.fB();
            cxk $$6 = this.b.fz();
            if ($$5 >= cwb.b($$6, this.b)) {
               this.b.fC();
               this.c = cea.a.c;
               this.g = 20 + this.b.dY().a(20);
               this.b.b(false);
            }
         } else if (this.c == cea.a.c) {
            this.g--;
            if (this.g == 0) {
               this.c = cea.a.d;
            }
         } else if (this.c == cea.a.d && $$1) {
            this.b.a($$0, 1.0F);
            this.c = cea.a.a;
         }
      }
   }

   private boolean k() {
      return this.c == cea.a.a;
   }

   static enum a {
      a,
      b,
      c,
      d;
   }
}
