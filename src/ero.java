public class ero extends erf {
   private float m = Float.MAX_VALUE;
   private erf n;
   private boolean o;

   public ero(erf $$0) {
      super($$0.a, $$0.b, $$0.c);
   }

   public ero(int $$0, int $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   public void a(float $$0, erf $$1) {
      if ($$0 < this.m) {
         this.m = $$0;
         this.n = $$1;
      }
   }

   public erf d() {
      return this.n;
   }

   public void e() {
      this.o = true;
   }

   public boolean f() {
      return this.o;
   }

   public static ero c(wb $$0) {
      ero $$1 = new ero($$0.readInt(), $$0.readInt(), $$0.readInt());
      a($$0, $$1);
      return $$1;
   }
}
