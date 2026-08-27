public class eaz extends eat {
   private float m = Float.MAX_VALUE;
   private eat n;
   private boolean o;

   public eaz(eat $$0) {
      super($$0.a, $$0.b, $$0.c);
   }

   public eaz(int $$0, int $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   public void a(float $$0, eat $$1) {
      if ($$0 < this.m) {
         this.m = $$0;
         this.n = $$1;
      }
   }

   public eat d() {
      return this.n;
   }

   public void e() {
      this.o = true;
   }

   public boolean f() {
      return this.o;
   }

   public static eaz c(so $$0) {
      eaz $$1 = new eaz($$0.readInt(), $$0.readInt(), $$0.readInt());
      a($$0, $$1);
      return $$1;
   }
}
