public class ets extends etj {
   private float m = Float.MAX_VALUE;
   private etj n;
   private boolean o;

   public ets(etj $$0) {
      super($$0.a, $$0.b, $$0.c);
   }

   public ets(int $$0, int $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   public void a(float $$0, etj $$1) {
      if ($$0 < this.m) {
         this.m = $$0;
         this.n = $$1;
      }
   }

   public etj d() {
      return this.n;
   }

   public void e() {
      this.o = true;
   }

   public boolean f() {
      return this.o;
   }

   public static ets c(vl $$0) {
      ets $$1 = new ets($$0.readInt(), $$0.readInt(), $$0.readInt());
      a($$0, $$1);
      return $$1;
   }
}
