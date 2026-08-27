import javax.annotation.Nullable;

public class cak extends cab {
   private static final int b = 200;
   private static final int c = 4;
   private static final int d = 10;
   private int e;
   private int f;
   @Nullable
   private blc g;

   public cak(bzy $$0) {
      super($$0);
   }

   @Override
   public void b() {
      this.e++;
      if (this.e % 2 == 0 && this.e < 10) {
         elb $$0 = this.a.D(1.0F).d();
         $$0.b((float) (-Math.PI / 4));
         double $$1 = this.a.e.dr();
         double $$2 = this.a.e.e(0.5);
         double $$3 = this.a.e.dx();

         for (int $$4 = 0; $$4 < 8; $$4++) {
            double $$5 = $$1 + this.a.eg().k() / 2.0;
            double $$6 = $$2 + this.a.eg().k() / 2.0;
            double $$7 = $$3 + this.a.eg().k() / 2.0;

            for (int $$8 = 0; $$8 < 6; $$8++) {
               this.a.dM().a(jv.i, $$5, $$6, $$7, -$$0.c * 0.08F * (double)$$8, -$$0.d * 0.6F, -$$0.e * 0.08F * (double)$$8);
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
            this.a.gb().a(cao.e);
         } else {
            this.a.gb().a(cao.g);
         }
      } else if (this.e == 10) {
         elb $$0 = new elb(this.a.e.dr() - this.a.dr(), 0.0, this.a.e.dx() - this.a.dx()).d();
         float $$1 = 5.0F;
         double $$2 = this.a.e.dr() + $$0.c * 5.0 / 2.0;
         double $$3 = this.a.e.dx() + $$0.e * 5.0 / 2.0;
         double $$4 = this.a.e.e(0.5);
         double $$5 = $$4;
         hv.a $$6 = new hv.a($$2, $$4, $$3);

         while (this.a.dM().t($$6)) {
            if (--$$5 < 0.0) {
               $$5 = $$4;
               break;
            }

            $$6.b($$2, $$5, $$3);
         }

         $$5 = (double)(aty.a($$5) + 1);
         this.g = new blc(this.a.dM(), $$2, $$5, $$3);
         this.g.a(this.a);
         this.g.a(5.0F);
         this.g.b(200);
         this.g.a(jv.i);
         this.g.a(new bks(bku.g));
         this.a.dM().b(this.g);
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
   public cao<cak> i() {
      return cao.f;
   }

   public void j() {
      this.f = 0;
   }
}
