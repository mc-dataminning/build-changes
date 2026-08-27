public class csl extends cpv implements cxq {
   protected static final float a = 3.0F;
   protected static final efb b = cpn.a(5.0, 0.0, 5.0, 11.0, 10.0, 11.0);
   private final bey c;
   private final int d;

   public csl(bey $$0, int $$1, dca.d $$2) {
      super($$2);
      this.c = $$0;
      if ($$0.a()) {
         this.d = $$1;
      } else {
         this.d = $$1 * 20;
      }
   }

   @Override
   public efb a(dcb $$0, cls $$1, gu $$2, een $$3) {
      eei $$4 = $$0.n($$1, $$2);
      return b.a($$4.c, $$4.d, $$4.e);
   }

   @Override
   public bey a() {
      return this.c;
   }

   @Override
   public int b() {
      return this.d;
   }
}
