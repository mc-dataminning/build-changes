public class aac implements uo<zb> {
   private static final int a = 2;
   private final boolean b;

   public aac(byl $$0) {
      this.b = $$0.b;
   }

   public aac(sf $$0) {
      byte $$1 = $$0.readByte();
      this.b = ($$1 & 2) != 0;
   }

   @Override
   public void a(sf $$0) {
      byte $$1 = 0;
      if (this.b) {
         $$1 = (byte)($$1 | 2);
      }

      $$0.writeByte($$1);
   }

   public void a(zb $$0) {
      $$0.a(this);
   }

   public boolean a() {
      return this.b;
   }
}
