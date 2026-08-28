public class aen implements zo<acd> {
   public static final zf<we, aen> a = zo.a(aen::a, aen::new);
   private final int b;
   private final double c;

   public aen(int $$0, double $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   private aen(we $$0) {
      this.b = $$0.l();
      this.c = $$0.readDouble();
   }

   private void a(we $$0) {
      $$0.c(this.b);
      $$0.a(this.c);
   }

   @Override
   public zq<aen> a() {
      return ags.bf;
   }

   public void a(acd $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public double e() {
      return this.c;
   }
}
