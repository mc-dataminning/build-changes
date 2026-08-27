public class cbv {
   private final bvv a;
   private final float b;
   private final int c;

   public cbv(io $$0, float $$1, int $$2) {
      this(new buk($$0), $$1, $$2);
   }

   public cbv(euk $$0, float $$1, int $$2) {
      this(new buk(io.a($$0)), $$1, $$2);
   }

   public cbv(bru $$0, float $$1, int $$2) {
      this(new bus($$0, false), $$1, $$2);
   }

   public cbv(bvv $$0, float $$1, int $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public bvv a() {
      return this.a;
   }

   public float b() {
      return this.b;
   }

   public int c() {
      return this.c;
   }
}
