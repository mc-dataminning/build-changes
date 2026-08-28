public class eyv extends eym {
   private float m = Float.MAX_VALUE;
   private eym n;
   private boolean o;

   public eyv(eym $$0) {
      super($$0.a, $$0.b, $$0.c);
   }

   public eyv(int $$0, int $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   public void a(float $$0, eym $$1) {
      if ($$0 < this.m) {
         this.m = $$0;
         this.n = $$1;
      }
   }

   public eym d() {
      return this.n;
   }

   public void e() {
      this.o = true;
   }

   public boolean f() {
      return this.o;
   }

   public static eyv c(vy $$0) {
      eyv $$1 = new eyv($$0.readInt(), $$0.readInt(), $$0.readInt());
      a($$0, $$1);
      return $$1;
   }
}
