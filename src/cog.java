public class cog extends cou {
   public cog(cou.a $$0) {
      super($$0);
   }

   @Override
   public blu a(cri $$0) {
      chh $$1 = $$0.o();
      cvn $$2 = $$0.q();
      hz $$3 = $$0.a();
      dlf $$4 = $$2.a_($$3);
      if (!czc.h($$4) && !czd.g($$4) && !cze.g($$4)) {
         hz $$5 = $$3.a($$0.k());
         if (cyb.a($$2, $$5, $$0.g())) {
            $$2.a($$1, $$5, atk.iK, atl.e, 1.0F, $$2.F_().i() * 0.4F + 0.8F);
            dlf $$6 = cyb.a($$2, $$5);
            $$2.a($$5, $$6, 11);
            $$2.a($$1, dpp.i, $$3);
            coz $$7 = $$0.n();
            if ($$1 instanceof aow) {
               am.z.a((aow)$$1, $$5, $$7);
               $$7.a(1, $$1, bog.d($$0.p()));
            }

            return blu.a($$2.y_());
         } else {
            return blu.e;
         }
      } else {
         $$2.a($$1, $$3, atk.iK, atl.e, 1.0F, $$2.F_().i() * 0.4F + 0.8F);
         $$2.a($$3, $$4.a(dlv.r, Boolean.valueOf(true)), 11);
         $$2.a($$1, dpp.c, $$3);
         if ($$1 != null) {
            $$0.n().a(1, $$1, bog.d($$0.p()));
         }

         return blu.a($$2.y_());
      }
   }
}
