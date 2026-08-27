public class aao implements wk<yd> {
   private final int a;
   private final byte b;

   public aao(bki $$0, byte $$1) {
      this.a = $$0.ah();
      this.b = $$1;
   }

   public aao(tu $$0) {
      this.a = $$0.n();
      this.b = $$0.readByte();
   }

   @Override
   public void a(tu $$0) {
      $$0.c(this.a);
      $$0.k(this.b);
   }

   public void a(yd $$0) {
      $$0.a(this);
   }

   public bki a(crs $$0) {
      return $$0.a(this.a);
   }

   public byte a() {
      return this.b;
   }
}
