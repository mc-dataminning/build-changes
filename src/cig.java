public class cig extends civ implements cku {
   public cig(civ.a $$0) {
      super($$0);
   }

   @Override
   public bgu<cja> a(cpq $$0, cbp $$1, bgs $$2) {
      cja $$3 = $$1.b($$2);
      if ($$1.ci != null) {
         if (!$$0.B) {
            int $$4 = $$1.ci.a($$3);
            $$3.a($$4, $$1, $$1x -> $$1x.d($$2));
         }

         $$0.a(null, $$1.dp(), $$1.dr(), $$1.dv(), aoz.hP, apa.g, 1.0F, 0.4F / ($$0.y_().i() * 0.4F + 0.8F));
         $$1.a(djo.C);
      } else {
         $$0.a(null, $$1.dp(), $$1.dr(), $$1.dv(), aoz.hR, apa.g, 0.5F, 0.4F / ($$0.y_().i() * 0.4F + 0.8F));
         if (!$$0.B) {
            int $$5 = cnl.c($$3);
            int $$6 = cnl.b($$3);
            $$0.b(new ccd($$1, $$0, $$6, $$5));
         }

         $$1.b(apj.c.b(this));
         $$1.a(djo.D);
      }

      return bgu.a($$3, $$0.r_());
   }

   @Override
   public int c() {
      return 1;
   }
}
