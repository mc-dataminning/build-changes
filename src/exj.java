public class exj extends exa {
   private float m = Float.MAX_VALUE;
   private exa n;
   private boolean o;

   public exj(exa $$0) {
      super($$0.a, $$0.b, $$0.c);
   }

   public exj(int $$0, int $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   public void a(float $$0, exa $$1) {
      if ($$0 < this.m) {
         this.m = $$0;
         this.n = $$1;
      }
   }

   public exa d() {
      return this.n;
   }

   public void e() {
      this.o = true;
   }

   public boolean f() {
      return this.o;
   }

   public static exj c(vu $$0) {
      exj $$1 = new exj($$0.readInt(), $$0.readInt(), $$0.readInt());
      a($$0, $$1);
      return $$1;
   }
}
