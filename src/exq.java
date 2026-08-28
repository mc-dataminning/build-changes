public class exq extends exh {
   private float m = Float.MAX_VALUE;
   private exh n;
   private boolean o;

   public exq(exh $$0) {
      super($$0.a, $$0.b, $$0.c);
   }

   public exq(int $$0, int $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   public void a(float $$0, exh $$1) {
      if ($$0 < this.m) {
         this.m = $$0;
         this.n = $$1;
      }
   }

   public exh d() {
      return this.n;
   }

   public void e() {
      this.o = true;
   }

   public boolean f() {
      return this.o;
   }

   public static exq c(vu $$0) {
      exq $$1 = new exq($$0.readInt(), $$0.readInt(), $$0.readInt());
      a($$0, $$1);
      return $$1;
   }
}
