public class bsm {
   private final bmm a;
   private final float b;
   private final int c;

   public bsm(gw $$0, float $$1, int $$2) {
      this(new blc($$0), $$1, $$2);
   }

   public bsm(ehp $$0, float $$1, int $$2) {
      this(new blc(gw.a($$0)), $$1, $$2);
   }

   public bsm(bis $$0, float $$1, int $$2) {
      this(new blk($$0, false), $$1, $$2);
   }

   public bsm(bmm $$0, float $$1, int $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public bmm a() {
      return this.a;
   }

   public float b() {
      return this.b;
   }

   public int c() {
      return this.c;
   }
}
