public class abi implements yp<aba> {
   public static final yg<vt, abi> a = yp.a(abi::a, abi::new);
   private final id b;
   private final int c;
   private final int d;
   private final dch e;

   public abi(id $$0, dch $$1, int $$2, int $$3) {
      this.b = $$0;
      this.e = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   private abi(vt $$0) {
      this.b = $$0.e();
      this.c = $$0.readUnsignedByte();
      this.d = $$0.readUnsignedByte();
      this.e = ye.a(ku.f).decode($$0);
   }

   private void a(vt $$0) {
      $$0.a(this.b);
      $$0.k(this.c);
      $$0.k(this.d);
      ye.a(ku.f).encode($$0, this.e);
   }

   @Override
   public yr<abi> a() {
      return afl.j;
   }

   public void a(aba $$0) {
      $$0.a(this);
   }

   public id b() {
      return this.b;
   }

   public int e() {
      return this.c;
   }

   public int f() {
      return this.d;
   }

   public dch g() {
      return this.e;
   }
}
