import javax.annotation.Nullable;

public class bwz extends bqd {
   private final bwy a;

   public bwz(bwy $$0) {
      this.a = $$0;
   }

   @Override
   public boolean a() {
      return this.a.dL().a(this.a.dq(), this.a.ds(), this.a.dw(), 10.0);
   }

   @Override
   public void e() {
      aks $$0 = (aks)this.a.dL();
      bgy $$1 = $$0.d_(this.a.dl());
      this.a.w(false);
      this.a.x(true);
      this.a.c_(0);
      bjh $$2 = biw.ai.a((cpx)$$0);
      if ($$2 != null) {
         $$2.d(this.a.dq(), this.a.ds(), this.a.dw());
         $$2.a(true);
         $$0.b($$2);
         bzs $$3 = this.a($$1, this.a);
         if ($$3 != null) {
            $$3.n(this.a);
            $$0.a_($$3);

            for (int $$4 = 0; $$4 < 3; $$4++) {
               bws $$5 = this.a($$1);
               if ($$5 != null) {
                  bzs $$6 = this.a($$1, $$5);
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
   private bws a(bgy $$0) {
      bwy $$1 = biw.aK.a(this.a.dL());
      if ($$1 != null) {
         $$1.a((aks)this.a.dL(), $$0, bjm.k, null, null);
         $$1.e(this.a.dq(), this.a.ds(), this.a.dw());
         $$1.al = 60;
         $$1.fI();
         $$1.x(true);
         $$1.c_(0);
      }

      return $$1;
   }

   @Nullable
   private bzs a(bgy $$0, bws $$1) {
      bzs $$2 = biw.aJ.a($$1.dL());
      if ($$2 != null) {
         $$2.a((aks)$$1.dL(), $$0, bjm.k, null, null);
         $$2.e($$1.dq(), $$1.ds(), $$1.dw());
         $$2.al = 60;
         $$2.fI();
         if ($$2.c(bix.f).b()) {
            $$2.a(bix.f, new cjh(cjk.oS));
         }

         $$2.a(bix.a, cns.a($$2.ef(), this.a($$2.eS()), (int)(5.0F + $$0.d() * (float)$$2.ef().a(18)), false));
         $$2.a(bix.f, cns.a($$2.ef(), this.a($$2.c(bix.f)), (int)(5.0F + $$0.d() * (float)$$2.ef().a(18)), false));
      }

      return $$2;
   }

   private cjh a(cjh $$0) {
      $$0.c("Enchantments");
      return $$0;
   }
}
