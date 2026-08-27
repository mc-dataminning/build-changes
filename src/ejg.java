public class ejg extends eja {
   private float m = Float.MAX_VALUE;
   private eja n;
   private boolean o;

   public ejg(eja $$0) {
      super($$0.a, $$0.b, $$0.c);
   }

   public ejg(int $$0, int $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   public void a(float $$0, eja $$1) {
      if ($$0 < this.m) {
         this.m = $$0;
         this.n = $$1;
      }
   }

   public eja d() {
      return this.n;
   }

   public void e() {
      this.o = true;
   }

   public boolean f() {
      return this.o;
   }

   public static ejg c(uu $$0) {
      ejg $$1 = new ejg($$0.readInt(), $$0.readInt(), $$0.readInt());
      a($$0, $$1);
      return $$1;
   }
}
