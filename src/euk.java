public class euk extends eub {
   private float m = Float.MAX_VALUE;
   private eub n;
   private boolean o;

   public euk(eub $$0) {
      super($$0.a, $$0.b, $$0.c);
   }

   public euk(int $$0, int $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   public void a(float $$0, eub $$1) {
      if ($$0 < this.m) {
         this.m = $$0;
         this.n = $$1;
      }
   }

   public eub d() {
      return this.n;
   }

   public void e() {
      this.o = true;
   }

   public boolean f() {
      return this.o;
   }

   public static euk c(ws $$0) {
      euk $$1 = new euk($$0.readInt(), $$0.readInt(), $$0.readInt());
      a($$0, $$1);
      return $$1;
   }
}
