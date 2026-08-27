public class bsf {
   private final bmf a;
   private final float b;
   private final int c;

   public bsf(gw $$0, float $$1, int $$2) {
      this(new bkv($$0), $$1, $$2);
   }

   public bsf(ehi $$0, float $$1, int $$2) {
      this(new bkv(gw.a($$0)), $$1, $$2);
   }

   public bsf(bil $$0, float $$1, int $$2) {
      this(new bld($$0, false), $$1, $$2);
   }

   public bsf(bmf $$0, float $$1, int $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public bmf a() {
      return this.a;
   }

   public float b() {
      return this.b;
   }

   public int c() {
      return this.c;
   }
}
