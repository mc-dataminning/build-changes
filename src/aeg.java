public class aeg implements yp<aba> {
   public static final yg<vi, aeg> a = yp.a(aeg::a, aeg::new);
   private final int b;
   private final int c;
   private final int d;
   private final int e;

   public aeg(bqa $$0) {
      this($$0.aj(), $$0.dp());
   }

   public aeg(int $$0, esj $$1) {
      this.b = $$0;
      double $$2 = 3.9;
      double $$3 = axm.a($$1.c, -3.9, 3.9);
      double $$4 = axm.a($$1.d, -3.9, 3.9);
      double $$5 = axm.a($$1.e, -3.9, 3.9);
      this.c = (int)($$3 * 8000.0);
      this.d = (int)($$4 * 8000.0);
      this.e = (int)($$5 * 8000.0);
   }

   private aeg(vi $$0) {
      this.b = $$0.l();
      this.c = $$0.readShort();
      this.d = $$0.readShort();
      this.e = $$0.readShort();
   }

   private void a(vi $$0) {
      $$0.c(this.b);
      $$0.l(this.c);
      $$0.l(this.d);
      $$0.l(this.e);
   }

   @Override
   public yr<aeg> a() {
      return afl.aE;
   }

   public void a(aba $$0) {
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
