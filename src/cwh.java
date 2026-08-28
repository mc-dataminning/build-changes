public class cwh extends cvl implements cvm {
   public cwh(cul.a $$0) {
      super($$0);
   }

   @Override
   public bqs<cuq> a(dcw $$0, cmx $$1, bqq $$2) {
      cuq $$3 = $$1.b($$2);
      if (!$$0.B) {
         cob $$4 = new cob($$0, $$1);
         $$4.a($$3);
         $$4.a($$1, $$1.dG(), $$1.dE(), -20.0F, 0.5F, 1.0F);
         $$0.b($$4);
      }

      $$1.b(avz.c.b(this));
      $$3.a(1, $$1);
      return bqs.a($$3, $$0.x_());
   }

   @Override
   public cnp a(dcw $$0, jw $$1, cuq $$2, ji $$3) {
      cob $$4 = new cob($$0, $$1.a(), $$1.b(), $$1.c());
      $$4.a($$2);
      return $$4;
   }

   @Override
   public cvm.a c() {
      return cvm.a.a().a(cvm.a.a.c() * 0.5F).b(cvm.a.a.d() * 1.25F).a();
   }
}
