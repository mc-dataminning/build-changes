public class cnz extends cou {
   public cnz(cou.a $$0) {
      super($$0);
   }

   @Override
   public blv<coz> a(cvn $$0, chh $$1, blt $$2) {
      coz $$3 = $$1.b($$2);
      $$0.a(null, $$1.dr(), $$1.dt(), $$1.dx(), atk.ie, atl.g, 0.5F, 0.4F / ($$0.F_().i() * 0.4F + 0.8F));
      $$1.go().a(this, 20);
      if (!$$0.B) {
         cij $$4 = new cij($$0, $$1);
         $$4.a($$3);
         $$4.a($$1, $$1.dE(), $$1.dC(), 0.0F, 1.5F, 1.0F);
         $$0.b($$4);
      }

      $$1.b(atu.c.b(this));
      if (!$$1.fU().d) {
         $$3.h(1);
      }

      return blv.a($$3, $$0.y_());
   }
}
