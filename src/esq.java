public class esq extends esh {
   private float m = Float.MAX_VALUE;
   private esh n;
   private boolean o;

   public esq(esh $$0) {
      super($$0.a, $$0.b, $$0.c);
   }

   public esq(int $$0, int $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   public void a(float $$0, esh $$1) {
      if ($$0 < this.m) {
         this.m = $$0;
         this.n = $$1;
      }
   }

   public esh d() {
      return this.n;
   }

   public void e() {
      this.o = true;
   }

   public boolean f() {
      return this.o;
   }

   public static esq c(wg $$0) {
      esq $$1 = new esq($$0.readInt(), $$0.readInt(), $$0.readInt());
      a($$0, $$1);
      return $$1;
   }
}
