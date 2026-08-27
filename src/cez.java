public class cez extends cfu {
   public cez(cfu.a $$0) {
      super($$0);
   }

   @Override
   public bdy<cfz> a(cmm $$0, byo $$1, bdw $$2) {
      cfz $$3 = $$1.b($$2);
      $$0.a(null, $$1.dn(), $$1.dp(), $$1.dt(), amh.hm, ami.g, 0.5F, 0.4F / ($$0.y_().i() * 0.4F + 0.8F));
      $$1.gi().a(this, 20);
      if (!$$0.B) {
         bzp $$4 = new bzp($$0, $$1);
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
