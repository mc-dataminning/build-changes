public class aby implements ux<aaw> {
   private static final int a = 2;
   private final boolean b;

   public aby(cbk $$0) {
      this.b = $$0.b;
   }

   public aby(si $$0) {
      byte $$1 = $$0.readByte();
      this.b = ($$1 & 2) != 0;
   }

   @Override
   public void a(si $$0) {
      byte $$1 = 0;
      if (this.b) {
         $$1 = (byte)($$1 | 2);
      }

      $$0.k($$1);
   }

   public void a(aaw $$0) {
      $$0.a(this);
   }

   public boolean a() {
      return this.b;
   }
}
