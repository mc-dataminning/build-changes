public class cic extends civ {
   public cic(civ.a $$0) {
      super($$0);
   }

   @Override
   public boolean i(cja $$0) {
      return true;
   }

   @Override
   public bgu<cja> a(cpq $$0, cbp $$1, bgs $$2) {
      cja $$3 = $$1.b($$2);
      $$0.a(null, $$1.dp(), $$1.dr(), $$1.dv(), aoz.hz, apa.g, 0.5F, 0.4F / ($$0.y_().i() * 0.4F + 0.8F));
      if (!$$0.B) {
         ccr $$4 = new ccr($$0, $$1);
         $$4.a($$3);
         $$4.a($$1, $$1.dC(), $$1.dA(), -20.0F, 0.7F, 1.0F);
         $$0.b($$4);
      }

      $$1.b(apj.c.b(this));
      if (!$$1.fR().d) {
         $$3.h(1);
      }

      return bgu.a($$3, $$0.r_());
   }
}
