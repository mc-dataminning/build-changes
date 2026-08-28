public class eol extends eoc {
   private float m = Float.MAX_VALUE;
   private eoc n;
   private boolean o;

   public eol(eoc $$0) {
      super($$0.a, $$0.b, $$0.c);
   }

   public eol(int $$0, int $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   public void a(float $$0, eoc $$1) {
      if ($$0 < this.m) {
         this.m = $$0;
         this.n = $$1;
      }
   }

   public eoc d() {
      return this.n;
   }

   public void e() {
      this.o = true;
   }

   public boolean f() {
      return this.o;
   }

   public static eol c(wl $$0) {
      eol $$1 = new eol($$0.readInt(), $$0.readInt(), $$0.readInt());
      a($$0, $$1);
      return $$1;
   }
}
