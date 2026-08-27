public class abn implements xg<zb> {
   private final int a;
   private final byte b;

   public abn(blw $$0, byte $$1) {
      this.a = $$0.aj();
      this.b = $$1;
   }

   public abn(uj $$0) {
      this.a = $$0.n();
      this.b = $$0.readByte();
   }

   @Override
   public void a(uj $$0) {
      $$0.c(this.a);
      $$0.k(this.b);
   }

   public void a(zb $$0) {
      $$0.a(this);
   }

   public blw a(ctx $$0) {
      return $$0.a(this.a);
   }

   public byte a() {
      return this.b;
   }
}
