public class afq implements zo<acf> {
   public static final ze<vy, afq> a = zo.a(afq::a, afq::new);
   private final int b;
   private final int c;
   private final int d;
   private final int e;

   public afq(bxe $$0) {
      this($$0.ao(), $$0.dy());
   }

   public afq(int $$0, fgc $$1) {
      this.b = $$0;
      double $$2 = 3.9;
      double $$3 = azz.a($$1.d, -3.9, 3.9);
      double $$4 = azz.a($$1.e, -3.9, 3.9);
      double $$5 = azz.a($$1.f, -3.9, 3.9);
      this.c = (int)($$3 * 8000.0);
      this.d = (int)($$4 * 8000.0);
      this.e = (int)($$5 * 8000.0);
   }

   private afq(vy $$0) {
      this.b = $$0.l();
      this.c = $$0.readShort();
      this.d = $$0.readShort();
      this.e = $$0.readShort();
   }

   private void a(vy $$0) {
      $$0.c(this.b);
      $$0.m(this.c);
      $$0.m(this.d);
      $$0.m(this.e);
   }

   @Override
   public zq<afq> a() {
      return agy.aH;
   }

   public void a(acf $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public double e() {
      return (double)this.c / 8000.0;
   }

   public double f() {
      return (double)this.d / 8000.0;
   }

   public double g() {
      return (double)this.e / 8000.0;
   }
}
