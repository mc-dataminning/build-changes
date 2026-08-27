public class cia extends cit {
   public cia(cit.a $$0) {
      super($$0);
   }

   @Override
   public boolean i(ciy $$0) {
      return true;
   }

   @Override
   public bgr<ciy> a(cpm $$0, cbn $$1, bgp $$2) {
      ciy $$3 = $$1.b($$2);
      $$0.a(null, $$1.dp(), $$1.dr(), $$1.dv(), aow.hz, aox.g, 0.5F, 0.4F / ($$0.y_().i() * 0.4F + 0.8F));
      if (!$$0.B) {
         ccp $$4 = new ccp($$0, $$1);
         $$4.a($$3);
         $$4.a($$1, $$1.dC(), $$1.dA(), -20.0F, 0.7F, 1.0F);
         $$0.b($$4);
      }

      $$1.b(apg.c.b(this));
      if (!$$1.fR().d) {
         $$3.h(1);
      }

      return bgr.a($$3, $$0.r_());
   }
}
