public class ebh extends ebb {
   private float m = Float.MAX_VALUE;
   private ebb n;
   private boolean o;

   public ebh(ebb $$0) {
      super($$0.a, $$0.b, $$0.c);
   }

   public ebh(int $$0, int $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   public void a(float $$0, ebb $$1) {
      if ($$0 < this.m) {
         this.m = $$0;
         this.n = $$1;
      }
   }

   public ebb d() {
      return this.n;
   }

   public void e() {
      this.o = true;
   }

   public boolean f() {
      return this.o;
   }

   public static ebh c(sq $$0) {
      ebh $$1 = new ebh($$0.readInt(), $$0.readInt(), $$0.readInt());
      a($$0, $$1);
      return $$1;
   }
}
