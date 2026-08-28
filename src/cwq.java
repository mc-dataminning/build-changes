public class cwq extends cxd {
   public cwq(cxd.a $$0) {
      super($$0);
   }

   @Override
   public bsy a(dgz $$0, cpr $$1, bsx $$2) {
      cxh $$3 = $$1.b($$2);
      if ($$1.cj != null) {
         if (!$$0.C) {
            int $$4 = $$1.cj.a($$3);
            $$3.a($$4, $$1, bvy.d($$2));
         }

         $$0.a(null, $$1.dz(), $$1.dB(), $$1.dF(), awa.jw, awb.g, 1.0F, 0.4F / ($$0.C_().i() * 0.4F + 0.8F));
         $$1.a(ecp.C);
      } else {
         $$0.a(null, $$1.dz(), $$1.dB(), $$1.dF(), awa.jy, awb.g, 0.5F, 0.4F / ($$0.C_().i() * 0.4F + 0.8F));
         if ($$0 instanceof ard $$5) {
            int $$6 = (int)(ddt.b($$5, $$3, $$1) * 20.0F);
            int $$7 = ddt.a($$5, $$3, $$1);
            cqk.a(new cqg($$1, $$0, $$7, $$6), $$5, $$3);
         }

         $$1.b(awk.c.b(this));
         $$1.a(ecp.D);
      }

      return bsy.a;
   }
}
