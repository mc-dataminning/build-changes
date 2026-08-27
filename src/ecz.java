public class ecz extends ect {
   private float m = Float.MAX_VALUE;
   private ect n;
   private boolean o;

   public ecz(ect $$0) {
      super($$0.a, $$0.b, $$0.c);
   }

   public ecz(int $$0, int $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   public void a(float $$0, ect $$1) {
      if ($$0 < this.m) {
         this.m = $$0;
         this.n = $$1;
      }
   }

   public ect d() {
      return this.n;
   }

   public void e() {
      this.o = true;
   }

   public boolean f() {
      return this.o;
   }

   public static ecz c(tu $$0) {
      ecz $$1 = new ecz($$0.readInt(), $$0.readInt(), $$0.readInt());
      a($$0, $$1);
      return $$1;
   }
}
