public class ckb extends cja {
   public ckb(cja.a $$0) {
      super($$0);
   }

   @Override
   public boolean a(cjf $$0, cpv $$1, dfj $$2, gw $$3, bjg $$4) {
      if (!$$1.B && !$$2.a(aps.aJ)) {
         $$0.a(1, $$4, $$0x -> $$0x.d(biv.a));
      }

      return !$$2.a(aps.O)
            && !$$2.a(csw.bs)
            && !$$2.a(csw.bt)
            && !$$2.a(csw.bu)
            && !$$2.a(csw.bv)
            && !$$2.a(csw.rF)
            && !$$2.a(csw.ff)
            && !$$2.a(csw.fI)
            && !$$2.a(aps.a)
         ? super.a($$0, $$1, $$2, $$3, $$4)
         : true;
   }

   @Override
   public boolean a_(dfj $$0) {
      return $$0.a(csw.bs) || $$0.a(csw.cw) || $$0.a(csw.fI);
   }

   @Override
   public float a(cjf $$0, dfj $$1) {
      if ($$1.a(csw.bs) || $$1.a(aps.O)) {
         return 15.0F;
      } else if ($$1.a(aps.a)) {
         return 5.0F;
      } else {
         return !$$1.a(csw.ff) && !$$1.a(csw.fg) ? super.a($$0, $$1) : 2.0F;
      }
   }

   @Override
   public bgy a(clp $$0) {
      cpv $$1 = $$0.q();
      gw $$2 = $$0.a();
      dfj $$3 = $$1.a_($$2);
      if ($$3.b() instanceof cwi $$5 && !$$5.o($$3)) {
         cbu $$6 = $$0.o();
         cjf $$7 = $$0.n();
         if ($$6 instanceof akr) {
            al.M.a((akr)$$6, $$2, $$7);
         }

         $$1.a($$6, $$2, apd.ki, ape.e, 1.0F, 1.0F);
         dfj $$8 = $$5.n($$3);
         $$1.b($$2, $$8);
         $$1.a(djt.c, $$2, djt.a.a($$0.o(), $$8));
         if ($$6 != null) {
            $$7.a(1, $$6, $$1x -> $$1x.d($$0.p()));
         }

         return bgy.a($$1.B);
      }

      return super.a($$0);
   }
}
