public class cie extends cit implements cks {
   public cie(cit.a $$0) {
      super($$0);
   }

   @Override
   public bgr<ciy> a(cpm $$0, cbn $$1, bgp $$2) {
      ciy $$3 = $$1.b($$2);
      if ($$1.ci != null) {
         if (!$$0.B) {
            int $$4 = $$1.ci.a($$3);
            $$3.a($$4, $$1, $$1x -> $$1x.d($$2));
         }

         $$0.a(null, $$1.dp(), $$1.dr(), $$1.dv(), aow.hP, aox.g, 1.0F, 0.4F / ($$0.y_().i() * 0.4F + 0.8F));
         $$1.a(djk.C);
      } else {
         $$0.a(null, $$1.dp(), $$1.dr(), $$1.dv(), aow.hR, aox.g, 0.5F, 0.4F / ($$0.y_().i() * 0.4F + 0.8F));
         if (!$$0.B) {
            int $$5 = cnh.c($$3);
            int $$6 = cnh.b($$3);
            $$0.b(new ccb($$1, $$0, $$6, $$5));
         }

         $$1.b(apg.c.b(this));
         $$1.a(djk.D);
      }

      return bgr.a($$3, $$0.r_());
   }

   @Override
   public int c() {
      return 1;
   }
}
