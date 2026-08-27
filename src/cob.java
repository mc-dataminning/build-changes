public class cob extends cou {
   public cob(cou.a $$0) {
      super($$0);
   }

   @Override
   public boolean i(coz $$0) {
      return true;
   }

   @Override
   public blv<coz> a(cvn $$0, chh $$1, blt $$2) {
      coz $$3 = $$1.b($$2);
      $$0.a(null, $$1.dr(), $$1.dt(), $$1.dx(), atk.ir, atl.g, 0.5F, 0.4F / ($$0.F_().i() * 0.4F + 0.8F));
      if (!$$0.B) {
         cik $$4 = new cik($$0, $$1);
         $$4.a($$3);
         $$4.a($$1, $$1.dE(), $$1.dC(), -20.0F, 0.7F, 1.0F);
         $$0.b($$4);
      }

      $$1.b(atu.c.b(this));
      if (!$$1.fU().d) {
         $$3.h(1);
      }

      return blv.a($$3, $$0.y_());
   }
}
