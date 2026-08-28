public class aeo implements zf<abt> {
   public static final yw<vv, aeo> a = zf.a(aeo::a, aeo::new);
   private final double b;
   private final double c;
   private final long d;

   public aeo(dur $$0) {
      this.b = $$0.i();
      this.c = $$0.k();
      this.d = $$0.j();
   }

   private aeo(vv $$0) {
      this.b = $$0.readDouble();
      this.c = $$0.readDouble();
      this.d = $$0.m();
   }

   private void a(vv $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
   }

   @Override
   public zh<aeo> a() {
      return agf.as;
   }

   public void a(abt $$0) {
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
