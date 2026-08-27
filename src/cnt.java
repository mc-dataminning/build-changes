public class cnt extends cms {
   public cnt(cms.a $$0) {
      super($$0);
   }

   @Override
   public boolean a(cmx $$0, cto $$1, djg $$2, hx $$3, bmk $$4) {
      if (!$$1.B && !$$2.a(asg.aJ)) {
         $$0.a(1, $$4, $$0x -> $$0x.d(blz.a));
      }

      return !$$2.a(asg.O)
            && !$$2.a(cwr.bs)
            && !$$2.a(cwr.bt)
            && !$$2.a(cwr.bu)
            && !$$2.a(cwr.bv)
            && !$$2.a(cwr.sG)
            && !$$2.a(cwr.ff)
            && !$$2.a(cwr.fI)
            && !$$2.a(asg.a)
         ? super.a($$0, $$1, $$2, $$3, $$4)
         : true;
   }

   @Override
   public boolean a_(djg $$0) {
      return $$0.a(cwr.bs) || $$0.a(cwr.cw) || $$0.a(cwr.fI);
   }

   @Override
   public float a(cmx $$0, djg $$1) {
      if ($$1.a(cwr.bs) || $$1.a(asg.O)) {
         return 15.0F;
      } else if ($$1.a(asg.a)) {
         return 5.0F;
      } else {
         return !$$1.a(cwr.ff) && !$$1.a(cwr.fg) ? super.a($$0, $$1) : 2.0F;
      }
   }

   @Override
   public bka a(cpi $$0) {
      cto $$1 = $$0.q();
      hx $$2 = $$0.a();
      djg $$3 = $$1.a_($$2);
      if ($$3.b() instanceof dae $$5 && !$$5.o($$3)) {
         cfh $$6 = $$0.o();
         cmx $$7 = $$0.n();
         if ($$6 instanceof ane) {
            am.N.a((ane)$$6, $$2, $$7);
         }

         $$1.a($$6, $$2, arr.kL, ars.e, 1.0F, 1.0F);
         djg $$8 = $$5.n($$3);
         $$1.b($$2, $$8);
         $$1.a(dnq.c, $$2, dnq.a.a($$0.o(), $$8));
         if ($$6 != null) {
            $$7.a(1, $$6, $$1x -> $$1x.d($$0.p()));
         }

         return bka.a($$1.B);
      }

      return super.a($$0);
   }
}
