public class efs extends efm {
   private float m = Float.MAX_VALUE;
   private efm n;
   private boolean o;

   public efs(efm $$0) {
      super($$0.a, $$0.b, $$0.c);
   }

   public efs(int $$0, int $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   public void a(float $$0, efm $$1) {
      if ($$0 < this.m) {
         this.m = $$0;
         this.n = $$1;
      }
   }

   public efm d() {
      return this.n;
   }

   public void e() {
      this.o = true;
   }

   public boolean f() {
      return this.o;
   }

   public static efs c(uj $$0) {
      efs $$1 = new efs($$0.readInt(), $$0.readInt(), $$0.readInt());
      a($$0, $$1);
      return $$1;
   }
}
