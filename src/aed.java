public class aed implements zd<abs> {
   public static final yu<vs, aed> a = zd.a(aed::a, aed::new);
   private final int b;
   private final double c;

   public aed(int $$0, double $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   private aed(vs $$0) {
      this.b = $$0.l();
      this.c = $$0.readDouble();
   }

   private void a(vs $$0) {
      $$0.c(this.b);
      $$0.a(this.c);
   }

   @Override
   public zf<aed> a() {
      return agl.bj;
   }

   public void a(abs $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public double e() {
      return this.c;
   }
}
