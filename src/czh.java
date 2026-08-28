public class czh extends czu {
   public czh(czu.a $$0) {
      super($$0);
   }

   @Override
   public bur a(djx $$0, crx $$1, buq $$2) {
      czy $$3 = $$1.b($$2);
      if ($$1.ck != null) {
         if (!$$0.C) {
            int $$4 = $$1.ck.a($$3);
            $$3.a($$4, $$1, bxu.d($$2));
         }

         $$0.a(null, $$1.dA(), $$1.dC(), $$1.dG(), awp.jA, awq.g, 1.0F, 0.4F / ($$0.G_().i() * 0.4F + 0.8F));
         $$1.a(ege.C);
      } else {
         $$0.a(null, $$1.dA(), $$1.dC(), $$1.dG(), awp.jC, awq.g, 0.5F, 0.4F / ($$0.G_().i() * 0.4F + 0.8F));
         if ($$0 instanceof ars $$5) {
            int $$6 = (int)(dgn.b($$5, $$3, $$1) * 20.0F);
            int $$7 = dgn.a($$5, $$3, $$1);
            css.a(new cso($$1, $$0, $$7, $$6), $$5, $$3);
         }

         $$1.b(awz.c.b(this));
         $$1.a(ege.D);
      }

      return bur.a;
   }
}
