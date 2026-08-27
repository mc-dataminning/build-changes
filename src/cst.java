public class cst extends ctl implements cui {
   public cst(ctl.a $$0) {
      super($$0);
   }

   @Override
   public bpx<ctq> a(daz $$0, cly $$1, bpv $$2) {
      ctq $$3 = $$1.b($$2);
      $$0.a(null, $$1.du(), $$1.dw(), $$1.dA(), avi.iG, avj.g, 0.5F, 0.4F / ($$0.E_().i() * 0.4F + 0.8F));
      if (!$$0.B) {
         cnb $$4 = new cnb($$0, $$1);
         $$4.a($$3);
         $$4.a($$1, $$1.dH(), $$1.dF(), -20.0F, 0.7F, 1.0F);
         $$0.b($$4);
      }

      $$1.b(avs.c.b(this));
      $$3.a(1, $$1);
      return bpx.a($$3, $$0.x_());
   }

   @Override
   public cmq a(daz $$0, jh $$1, ctq $$2, it $$3) {
      cnb $$4 = new cnb($$0, $$1.a(), $$1.b(), $$1.c());
      $$4.a($$2);
      return $$4;
   }

   @Override
   public cui.a c() {
      return cui.a.a().a(cui.a.a.c() * 0.5F).b(cui.a.a.d() * 1.25F).a();
   }
}
