public class epx extends epo {
   private float m = Float.MAX_VALUE;
   private epo n;
   private boolean o;

   public epx(epo $$0) {
      super($$0.a, $$0.b, $$0.c);
   }

   public epx(int $$0, int $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   public void a(float $$0, epo $$1) {
      if ($$0 < this.m) {
         this.m = $$0;
         this.n = $$1;
      }
   }

   public epo d() {
      return this.n;
   }

   public void e() {
      this.o = true;
   }

   public boolean f() {
      return this.o;
   }

   public static epx c(vw $$0) {
      epx $$1 = new epx($$0.readInt(), $$0.readInt(), $$0.readInt());
      a($$0, $$1);
      return $$1;
   }
}
