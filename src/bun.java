import javax.annotation.Nullable;

public class bun extends bue {
   private static final int b = 200;
   private static final int c = 4;
   private static final int d = 10;
   private int e;
   private int f;
   @Nullable
   private bfg g;

   public bun(bub $$0) {
      super($$0);
   }

   @Override
   public void b() {
      this.e++;
      if (this.e % 2 == 0 && this.e < 10) {
         eei $$0 = this.a.C(1.0F).d();
         $$0.b((float) (-Math.PI / 4));
         double $$1 = this.a.e.dn();
         double $$2 = this.a.e.e(0.5);
         double $$3 = this.a.e.dt();

         for (int $$4 = 0; $$4 < 8; $$4++) {
            double $$5 = $$1 + this.a.ec().k() / 2.0;
            double $$6 = $$2 + this.a.ec().k() / 2.0;
            double $$7 = $$3 + this.a.ec().k() / 2.0;

            for (int $$8 = 0; $$8 < 6; $$8++) {
               this.a.dI().a(iv.i, $$5, $$6, $$7, -$$0.c * 0.08F * (double)$$8, -$$0.d * 0.6F, -$$0.e * 0.08F * (double)$$8);
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
            this.a.fW().a(bur.e);
         } else {
            this.a.fW().a(bur.g);
         }
      } else if (this.e == 10) {
         eei $$0 = new eei(this.a.e.dn() - this.a.dn(), 0.0, this.a.e.dt() - this.a.dt()).d();
         float $$1 = 5.0F;
         double $$2 = this.a.e.dn() + $$0.c * 5.0 / 2.0;
         double $$3 = this.a.e.dt() + $$0.e * 5.0 / 2.0;
         double $$4 = this.a.e.e(0.5);
         double $$5 = $$4;
         gu.a $$6 = new gu.a($$2, $$4, $$3);

         while (this.a.dI().t($$6)) {
            if (--$$5 < 0.0) {
               $$5 = $$4;
               break;
            }

            $$6.b($$2, $$5, $$3);
         }

         $$5 = (double)(apa.a($$5) + 1);
         this.g = new bfg(this.a.dI(), $$2, $$5, $$3);
         this.g.a(this.a);
         this.g.a(5.0F);
         this.g.b(200);
         this.g.a(iv.i);
         this.g.a(new bfa(bfc.g));
         this.a.dI().b(this.g);
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
         this.g.ai();
         this.g = null;
      }
   }

   @Override
   public bur<bun> i() {
      return bur.f;
   }

   public void j() {
      this.f = 0;
   }
}
