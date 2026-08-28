public record ahp(fex b, float c, float d, boolean e) implements zf<agp> {
   public static final yw<vu, ahp> a = yw.a(fex.b, ahp::b, yu.l, ahp::e, yu.l, ahp::f, yu.b, ahp::g, ahp::new);

   public static ahp a(bwi $$0) {
      return $$0.bP() ? new ahp($$0.N_().a(), $$0.N_().b(), $$0.N_().c(), $$0.aH()) : new ahp($$0.ds(), $$0.dK(), $$0.dM(), $$0.aH());
   }

   @Override
   public zh<ahp> a() {
      return agn.bM;
   }

   public void a(agp $$0) {
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
