import javax.annotation.Nullable;

public class cje extends civ {
   private static final int b = 200;
   private static final int c = 4;
   private static final int d = 10;
   private int e;
   private int f;
   @Nullable
   private bte g;

   public cje(cis $$0) {
      super($$0);
   }

   @Override
   public void b() {
      this.e++;
      if (this.e % 2 == 0 && this.e < 10) {
         eye $$0 = this.a.J(1.0F).d();
         $$0.b((float) (-Math.PI / 4));
         double $$1 = this.a.d.dx();
         double $$2 = this.a.d.e(0.5);
         double $$3 = this.a.d.dD();

         for (int $$4 = 0; $$4 < 8; $$4++) {
            double $$5 = $$1 + this.a.dV().k() / 2.0;
            double $$6 = $$2 + this.a.dV().k() / 2.0;
            double $$7 = $$3 + this.a.dV().k() / 2.0;

            for (int $$8 = 0; $$8 < 6; $$8++) {
               this.a.dS().a(ln.h, $$5, $$6, $$7, -$$0.d * 0.08F * (double)$$8, -$$0.e * 0.6F, -$$0.f * 0.08F * (double)$$8);
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
            this.a.gl().a(cji.e);
         } else {
            this.a.gl().a(cji.g);
         }
      } else if (this.e == 10) {
         eye $$0 = new eye(this.a.d.dx() - this.a.dx(), 0.0, this.a.d.dD() - this.a.dD()).d();
         float $$1 = 5.0F;
         double $$2 = this.a.d.dx() + $$0.d * 5.0 / 2.0;
         double $$3 = this.a.d.dD() + $$0.f * 5.0 / 2.0;
         double $$4 = this.a.d.e(0.5);
         double $$5 = $$4;
         je.a $$6 = new je.a($$2, $$4, $$3);

         while (this.a.dS().u($$6)) {
            if (--$$5 < 0.0) {
               $$5 = $$4;
               break;
            }

            $$6.b($$2, $$5, $$3);
         }

         $$5 = (double)(azc.a($$5) + 1);
         this.g = new bte(this.a.dS(), $$2, $$5, $$3);
         this.g.a(this.a);
         this.g.a(5.0F);
         this.g.a(200);
         this.g.a(ln.h);
         this.g.a(new bsq(bss.g));
         this.a.dS().b(this.g);
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
         this.g.as();
         this.g = null;
      }
   }

   @Override
   public cji<cje> i() {
      return cji.f;
   }

   public void j() {
      this.f = 0;
   }
}
