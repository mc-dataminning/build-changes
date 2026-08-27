public class aah implements wu<yo> {
   private final double a;
   private final double b;
   private final double c;
   private final float d;
   private final float e;

   public aah(blf $$0) {
      this.a = $$0.dr();
      this.b = $$0.dt();
      this.c = $$0.dx();
      this.d = $$0.dC();
      this.e = $$0.dE();
   }

   public aah(ue $$0) {
      this.a = $$0.readDouble();
      this.b = $$0.readDouble();
      this.c = $$0.readDouble();
      this.d = $$0.readFloat();
      this.e = $$0.readFloat();
   }

   @Override
   public void a(ue $$0) {
      $$0.a(this.a);
      $$0.a(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
      $$0.a(this.e);
   }

   public void a(yo $$0) {
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
