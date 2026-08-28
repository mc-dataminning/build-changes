public class bsm {
   public static final float a = 1.0F;
   protected float b = 20.0F;
   protected long c = bal.a / 20L;
   protected int d = 0;
   protected boolean e = true;
   protected boolean f = false;

   public void a(float $$0) {
      this.b = Math.max($$0, 1.0F);
      this.c = (long)((double)bal.a / (double)this.b);
   }

   public float f() {
      return this.b;
   }

   public float g() {
      return (float)this.c / (float)bal.b;
   }

   public long h() {
      return this.c;
   }

   public boolean i() {
      return this.e;
   }

   public boolean j() {
      return this.d > 0;
   }

   public void c(int $$0) {
      this.d = $$0;
   }

   public int k() {
      return this.d;
   }

   public void a(boolean $$0) {
      this.f = $$0;
   }

   public boolean l() {
      return this.f;
   }

   public void m() {
      this.e = !this.f || this.d > 0;
      if (this.d > 0) {
         this.d--;
      }
   }

   public boolean a(bue $$0) {
      return !this.i() && !($$0 instanceof com) && $$0.df() <= 0;
   }
}
