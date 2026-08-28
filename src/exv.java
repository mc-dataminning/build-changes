public class exv extends exm {
   private float m = Float.MAX_VALUE;
   private exm n;
   private boolean o;

   public exv(exm $$0) {
      super($$0.a, $$0.b, $$0.c);
   }

   public exv(int $$0, int $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   public void a(float $$0, exm $$1) {
      if ($$0 < this.m) {
         this.m = $$0;
         this.n = $$1;
      }
   }

   public exm d() {
      return this.n;
   }

   public void e() {
      this.o = true;
   }

   public boolean f() {
      return this.o;
   }

   public static exv c(vu $$0) {
      exv $$1 = new exv($$0.readInt(), $$0.readInt(), $$0.readInt());
      a($$0, $$1);
      return $$1;
   }
}
