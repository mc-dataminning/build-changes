public class cia extends civ {
   public cia(civ.a $$0) {
      super($$0);
   }

   @Override
   public bgu<cja> a(cpq $$0, cbp $$1, bgs $$2) {
      cja $$3 = $$1.b($$2);
      $$0.a(null, $$1.dp(), $$1.dr(), $$1.dv(), aoz.hm, apa.g, 0.5F, 0.4F / ($$0.y_().i() * 0.4F + 0.8F));
      $$1.gl().a(this, 20);
      if (!$$0.B) {
         ccq $$4 = new ccq($$0, $$1);
         $$4.a($$3);
         $$4.a($$1, $$1.dC(), $$1.dA(), 0.0F, 1.5F, 1.0F);
         $$0.b($$4);
      }

      $$1.b(apj.c.b(this));
      if (!$$1.fR().d) {
         $$3.h(1);
      }

      return bgu.a($$3, $$0.r_());
   }
}
