public class adr implements xz<aai> {
   public static final xq<us, adr> a = xz.a(adr::a, adr::new);
   private final float b;
   private final int c;
   private final float d;

   public adr(float $$0, int $$1, float $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private adr(us $$0) {
      this.b = $$0.readFloat();
      this.c = $$0.l();
      this.d = $$0.readFloat();
   }

   private void a(us $$0) {
      $$0.a(this.b);
      $$0.c(this.c);
      $$0.a(this.d);
   }

   @Override
   public yb<adr> a() {
      return aet.aH;
   }

   public void a(aai $$0) {
      $$0.a(this);
   }

   public float b() {
      return this.b;
   }

   public int e() {
      return this.c;
   }

   public float f() {
      return this.d;
   }
}
