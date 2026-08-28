public class ctt extends cul implements cvm {
   public ctt(cul.a $$0) {
      super($$0);
   }

   @Override
   public bqs<cuq> a(dcw $$0, cmx $$1, bqq $$2) {
      cuq $$3 = $$1.b($$2);
      $$0.a(null, $$1.du(), $$1.dw(), $$1.dA(), avp.iG, avq.g, 0.5F, 0.4F / ($$0.E_().i() * 0.4F + 0.8F));
      if (!$$0.B) {
         coa $$4 = new coa($$0, $$1);
         $$4.a($$3);
         $$4.a($$1, $$1.dH(), $$1.dF(), -20.0F, 0.7F, 1.0F);
         $$0.b($$4);
      }

      $$1.b(avz.c.b(this));
      $$3.a(1, $$1);
      return bqs.a($$3, $$0.x_());
   }

   @Override
   public cnp a(dcw $$0, jw $$1, cuq $$2, ji $$3) {
      coa $$4 = new coa($$0, $$1.a(), $$1.b(), $$1.c());
      $$4.a($$2);
      return $$4;
   }

   @Override
   public cvm.a c() {
      return cvm.a.a().a(cvm.a.a.c() * 0.5F).b(cvm.a.a.d() * 1.25F).a();
   }
}
