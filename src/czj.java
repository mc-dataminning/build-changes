public class czj extends czw {
   public czj(czw.a $$0) {
      super($$0);
   }

   @Override
   public but a(djz $$0, crz $$1, bus $$2) {
      daa $$3 = $$1.b($$2);
      if ($$1.ck != null) {
         if (!$$0.C) {
            int $$4 = $$1.ck.a($$3);
            $$3.a($$4, $$1, bxw.d($$2));
         }

         $$0.a(null, $$1.dA(), $$1.dC(), $$1.dG(), awr.jA, aws.g, 1.0F, 0.4F / ($$0.G_().i() * 0.4F + 0.8F));
         $$1.a(egg.C);
      } else {
         $$0.a(null, $$1.dA(), $$1.dC(), $$1.dG(), awr.jC, aws.g, 0.5F, 0.4F / ($$0.G_().i() * 0.4F + 0.8F));
         if ($$0 instanceof aru $$5) {
            int $$6 = (int)(dgp.b($$5, $$3, $$1) * 20.0F);
            int $$7 = dgp.a($$5, $$3, $$1);
            csu.a(new csq($$1, $$0, $$7, $$6), $$5, $$3);
         }

         $$1.b(axb.c.b(this));
         $$1.a(egg.D);
      }

      return but.a;
   }
}
