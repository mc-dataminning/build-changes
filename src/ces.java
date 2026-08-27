public class ces extends cfu {
   public ces(cfu.a $$0) {
      super($$0);
   }

   @Override
   public bdy<cfz> a(cmm $$0, byo $$1, bdw $$2) {
      cfz $$3 = $$1.b($$2);
      $$0.a(null, $$1.dn(), $$1.dp(), $$1.dt(), amh.gG, ami.h, 0.5F, 0.4F / ($$0.y_().i() * 0.4F + 0.8F));
      if (!$$0.B) {
         bzo $$4 = new bzo($$0, $$1);
         $$4.a($$3);
         $$4.a($$1, $$1.dA(), $$1.dy(), 0.0F, 1.5F, 1.0F);
         $$0.b($$4);
      }

      $$1.b(amr.c.b(this));
      if (!$$1.fO().d) {
         $$3.h(1);
      }

      return bdy.a($$3, $$0.r_());
   }
}
