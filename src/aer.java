public class aer implements zd<abs> {
   public static final yu<vs, aer> a = zd.a(aer::a, aer::new);
   private final double b;
   private final double c;
   private final long d;

   public aer(ebg $$0) {
      this.b = $$0.i();
      this.c = $$0.k();
      this.d = $$0.j();
   }

   private aer(vs $$0) {
      this.b = $$0.readDouble();
      this.c = $$0.readDouble();
      this.d = $$0.m();
   }

   private void a(vs $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
   }

   @Override
   public zf<aer> a() {
      return agl.aw;
   }

   public void a(abs $$0) {
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
