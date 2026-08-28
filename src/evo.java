public class evo extends evf {
   private float m = Float.MAX_VALUE;
   private evf n;
   private boolean o;

   public evo(evf $$0) {
      super($$0.a, $$0.b, $$0.c);
   }

   public evo(int $$0, int $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   public void a(float $$0, evf $$1) {
      if ($$0 < this.m) {
         this.m = $$0;
         this.n = $$1;
      }
   }

   public evf d() {
      return this.n;
   }

   public void e() {
      this.o = true;
   }

   public boolean f() {
      return this.o;
   }

   public static evo c(vr $$0) {
      evo $$1 = new evo($$0.readInt(), $$0.readInt(), $$0.readInt());
      a($$0, $$1);
      return $$1;
   }
}
