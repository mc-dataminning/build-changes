public class bvq {
   private final bpq a;
   private final float b;
   private final int c;

   public bvq(hx $$0, float $$1, int $$2) {
      this(new bof($$0), $$1, $$2);
   }

   public bvq(elt $$0, float $$1, int $$2) {
      this(new bof(hx.a($$0)), $$1, $$2);
   }

   public bvq(blv $$0, float $$1, int $$2) {
      this(new bon($$0, false), $$1, $$2);
   }

   public bvq(bpq $$0, float $$1, int $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public bpq a() {
      return this.a;
   }

   public float b() {
      return this.b;
   }

   public int c() {
      return this.c;
   }
}
