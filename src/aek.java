public class aek implements zl<aca> {
   public static final zc<wb, aek> a = zl.a(aek::a, aek::new);
   private final int b;
   private final double c;

   public aek(int $$0, double $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   private aek(wb $$0) {
      this.b = $$0.l();
      this.c = $$0.readDouble();
   }

   private void a(wb $$0) {
      $$0.c(this.b);
      $$0.a(this.c);
   }

   @Override
   public zn<aek> a() {
      return agp.bf;
   }

   public void a(aca $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public double e() {
      return this.c;
   }
}
