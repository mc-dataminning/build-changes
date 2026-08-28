public class etv extends etm {
   private float m = Float.MAX_VALUE;
   private etm n;
   private boolean o;

   public etv(etm $$0) {
      super($$0.a, $$0.b, $$0.c);
   }

   public etv(int $$0, int $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   public void a(float $$0, etm $$1) {
      if ($$0 < this.m) {
         this.m = $$0;
         this.n = $$1;
      }
   }

   public etm d() {
      return this.n;
   }

   public void e() {
      this.o = true;
   }

   public boolean f() {
      return this.o;
   }

   public static etv c(vl $$0) {
      etv $$1 = new etv($$0.readInt(), $$0.readInt(), $$0.readInt());
      a($$0, $$1);
      return $$1;
   }
}
