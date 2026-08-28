public class ahr implements zs<ags> {
   public static final zj<wl, ahr> a = zs.a(ahr::a, ahr::new);
   private final double b;
   private final double c;
   private final double d;
   private final float e;
   private final float f;

   public ahr(bsp $$0) {
      this.b = $$0.du();
      this.c = $$0.dw();
      this.d = $$0.dA();
      this.e = $$0.dF();
      this.f = $$0.dH();
   }

   private ahr(wl $$0) {
      this.b = $$0.readDouble();
      this.c = $$0.readDouble();
      this.d = $$0.readDouble();
      this.e = $$0.readFloat();
      this.f = $$0.readFloat();
   }

   private void a(wl $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
      $$0.a(this.e);
      $$0.a(this.f);
   }

   @Override
   public zu<ahr> a() {
      return agq.bF;
   }

   public void a(ags $$0) {
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
