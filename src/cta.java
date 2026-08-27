public class cta extends cry {
   public cta(cry.a $$0) {
      super($$0);
   }

   @Override
   public boolean a(csd $$0, czu $$1, dpy $$2, im $$3, bre $$4) {
      if (!$$1.B && !$$2.a(avo.aK)) {
         $$0.a(1, $$4, bqs.a);
      }

      return !$$2.a(avo.O)
            && !$$2.a(dcx.bs)
            && !$$2.a(dcx.bt)
            && !$$2.a(dcx.bu)
            && !$$2.a(dcx.bv)
            && !$$2.a(dcx.sG)
            && !$$2.a(dcx.ff)
            && !$$2.a(dcx.fI)
            && !$$2.a(avo.a)
         ? super.a($$0, $$1, $$2, $$3, $$4)
         : true;
   }

   @Override
   public boolean a_(dpy $$0) {
      return $$0.a(dcx.bs) || $$0.a(dcx.cw) || $$0.a(dcx.fI);
   }

   @Override
   public float a(csd $$0, dpy $$1) {
      if ($$1.a(dcx.bs) || $$1.a(avo.O)) {
         return 15.0F;
      } else if ($$1.a(avo.a)) {
         return 5.0F;
      } else {
         return !$$1.a(dcx.ff) && !$$1.a(dcx.fg) ? super.a($$0, $$1) : 2.0F;
      }
   }

   @Override
   public boq a(cvn $$0) {
      czu $$1 = $$0.q();
      im $$2 = $$0.a();
      dpy $$3 = $$1.a_($$2);
      if ($$3.b() instanceof dgk $$5 && !$$5.o($$3)) {
         ckl $$6 = $$0.o();
         csd $$7 = $$0.n();
         if ($$6 instanceof aqf) {
            am.N.a((aqf)$$6, $$2, $$7);
         }

         $$1.a($$6, $$2, auz.lk, ava.e, 1.0F, 1.0F);
         dpy $$8 = $$5.n($$3);
         $$1.b($$2, $$8);
         $$1.a(dur.c, $$2, dur.a.a($$0.o(), $$8));
         if ($$6 != null) {
            $$7.a(1, $$6, bre.d($$0.p()));
         }

         return boq.a($$1.B);
      }

      return super.a($$0);
   }
}
