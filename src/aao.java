public class aao implements xx<aag> {
   public static final xo<vb, aao> a = xx.a(aao::a, aao::new);
   private final hz b;
   private final int c;
   private final int d;
   private final cys e;

   public aao(hz $$0, cys $$1, int $$2, int $$3) {
      this.b = $$0;
      this.e = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   private aao(vb $$0) {
      this.b = $$0.e();
      this.c = $$0.readUnsignedByte();
      this.d = $$0.readUnsignedByte();
      this.e = xm.a(kg.f).decode($$0);
   }

   private void a(vb $$0) {
      $$0.a(this.b);
      $$0.k(this.c);
      $$0.k(this.d);
      xm.a(kg.f).encode($$0, this.e);
   }

   @Override
   public xz<aao> a() {
      return aeq.j;
   }

   public void a(aag $$0) {
      $$0.a(this);
   }

   public hz b() {
      return this.b;
   }

   public int e() {
      return this.c;
   }

   public int f() {
      return this.d;
   }

   public cys g() {
      return this.e;
   }
}
