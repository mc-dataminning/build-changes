public class efk extends efe {
   private float m = Float.MAX_VALUE;
   private efe n;
   private boolean o;

   public efk(efe $$0) {
      super($$0.a, $$0.b, $$0.c);
   }

   public efk(int $$0, int $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   public void a(float $$0, efe $$1) {
      if ($$0 < this.m) {
         this.m = $$0;
         this.n = $$1;
      }
   }

   public efe d() {
      return this.n;
   }

   public void e() {
      this.o = true;
   }

   public boolean f() {
      return this.o;
   }

   public static efk c(ui $$0) {
      efk $$1 = new efk($$0.readInt(), $$0.readInt(), $$0.readInt());
      a($$0, $$1);
      return $$1;
   }
}
