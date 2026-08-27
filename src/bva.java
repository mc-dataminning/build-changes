public class bva {
   private final bpa a;
   private final float b;
   private final int c;

   public bva(hv $$0, float $$1, int $$2) {
      this(new bnp($$0), $$1, $$2);
   }

   public bva(elb $$0, float $$1, int $$2) {
      this(new bnp(hv.a($$0)), $$1, $$2);
   }

   public bva(blf $$0, float $$1, int $$2) {
      this(new bnx($$0, false), $$1, $$2);
   }

   public bva(bpa $$0, float $$1, int $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public bpa a() {
      return this.a;
   }

   public float b() {
      return this.b;
   }

   public int c() {
      return this.c;
   }
}
