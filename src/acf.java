public class acf implements zl<abw> {
   public static final zc<wp, acf> a = zl.a(acf::a, acf::new);
   private final ir b;
   private final int c;
   private final int d;
   private final dfc e;

   public acf(ir $$0, dfc $$1, int $$2, int $$3) {
      this.b = $$0;
      this.e = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   private acf(wp $$0) {
      this.b = $$0.e();
      this.c = $$0.readUnsignedByte();
      this.d = $$0.readUnsignedByte();
      this.e = za.a(li.f).decode($$0);
   }

   private void a(wp $$0) {
      $$0.a(this.b);
      $$0.k(this.c);
      $$0.k(this.d);
      za.a(li.f).encode($$0, this.e);
   }

   @Override
   public zn<acf> a() {
      return agj.k;
   }

   public void a(abw $$0) {
      $$0.a(this);
   }

   public ir b() {
      return this.b;
   }

   public int e() {
      return this.c;
   }

   public int f() {
      return this.d;
   }

   public dfc g() {
      return this.e;
   }
}
