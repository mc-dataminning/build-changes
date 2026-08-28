public class esj extends esa {
   private float m = Float.MAX_VALUE;
   private esa n;
   private boolean o;

   public esj(esa $$0) {
      super($$0.a, $$0.b, $$0.c);
   }

   public esj(int $$0, int $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   public void a(float $$0, esa $$1) {
      if ($$0 < this.m) {
         this.m = $$0;
         this.n = $$1;
      }
   }

   public esa d() {
      return this.n;
   }

   public void e() {
      this.o = true;
   }

   public boolean f() {
      return this.o;
   }

   public static esj c(wi $$0) {
      esj $$1 = new esj($$0.readInt(), $$0.readInt(), $$0.readInt());
      a($$0, $$1);
      return $$1;
   }
}
