public class elw extends eln {
   private float m = Float.MAX_VALUE;
   private eln n;
   private boolean o;

   public elw(eln $$0) {
      super($$0.a, $$0.b, $$0.c);
   }

   public elw(int $$0, int $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   public void a(float $$0, eln $$1) {
      if ($$0 < this.m) {
         this.m = $$0;
         this.n = $$1;
      }
   }

   public eln d() {
      return this.n;
   }

   public void e() {
      this.o = true;
   }

   public boolean f() {
      return this.o;
   }

   public static elw c(vi $$0) {
      elw $$1 = new elw($$0.readInt(), $$0.readInt(), $$0.readInt());
      a($$0, $$1);
      return $$1;
   }
}
