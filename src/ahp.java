public record ahp(feq b, float c, float d, boolean e) implements zf<agp> {
   public static final yw<vu, ahp> a = yw.a(feq.b, ahp::b, yu.l, ahp::e, yu.l, ahp::f, yu.b, ahp::g, ahp::new);

   public static ahp a(bwf $$0) {
      return $$0.bR() ? new ahp($$0.N_().a(), $$0.N_().b(), $$0.N_().c(), $$0.aJ()) : new ahp($$0.dt(), $$0.dL(), $$0.dN(), $$0.aJ());
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
