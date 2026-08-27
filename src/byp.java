import javax.annotation.Nullable;

public class byp extends brt {
   private final byo a;

   public byp(byo $$0) {
      this.a = $$0;
   }

   @Override
   public boolean a() {
      return this.a.dL().a(this.a.dq(), this.a.ds(), this.a.dw(), 10.0);
   }

   @Override
   public void e() {
      ama $$0 = (ama)this.a.dL();
      bio $$1 = $$0.d_(this.a.dl());
      this.a.w(false);
      this.a.x(true);
      this.a.c_(0);
      bkx $$2 = bkm.ai.a((crs)$$0);
      if ($$2 != null) {
         $$2.d(this.a.dq(), this.a.ds(), this.a.dw());
         $$2.a(true);
         $$0.b($$2);
         cbi $$3 = this.a($$1, this.a);
         if ($$3 != null) {
            $$3.n(this.a);
            $$0.a_($$3);

            for (int $$4 = 0; $$4 < 3; $$4++) {
               byi $$5 = this.a($$1);
               if ($$5 != null) {
                  cbi $$6 = this.a($$1, $$5);
                  if ($$6 != null) {
                     $$6.n($$5);
                     $$5.j(this.a.ef().a(0.0, 1.1485), 0.0, this.a.ef().a(0.0, 1.1485));
                     $$0.a_($$5);
                  }
               }
            }
         }
      }
   }

   @Nullable
   private byi a(bio $$0) {
      byo $$1 = bkm.aK.a(this.a.dL());
      if ($$1 != null) {
         $$1.a((ama)this.a.dL(), $$0, blc.k, null, null);
         $$1.e(this.a.dq(), this.a.ds(), this.a.dw());
         $$1.al = 60;
         $$1.fJ();
         $$1.x(true);
         $$1.c_(0);
      }

      return $$1;
   }

   @Nullable
   private cbi a(bio $$0, byi $$1) {
      cbi $$2 = bkm.aJ.a($$1.dL());
      if ($$2 != null) {
         $$2.a((ama)$$1.dL(), $$0, blc.k, null, null);
         $$2.e($$1.dq(), $$1.ds(), $$1.dw());
         $$2.al = 60;
         $$2.fJ();
         if ($$2.c(bkn.f).b()) {
            $$2.a(bkn.f, new clb(cle.oS));
         }

         $$2.a(bkn.a, cpo.a($$2.ef(), this.a($$2.eS()), (int)(5.0F + $$0.d() * (float)$$2.ef().a(18)), false));
         $$2.a(bkn.f, cpo.a($$2.ef(), this.a($$2.c(bkn.f)), (int)(5.0F + $$0.d() * (float)$$2.ef().a(18)), false));
      }

      return $$2;
   }

   private clb a(clb $$0) {
      $$0.c("Enchantments");
      return $$0;
   }
}
