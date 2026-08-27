public class cmd extends cms implements cos {
   public cmd(cms.a $$0) {
      super($$0);
   }

   @Override
   public bkb<cmx> a(cto $$0, cfh $$1, bjz $$2) {
      cmx $$3 = $$1.b($$2);
      if ($$1.ck != null) {
         if (!$$0.B) {
            int $$4 = $$1.ck.a($$3);
            $$3.a($$4, $$1, $$1x -> $$1x.d($$2));
         }

         $$0.a(null, $$1.dr(), $$1.dt(), $$1.dx(), arr.is, ars.g, 1.0F, 0.4F / ($$0.F_().i() * 0.4F + 0.8F));
         $$1.a(dnq.C);
      } else {
         $$0.a(null, $$1.dr(), $$1.dt(), $$1.dx(), arr.iu, ars.g, 0.5F, 0.4F / ($$0.F_().i() * 0.4F + 0.8F));
         if (!$$0.B) {
            int $$5 = crk.c($$3);
            int $$6 = crk.b($$3);
            $$0.b(new cfv($$1, $$0, $$6, $$5));
         }

         $$1.b(asb.c.b(this));
         $$1.a(dnq.D);
      }

      return bkb.a($$3, $$0.y_());
   }

   @Override
   public int c() {
      return 1;
   }
}
