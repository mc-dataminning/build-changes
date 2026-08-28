public class aez implements zo<acd> {
   public static final zf<we, aez> a = zo.a(aez::a, aez::new);
   private final double b;
   private final double c;
   private final long d;

   public aez(dwu $$0) {
      this.b = $$0.i();
      this.c = $$0.k();
      this.d = $$0.j();
   }

   private aez(we $$0) {
      this.b = $$0.readDouble();
      this.c = $$0.readDouble();
      this.d = $$0.m();
   }

   private void a(we $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
   }

   @Override
   public zq<aez> a() {
      return ags.at;
   }

   public void a(acd $$0) {
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
