public class epc extends eot {
   private float m = Float.MAX_VALUE;
   private eot n;
   private boolean o;

   public epc(eot $$0) {
      super($$0.a, $$0.b, $$0.c);
   }

   public epc(int $$0, int $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   public void a(float $$0, eot $$1) {
      if ($$0 < this.m) {
         this.m = $$0;
         this.n = $$1;
      }
   }

   public eot d() {
      return this.n;
   }

   public void e() {
      this.o = true;
   }

   public boolean f() {
      return this.o;
   }

   public static epc c(vr $$0) {
      epc $$1 = new epc($$0.readInt(), $$0.readInt(), $$0.readInt());
      a($$0, $$1);
      return $$1;
   }
}
