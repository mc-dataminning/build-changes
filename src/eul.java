public class eul extends euc {
   private float m = Float.MAX_VALUE;
   private euc n;
   private boolean o;

   public eul(euc $$0) {
      super($$0.a, $$0.b, $$0.c);
   }

   public eul(int $$0, int $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   public void a(float $$0, euc $$1) {
      if ($$0 < this.m) {
         this.m = $$0;
         this.n = $$1;
      }
   }

   public euc d() {
      return this.n;
   }

   public void e() {
      this.o = true;
   }

   public boolean f() {
      return this.o;
   }

   public static eul c(wh $$0) {
      eul $$1 = new eul($$0.readInt(), $$0.readInt(), $$0.readInt());
      a($$0, $$1);
      return $$1;
   }
}
