public class cto extends ctr {
   public cto(ctq $$0, cry.a $$1) {
      super($$0, $$1);
   }

   public static cuw a(ctq $$0, int $$1, float $$2) {
      return cuw.a()
         .a(bsl.c, new bsj(e, "Weapon modifier", (double)((float)$$1 + $$0.c()), bsj.a.a), bqt.b)
         .a(bsl.e, new bsj(f, "Weapon modifier", (double)$$2, bsj.a.a), bqt.b)
         .a();
   }

   @Override
   public boolean a(dpy $$0, czu $$1, im $$2, ckl $$3) {
      return !$$3.f();
   }

   @Override
   public float a(csd $$0, dpy $$1) {
      if ($$1.a(dcx.bs)) {
         return 15.0F;
      } else {
         return $$1.a(avo.bE) ? 1.5F : 1.0F;
      }
   }

   @Override
   public boolean a(csd $$0, bre $$1, bre $$2) {
      $$0.a(1, $$2, bqs.a);
      return true;
   }

   @Override
   public boolean a(csd $$0, czu $$1, dpy $$2, im $$3, bre $$4) {
      if ($$2.h($$1, $$3) != 0.0F) {
         $$0.a(2, $$4, bqs.a);
      }

      return true;
   }

   @Override
   public boolean a_(dpy $$0) {
      return $$0.a(dcx.bs);
   }
}
