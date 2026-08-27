public class abm implements xf<za> {
   private final int a;
   private final byte b;

   public abm(blu $$0, byte $$1) {
      this.a = $$0.aj();
      this.b = $$1;
   }

   public abm(ui $$0) {
      this.a = $$0.n();
      this.b = $$0.readByte();
   }

   @Override
   public void a(ui $$0) {
      $$0.c(this.a);
      $$0.k(this.b);
   }

   public void a(za $$0) {
      $$0.a(this);
   }

   public blu a(cto $$0) {
      return $$0.a(this.a);
   }

   public byte a() {
      return this.b;
   }
}
