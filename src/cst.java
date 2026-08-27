public class cst extends csw {
   public cst(csv $$0, cre.a $$1) {
      super($$0, $$1);
   }

   public static ctz a(csv $$0, int $$1, float $$2) {
      return ctz.a()
         .a(brv.c, new brt(e, "Weapon modifier", (double)((float)$$1 + $$0.c()), brt.a.a), bqd.b)
         .a(brv.e, new brt(f, "Weapon modifier", (double)$$2, brt.a.a), bqd.b)
         .a();
   }

   @Override
   public boolean a(doz $$0, cyx $$1, ib $$2, cjt $$3) {
      return !$$3.f();
   }

   @Override
   public float a(crj $$0, doz $$1) {
      if ($$1.a(dca.bs)) {
         return 15.0F;
      } else {
         return $$1.a(avc.bE) ? 1.5F : 1.0F;
      }
   }

   @Override
   public boolean a(crj $$0, bqo $$1, bqo $$2) {
      $$0.a(1, $$2, bqc.a);
      return true;
   }

   @Override
   public boolean a(crj $$0, cyx $$1, doz $$2, ib $$3, bqo $$4) {
      if ($$2.h($$1, $$3) != 0.0F) {
         $$0.a(2, $$4, bqc.a);
      }

      return true;
   }

   @Override
   public boolean a_(doz $$0) {
      return $$0.a(dca.bs);
   }
}
