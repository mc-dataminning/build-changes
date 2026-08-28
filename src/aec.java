public class aec implements zv<ach> {
   public static final zm<wl, aec> a = zv.a(aec::a, aec::new);
   private final double b;
   private final double c;
   private final double d;
   private final float e;
   private final float f;

   public aec(bst $$0) {
      this.b = $$0.du();
      this.c = $$0.dw();
      this.d = $$0.dA();
      this.e = $$0.dF();
      this.f = $$0.dH();
   }

   private aec(wl $$0) {
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
   public zx<aec> a() {
      return agt.U;
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
