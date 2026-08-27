public class cqh extends ctf {
   private final avt<dch> a;
   protected final float b;

   protected cqh(cte $$0, avt<dch> $$1, crn.a $$2) {
      super($$0, $$2);
      this.a = $$1;
      this.b = $$0.b();
   }

   public static cui a(cte $$0, float $$1, float $$2) {
      return cui.a()
         .a(bsa.c, new bry(e, "Tool modifier", (double)($$1 + $$0.c()), bry.a.a), bqi.b)
         .a(bsa.e, new bry(f, "Tool modifier", (double)$$2, bry.a.a), bqi.b)
         .a();
   }

   @Override
   public float a(crs $$0, dpi $$1) {
      return $$1.a(this.a) ? this.b : 1.0F;
   }

   @Override
   public boolean a(crs $$0, bqt $$1, bqt $$2) {
      $$0.a(2, $$2, bqh.a);
      return true;
   }

   @Override
   public boolean a(crs $$0, czg $$1, dpi $$2, id $$3, bqt $$4) {
      if (!$$1.B && $$2.h($$1, $$3) != 0.0F) {
         $$0.a(1, $$4, bqh.a);
      }

      return true;
   }

   @Override
   public boolean a_(dpi $$0) {
      int $$1 = this.h().d();
      if ($$1 < 3 && $$0.a(ave.bF)) {
         return false;
      } else if ($$1 < 2 && $$0.a(ave.bG)) {
         return false;
      } else {
         return $$1 < 1 && $$0.a(ave.bH) ? false : $$0.a(this.a);
      }
   }
}
