public class aer implements zw<aci> {
   public static final zn<wm, aer> a = zw.a(aer::a, aer::new);
   private final int b;
   private final double c;
   private final double d;
   private final double e;

   public aer(int $$0, double $$1, double $$2, double $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   private aer(wm $$0) {
      this.b = $$0.l();
      this.c = $$0.readDouble();
      this.d = $$0.readDouble();
      this.e = $$0.readDouble();
   }

   private void a(wm $$0) {
      $$0.c(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
      $$0.a(this.e);
   }

   @Override
   public zy<aer> a() {
      return agu.be;
   }

   public void a(aci $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public double e() {
      return this.c;
   }

   public double f() {
      return this.d;
   }

   public double g() {
      return this.e;
   }
}
