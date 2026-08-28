public class aif implements zo<aha> {
   public static final ze<vy, aif> a = zo.a(aif::a, aif::new);
   private static final int b = 2;
   private final boolean c;

   public aif(cse $$0) {
      this.c = $$0.b;
   }

   private aif(vy $$0) {
      byte $$1 = $$0.readByte();
      this.c = ($$1 & 2) != 0;
   }

   private void a(vy $$0) {
      byte $$1 = 0;
      if (this.c) {
         $$1 = (byte)($$1 | 2);
      }

      $$0.l($$1);
   }

   @Override
   public zq<aif> a() {
      return agy.bR;
   }

   public void a(aha $$0) {
      $$0.a(this);
   }

   public boolean b() {
      return this.c;
   }
}
