public class abs implements uw<aav> {
   private final double a;
   private final double b;
   private final double c;
   private final float d;
   private final float e;

   public abs(big $$0) {
      this.a = $$0.dp();
      this.b = $$0.dr();
      this.c = $$0.dv();
      this.d = $$0.dA();
      this.e = $$0.dC();
   }

   public abs(sh $$0) {
      this.a = $$0.readDouble();
      this.b = $$0.readDouble();
      this.c = $$0.readDouble();
      this.d = $$0.readFloat();
      this.e = $$0.readFloat();
   }

   @Override
   public void a(sh $$0) {
      $$0.a(this.a);
      $$0.a(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
      $$0.a(this.e);
   }

   public void a(aav $$0) {
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
