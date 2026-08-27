public class cqz extends crn {
   public cqz(crn.a $$0) {
      super($$0);
   }

   @Override
   public bog<crs> a(czg $$0, cka $$1, boe $$2) {
      crs $$3 = $$1.b($$2);
      if ($$1.cs != null) {
         if (!$$0.B) {
            int $$4 = $$1.cs.a($$3);
            $$3.a($$4, $$1, bqt.d($$2));
         }

         $$0.a(null, $$1.dr(), $$1.dt(), $$1.dx(), auo.iR, aup.g, 1.0F, 0.4F / ($$0.E_().i() * 0.4F + 0.8F));
         $$1.a(dub.C);
      } else {
         $$0.a(null, $$1.dr(), $$1.dt(), $$1.dx(), auo.iT, aup.g, 0.5F, 0.4F / ($$0.E_().i() * 0.4F + 0.8F));
         if (!$$0.B) {
            int $$5 = cxa.e($$3);
            int $$6 = cxa.d($$3);
            $$0.b(new cko($$1, $$0, $$6, $$5));
         }

         $$1.b(auz.c.b(this));
         $$1.a(dub.D);
      }

      return bog.a($$3, $$0.x_());
   }

   @Override
   public int g() {
      return 1;
   }
}
