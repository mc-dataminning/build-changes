public class aec implements zf<abt> {
   public static final yw<vv, aec> a = zf.a(aec::a, aec::new);
   private final int b;
   private final double c;

   public aec(int $$0, double $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   private aec(vv $$0) {
      this.b = $$0.l();
      this.c = $$0.readDouble();
   }

   private void a(vv $$0) {
      $$0.c(this.b);
      $$0.a(this.c);
   }

   @Override
   public zh<aec> a() {
      return agf.be;
   }

   public void a(abt $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public double e() {
      return this.c;
   }
}
