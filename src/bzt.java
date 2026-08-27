import javax.annotation.Nullable;

public class bzt extends bzk {
   private static final int b = 200;
   private static final int c = 4;
   private static final int d = 10;
   private int e;
   private int f;
   @Nullable
   private bkn g;

   public bzt(bzh $$0) {
      super($$0);
   }

   @Override
   public void b() {
      this.e++;
      if (this.e % 2 == 0 && this.e < 10) {
         eju $$0 = this.a.D(1.0F).d();
         $$0.b((float) (-Math.PI / 4));
         double $$1 = this.a.e.ds();
         double $$2 = this.a.e.e(0.5);
         double $$3 = this.a.e.dy();

         for (int $$4 = 0; $$4 < 8; $$4++) {
            double $$5 = $$1 + this.a.eh().k() / 2.0;
            double $$6 = $$2 + this.a.eh().k() / 2.0;
            double $$7 = $$3 + this.a.eh().k() / 2.0;

            for (int $$8 = 0; $$8 < 6; $$8++) {
               this.a.dN().a(js.i, $$5, $$6, $$7, -$$0.c * 0.08F * (double)$$8, -$$0.d * 0.6F, -$$0.e * 0.08F * (double)$$8);
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
            this.a.gc().a(bzx.e);
         } else {
            this.a.gc().a(bzx.g);
         }
      } else if (this.e == 10) {
         eju $$0 = new eju(this.a.e.ds() - this.a.ds(), 0.0, this.a.e.dy() - this.a.dy()).d();
         float $$1 = 5.0F;
         double $$2 = this.a.e.ds() + $$0.c * 5.0 / 2.0;
         double $$3 = this.a.e.dy() + $$0.e * 5.0 / 2.0;
         double $$4 = this.a.e.e(0.5);
         double $$5 = $$4;
         ht.a $$6 = new ht.a($$2, $$4, $$3);

         while (this.a.dN().t($$6)) {
            if (--$$5 < 0.0) {
               $$5 = $$4;
               break;
            }

            $$6.b($$2, $$5, $$3);
         }

         $$5 = (double)(atm.a($$5) + 1);
         this.g = new bkn(this.a.dN(), $$2, $$5, $$3);
         this.g.a(this.a);
         this.g.a(5.0F);
         this.g.b(200);
         this.g.a(js.i);
         this.g.a(new bkd(bkf.g));
         this.a.dN().b(this.g);
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
         this.g.am();
         this.g = null;
      }
   }

   @Override
   public bzx<bzt> i() {
      return bzx.f;
   }

   public void j() {
      this.f = 0;
   }
}
