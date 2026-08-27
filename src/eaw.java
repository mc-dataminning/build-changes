public class eaw extends eaq {
   private float m = Float.MAX_VALUE;
   private eaq n;
   private boolean o;

   public eaw(eaq $$0) {
      super($$0.a, $$0.b, $$0.c);
   }

   public eaw(int $$0, int $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   public void a(float $$0, eaq $$1) {
      if ($$0 < this.m) {
         this.m = $$0;
         this.n = $$1;
      }
   }

   public eaq d() {
      return this.n;
   }

   public void e() {
      this.o = true;
   }

   public boolean f() {
      return this.o;
   }

   public static eaw c(si $$0) {
      eaw $$1 = new eaw($$0.readInt(), $$0.readInt(), $$0.readInt());
      a($$0, $$1);
      return $$1;
   }
}
