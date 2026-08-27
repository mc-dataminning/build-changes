public class clx extends cmm implements col {
   public clx(cmm.a $$0) {
      super($$0);
   }

   @Override
   public bjw<cmr> a(cti $$0, cfb $$1, bju $$2) {
      cmr $$3 = $$1.b($$2);
      if ($$1.ck != null) {
         if (!$$0.B) {
            int $$4 = $$1.ck.a($$3);
            $$3.a($$4, $$1, $$1x -> $$1x.d($$2));
         }

         $$0.a(null, $$1.dr(), $$1.dt(), $$1.dx(), arm.is, arn.g, 1.0F, 0.4F / ($$0.F_().i() * 0.4F + 0.8F));
         $$1.a(dnk.C);
      } else {
         $$0.a(null, $$1.dr(), $$1.dt(), $$1.dx(), arm.iu, arn.g, 0.5F, 0.4F / ($$0.F_().i() * 0.4F + 0.8F));
         if (!$$0.B) {
            int $$5 = cre.c($$3);
            int $$6 = cre.b($$3);
            $$0.b(new cfp($$1, $$0, $$6, $$5));
         }

         $$1.b(arw.c.b(this));
         $$1.a(dnk.D);
      }

      return bjw.a($$3, $$0.y_());
   }

   @Override
   public int c() {
      return 1;
   }
}
