public class aaf implements wb<xu> {
   private final int a;
   private final byte b;

   public aaf(bjt $$0, byte $$1) {
      this.a = $$0.ah();
      this.b = $$1;
   }

   public aaf(tl $$0) {
      this.a = $$0.n();
      this.b = $$0.readByte();
   }

   @Override
   public void a(tl $$0) {
      $$0.c(this.a);
      $$0.k(this.b);
   }

   public void a(xu $$0) {
      $$0.a(this);
   }

   public bjt a(cqz $$0) {
      return $$0.a(this.a);
   }

   public byte a() {
      return this.b;
   }
}
