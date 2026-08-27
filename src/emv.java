public class emv extends emm {
   private float m = Float.MAX_VALUE;
   private emm n;
   private boolean o;

   public emv(emm $$0) {
      super($$0.a, $$0.b, $$0.c);
   }

   public emv(int $$0, int $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   public void a(float $$0, emm $$1) {
      if ($$0 < this.m) {
         this.m = $$0;
         this.n = $$1;
      }
   }

   public emm d() {
      return this.n;
   }

   public void e() {
      this.o = true;
   }

   public boolean f() {
      return this.o;
   }

   public static emv c(vu $$0) {
      emv $$1 = new emv($$0.readInt(), $$0.readInt(), $$0.readInt());
      a($$0, $$1);
      return $$1;
   }
}
