public class aeq implements zv<ach> {
   public static final zm<wl, aeq> a = zv.a(aeq::a, aeq::new);
   private final int b;
   private final double c;
   private final double d;
   private final double e;

   public aeq(int $$0, double $$1, double $$2, double $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   private aeq(wl $$0) {
      this.b = $$0.l();
      this.c = $$0.readDouble();
      this.d = $$0.readDouble();
      this.e = $$0.readDouble();
   }

   private void a(wl $$0) {
      $$0.c(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
      $$0.a(this.e);
   }

   @Override
   public zx<aeq> a() {
      return agt.be;
   }

   public void a(ach $$0) {
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
