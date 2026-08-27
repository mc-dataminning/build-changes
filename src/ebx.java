public class ebx extends ebr {
   private float m = Float.MAX_VALUE;
   private ebr n;
   private boolean o;

   public ebx(ebr $$0) {
      super($$0.a, $$0.b, $$0.c);
   }

   public ebx(int $$0, int $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   public void a(float $$0, ebr $$1) {
      if ($$0 < this.m) {
         this.m = $$0;
         this.n = $$1;
      }
   }

   public ebr d() {
      return this.n;
   }

   public void e() {
      this.o = true;
   }

   public boolean f() {
      return this.o;
   }

   public static ebx c(tl $$0) {
      ebx $$1 = new ebx($$0.readInt(), $$0.readInt(), $$0.readInt());
      a($$0, $$1);
      return $$1;
   }
}
