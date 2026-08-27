public class cln extends cmc implements cob {
   public cln(cmc.a $$0) {
      super($$0);
   }

   @Override
   public bjm<cmh> a(csy $$0, cer $$1, bjk $$2) {
      cmh $$3 = $$1.b($$2);
      if ($$1.ck != null) {
         if (!$$0.B) {
            int $$4 = $$1.ck.a($$3);
            $$3.a($$4, $$1, $$1x -> $$1x.d($$2));
         }

         $$0.a(null, $$1.dr(), $$1.dt(), $$1.dx(), arc.is, ard.g, 1.0F, 0.4F / ($$0.F_().i() * 0.4F + 0.8F));
         $$1.a(dmz.C);
      } else {
         $$0.a(null, $$1.dr(), $$1.dt(), $$1.dx(), arc.iu, ard.g, 0.5F, 0.4F / ($$0.F_().i() * 0.4F + 0.8F));
         if (!$$0.B) {
            int $$5 = cqu.c($$3);
            int $$6 = cqu.b($$3);
            $$0.b(new cff($$1, $$0, $$6, $$5));
         }

         $$1.b(arm.c.b(this));
         $$1.a(dmz.D);
      }

      return bjm.a($$3, $$0.y_());
   }

   @Override
   public int c() {
      return 1;
   }
}
