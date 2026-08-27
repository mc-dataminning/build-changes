public class bvk {
   private final bpk a;
   private final float b;
   private final int c;

   public bvk(hx $$0, float $$1, int $$2) {
      this(new bnz($$0), $$1, $$2);
   }

   public bvk(elm $$0, float $$1, int $$2) {
      this(new bnz(hx.a($$0)), $$1, $$2);
   }

   public bvk(blp $$0, float $$1, int $$2) {
      this(new boh($$0, false), $$1, $$2);
   }

   public bvk(bpk $$0, float $$1, int $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public bpk a() {
      return this.a;
   }

   public float b() {
      return this.b;
   }

   public int c() {
      return this.c;
   }
}
