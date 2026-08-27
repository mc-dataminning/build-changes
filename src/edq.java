public class edq extends edk {
   private float m = Float.MAX_VALUE;
   private edk n;
   private boolean o;

   public edq(edk $$0) {
      super($$0.a, $$0.b, $$0.c);
   }

   public edq(int $$0, int $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   public void a(float $$0, edk $$1) {
      if ($$0 < this.m) {
         this.m = $$0;
         this.n = $$1;
      }
   }

   public edk d() {
      return this.n;
   }

   public void e() {
      this.o = true;
   }

   public boolean f() {
      return this.o;
   }

   public static edq c(ty $$0) {
      edq $$1 = new edq($$0.readInt(), $$0.readInt(), $$0.readInt());
      a($$0, $$1);
      return $$1;
   }
}
