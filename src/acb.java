public class acb implements va<aaz> {
   private static final int a = 2;
   private final boolean b;

   public acb(cbm $$0) {
      this.b = $$0.b;
   }

   public acb(sl $$0) {
      byte $$1 = $$0.readByte();
      this.b = ($$1 & 2) != 0;
   }

   @Override
   public void a(sl $$0) {
      byte $$1 = 0;
      if (this.b) {
         $$1 = (byte)($$1 | 2);
      }

      $$0.k($$1);
   }

   public void a(aaz $$0) {
      $$0.a(this);
   }

   public boolean a() {
      return this.b;
   }
}
