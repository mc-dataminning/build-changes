public class czt extends dag {
   public czt(dag.a $$0) {
      super($$0);
   }

   @Override
   public bvc a(dkj $$0, csi $$1, bvb $$2) {
      dak $$3 = $$1.b($$2);
      if ($$1.ck != null) {
         if (!$$0.C) {
            int $$4 = $$1.ck.a($$3);
            $$3.a($$4, $$1, byf.d($$2));
         }

         $$0.a(null, $$1.dA(), $$1.dC(), $$1.dG(), awy.jA, awz.g, 1.0F, 0.4F / ($$0.G_().i() * 0.4F + 0.8F));
         $$1.a(egq.C);
      } else {
         $$0.a(null, $$1.dA(), $$1.dC(), $$1.dG(), awy.jC, awz.g, 0.5F, 0.4F / ($$0.G_().i() * 0.4F + 0.8F));
         if ($$0 instanceof asb $$5) {
            int $$6 = (int)(dgz.b($$5, $$3, $$1) * 20.0F);
            int $$7 = dgz.a($$5, $$3, $$1);
            ctd.a(new csz($$1, $$0, $$7, $$6), $$5, $$3);
         }

         $$1.b(axi.c.b(this));
         $$1.a(egq.D);
      }

      return bvc.a;
   }
}
