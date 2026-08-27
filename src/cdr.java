import javax.annotation.Nullable;

public class cdr extends cdi {
   private static final int b = 200;
   private static final int c = 4;
   private static final int d = 10;
   private int e;
   private int f;
   @Nullable
   private boc g;

   public cdr(cdf $$0) {
      super($$0);
   }

   @Override
   public void b() {
      this.e++;
      if (this.e % 2 == 0 && this.e < 10) {
         eov $$0 = this.a.D(1.0F).d();
         $$0.b((float) (-Math.PI / 4));
         double $$1 = this.a.e.do();
         double $$2 = this.a.e.e(0.5);
         double $$3 = this.a.e.du();

         for (int $$4 = 0; $$4 < 8; $$4++) {
            double $$5 = $$1 + this.a.ef().k() / 2.0;
            double $$6 = $$2 + this.a.ef().k() / 2.0;
            double $$7 = $$3 + this.a.ef().k() / 2.0;

            for (int $$8 = 0; $$8 < 6; $$8++) {
               this.a.dJ().a(kb.i, $$5, $$6, $$7, -$$0.c * 0.08F * (double)$$8, -$$0.d * 0.6F, -$$0.e * 0.08F * (double)$$8);
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
            this.a.gi().a(cdv.e);
         } else {
            this.a.gi().a(cdv.g);
         }
      } else if (this.e == 10) {
         eov $$0 = new eov(this.a.e.do() - this.a.do(), 0.0, this.a.e.du() - this.a.du()).d();
         float $$1 = 5.0F;
         double $$2 = this.a.e.do() + $$0.c * 5.0 / 2.0;
         double $$3 = this.a.e.du() + $$0.e * 5.0 / 2.0;
         double $$4 = this.a.e.e(0.5);
         double $$5 = $$4;
         ib.a $$6 = new ib.a($$2, $$4, $$3);

         while (this.a.dJ().u($$6)) {
            if (--$$5 < 0.0) {
               $$5 = $$4;
               break;
            }

            $$6.b($$2, $$5, $$3);
         }

         $$5 = (double)(awm.a($$5) + 1);
         this.g = new boc(this.a.dJ(), $$2, $$5, $$3);
         this.g.a(this.a);
         this.g.a(5.0F);
         this.g.b(200);
         this.g.a(kb.i);
         this.g.a(new bns(bnu.g));
         this.a.dJ().b(this.g);
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
   public cdv<cdr> i() {
      return cdv.f;
   }

   public void j() {
      this.f = 0;
   }
}
