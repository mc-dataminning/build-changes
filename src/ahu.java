public class ahu implements zo<agu> {
   public static final zf<we, ahu> a = zo.a(ahu::a, ahu::new);
   private final double b;
   private final double c;
   private final double d;
   private final float e;
   private final float f;

   public ahu(btz $$0) {
      this.b = $$0.dC();
      this.c = $$0.dE();
      this.d = $$0.dI();
      this.e = $$0.dN();
      this.f = $$0.dP();
   }

   private ahu(we $$0) {
      this.b = $$0.readDouble();
      this.c = $$0.readDouble();
      this.d = $$0.readDouble();
      this.e = $$0.readFloat();
      this.f = $$0.readFloat();
   }

   private void a(we $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
      $$0.a(this.e);
      $$0.a(this.f);
   }

   @Override
   public zq<ahu> a() {
      return ags.bI;
   }

   public void a(agu $$0) {
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
