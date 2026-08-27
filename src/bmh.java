public class bmh {
   private static final int a = 140;
   private static final int b = 700;
   private final agp c;
   private final agm<Integer> d;
   private final agm<Boolean> e;
   private boolean f;
   private int g;

   public bmh(agp $$0, agm<Integer> $$1, agm<Boolean> $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   public void a() {
      this.f = true;
      this.g = 0;
   }

   public boolean a(auv $$0) {
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
      return this.f ? 1.0F + 1.15F * auo.a((float)this.g / (float)this.e() * (float) Math.PI) : 1.0F;
   }

   private int e() {
      return this.c.b(this.d);
   }

   public void a(sn $$0) {
      $$0.a("Saddle", this.d());
   }

   public void b(sn $$0) {
      this.a($$0.q("Saddle"));
   }

   public void a(boolean $$0) {
      this.c.b(this.e, $$0);
   }

   public boolean d() {
      return this.c.b(this.e);
   }
}
