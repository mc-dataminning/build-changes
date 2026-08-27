public class cqs extends ctr {
   private final awd<dcv> a;
   protected final float b;

   protected cqs(ctq $$0, awd<dcv> $$1, cry.a $$2) {
      super($$0, $$2);
      this.a = $$1;
      this.b = $$0.b();
   }

   public static cuw a(ctq $$0, float $$1, float $$2) {
      return cuw.a()
         .a(bsl.c, new bsj(e, "Tool modifier", (double)($$1 + $$0.c()), bsj.a.a), bqt.b)
         .a(bsl.e, new bsj(f, "Tool modifier", (double)$$2, bsj.a.a), bqt.b)
         .a();
   }

   @Override
   public float a(csd $$0, dpy $$1) {
      return $$1.a(this.a) ? this.b : 1.0F;
   }

   @Override
   public boolean a(csd $$0, bre $$1, bre $$2) {
      $$0.a(2, $$2, bqs.a);
      return true;
   }

   @Override
   public boolean a(csd $$0, czu $$1, dpy $$2, im $$3, bre $$4) {
      if (!$$1.B && $$2.h($$1, $$3) != 0.0F) {
         $$0.a(1, $$4, bqs.a);
      }

      return true;
   }

   @Override
   public boolean a_(dpy $$0) {
      int $$1 = this.h().d();
      if ($$1 < 3 && $$0.a(avo.bF)) {
         return false;
      } else if ($$1 < 2 && $$0.a(avo.bG)) {
         return false;
      } else {
         return $$1 < 1 && $$0.a(avo.bH) ? false : $$0.a(this.a);
      }
   }
}
