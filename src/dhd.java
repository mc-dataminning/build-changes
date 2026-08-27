public class dhd {
   private boolean a;
   private float b;
   private float c;

   public void a() {
      this.c = this.b;
      float $$0 = 0.1F;
      if (!this.a && this.b > 0.0F) {
         this.b = Math.max(this.b - 0.1F, 0.0F);
      } else if (this.a && this.b < 1.0F) {
         this.b = Math.min(this.b + 0.1F, 1.0F);
      }
   }

   public float a(float $$0) {
      return auo.i($$0, this.c, this.b);
   }

   public void a(boolean $$0) {
      this.a = $$0;
   }
}
