public class aau implements xg<zb> {
   private final double a;
   private final double b;
   private final double c;
   private final float d;
   private final float e;

   public aau(blw $$0) {
      this.a = $$0.dq();
      this.b = $$0.ds();
      this.c = $$0.dw();
      this.d = $$0.dB();
      this.e = $$0.dD();
   }

   public aau(uj $$0) {
      this.a = $$0.readDouble();
      this.b = $$0.readDouble();
      this.c = $$0.readDouble();
      this.d = $$0.readFloat();
      this.e = $$0.readFloat();
   }

   @Override
   public void a(uj $$0) {
      $$0.a(this.a);
      $$0.a(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
      $$0.a(this.e);
   }

   public void a(zb $$0) {
      $$0.a(this);
   }

   public double a() {
      return this.a;
   }

   public double d() {
      return this.b;
   }

   public double e() {
      return this.c;
   }

   public float f() {
      return this.d;
   }

   public float g() {
      return this.e;
   }
}
