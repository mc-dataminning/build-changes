public class cvc extends cuf implements cug {
   public cvc(ctj.a $$0) {
      super($$0);
   }

   @Override
   public bpv<cto> a(dax $$0, clw $$1, bpt $$2) {
      cto $$3 = $$1.b($$2);
      if (!$$0.B) {
         cna $$4 = new cna($$0, $$1);
         $$4.a($$3);
         $$4.a($$1, $$1.dH(), $$1.dF(), -20.0F, 0.5F, 1.0F);
         $$0.b($$4);
      }

      $$1.b(avr.c.b(this));
      $$3.a(1, $$1);
      return bpv.a($$3, $$0.x_());
   }

   @Override
   public cmo a(dax $$0, jh $$1, cto $$2, it $$3) {
      cna $$4 = new cna($$0, $$1.a(), $$1.b(), $$1.c());
      $$4.a($$2);
      return $$4;
   }

   @Override
   public cug.a c() {
      return cug.a.a().a(cug.a.a.c() * 0.5F).b(cug.a.a.d() * 1.25F).a();
   }
}
