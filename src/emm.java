public class emm extends emd {
   private float m = Float.MAX_VALUE;
   private emd n;
   private boolean o;

   public emm(emd $$0) {
      super($$0.a, $$0.b, $$0.c);
   }

   public emm(int $$0, int $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   public void a(float $$0, emd $$1) {
      if ($$0 < this.m) {
         this.m = $$0;
         this.n = $$1;
      }
   }

   public emd d() {
      return this.n;
   }

   public void e() {
      this.o = true;
   }

   public boolean f() {
      return this.o;
   }

   public static emm c(vs $$0) {
      emm $$1 = new emm($$0.readInt(), $$0.readInt(), $$0.readInt());
      a($$0, $$1);
      return $$1;
   }
}
