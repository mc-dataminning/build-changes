public class cso extends crn {
   public cso(crn.a $$0) {
      super($$0);
   }

   @Override
   public boolean a(crs $$0, czg $$1, dpi $$2, id $$3, bqt $$4) {
      if (!$$1.B && !$$2.a(ave.aK)) {
         $$0.a(1, $$4, bqh.a);
      }

      return !$$2.a(ave.O)
            && !$$2.a(dcj.bs)
            && !$$2.a(dcj.bt)
            && !$$2.a(dcj.bu)
            && !$$2.a(dcj.bv)
            && !$$2.a(dcj.sG)
            && !$$2.a(dcj.ff)
            && !$$2.a(dcj.fI)
            && !$$2.a(ave.a)
         ? super.a($$0, $$1, $$2, $$3, $$4)
         : true;
   }

   @Override
   public boolean a_(dpi $$0) {
      return $$0.a(dcj.bs) || $$0.a(dcj.cw) || $$0.a(dcj.fI);
   }

   @Override
   public float a(crs $$0, dpi $$1) {
      if ($$1.a(dcj.bs) || $$1.a(ave.O)) {
         return 15.0F;
      } else if ($$1.a(ave.a)) {
         return 5.0F;
      } else {
         return !$$1.a(dcj.ff) && !$$1.a(dcj.fg) ? super.a($$0, $$1) : 2.0F;
      }
   }

   @Override
   public bof a(cuz $$0) {
      czg $$1 = $$0.q();
      id $$2 = $$0.a();
      dpi $$3 = $$1.a_($$2);
      if ($$3.b() instanceof dfw $$5 && !$$5.o($$3)) {
         cka $$6 = $$0.o();
         crs $$7 = $$0.n();
         if ($$6 instanceof apv) {
            am.N.a((apv)$$6, $$2, $$7);
         }

         $$1.a($$6, $$2, auo.lk, aup.e, 1.0F, 1.0F);
         dpi $$8 = $$5.n($$3);
         $$1.b($$2, $$8);
         $$1.a(dub.c, $$2, dub.a.a($$0.o(), $$8));
         if ($$6 != null) {
            $$7.a(1, $$6, bqt.d($$0.p()));
         }

         return bof.a($$1.B);
      }

      return super.a($$0);
   }
}
