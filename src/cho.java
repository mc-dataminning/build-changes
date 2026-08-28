import javax.annotation.Nullable;

public class cho extends cal {
   private final chn a;

   public cho(chn $$0) {
      this.a = $$0;
   }

   @Override
   public boolean a() {
      return this.a.dP().a(this.a.du(), this.a.dw(), this.a.dA(), 10.0);
   }

   @Override
   public void e() {
      are $$0 = (are)this.a.dP();
      bqq $$1 = $$0.d_(this.a.dp());
      this.a.w(false);
      this.a.x(true);
      this.a.c_(0);
      btm $$2 = bsy.am.a((dbw)$$0);
      if ($$2 != null) {
         $$2.e(this.a.du(), this.a.dw(), this.a.dA());
         $$2.a(true);
         $$0.b($$2);
         ckj $$3 = this.a($$1, this.a);
         if ($$3 != null) {
            $$3.n(this.a);
            $$0.a_($$3);

            for (int $$4 = 0; $$4 < 3; $$4++) {
               chh $$5 = this.a($$1);
               if ($$5 != null) {
                  ckj $$6 = this.a($$1, $$5);
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
   private chh a(bqq $$0) {
      chn $$1 = bsy.aO.a(this.a.dP());
      if ($$1 != null) {
         $$1.a((are)this.a.dP(), $$0, btr.k, null);
         $$1.a_(this.a.du(), this.a.dw(), this.a.dA());
         $$1.am = 60;
         $$1.fU();
         $$1.x(true);
         $$1.c_(0);
      }

      return $$1;
   }

   @Nullable
   private ckj a(bqq $$0, chh $$1) {
      ckj $$2 = bsy.aN.a($$1.dP());
      if ($$2 != null) {
         $$2.a((are)$$1.dP(), $$0, btr.k, null);
         $$2.a_($$1.du(), $$1.dw(), $$1.dA());
         $$2.am = 60;
         $$2.fU();
         if ($$2.a(bsz.f).e()) {
            $$2.a(bsz.f, new cun(cuq.pG));
         }

         cpj $$3 = $$1.dP().J();
         $$2.a(bsz.a, czz.a($$3, $$2.el(), this.a($$2.eX()), (int)(5.0F + $$0.d() * (float)$$2.el().a(18)), false));
         $$2.a(bsz.f, czz.a($$3, $$2.el(), this.a($$2.a(bsz.f)), (int)(5.0F + $$0.d() * (float)$$2.el().a(18)), false));
      }

      return $$2;
   }

   private cun a(cun $$0) {
      $$0.b(km.j, dad.a);
      return $$0;
   }
}
