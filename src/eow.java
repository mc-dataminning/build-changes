public class eow extends eon {
   private float m = Float.MAX_VALUE;
   private eon n;
   private boolean o;

   public eow(eon $$0) {
      super($$0.a, $$0.b, $$0.c);
   }

   public eow(int $$0, int $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   public void a(float $$0, eon $$1) {
      if ($$0 < this.m) {
         this.m = $$0;
         this.n = $$1;
      }
   }

   public eon d() {
      return this.n;
   }

   public void e() {
      this.o = true;
   }

   public boolean f() {
      return this.o;
   }

   public static eow c(vr $$0) {
      eow $$1 = new eow($$0.readInt(), $$0.readInt(), $$0.readInt());
      a($$0, $$1);
      return $$1;
   }
}
