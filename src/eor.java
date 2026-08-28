public class eor extends eoi {
   private float m = Float.MAX_VALUE;
   private eoi n;
   private boolean o;

   public eor(eoi $$0) {
      super($$0.a, $$0.b, $$0.c);
   }

   public eor(int $$0, int $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   public void a(float $$0, eoi $$1) {
      if ($$0 < this.m) {
         this.m = $$0;
         this.n = $$1;
      }
   }

   public eoi d() {
      return this.n;
   }

   public void e() {
      this.o = true;
   }

   public boolean f() {
      return this.o;
   }

   public static eor c(wm $$0) {
      eor $$1 = new eor($$0.readInt(), $$0.readInt(), $$0.readInt());
      a($$0, $$1);
      return $$1;
   }
}
