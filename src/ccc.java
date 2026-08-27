import javax.annotation.Nullable;

public class ccc extends bvb {
   private final ccb a;

   public ccc(ccb $$0) {
      this.a = $$0;
   }

   @Override
   public boolean a() {
      return this.a.dM().a(this.a.dr(), this.a.dt(), this.a.dx(), 10.0);
   }

   @Override
   public void e() {
      aov $$0 = (aov)this.a.dM();
      bls $$1 = $$0.d_(this.a.dm());
      this.a.w(false);
      this.a.x(true);
      this.a.c_(0);
      bof $$2 = bnu.ak.a((cvn)$$0);
      if ($$2 != null) {
         $$2.e(this.a.dr(), this.a.dt(), this.a.dx());
         $$2.a(true);
         $$0.b($$2);
         cev $$3 = this.a($$1, this.a);
         if ($$3 != null) {
            $$3.m(this.a);
            $$0.a_($$3);

            for (int $$4 = 0; $$4 < 3; $$4++) {
               cbv $$5 = this.a($$1);
               if ($$5 != null) {
                  cev $$6 = this.a($$1, $$5);
                  if ($$6 != null) {
                     $$6.m($$5);
                     $$5.j(this.a.eh().a(0.0, 1.1485), 0.0, this.a.eh().a(0.0, 1.1485));
                     $$0.a_($$5);
                  }
               }
            }
         }
      }
   }

   @Nullable
   private cbv a(bls $$0) {
      ccb $$1 = bnu.aM.a(this.a.dM());
      if ($$1 != null) {
         $$1.a((aov)this.a.dM(), $$0, bok.k, null, null);
         $$1.a_(this.a.dr(), this.a.dt(), this.a.dx());
         $$1.ak = 60;
         $$1.fL();
         $$1.x(true);
         $$1.c_(0);
      }

      return $$1;
   }

   @Nullable
   private cev a(bls $$0, cbv $$1) {
      cev $$2 = bnu.aL.a($$1.dM());
      if ($$2 != null) {
         $$2.a((aov)$$1.dM(), $$0, bok.k, null, null);
         $$2.a_($$1.dr(), $$1.dt(), $$1.dx());
         $$2.ak = 60;
         $$2.fL();
         if ($$2.c(bnv.f).b()) {
            $$2.a(bnv.f, new coz(cpc.pF));
         }

         $$2.a(bnv.a, ctj.a($$2.eh(), this.a($$2.eT()), (int)(5.0F + $$0.d() * (float)$$2.eh().a(18)), false));
         $$2.a(bnv.f, ctj.a($$2.eh(), this.a($$2.c(bnv.f)), (int)(5.0F + $$0.d() * (float)$$2.eh().a(18)), false));
      }

      return $$2;
   }

   private coz a(coz $$0) {
      $$0.c("Enchantments");
      return $$0;
   }
}
