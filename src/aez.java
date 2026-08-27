public class aez implements ze<abq> {
   public static final yv<vx, aez> a = ze.a(aez::a, aez::new);
   private final float b;
   private final int c;
   private final float d;

   public aez(float $$0, int $$1, float $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private aez(vx $$0) {
      this.b = $$0.readFloat();
      this.c = $$0.l();
      this.d = $$0.readFloat();
   }

   private void a(vx $$0) {
      $$0.a(this.b);
      $$0.c(this.c);
      $$0.a(this.d);
   }

   @Override
   public zg<aez> a() {
      return agb.aH;
   }

   public void a(abq $$0) {
      $$0.a(this);
   }

   public float b() {
      return this.b;
   }

   public int e() {
      return this.c;
   }

   public float f() {
      return this.d;
   }
}
