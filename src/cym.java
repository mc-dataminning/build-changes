public class cym extends cyz {
   public cym(cyz.a $$0) {
      super($$0);
   }

   @Override
   public bud a(dja $$0, crc $$1, buc $$2) {
      czd $$3 = $$1.b($$2);
      if ($$1.ck != null) {
         if (!$$0.C) {
            int $$4 = $$1.ck.a($$3);
            $$3.a($$4, $$1, bxe.d($$2));
         }

         $$0.a(null, $$1.dA(), $$1.dC(), $$1.dG(), awn.jA, awo.g, 1.0F, 0.4F / ($$0.C_().i() * 0.4F + 0.8F));
         $$1.a(efh.C);
      } else {
         $$0.a(null, $$1.dA(), $$1.dC(), $$1.dG(), awn.jC, awo.g, 0.5F, 0.4F / ($$0.C_().i() * 0.4F + 0.8F));
         if ($$0 instanceof arq $$5) {
            int $$6 = (int)(dfs.b($$5, $$3, $$1) * 20.0F);
            int $$7 = dfs.a($$5, $$3, $$1);
            crx.a(new crt($$1, $$0, $$7, $$6), $$5, $$3);
         }

         $$1.b(awx.c.b(this));
         $$1.a(efh.D);
      }

      return bud.a;
   }
}
