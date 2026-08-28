public class ept extends epk {
   private float m = Float.MAX_VALUE;
   private epk n;
   private boolean o;

   public ept(epk $$0) {
      super($$0.a, $$0.b, $$0.c);
   }

   public ept(int $$0, int $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   public void a(float $$0, epk $$1) {
      if ($$0 < this.m) {
         this.m = $$0;
         this.n = $$1;
      }
   }

   public epk d() {
      return this.n;
   }

   public void e() {
      this.o = true;
   }

   public boolean f() {
      return this.o;
   }

   public static ept c(vv $$0) {
      ept $$1 = new ept($$0.readInt(), $$0.readInt(), $$0.readInt());
      a($$0, $$1);
      return $$1;
   }
}
