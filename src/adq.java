public class adq implements xz<aai> {
   public static final xq<us, adq> a = xz.a(adq::a, adq::new);
   private final float b;
   private final int c;
   private final int d;

   public adq(float $$0, int $$1, int $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private adq(us $$0) {
      this.b = $$0.readFloat();
      this.d = $$0.l();
      this.c = $$0.l();
   }

   private void a(us $$0) {
      $$0.a(this.b);
      $$0.c(this.d);
      $$0.c(this.c);
   }

   @Override
   public yb<adq> a() {
      return aet.aG;
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

   public int f() {
      return this.d;
   }
}
