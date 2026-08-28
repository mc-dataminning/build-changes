public class eus extends euj {
   private float m = Float.MAX_VALUE;
   private euj n;
   private boolean o;

   public eus(euj $$0) {
      super($$0.a, $$0.b, $$0.c);
   }

   public eus(int $$0, int $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   public void a(float $$0, euj $$1) {
      if ($$0 < this.m) {
         this.m = $$0;
         this.n = $$1;
      }
   }

   public euj d() {
      return this.n;
   }

   public void e() {
      this.o = true;
   }

   public boolean f() {
      return this.o;
   }

   public static eus c(ws $$0) {
      eus $$1 = new eus($$0.readInt(), $$0.readInt(), $$0.readInt());
      a($$0, $$1);
      return $$1;
   }
}
