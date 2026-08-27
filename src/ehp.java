public class ehp extends ehj {
   private float m = Float.MAX_VALUE;
   private ehj n;
   private boolean o;

   public ehp(ehj $$0) {
      super($$0.a, $$0.b, $$0.c);
   }

   public ehp(int $$0, int $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   public void a(float $$0, ehj $$1) {
      if ($$0 < this.m) {
         this.m = $$0;
         this.n = $$1;
      }
   }

   public ehj d() {
      return this.n;
   }

   public void e() {
      this.o = true;
   }

   public boolean f() {
      return this.o;
   }

   public static ehp c(uq $$0) {
      ehp $$1 = new ehp($$0.readInt(), $$0.readInt(), $$0.readInt());
      a($$0, $$1);
      return $$1;
   }
}
