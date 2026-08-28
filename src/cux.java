public class cux extends cvk {
   public cux(cvk.a $$0) {
      super($$0);
   }

   @Override
   public brp a(deg $$0, cnu $$1, bro $$2) {
      cvp $$3 = $$1.b($$2);
      if ($$1.cr != null) {
         if (!$$0.B) {
            int $$4 = $$1.cr.a($$3);
            $$3.a($$4, $$1, buk.d($$2));
         }

         $$0.a(null, $$1.dx(), $$1.dz(), $$1.dD(), awe.iX, awf.g, 1.0F, 0.4F / ($$0.C_().i() * 0.4F + 0.8F));
         $$1.a(dzl.C);
      } else {
         $$0.a(null, $$1.dx(), $$1.dz(), $$1.dD(), awe.iZ, awf.g, 0.5F, 0.4F / ($$0.C_().i() * 0.4F + 0.8F));
         if ($$0 instanceof arh $$5) {
            int $$6 = (int)(dbm.b($$5, $$3, $$1) * 20.0F);
            int $$7 = dbm.a($$5, $$3, $$1);
            coo.a(new coj($$1, $$0, $$7, $$6, $$3), $$5, $$3);
         }

         $$1.b(awo.c.b(this));
         $$1.a(dzl.D);
      }

      return brp.a;
   }
}
