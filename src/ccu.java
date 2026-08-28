public class ccu {
   private final bwu a;
   private final float b;
   private final int c;

   public ccu(iz $$0, float $$1, int $$2) {
      this(new bvj($$0), $$1, $$2);
   }

   public ccu(evp $$0, float $$1, int $$2) {
      this(new bvj(iz.a($$0)), $$1, $$2);
   }

   public ccu(bss $$0, float $$1, int $$2) {
      this(new bvr($$0, false), $$1, $$2);
   }

   public ccu(bwu $$0, float $$1, int $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public bwu a() {
      return this.a;
   }

   public float b() {
      return this.b;
   }

   public int c() {
      return this.c;
   }
}
