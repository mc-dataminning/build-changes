public class cvi extends css implements dan {
   protected static final float a = 3.0F;
   protected static final ehy b = csk.a(5.0, 0.0, 5.0, 11.0, 10.0, 11.0);
   private final bhr c;
   private final int d;

   public cvi(bhr $$0, int $$1, dex.d $$2) {
      super($$2);
      this.c = $$0;
      if ($$0.a()) {
         this.d = $$1;
      } else {
         this.d = $$1 * 20;
      }
   }

   @Override
   public ehy a(dey $$0, coq $$1, gv $$2, ehk $$3) {
      ehf $$4 = $$0.n($$1, $$2);
      return b.a($$4.c, $$4.d, $$4.e);
   }

   @Override
   public bhr a() {
      return this.c;
   }

   @Override
   public int b() {
      return this.d;
   }
}
