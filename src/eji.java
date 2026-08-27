public class eji extends ejb {
   private float m = Float.MAX_VALUE;
   private ejb n;
   private boolean o;

   public eji(ejb $$0) {
      super($$0.a, $$0.b, $$0.c);
   }

   public eji(int $$0, int $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   public void a(float $$0, ejb $$1) {
      if ($$0 < this.m) {
         this.m = $$0;
         this.n = $$1;
      }
   }

   public ejb d() {
      return this.n;
   }

   public void e() {
      this.o = true;
   }

   public boolean f() {
      return this.o;
   }

   public static eji c(uu $$0) {
      eji $$1 = new eji($$0.readInt(), $$0.readInt(), $$0.readInt());
      a($$0, $$1);
      return $$1;
   }
}
