public class esf extends erw {
   private float m = Float.MAX_VALUE;
   private erw n;
   private boolean o;

   public esf(erw $$0) {
      super($$0.a, $$0.b, $$0.c);
   }

   public esf(int $$0, int $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   public void a(float $$0, erw $$1) {
      if ($$0 < this.m) {
         this.m = $$0;
         this.n = $$1;
      }
   }

   public erw d() {
      return this.n;
   }

   public void e() {
      this.o = true;
   }

   public boolean f() {
      return this.o;
   }

   public static esf c(wf $$0) {
      esf $$1 = new esf($$0.readInt(), $$0.readInt(), $$0.readInt());
      a($$0, $$1);
      return $$1;
   }
}
