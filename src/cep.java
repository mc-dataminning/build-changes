public class cep {
   private final byp a;
   private final float b;
   private final int c;

   public cep(ji $$0, float $$1, int $$2) {
      this(new bxe($$0), $$1, $$2);
   }

   public cep(fbb $$0, float $$1, int $$2) {
      this(new bxe(ji.a((kb)$$0)), $$1, $$2);
   }

   public cep(bum $$0, float $$1, int $$2) {
      this(new bxm($$0, false), $$1, $$2);
   }

   public cep(byp $$0, float $$1, int $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public byp a() {
      return this.a;
   }

   public float b() {
      return this.b;
   }

   public int c() {
      return this.c;
   }
}
