public record aia(fgc b, float c, float d, boolean e) implements zo<aha> {
   public static final ze<vy, aia> a = ze.a(fgc.b, aia::b, zc.l, aia::e, zc.l, aia::f, zc.b, aia::g, aia::new);

   public static aia a(bxe $$0) {
      return $$0.bQ() ? new aia($$0.S_().a(), $$0.S_().b(), $$0.S_().c(), $$0.aH()) : new aia($$0.dt(), $$0.dL(), $$0.dN(), $$0.aH());
   }

   @Override
   public zq<aia> a() {
      return agy.bM;
   }

   public void a(aha $$0) {
      $$0.a(this);
   }

   public float e() {
      return this.c;
   }

   public float f() {
      return this.d;
   }

   public boolean g() {
      return this.e;
   }
}
