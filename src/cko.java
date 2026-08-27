public class cko extends clj {
   public cko(clj.a $$0) {
      super($$0);
   }

   @Override
   public bjc<clo> a(csf $$0, cdz $$1, bja $$2) {
      clo $$3 = $$1.b($$2);
      $$0.a(null, $$1.ds(), $$1.du(), $$1.dy(), aqv.hG, aqw.g, 0.5F, 0.4F / ($$0.F_().i() * 0.4F + 0.8F));
      $$1.go().a(this, 20);
      if (!$$0.B) {
         cfa $$4 = new cfa($$0, $$1);
         $$4.a($$3);
         $$4.a($$1, $$1.dF(), $$1.dD(), 0.0F, 1.5F, 1.0F);
         $$0.b($$4);
      }

      $$1.b(arf.c.b(this));
      if (!$$1.fU().d) {
         $$3.h(1);
      }

      return bjc.a($$3, $$0.y_());
   }
}
