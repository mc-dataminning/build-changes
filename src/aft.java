public class aft implements xx<aes> {
   public static final xo<uq, aft> a = xx.a(aft::a, aft::new);
   private static final int b = 2;
   private final boolean c;

   public aft(chi $$0) {
      this.c = $$0.b;
   }

   private aft(uq $$0) {
      byte $$1 = $$0.readByte();
      this.c = ($$1 & 2) != 0;
   }

   private void a(uq $$0) {
      byte $$1 = 0;
      if (this.c) {
         $$1 = (byte)($$1 | 2);
      }

      $$0.k($$1);
   }

   @Override
   public xz<aft> a() {
      return aeq.bF;
   }

   public void a(aes $$0) {
      $$0.a(this);
   }

   public boolean b() {
      return this.c;
   }
}
