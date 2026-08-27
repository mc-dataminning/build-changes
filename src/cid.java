public class cid extends cis implements ckr {
   public cid(cis.a $$0) {
      super($$0);
   }

   @Override
   public bgr<cix> a(cpl $$0, cbm $$1, bgp $$2) {
      cix $$3 = $$1.b($$2);
      if ($$1.ci != null) {
         if (!$$0.B) {
            int $$4 = $$1.ci.a($$3);
            $$3.a($$4, $$1, $$1x -> $$1x.d($$2));
         }

         $$0.a(null, $$1.dp(), $$1.dr(), $$1.dv(), aow.hP, aox.g, 1.0F, 0.4F / ($$0.y_().i() * 0.4F + 0.8F));
         $$1.a(djj.C);
      } else {
         $$0.a(null, $$1.dp(), $$1.dr(), $$1.dv(), aow.hR, aox.g, 0.5F, 0.4F / ($$0.y_().i() * 0.4F + 0.8F));
         if (!$$0.B) {
            int $$5 = cng.c($$3);
            int $$6 = cng.b($$3);
            $$0.b(new cca($$1, $$0, $$6, $$5));
         }

         $$1.b(apg.c.b(this));
         $$1.a(djj.D);
      }

      return bgr.a($$3, $$0.r_());
   }

   @Override
   public int c() {
      return 1;
   }
}
