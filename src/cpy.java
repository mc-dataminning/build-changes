public class cpy extends csw {
   private final avr<dby> a;
   protected final float b;

   protected cpy(csv $$0, avr<dby> $$1, cre.a $$2) {
      super($$0, $$2);
      this.a = $$1;
      this.b = $$0.b();
   }

   public static ctz a(csv $$0, float $$1, float $$2) {
      return ctz.a()
         .a(brv.c, new brt(e, "Tool modifier", (double)($$1 + $$0.c()), brt.a.a), bqd.b)
         .a(brv.e, new brt(f, "Tool modifier", (double)$$2, brt.a.a), bqd.b)
         .a();
   }

   @Override
   public float a(crj $$0, doz $$1) {
      return $$1.a(this.a) ? this.b : 1.0F;
   }

   @Override
   public boolean a(crj $$0, bqo $$1, bqo $$2) {
      $$0.a(2, $$2, bqc.a);
      return true;
   }

   @Override
   public boolean a(crj $$0, cyx $$1, doz $$2, ib $$3, bqo $$4) {
      if (!$$1.B && $$2.h($$1, $$3) != 0.0F) {
         $$0.a(1, $$4, bqc.a);
      }

      return true;
   }

   @Override
   public boolean a_(doz $$0) {
      int $$1 = this.h().d();
      if ($$1 < 3 && $$0.a(avc.bF)) {
         return false;
      } else if ($$1 < 2 && $$0.a(avc.bG)) {
         return false;
      } else {
         return $$1 < 1 && $$0.a(avc.bH) ? false : $$0.a(this.a);
      }
   }
}
