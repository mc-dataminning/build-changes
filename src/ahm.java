public record ahm(fcu b, float c, float d, boolean e) implements zc<agm> {
   public static final yt<vr, ahm> a = yt.a(fcu.b, ahm::b, yr.l, ahm::e, yr.l, ahm::f, yr.b, ahm::g, ahm::new);

   public static ahm a(bvs $$0) {
      return $$0.bR() ? new ahm($$0.N_().a(), $$0.N_().b(), $$0.N_().c(), $$0.aJ()) : new ahm($$0.dt(), $$0.dL(), $$0.dN(), $$0.aJ());
   }

   @Override
   public ze<ahm> a() {
      return agk.bM;
   }

   public void a(agm $$0) {
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
