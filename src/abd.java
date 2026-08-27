public class abd implements xx<aag> {
   public static final xo<vb, abd> a = xx.a(abd::a, abd::new);
   public static final int b = -1;
   public static final int c = -2;
   private final int d;
   private final int e;
   private final int f;
   private final coz g;

   public abd(int $$0, int $$1, int $$2, coz $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3.q();
   }

   private abd(vb $$0) {
      this.d = $$0.readByte();
      this.e = $$0.n();
      this.f = $$0.readShort();
      this.g = coz.f.decode($$0);
   }

   private void a(vb $$0) {
      $$0.k(this.d);
      $$0.c(this.e);
      $$0.l(this.f);
      coz.f.encode($$0, this.g);
   }

   @Override
   public xz<abd> a() {
      return aeq.w;
   }

   public void a(aag $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.d;
   }

   public int e() {
      return this.f;
   }

   public coz f() {
      return this.g;
   }

   public int g() {
      return this.e;
   }
}
