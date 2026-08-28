public class aeo implements aac<acr> {
   public static final zt<ws, aeo> a = aac.a(aeo::a, aeo::new);
   private final double b;
   private final double c;
   private final double d;
   private final float e;
   private final float f;

   public aeo(bvf $$0) {
      this.b = $$0.dA();
      this.c = $$0.dC();
      this.d = $$0.dG();
      this.e = $$0.dL();
      this.f = $$0.dN();
   }

   private aeo(ws $$0) {
      this.b = $$0.readDouble();
      this.c = $$0.readDouble();
      this.d = $$0.readDouble();
      this.e = $$0.readFloat();
      this.f = $$0.readFloat();
   }

   private void a(ws $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
      $$0.a(this.e);
      $$0.a(this.f);
   }

   @Override
   public aae<aeo> a() {
      return ahk.V;
   }

   public void a(acr $$0) {
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
