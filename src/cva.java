public class cva extends cvn {
   public cva(cvn.a $$0) {
      super($$0);
   }

   @Override
   public brs a(dej $$0, cnx $$1, brr $$2) {
      cvs $$3 = $$1.b($$2);
      if ($$1.cr != null) {
         if (!$$0.B) {
            int $$4 = $$1.cr.a($$3);
            $$3.a($$4, $$1, bun.d($$2));
         }

         $$0.a(null, $$1.dx(), $$1.dz(), $$1.dD(), awg.iX, awh.g, 1.0F, 0.4F / ($$0.D_().i() * 0.4F + 0.8F));
         $$1.a(dzp.C);
      } else {
         $$0.a(null, $$1.dx(), $$1.dz(), $$1.dD(), awg.iZ, awh.g, 0.5F, 0.4F / ($$0.D_().i() * 0.4F + 0.8F));
         if ($$0 instanceof arj $$5) {
            int $$6 = (int)(dbp.b($$5, $$3, $$1) * 20.0F);
            int $$7 = dbp.a($$5, $$3, $$1);
            cor.a(new com($$1, $$0, $$7, $$6, $$3), $$5, $$3);
         }

         $$1.b(awq.c.b(this));
         $$1.a(dzp.D);
      }

      return brs.a;
   }
}
