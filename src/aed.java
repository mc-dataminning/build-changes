public class aed implements zs<ach> {
   public static final zj<wi, aed> a = zs.a(aed::a, aed::new);
   private final double b;
   private final double c;
   private final double d;
   private final float e;
   private final float f;

   public aed(bui $$0) {
      this.b = $$0.dD();
      this.c = $$0.dF();
      this.d = $$0.dJ();
      this.e = $$0.dO();
      this.f = $$0.dQ();
   }

   private aed(wi $$0) {
      this.b = $$0.readDouble();
      this.c = $$0.readDouble();
      this.d = $$0.readDouble();
      this.e = $$0.readFloat();
      this.f = $$0.readFloat();
   }

   private void a(wi $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
      $$0.a(this.e);
      $$0.a(this.f);
   }

   @Override
   public zu<aed> a() {
      return agw.V;
   }

   public void a(ach $$0) {
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
