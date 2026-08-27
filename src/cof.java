public class cof extends cou {
   public cof(cou.a $$0) {
      super($$0);
   }

   @Override
   public blv<coz> a(cvn $$0, chh $$1, blt $$2) {
      coz $$3 = $$1.b($$2);
      if ($$1.co != null) {
         if (!$$0.B) {
            int $$4 = $$1.co.a($$3);
            $$3.a($$4, $$1, bog.d($$2));
         }

         $$0.a(null, $$1.dr(), $$1.dt(), $$1.dx(), atk.iH, atl.g, 1.0F, 0.4F / ($$0.F_().i() * 0.4F + 0.8F));
         $$1.b(dpp.C);
      } else {
         $$0.a(null, $$1.dr(), $$1.dt(), $$1.dx(), atk.iJ, atl.g, 0.5F, 0.4F / ($$0.F_().i() * 0.4F + 0.8F));
         if (!$$0.B) {
            int $$5 = ctj.c($$3);
            int $$6 = ctj.b($$3);
            $$0.b(new chv($$1, $$0, $$6, $$5));
         }

         $$1.b(atu.c.b(this));
         $$1.b(dpp.D);
      }

      return blv.a($$3, $$0.y_());
   }

   @Override
   public int an_() {
      return 1;
   }
}
