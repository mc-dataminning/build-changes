public class cvy extends cwl {
   public cvy(cwl.a $$0) {
      super($$0);
   }

   @Override
   public bsk a(dgi $$0, cox $$1, bsj $$2) {
      cwp $$3 = $$1.b($$2);
      if ($$1.cw != null) {
         if (!$$0.C) {
            int $$4 = $$1.cw.a($$3);
            $$3.a($$4, $$1, bvh.d($$2));
         }

         $$0.a(null, $$1.dA(), $$1.dC(), $$1.dG(), awa.jw, awb.g, 1.0F, 0.4F / ($$0.H_().i() * 0.4F + 0.8F));
         $$1.a(ebt.C);
      } else {
         $$0.a(null, $$1.dA(), $$1.dC(), $$1.dG(), awa.jy, awb.g, 0.5F, 0.4F / ($$0.H_().i() * 0.4F + 0.8F));
         if ($$0 instanceof ard $$5) {
            int $$6 = (int)(ddb.b($$5, $$3, $$1) * 20.0F);
            int $$7 = ddb.a($$5, $$3, $$1);
            cpq.a(new cpm($$1, $$0, $$7, $$6), $$5, $$3);
         }

         $$1.b(awk.c.b(this));
         $$1.a(ebt.D);
      }

      return bsk.a;
   }
}
