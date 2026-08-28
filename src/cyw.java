public class cyw extends czj {
   public cyw(czj.a $$0) {
      super($$0);
   }

   @Override
   public bug a(djm $$0, crm $$1, buf $$2) {
      czn $$3 = $$1.b($$2);
      if ($$1.ck != null) {
         if (!$$0.C) {
            int $$4 = $$1.ck.a($$3);
            $$3.a($$4, $$1, bxj.d($$2));
         }

         $$0.a(null, $$1.dz(), $$1.dB(), $$1.dF(), awn.jA, awo.g, 1.0F, 0.4F / ($$0.C_().i() * 0.4F + 0.8F));
         $$1.a(eft.C);
      } else {
         $$0.a(null, $$1.dz(), $$1.dB(), $$1.dF(), awn.jC, awo.g, 0.5F, 0.4F / ($$0.C_().i() * 0.4F + 0.8F));
         if ($$0 instanceof arq $$5) {
            int $$6 = (int)(dgc.b($$5, $$3, $$1) * 20.0F);
            int $$7 = dgc.a($$5, $$3, $$1);
            csh.a(new csd($$1, $$0, $$7, $$6), $$5, $$3);
         }

         $$1.b(awx.c.b(this));
         $$1.a(eft.D);
      }

      return bug.a;
   }
}
