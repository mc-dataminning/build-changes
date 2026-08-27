public class clt extends cmm {
   public clt(cmm.a $$0) {
      super($$0);
   }

   @Override
   public boolean i(cmr $$0) {
      return true;
   }

   @Override
   public bjw<cmr> a(cti $$0, cfb $$1, bju $$2) {
      cmr $$3 = $$1.b($$2);
      $$0.a(null, $$1.dr(), $$1.dt(), $$1.dx(), arm.ic, arn.g, 0.5F, 0.4F / ($$0.F_().i() * 0.4F + 0.8F));
      if (!$$0.B) {
         cgd $$4 = new cgd($$0, $$1);
         $$4.a($$3);
         $$4.a($$1, $$1.dE(), $$1.dC(), -20.0F, 0.7F, 1.0F);
         $$0.b($$4);
      }

      $$1.b(arw.c.b(this));
      if (!$$1.fT().d) {
         $$3.h(1);
      }

      return bjw.a($$3, $$0.y_());
   }
}
