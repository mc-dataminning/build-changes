public class aed implements zg<abu> {
   public static final yx<vw, aed> a = zg.a(aed::a, aed::new);
   private final int b;
   private final double c;

   public aed(int $$0, double $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   private aed(vw $$0) {
      this.b = $$0.l();
      this.c = $$0.readDouble();
   }

   private void a(vw $$0) {
      $$0.c(this.b);
      $$0.a(this.c);
   }

   @Override
   public zi<aed> a() {
      return agg.be;
   }

   public void a(abu $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public double e() {
      return this.c;
   }
}
