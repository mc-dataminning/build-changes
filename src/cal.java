import javax.annotation.Nullable;

public class cal extends btk {
   private final cak a;

   public cal(cak $$0) {
      this.a = $$0;
   }

   @Override
   public boolean a() {
      return this.a.dL().a(this.a.dq(), this.a.ds(), this.a.dw(), 10.0);
   }

   @Override
   public void e() {
      ane $$0 = (ane)this.a.dL();
      bka $$1 = $$0.d_(this.a.dl());
      this.a.w(false);
      this.a.x(true);
      this.a.c_(0);
      bmn $$2 = bmc.ak.a((ctx)$$0);
      if ($$2 != null) {
         $$2.e(this.a.dq(), this.a.ds(), this.a.dw());
         $$2.a(true);
         $$0.b($$2);
         cde $$3 = this.a($$1, this.a);
         if ($$3 != null) {
            $$3.m(this.a);
            $$0.a_($$3);

            for (int $$4 = 0; $$4 < 3; $$4++) {
               cae $$5 = this.a($$1);
               if ($$5 != null) {
                  cde $$6 = this.a($$1, $$5);
                  if ($$6 != null) {
                     $$6.m($$5);
                     $$5.j(this.a.eg().a(0.0, 1.1485), 0.0, this.a.eg().a(0.0, 1.1485));
                     $$0.a_($$5);
                  }
               }
            }
         }
      }
   }

   @Nullable
   private cae a(bka $$0) {
      cak $$1 = bmc.aM.a(this.a.dL());
      if ($$1 != null) {
         $$1.a((ane)this.a.dL(), $$0, bms.k, null, null);
         $$1.a_(this.a.dq(), this.a.ds(), this.a.dw());
         $$1.al = 60;
         $$1.fK();
         $$1.x(true);
         $$1.c_(0);
      }

      return $$1;
   }

   @Nullable
   private cde a(bka $$0, cae $$1) {
      cde $$2 = bmc.aL.a($$1.dL());
      if ($$2 != null) {
         $$2.a((ane)$$1.dL(), $$0, bms.k, null, null);
         $$2.a_($$1.dq(), $$1.ds(), $$1.dw());
         $$2.al = 60;
         $$2.fK();
         if ($$2.c(bmd.f).b()) {
            $$2.a(bmd.f, new cng(cnj.pF));
         }

         $$2.a(bmd.a, crt.a($$2.eg(), this.a($$2.eT()), (int)(5.0F + $$0.d() * (float)$$2.eg().a(18)), false));
         $$2.a(bmd.f, crt.a($$2.eg(), this.a($$2.c(bmd.f)), (int)(5.0F + $$0.d() * (float)$$2.eg().a(18)), false));
      }

      return $$2;
   }

   private cng a(cng $$0) {
      $$0.c("Enchantments");
      return $$0;
   }
}
