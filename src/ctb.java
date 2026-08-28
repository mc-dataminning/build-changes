public class ctb extends ctv {
   public ctb(ctv.a $$0) {
      super($$0);
   }

   @Override
   public bqe<cua> a(dcd $$0, cmh $$1, bqc $$2) {
      cua $$3 = $$1.b($$2);
      $$0.a(null, $$1.du(), $$1.dw(), $$1.dA(), avf.it, avg.g, 0.5F, 0.4F / ($$0.E_().i() * 0.4F + 0.8F));
      $$1.gt().a(this, 20);
      if (!$$0.B) {
         cnj $$4 = new cnj($$0, $$1);
         $$4.a($$3);
         $$4.a($$1, $$1.dH(), $$1.dF(), 0.0F, 1.5F, 1.0F);
         $$0.b($$4);
      }

      $$1.b(avp.c.b(this));
      $$3.a(1, $$1);
      return bqe.a($$3, $$0.x_());
   }
}
