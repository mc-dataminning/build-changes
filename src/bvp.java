public class bvp {
   private final bpp a;
   private final float b;
   private final int c;

   public bvp(hx $$0, float $$1, int $$2) {
      this(new boe($$0), $$1, $$2);
   }

   public bvp(els $$0, float $$1, int $$2) {
      this(new boe(hx.a($$0)), $$1, $$2);
   }

   public bvp(blu $$0, float $$1, int $$2) {
      this(new bom($$0, false), $$1, $$2);
   }

   public bvp(bpp $$0, float $$1, int $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public bpp a() {
      return this.a;
   }

   public float b() {
      return this.b;
   }

   public int c() {
      return this.c;
   }
}
