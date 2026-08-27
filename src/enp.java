public class enp extends eng {
   private float m = Float.MAX_VALUE;
   private eng n;
   private boolean o;

   public enp(eng $$0) {
      super($$0.a, $$0.b, $$0.c);
   }

   public enp(int $$0, int $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   public void a(float $$0, eng $$1) {
      if ($$0 < this.m) {
         this.m = $$0;
         this.n = $$1;
      }
   }

   public eng d() {
      return this.n;
   }

   public void e() {
      this.o = true;
   }

   public boolean f() {
      return this.o;
   }

   public static enp c(vx $$0) {
      enp $$1 = new enp($$0.readInt(), $$0.readInt(), $$0.readInt());
      a($$0, $$1);
      return $$1;
   }
}
