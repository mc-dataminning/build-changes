public class bkf {
   private static final int a = 140;
   private static final int b = 700;
   private final aff c;
   private final afc<Integer> d;
   private final afc<Boolean> e;
   private boolean f;
   private int g;

   public bkf(aff $$0, afc<Integer> $$1, afc<Boolean> $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   public void a() {
      this.f = true;
      this.g = 0;
   }

   public boolean a(ate $$0) {
      if (this.f) {
         return false;
      } else {
         this.f = true;
         this.g = 0;
         this.c.b(this.d, $$0.a(841) + 140);
         return true;
      }
   }

   public void b() {
      if (this.f && this.g++ > this.e()) {
         this.f = false;
      }
   }

   public float c() {
      return this.f ? 1.0F + 1.15F * asy.a((float)this.g / (float)this.e() * (float) Math.PI) : 1.0F;
   }

   private int e() {
      return this.c.b(this.d);
   }

   public void a(rt $$0) {
      $$0.a("Saddle", this.d());
   }

   public void b(rt $$0) {
      this.a($$0.q("Saddle"));
   }

   public void a(boolean $$0) {
      this.c.b(this.e, $$0);
   }

   public boolean d() {
      return this.c.b(this.e);
   }
}
