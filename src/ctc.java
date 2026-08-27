public class ctc extends ctf {
   public ctc(cte $$0, crn.a $$1) {
      super($$0, $$1);
   }

   public static cui a(cte $$0, int $$1, float $$2) {
      return cui.a()
         .a(bsa.c, new bry(e, "Weapon modifier", (double)((float)$$1 + $$0.c()), bry.a.a), bqi.b)
         .a(bsa.e, new bry(f, "Weapon modifier", (double)$$2, bry.a.a), bqi.b)
         .a();
   }

   @Override
   public boolean a(dpi $$0, czg $$1, id $$2, cka $$3) {
      return !$$3.f();
   }

   @Override
   public float a(crs $$0, dpi $$1) {
      if ($$1.a(dcj.bs)) {
         return 15.0F;
      } else {
         return $$1.a(ave.bE) ? 1.5F : 1.0F;
      }
   }

   @Override
   public boolean a(crs $$0, bqt $$1, bqt $$2) {
      $$0.a(1, $$2, bqh.a);
      return true;
   }

   @Override
   public boolean a(crs $$0, czg $$1, dpi $$2, id $$3, bqt $$4) {
      if ($$2.h($$1, $$3) != 0.0F) {
         $$0.a(2, $$4, bqh.a);
      }

      return true;
   }

   @Override
   public boolean a_(dpi $$0) {
      return $$0.a(dcj.bs);
   }
}
