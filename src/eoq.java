public class eoq extends eoh {
   private float m = Float.MAX_VALUE;
   private eoh n;
   private boolean o;

   public eoq(eoh $$0) {
      super($$0.a, $$0.b, $$0.c);
   }

   public eoq(int $$0, int $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   public void a(float $$0, eoh $$1) {
      if ($$0 < this.m) {
         this.m = $$0;
         this.n = $$1;
      }
   }

   public eoh d() {
      return this.n;
   }

   public void e() {
      this.o = true;
   }

   public boolean f() {
      return this.o;
   }

   public static eoq c(wm $$0) {
      eoq $$1 = new eoq($$0.readInt(), $$0.readInt(), $$0.readInt());
      a($$0, $$1);
      return $$1;
   }
}
