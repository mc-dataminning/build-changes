public class byb {
   private static final int a = 140;
   private static final int b = 700;
   private final aky c;
   private final aku<Integer> d;
   private boolean e;
   private int f;

   public byb(aky $$0, aku<Integer> $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   public void a() {
      this.e = true;
      this.f = 0;
   }

   public boolean a(bai $$0) {
      if (this.e) {
         return false;
      } else {
         this.e = true;
         this.f = 0;
         this.c.a(this.d, $$0.a(841) + 140);
         return true;
      }
   }

   public void b() {
      if (this.e && this.f++ > this.d()) {
         this.e = false;
      }
   }

   public float c() {
      return this.e ? 1.0F + 1.15F * azz.a((float)this.f / (float)this.d() * (float) Math.PI) : 1.0F;
   }

   private int d() {
      return this.c.a(this.d);
   }
}
