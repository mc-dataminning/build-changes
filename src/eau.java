public class eau extends eao {
   private float m = Float.MAX_VALUE;
   private eao n;
   private boolean o;

   public eau(eao $$0) {
      super($$0.a, $$0.b, $$0.c);
   }

   public eau(int $$0, int $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   public void a(float $$0, eao $$1) {
      if ($$0 < this.m) {
         this.m = $$0;
         this.n = $$1;
      }
   }

   public eao d() {
      return this.n;
   }

   public void e() {
      this.o = true;
   }

   public boolean f() {
      return this.o;
   }

   public static eau c(sh $$0) {
      eau $$1 = new eau($$0.readInt(), $$0.readInt(), $$0.readInt());
      a($$0, $$1);
      return $$1;
   }
}
