public class dxx extends dxr {
   private float m = Float.MAX_VALUE;
   private dxr n;
   private boolean o;

   public dxx(dxr $$0) {
      super($$0.a, $$0.b, $$0.c);
   }

   public dxx(int $$0, int $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   public void a(float $$0, dxr $$1) {
      if ($$0 < this.m) {
         this.m = $$0;
         this.n = $$1;
      }
   }

   public dxr d() {
      return this.n;
   }

   public void e() {
      this.o = true;
   }

   public boolean f() {
      return this.o;
   }

   public static dxx c(sf $$0) {
      dxx $$1 = new dxx($$0.readInt(), $$0.readInt(), $$0.readInt());
      a($$0, $$1);
      return $$1;
   }
}
