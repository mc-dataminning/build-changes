public record ahf(fay b, float c, float d, boolean e) implements yv<agf> {
   public static final ym<vl, ahf> a = ym.a(fay.b, ahf::b, yk.l, ahf::e, yk.l, ahf::f, yk.b, ahf::g, ahf::new);

   public static ahf a(buj $$0) {
      return new ahf(new fay($$0.R_(), $$0.S_(), $$0.g_()), $$0.dM(), $$0.dO(), $$0.aJ());
   }

   @Override
   public yx<ahf> a() {
      return agd.bM;
   }

   public void a(agf $$0) {
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
