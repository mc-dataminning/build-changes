public class enr extends eni {
   private float m = Float.MAX_VALUE;
   private eni n;
   private boolean o;

   public enr(eni $$0) {
      super($$0.a, $$0.b, $$0.c);
   }

   public enr(int $$0, int $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   public void a(float $$0, eni $$1) {
      if ($$0 < this.m) {
         this.m = $$0;
         this.n = $$1;
      }
   }

   public eni d() {
      return this.n;
   }

   public void e() {
      this.o = true;
   }

   public boolean f() {
      return this.o;
   }

   public static enr c(vx $$0) {
      enr $$1 = new enr($$0.readInt(), $$0.readInt(), $$0.readInt());
      a($$0, $$1);
      return $$1;
   }
}
