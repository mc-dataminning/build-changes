public class aeq implements yz<abk> {
   public static final yq<vs, aeq> a = yz.a(aeq::a, aeq::new);
   private final int b;
   private final int c;
   private final int d;
   private final int e;

   public aeq(bql $$0) {
      this($$0.aj(), $$0.dq());
   }

   public aeq(int $$0, etf $$1) {
      this.b = $$0;
      double $$2 = 3.9;
      double $$3 = axw.a($$1.c, -3.9, 3.9);
      double $$4 = axw.a($$1.d, -3.9, 3.9);
      double $$5 = axw.a($$1.e, -3.9, 3.9);
      this.c = (int)($$3 * 8000.0);
      this.d = (int)($$4 * 8000.0);
      this.e = (int)($$5 * 8000.0);
   }

   private aeq(vs $$0) {
      this.b = $$0.l();
      this.c = $$0.readShort();
      this.d = $$0.readShort();
      this.e = $$0.readShort();
   }

   private void a(vs $$0) {
      $$0.c(this.b);
      $$0.l(this.c);
      $$0.l(this.d);
      $$0.l(this.e);
   }

   @Override
   public zb<aeq> a() {
      return afv.aE;
   }

   public void a(abk $$0) {
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

   public int g() {
      return this.e;
   }
}
