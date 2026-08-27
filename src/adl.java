public class adl implements xx<aag> {
   public static final xo<uq, adl> a = xx.a(adl::a, adl::new);
   private final int b;
   private final int c;
   private final int d;
   private final int e;

   public adl(bnq $$0) {
      this($$0.aj(), $$0.dp());
   }

   public adl(int $$0, enz $$1) {
      this.b = $$0;
      double $$2 = 3.9;
      double $$3 = awi.a($$1.c, -3.9, 3.9);
      double $$4 = awi.a($$1.d, -3.9, 3.9);
      double $$5 = awi.a($$1.e, -3.9, 3.9);
      this.c = (int)($$3 * 8000.0);
      this.d = (int)($$4 * 8000.0);
      this.e = (int)($$5 * 8000.0);
   }

   private adl(uq $$0) {
      this.b = $$0.n();
      this.c = $$0.readShort();
      this.d = $$0.readShort();
      this.e = $$0.readShort();
   }

   private void a(uq $$0) {
      $$0.c(this.b);
      $$0.l(this.c);
      $$0.l(this.d);
      $$0.l(this.e);
   }

   @Override
   public xz<adl> a() {
      return aeq.aD;
   }

   public void a(aag $$0) {
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
