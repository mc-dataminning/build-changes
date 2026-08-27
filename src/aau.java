public class aau implements yb<aam> {
   public static final xs<vf, aau> a = yb.a(aau::a, aau::new);
   private final ib b;
   private final int c;
   private final int d;
   private final daa e;

   public aau(ib $$0, daa $$1, int $$2, int $$3) {
      this.b = $$0;
      this.e = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   private aau(vf $$0) {
      this.b = $$0.e();
      this.c = $$0.readUnsignedByte();
      this.d = $$0.readUnsignedByte();
      this.e = xq.a(kj.f).decode($$0);
   }

   private void a(vf $$0) {
      $$0.a(this.b);
      $$0.k(this.c);
      $$0.k(this.d);
      xq.a(kj.f).encode($$0, this.e);
   }

   @Override
   public yd<aau> a() {
      return aex.j;
   }

   public void a(aam $$0) {
      $$0.a(this);
   }

   public ib b() {
      return this.b;
   }

   public int e() {
      return this.c;
   }

   public int f() {
      return this.d;
   }

   public daa g() {
      return this.e;
   }
}
