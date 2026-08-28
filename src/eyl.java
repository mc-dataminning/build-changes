public class eyl extends eyc {
   private float m = Float.MAX_VALUE;
   private eyc n;
   private boolean o;

   public eyl(eyc $$0) {
      super($$0.a, $$0.b, $$0.c);
   }

   public eyl(int $$0, int $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   public void a(float $$0, eyc $$1) {
      if ($$0 < this.m) {
         this.m = $$0;
         this.n = $$1;
      }
   }

   public eyc d() {
      return this.n;
   }

   public void e() {
      this.o = true;
   }

   public boolean f() {
      return this.o;
   }

   public static eyl c(vy $$0) {
      eyl $$1 = new eyl($$0.readInt(), $$0.readInt(), $$0.readInt());
      a($$0, $$1);
      return $$1;
   }
}
