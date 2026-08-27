public class eba extends eau {
   private float m = Float.MAX_VALUE;
   private eau n;
   private boolean o;

   public eba(eau $$0) {
      super($$0.a, $$0.b, $$0.c);
   }

   public eba(int $$0, int $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   public void a(float $$0, eau $$1) {
      if ($$0 < this.m) {
         this.m = $$0;
         this.n = $$1;
      }
   }

   public eau d() {
      return this.n;
   }

   public void e() {
      this.o = true;
   }

   public boolean f() {
      return this.o;
   }

   public static eba c(sl $$0) {
      eba $$1 = new eba($$0.readInt(), $$0.readInt(), $$0.readInt());
      a($$0, $$1);
      return $$1;
   }
}
