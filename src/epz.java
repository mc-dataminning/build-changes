public class epz extends epq {
   private float m = Float.MAX_VALUE;
   private epq n;
   private boolean o;

   public epz(epq $$0) {
      super($$0.a, $$0.b, $$0.c);
   }

   public epz(int $$0, int $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   public void a(float $$0, epq $$1) {
      if ($$0 < this.m) {
         this.m = $$0;
         this.n = $$1;
      }
   }

   public epq d() {
      return this.n;
   }

   public void e() {
      this.o = true;
   }

   public boolean f() {
      return this.o;
   }

   public static epz c(vw $$0) {
      epz $$1 = new epz($$0.readInt(), $$0.readInt(), $$0.readInt());
      a($$0, $$1);
      return $$1;
   }
}
