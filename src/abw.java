public class abw implements uw<aav> {
   private static final int a = 2;
   private final boolean b;

   public abw(cbi $$0) {
      this.b = $$0.b;
   }

   public abw(sh $$0) {
      byte $$1 = $$0.readByte();
      this.b = ($$1 & 2) != 0;
   }

   @Override
   public void a(sh $$0) {
      byte $$1 = 0;
      if (this.b) {
         $$1 = (byte)($$1 | 2);
      }

      $$0.k($$1);
   }

   public void a(aav $$0) {
      $$0.a(this);
   }

   public boolean a() {
      return this.b;
   }
}
