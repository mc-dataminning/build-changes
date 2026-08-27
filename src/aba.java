public class aba implements wb<xu> {
   private final float a;
   private final int b;
   private final float c;

   public aba(float $$0, int $$1, float $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public aba(tl $$0) {
      this.a = $$0.readFloat();
      this.b = $$0.n();
      this.c = $$0.readFloat();
   }

   @Override
   public void a(tl $$0) {
      $$0.a(this.a);
      $$0.c(this.b);
      $$0.a(this.c);
   }

   public void a(xu $$0) {
      $$0.a(this);
   }

   public float a() {
      return this.a;
   }

   public int d() {
      return this.b;
   }

   public float e() {
      return this.c;
   }
}
