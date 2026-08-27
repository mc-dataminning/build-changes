public class cvk extends ctj implements cug {
   private static final int a = 10;

   public cvk(ctj.a $$0) {
      super($$0);
   }

   @Override
   public bpv<cto> a(dax $$0, clw $$1, bpt $$2) {
      if (!$$0.x_()) {
         euk $$3 = $$1.bx().e($$1.bN().a(0.8F));
         if (!$$0.a_(io.a($$3)).r()) {
            $$3 = $$1.bx().e($$1.bN().a(0.05F));
         }

         cng $$4 = new cng($$1, $$0, $$3.a(), $$3.b(), $$3.c());
         $$4.a($$1, $$1.dH(), $$1.dF(), 0.0F, 1.5F, 1.0F);
         $$0.b($$4);
      }

      $$0.a(null, $$1.du(), $$1.dw(), $$1.dA(), avh.Cn, avi.g, 0.5F, 0.4F / ($$0.E_().i() * 0.4F + 0.8F));
      cto $$5 = $$1.b($$2);
      $$1.gx().a(this, 10);
      $$1.b(avr.c.b(this));
      $$5.a(1, $$1);
      return bpv.a($$5, $$0.x_());
   }

   @Override
   public cmo a(dax $$0, jh $$1, cto $$2, it $$3) {
      ayk $$4 = $$0.E_();
      double $$5 = $$4.a((double)$$3.j(), 0.11485000000000001);
      double $$6 = $$4.a((double)$$3.k(), 0.11485000000000001);
      double $$7 = $$4.a((double)$$3.l(), 0.11485000000000001);
      return new cng($$0, $$1.a(), $$1.b(), $$1.c(), $$5, $$6, $$7);
   }

   @Override
   public void a(cmo $$0, double $$1, double $$2, double $$3, float $$4, float $$5) {
   }

   @Override
   public cug.a c() {
      return cug.a.a().a(($$0, $$1) -> dgd.a($$0, 1.0, euk.b)).a(6.6666665F).b(1.0F).a();
   }
}
