public class etu extends etl {
   private float m = Float.MAX_VALUE;
   private etl n;
   private boolean o;

   public etu(etl $$0) {
      super($$0.a, $$0.b, $$0.c);
   }

   public etu(int $$0, int $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   public void a(float $$0, etl $$1) {
      if ($$0 < this.m) {
         this.m = $$0;
         this.n = $$1;
      }
   }

   public etl d() {
      return this.n;
   }

   public void e() {
      this.o = true;
   }

   public boolean f() {
      return this.o;
   }

   public static etu c(vl $$0) {
      etu $$1 = new etu($$0.readInt(), $$0.readInt(), $$0.readInt());
      a($$0, $$1);
      return $$1;
   }
}
