public class edl extends edf {
   private float m = Float.MAX_VALUE;
   private edf n;
   private boolean o;

   public edl(edf $$0) {
      super($$0.a, $$0.b, $$0.c);
   }

   public edl(int $$0, int $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   public void a(float $$0, edf $$1) {
      if ($$0 < this.m) {
         this.m = $$0;
         this.n = $$1;
      }
   }

   public edf d() {
      return this.n;
   }

   public void e() {
      this.o = true;
   }

   public boolean f() {
      return this.o;
   }

   public static edl c(tu $$0) {
      edl $$1 = new edl($$0.readInt(), $$0.readInt(), $$0.readInt());
      a($$0, $$1);
      return $$1;
   }
}
