public class crp extends cqh {
   public crp(cqh.a $$0) {
      super($$0);
   }

   @Override
   public bne<cqm> a(cxb $$0, ciu $$1, bnc $$2) {
      cqm $$3 = $$1.b($$2);
      $$0.a(null, $$1.dr(), $$1.dt(), $$1.dx(), aty.yb, atz.g, 0.5F, 0.4F / ($$0.E_().i() * 0.4F + 0.8F));
      if (!$$0.B) {
         cjr $$4 = new cjr($$0, $$1);
         $$4.a($$3);
         $$4.a($$1, $$1.dE(), $$1.dC(), 0.0F, 1.5F, 1.0F);
         $$0.b($$4);
      }

      $$1.b(aui.c.b(this));
      $$3.a(1, $$1);
      return bne.a($$3, $$0.x_());
   }
}
