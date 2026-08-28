public class aep implements zq<acf> {
   public static final zh<wg, aep> a = zq.a(aep::a, aep::new);
   private final int b;
   private final double c;

   public aep(int $$0, double $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   private aep(wg $$0) {
      this.b = $$0.l();
      this.c = $$0.readDouble();
   }

   private void a(wg $$0) {
      $$0.c(this.b);
      $$0.a(this.c);
   }

   @Override
   public zs<aep> a() {
      return agu.bf;
   }

   public void a(acf $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public double e() {
      return this.c;
   }
}
