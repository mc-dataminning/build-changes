public class byv {
   private final bsv a;
   private final float b;
   private final int c;

   public byv(ib $$0, float $$1, int $$2) {
      this(new brk($$0), $$1, $$2);
   }

   public byv(ept $$0, float $$1, int $$2) {
      this(new brk(ib.a($$0)), $$1, $$2);
   }

   public byv(box $$0, float $$1, int $$2) {
      this(new brs($$0, false), $$1, $$2);
   }

   public byv(bsv $$0, float $$1, int $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public bsv a() {
      return this.a;
   }

   public float b() {
      return this.b;
   }

   public int c() {
      return this.c;
   }
}
