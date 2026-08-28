public class erz extends erq {
   private float m = Float.MAX_VALUE;
   private erq n;
   private boolean o;

   public erz(erq $$0) {
      super($$0.a, $$0.b, $$0.c);
   }

   public erz(int $$0, int $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   public void a(float $$0, erq $$1) {
      if ($$0 < this.m) {
         this.m = $$0;
         this.n = $$1;
      }
   }

   public erq d() {
      return this.n;
   }

   public void e() {
      this.o = true;
   }

   public boolean f() {
      return this.o;
   }

   public static erz c(we $$0) {
      erz $$1 = new erz($$0.readInt(), $$0.readInt(), $$0.readInt());
      a($$0, $$1);
      return $$1;
   }
}
