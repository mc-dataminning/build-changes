public class cic extends cir implements ckq {
   public cic(cir.a $$0) {
      super($$0);
   }

   @Override
   public bgp<ciw> a(cpk $$0, cbl $$1, bgn $$2) {
      ciw $$3 = $$1.b($$2);
      if ($$1.ci != null) {
         if (!$$0.B) {
            int $$4 = $$1.ci.a($$3);
            $$3.a($$4, $$1, $$1x -> $$1x.d($$2));
         }

         $$0.a(null, $$1.dp(), $$1.dr(), $$1.dv(), aou.hP, aov.g, 1.0F, 0.4F / ($$0.y_().i() * 0.4F + 0.8F));
         $$1.a(dji.C);
      } else {
         $$0.a(null, $$1.dp(), $$1.dr(), $$1.dv(), aou.hR, aov.g, 0.5F, 0.4F / ($$0.y_().i() * 0.4F + 0.8F));
         if (!$$0.B) {
            int $$5 = cnf.c($$3);
            int $$6 = cnf.b($$3);
            $$0.b(new cbz($$1, $$0, $$6, $$5));
         }

         $$1.b(ape.c.b(this));
         $$1.a(dji.D);
      }

      return bgp.a($$3, $$0.r_());
   }

   @Override
   public int c() {
      return 1;
   }
}
