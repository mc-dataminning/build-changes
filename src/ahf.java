public record ahf(fbx b, float c, float d, boolean e) implements yw<agf> {
   public static final yn<vl, ahf> a = yn.a(fbx.b, ahf::b, yl.l, ahf::e, yl.l, ahf::f, yl.b, ahf::g, ahf::new);

   public static ahf a(bva $$0) {
      return $$0.bQ() ? new ahf($$0.N_().a(), $$0.N_().b(), $$0.N_().c(), $$0.aJ()) : new ahf($$0.ds(), $$0.dK(), $$0.dM(), $$0.aJ());
   }

   @Override
   public yy<ahf> a() {
      return agd.bL;
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
