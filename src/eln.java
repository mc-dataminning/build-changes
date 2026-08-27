public class eln extends ele {
   private float m = Float.MAX_VALUE;
   private ele n;
   private boolean o;

   public eln(ele $$0) {
      super($$0.a, $$0.b, $$0.c);
   }

   public eln(int $$0, int $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   public void a(float $$0, ele $$1) {
      if ($$0 < this.m) {
         this.m = $$0;
         this.n = $$1;
      }
   }

   public ele d() {
      return this.n;
   }

   public void e() {
      this.o = true;
   }

   public boolean f() {
      return this.o;
   }

   public static eln c(vg $$0) {
      eln $$1 = new eln($$0.readInt(), $$0.readInt(), $$0.readInt());
      a($$0, $$1);
      return $$1;
   }
}
