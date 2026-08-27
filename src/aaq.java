public class aaq implements xz<aai> {
   public static final xq<vd, aaq> a = xz.a(aaq::a, aaq::new);
   private final ib b;
   private final int c;
   private final int d;
   private final czf e;

   public aaq(ib $$0, czf $$1, int $$2, int $$3) {
      this.b = $$0;
      this.e = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   private aaq(vd $$0) {
      this.b = $$0.e();
      this.c = $$0.readUnsignedByte();
      this.d = $$0.readUnsignedByte();
      this.e = xo.a(ki.f).decode($$0);
   }

   private void a(vd $$0) {
      $$0.a(this.b);
      $$0.k(this.c);
      $$0.k(this.d);
      xo.a(ki.f).encode($$0, this.e);
   }

   @Override
   public yb<aaq> a() {
      return aet.j;
   }

   public void a(aai $$0) {
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

   public czf g() {
      return this.e;
   }
}
