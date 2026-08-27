public class ace implements ve<abd> {
   private static final int a = 2;
   private final boolean b;

   public ace(cbr $$0) {
      this.b = $$0.b;
   }

   public ace(sp $$0) {
      byte $$1 = $$0.readByte();
      this.b = ($$1 & 2) != 0;
   }

   @Override
   public void a(sp $$0) {
      byte $$1 = 0;
      if (this.b) {
         $$1 = (byte)($$1 | 2);
      }

      $$0.k($$1);
   }

   public void a(abd $$0) {
      $$0.a(this);
   }

   public boolean a() {
      return this.b;
   }
}
