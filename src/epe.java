public class epe extends eov {
   private float m = Float.MAX_VALUE;
   private eov n;
   private boolean o;

   public epe(eov $$0) {
      super($$0.a, $$0.b, $$0.c);
   }

   public epe(int $$0, int $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   public void a(float $$0, eov $$1) {
      if ($$0 < this.m) {
         this.m = $$0;
         this.n = $$1;
      }
   }

   public eov d() {
      return this.n;
   }

   public void e() {
      this.o = true;
   }

   public boolean f() {
      return this.o;
   }

   public static epe c(vr $$0) {
      epe $$1 = new epe($$0.readInt(), $$0.readInt(), $$0.readInt());
      a($$0, $$1);
      return $$1;
   }
}
