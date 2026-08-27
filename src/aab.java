public class aab implements vd<ww> {
   private final float a;
   private final int b;
   private final int c;

   public aab(float $$0, int $$1, int $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public aab(so $$0) {
      this.a = $$0.readFloat();
      this.c = $$0.m();
      this.b = $$0.m();
   }

   @Override
   public void a(so $$0) {
      $$0.a(this.a);
      $$0.c(this.c);
      $$0.c(this.b);
   }

   public void a(ww $$0) {
      $$0.a(this);
   }

   public float a() {
      return this.a;
   }

   public int d() {
      return this.b;
   }

   public int e() {
      return this.c;
   }
}
