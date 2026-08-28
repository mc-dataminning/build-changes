public record ahg(fba b, float c, float d, boolean e) implements yw<agg> {
   public static final yn<vl, ahg> a = yn.a(fba.b, ahg::b, yl.l, ahg::e, yl.l, ahg::f, yl.b, ahg::g, ahg::new);

   public static ahg a(bul $$0) {
      return new ahg(new fba($$0.R_(), $$0.S_(), $$0.g_()), $$0.dL(), $$0.dN(), $$0.aJ());
   }

   @Override
   public yy<ahg> a() {
      return age.bM;
   }

   public void a(agg $$0) {
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
