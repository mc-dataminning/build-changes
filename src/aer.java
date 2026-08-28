public class aer implements zs<ach> {
   public static final zj<wi, aer> a = zs.a(aer::a, aer::new);
   private final int b;
   private final double c;

   public aer(int $$0, double $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   private aer(wi $$0) {
      this.b = $$0.l();
      this.c = $$0.readDouble();
   }

   private void a(wi $$0) {
      $$0.c(this.b);
      $$0.a(this.c);
   }

   @Override
   public zu<aer> a() {
      return agw.bf;
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
}
