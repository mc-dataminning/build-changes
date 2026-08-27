import javax.annotation.Nullable;

public class bxd extends bqh {
   private final bxc a;

   public bxd(bxc $$0) {
      this.a = $$0;
   }

   @Override
   public boolean a() {
      return this.a.dL().a(this.a.dq(), this.a.ds(), this.a.dw(), 10.0);
   }

   @Override
   public void e() {
      akt $$0 = (akt)this.a.dL();
      bhc $$1 = $$0.d_(this.a.dl());
      this.a.w(false);
      this.a.x(true);
      this.a.c_(0);
      bjl $$2 = bja.ai.a((cqb)$$0);
      if ($$2 != null) {
         $$2.d(this.a.dq(), this.a.ds(), this.a.dw());
         $$2.a(true);
         $$0.b($$2);
         bzw $$3 = this.a($$1, this.a);
         if ($$3 != null) {
            $$3.n(this.a);
            $$0.a_($$3);

            for (int $$4 = 0; $$4 < 3; $$4++) {
               bww $$5 = this.a($$1);
               if ($$5 != null) {
                  bzw $$6 = this.a($$1, $$5);
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
   private bww a(bhc $$0) {
      bxc $$1 = bja.aK.a(this.a.dL());
      if ($$1 != null) {
         $$1.a((akt)this.a.dL(), $$0, bjq.k, null, null);
         $$1.e(this.a.dq(), this.a.ds(), this.a.dw());
         $$1.al = 60;
         $$1.fJ();
         $$1.x(true);
         $$1.c_(0);
      }

      return $$1;
   }

   @Nullable
   private bzw a(bhc $$0, bww $$1) {
      bzw $$2 = bja.aJ.a($$1.dL());
      if ($$2 != null) {
         $$2.a((akt)$$1.dL(), $$0, bjq.k, null, null);
         $$2.e($$1.dq(), $$1.ds(), $$1.dw());
         $$2.al = 60;
         $$2.fJ();
         if ($$2.c(bjb.f).b()) {
            $$2.a(bjb.f, new cjl(cjo.oS));
         }

         $$2.a(bjb.a, cnw.a($$2.ef(), this.a($$2.eS()), (int)(5.0F + $$0.d() * (float)$$2.ef().a(18)), false));
         $$2.a(bjb.f, cnw.a($$2.ef(), this.a($$2.c(bjb.f)), (int)(5.0F + $$0.d() * (float)$$2.ef().a(18)), false));
      }

      return $$2;
   }

   private cjl a(cjl $$0) {
      $$0.c("Enchantments");
      return $$0;
   }
}
