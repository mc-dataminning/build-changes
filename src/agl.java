public class agl implements yp<afn> {
   public static final yg<vi, agl> a = yp.a(agl::a, agl::new);
   private final double b;
   private final double c;
   private final double d;
   private final float e;
   private final float f;

   public agl(bqa $$0) {
      this.b = $$0.dr();
      this.c = $$0.dt();
      this.d = $$0.dx();
      this.e = $$0.dC();
      this.f = $$0.dE();
   }

   private agl(vi $$0) {
      this.b = $$0.readDouble();
      this.c = $$0.readDouble();
      this.d = $$0.readDouble();
      this.e = $$0.readFloat();
      this.f = $$0.readFloat();
   }

   private void a(vi $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
      $$0.a(this.e);
      $$0.a(this.f);
   }

   @Override
   public yr<agl> a() {
      return afl.bD;
   }

   public void a(afn $$0) {
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
