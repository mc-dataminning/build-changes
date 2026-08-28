import javax.annotation.Nullable;

public class chq extends can {
   private final chp a;

   public chq(chp $$0) {
      this.a = $$0;
   }

   @Override
   public boolean a() {
      return this.a.dP().a(this.a.du(), this.a.dw(), this.a.dA(), 10.0);
   }

   @Override
   public void e() {
      arf $$0 = (arf)this.a.dP();
      bqs $$1 = $$0.d_(this.a.dp());
      this.a.w(false);
      this.a.x(true);
      this.a.c_(0);
      bto $$2 = bta.am.a((dby)$$0);
      if ($$2 != null) {
         $$2.e(this.a.du(), this.a.dw(), this.a.dA());
         $$2.a(true);
         $$0.b($$2);
         ckl $$3 = this.a($$1, this.a);
         if ($$3 != null) {
            $$3.n(this.a);
            $$0.a_($$3);

            for (int $$4 = 0; $$4 < 3; $$4++) {
               chj $$5 = this.a($$1);
               if ($$5 != null) {
                  ckl $$6 = this.a($$1, $$5);
                  if ($$6 != null) {
                     $$6.n($$5);
                     $$5.j(this.a.el().a(0.0, 1.1485), 0.0, this.a.el().a(0.0, 1.1485));
                     $$0.a_($$5);
                  }
               }
            }
         }
      }
   }

   @Nullable
   private chj a(bqs $$0) {
      chp $$1 = bta.aO.a(this.a.dP());
      if ($$1 != null) {
         $$1.a((arf)this.a.dP(), $$0, btt.k, null);
         $$1.a_(this.a.du(), this.a.dw(), this.a.dA());
         $$1.am = 60;
         $$1.fU();
         $$1.x(true);
         $$1.c_(0);
      }

      return $$1;
   }

   @Nullable
   private ckl a(bqs $$0, chj $$1) {
      ckl $$2 = bta.aN.a($$1.dP());
      if ($$2 != null) {
         $$2.a((arf)$$1.dP(), $$0, btt.k, null);
         $$2.a_($$1.du(), $$1.dw(), $$1.dA());
         $$2.am = 60;
         $$2.fU();
         if ($$2.a(btb.f).e()) {
            $$2.a(btb.f, new cup(cus.pG));
         }

         cpl $$3 = $$1.dP().J();
         $$2.a(btb.a, dab.a($$3, $$2.el(), this.a($$2.eX()), (int)(5.0F + $$0.d() * (float)$$2.el().a(18)), false));
         $$2.a(btb.f, dab.a($$3, $$2.el(), this.a($$2.a(btb.f)), (int)(5.0F + $$0.d() * (float)$$2.el().a(18)), false));
      }

      return $$2;
   }

   private cup a(cup $$0) {
      $$0.b(km.k, daf.a);
      return $$0;
   }
}
