public class cff extends cfu implements cht {
   public cff(cfu.a $$0) {
      super($$0);
   }

   @Override
   public bdy<cfz> a(cmm $$0, byo $$1, bdw $$2) {
      cfz $$3 = $$1.b($$2);
      if ($$1.cj != null) {
         if (!$$0.B) {
            int $$4 = $$1.cj.a($$3);
            $$3.a($$4, $$1, $$1x -> $$1x.d($$2));
         }

         $$0.a(null, $$1.dn(), $$1.dp(), $$1.dt(), amh.hP, ami.g, 1.0F, 0.4F / ($$0.y_().i() * 0.4F + 0.8F));
         $$1.a(dgl.D);
      } else {
         $$0.a(null, $$1.dn(), $$1.dp(), $$1.dt(), amh.hR, ami.g, 0.5F, 0.4F / ($$0.y_().i() * 0.4F + 0.8F));
         if (!$$0.B) {
            int $$5 = cki.c($$3);
            int $$6 = cki.b($$3);
            $$0.b(new bzc($$1, $$0, $$6, $$5));
         }

         $$1.b(amr.c.b(this));
         $$1.a(dgl.E);
      }

      return bdy.a($$3, $$0.r_());
   }

   @Override
   public int c() {
      return 1;
   }
}
