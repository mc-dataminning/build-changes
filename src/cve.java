public class cve extends cuh implements cui {
   public cve(ctl.a $$0) {
      super($$0);
   }

   @Override
   public bpx<ctq> a(daz $$0, cly $$1, bpv $$2) {
      ctq $$3 = $$1.b($$2);
      if (!$$0.B) {
         cnc $$4 = new cnc($$0, $$1);
         $$4.a($$3);
         $$4.a($$1, $$1.dH(), $$1.dF(), -20.0F, 0.5F, 1.0F);
         $$0.b($$4);
      }

      $$1.b(avs.c.b(this));
      $$3.a(1, $$1);
      return bpx.a($$3, $$0.x_());
   }

   @Override
   public cmq a(daz $$0, jh $$1, ctq $$2, it $$3) {
      cnc $$4 = new cnc($$0, $$1.a(), $$1.b(), $$1.c());
      $$4.a($$2);
      return $$4;
   }

   @Override
   public cui.a c() {
      return cui.a.a().a(cui.a.a.c() * 0.5F).b(cui.a.a.d() * 1.25F).a();
   }
}
