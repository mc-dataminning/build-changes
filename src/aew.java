public class aew implements zl<aca> {
   public static final zc<wb, aew> a = zl.a(aew::a, aew::new);
   private final double b;
   private final double c;
   private final long d;

   public aew(dwj $$0) {
      this.b = $$0.i();
      this.c = $$0.k();
      this.d = $$0.j();
   }

   private aew(wb $$0) {
      this.b = $$0.readDouble();
      this.c = $$0.readDouble();
      this.d = $$0.m();
   }

   private void a(wb $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
   }

   @Override
   public zn<aew> a() {
      return agp.at;
   }

   public void a(aca $$0) {
      $$0.a(this);
   }

   public double b() {
      return this.b;
   }

   public double e() {
      return this.c;
   }

   public long f() {
      return this.d;
   }
}
