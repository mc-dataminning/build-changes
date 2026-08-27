public class ebf extends eaz {
   private float m = Float.MAX_VALUE;
   private eaz n;
   private boolean o;

   public ebf(eaz $$0) {
      super($$0.a, $$0.b, $$0.c);
   }

   public ebf(int $$0, int $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   public void a(float $$0, eaz $$1) {
      if ($$0 < this.m) {
         this.m = $$0;
         this.n = $$1;
      }
   }

   public eaz d() {
      return this.n;
   }

   public void e() {
      this.o = true;
   }

   public boolean f() {
      return this.o;
   }

   public static ebf c(sp $$0) {
      ebf $$1 = new ebf($$0.readInt(), $$0.readInt(), $$0.readInt());
      a($$0, $$1);
      return $$1;
   }
}
