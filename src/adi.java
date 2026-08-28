public class adi implements zl<aca> {
   public static final zc<wb, adi> a = zl.a(adi::a, adi::new);
   private final int b;
   private final int c;
   private final int d;

   public adi(int $$0, int $$1, int $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private adi(wb $$0) {
      this.b = $$0.x();
      this.c = $$0.l();
      this.d = $$0.readInt();
   }

   private void a(wb $$0) {
      $$0.f(this.b);
      $$0.c(this.c);
      $$0.q(this.d);
   }

   @Override
   public zn<adi> a() {
      return agp.H;
   }

   public void a(aca $$0) {
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
}
