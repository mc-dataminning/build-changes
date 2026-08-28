public class aeb implements zq<acf> {
   public static final zh<wg, aeb> a = zq.a(aeb::a, aeb::new);
   private final double b;
   private final double c;
   private final double d;
   private final float e;
   private final float f;

   public aeb(bul $$0) {
      this.b = $$0.dA();
      this.c = $$0.dC();
      this.d = $$0.dG();
      this.e = $$0.dL();
      this.f = $$0.dN();
   }

   private aeb(wg $$0) {
      this.b = $$0.readDouble();
      this.c = $$0.readDouble();
      this.d = $$0.readDouble();
      this.e = $$0.readFloat();
      this.f = $$0.readFloat();
   }

   private void a(wg $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
      $$0.a(this.e);
      $$0.a(this.f);
   }

   @Override
   public zs<aeb> a() {
      return agu.V;
   }

   public void a(acf $$0) {
      $$0.a(this);
   }

   public double b() {
      return this.b;
   }

   public double e() {
      return this.c;
   }

   public double f() {
      return this.d;
   }

   public float g() {
      return this.e;
   }

   public float h() {
      return this.f;
   }
}
