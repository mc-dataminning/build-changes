public class acc implements zg<abu> {
   public static final yx<wk, acc> a = zg.a(acc::a, acc::new);
   private final jd b;
   private final int c;
   private final int d;
   private final dfy e;

   public acc(jd $$0, dfy $$1, int $$2, int $$3) {
      this.b = $$0;
      this.e = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   private acc(wk $$0) {
      this.b = $$0.e();
      this.c = $$0.readUnsignedByte();
      this.d = $$0.readUnsignedByte();
      this.e = yv.a(lu.f).decode($$0);
   }

   private void a(wk $$0) {
      $$0.a(this.b);
      $$0.k(this.c);
      $$0.k(this.d);
      yv.a(lu.f).encode($$0, this.e);
   }

   @Override
   public zi<acc> a() {
      return agg.j;
   }

   public void a(abu $$0) {
      $$0.a(this);
   }

   public jd b() {
      return this.b;
   }

   public int e() {
      return this.c;
   }

   public int f() {
      return this.d;
   }

   public dfy g() {
      return this.e;
   }
}
