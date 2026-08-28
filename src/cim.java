import javax.annotation.Nullable;

public class cim extends cid {
   private static final int b = 200;
   private static final int c = 4;
   private static final int d = 10;
   private int e;
   private int f;
   @Nullable
   private bsp g;

   public cim(cia $$0) {
      super($$0);
   }

   @Override
   public void b() {
      this.e++;
      if (this.e % 2 == 0 && this.e < 10) {
         evq $$0 = this.a.F(1.0F).d();
         $$0.b((float) (-Math.PI / 4));
         double $$1 = this.a.e.du();
         double $$2 = this.a.e.e(0.5);
         double $$3 = this.a.e.dA();

         for (int $$4 = 0; $$4 < 8; $$4++) {
            double $$5 = $$1 + this.a.el().k() / 2.0;
            double $$6 = $$2 + this.a.el().k() / 2.0;
            double $$7 = $$3 + this.a.el().k() / 2.0;

            for (int $$8 = 0; $$8 < 6; $$8++) {
               this.a.dP().a(li.h, $$5, $$6, $$7, -$$0.c * 0.08F * (double)$$8, -$$0.d * 0.6F, -$$0.e * 0.08F * (double)$$8);
            }

            $$0.b((float) (Math.PI / 16));
         }
      }
   }

   @Override
   public void c() {
      this.e++;
      if (this.e >= 200) {
         if (this.f >= 4) {
            this.a.gn().a(ciq.e);
         } else {
            this.a.gn().a(ciq.g);
         }
      } else if (this.e == 10) {
         evq $$0 = new evq(this.a.e.du() - this.a.du(), 0.0, this.a.e.dA() - this.a.dA()).d();
         float $$1 = 5.0F;
         double $$2 = this.a.e.du() + $$0.c * 5.0 / 2.0;
         double $$3 = this.a.e.dA() + $$0.e * 5.0 / 2.0;
         double $$4 = this.a.e.e(0.5);
         double $$5 = $$4;
         iz.a $$6 = new iz.a($$2, $$4, $$3);

         while (this.a.dP().u($$6)) {
            if (--$$5 < 0.0) {
               $$5 = $$4;
               break;
            }

            $$6.b($$2, $$5, $$3);
         }

         $$5 = (double)(ayy.a($$5) + 1);
         this.g = new bsp(this.a.dP(), $$2, $$5, $$3);
         this.g.a(this.a);
         this.g.a(5.0F);
         this.g.a(200);
         this.g.a(li.h);
         this.g.a(new bsb(bsd.g));
         this.a.dP().b(this.g);
      }
   }

   @Override
   public void d() {
      this.e = 0;
      this.f++;
   }

   @Override
   public void e() {
      if (this.g != null) {
         this.g.ao();
         this.g = null;
      }
   }

   @Override
   public ciq<cim> i() {
      return ciq.f;
   }

   public void j() {
      this.f = 0;
   }
}
