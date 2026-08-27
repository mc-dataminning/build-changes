public class aee implements yn<aay> {
   public static final ye<vg, aee> a = yn.a(aee::a, aee::new);
   private final int b;
   private final int c;
   private final int d;
   private final int e;

   public aee(bpv $$0) {
      this($$0.aj(), $$0.dp());
   }

   public aee(int $$0, esa $$1) {
      this.b = $$0;
      double $$2 = 3.9;
      double $$3 = axk.a($$1.c, -3.9, 3.9);
      double $$4 = axk.a($$1.d, -3.9, 3.9);
      double $$5 = axk.a($$1.e, -3.9, 3.9);
      this.c = (int)($$3 * 8000.0);
      this.d = (int)($$4 * 8000.0);
      this.e = (int)($$5 * 8000.0);
   }

   private aee(vg $$0) {
      this.b = $$0.l();
      this.c = $$0.readShort();
      this.d = $$0.readShort();
      this.e = $$0.readShort();
   }

   private void a(vg $$0) {
      $$0.c(this.b);
      $$0.l(this.c);
      $$0.l(this.d);
      $$0.l(this.e);
   }

   @Override
   public yp<aee> a() {
      return afj.aE;
   }

   public void a(aay $$0) {
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
