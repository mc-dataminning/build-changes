public class crk extends cry {
   public crk(cry.a $$0) {
      super($$0);
   }

   @Override
   public bor<csd> a(czu $$0, ckl $$1, bop $$2) {
      csd $$3 = $$1.b($$2);
      if ($$1.cu != null) {
         if (!$$0.B) {
            int $$4 = $$1.cu.a($$3);
            $$3.a($$4, $$1, bre.d($$2));
         }

         $$0.a(null, $$1.ds(), $$1.du(), $$1.dy(), auz.iR, ava.g, 1.0F, 0.4F / ($$0.E_().i() * 0.4F + 0.8F));
         $$1.a(dur.C);
      } else {
         $$0.a(null, $$1.ds(), $$1.du(), $$1.dy(), auz.iT, ava.g, 0.5F, 0.4F / ($$0.E_().i() * 0.4F + 0.8F));
         if (!$$0.B) {
            int $$5 = cxo.e($$3);
            int $$6 = cxo.d($$3);
            $$0.b(new ckz($$1, $$0, $$6, $$5));
         }

         $$1.b(avj.c.b(this));
         $$1.a(dur.D);
      }

      return bor.a($$3, $$0.x_());
   }

   @Override
   public int g() {
      return 1;
   }
}
