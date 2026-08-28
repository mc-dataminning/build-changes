public class ett extends etk {
   private float m = Float.MAX_VALUE;
   private etk n;
   private boolean o;

   public ett(etk $$0) {
      super($$0.a, $$0.b, $$0.c);
   }

   public ett(int $$0, int $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   public void a(float $$0, etk $$1) {
      if ($$0 < this.m) {
         this.m = $$0;
         this.n = $$1;
      }
   }

   public etk d() {
      return this.n;
   }

   public void e() {
      this.o = true;
   }

   public boolean f() {
      return this.o;
   }

   public static ett c(vl $$0) {
      ett $$1 = new ett($$0.readInt(), $$0.readInt(), $$0.readInt());
      a($$0, $$1);
      return $$1;
   }
}
