public class abi implements yb<aam> {
   public static final xs<uu, abi> a = yb.a(abi::a, abi::new);
   private final int b;
   private final int c;
   private final int d;

   public abi(int $$0, int $$1, int $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private abi(uu $$0) {
      this.b = $$0.readUnsignedByte();
      this.c = $$0.readShort();
      this.d = $$0.readShort();
   }

   private void a(uu $$0) {
      $$0.k(this.b);
      $$0.l(this.c);
      $$0.l(this.d);
   }

   @Override
   public yd<abi> a() {
      return aex.v;
   }

   public void a(aam $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public int e() {
      return this.c;
   }

   public int f() {
      return this.d;
   }
}
