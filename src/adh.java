public record adh(fba b, float c, float d) implements yv<abk> {
   public static final ym<vl, adh> a = ym.a(fba.b, adh::b, yk.l, adh::e, yk.l, adh::f, adh::new);

   public static adh a(buk $$0) {
      return new adh($$0.du(), $$0.dM(), $$0.dO());
   }

   @Override
   public yx<adh> a() {
      return agd.V;
   }

   public void a(abk $$0) {
      $$0.a(this);
   }

   public float e() {
      return this.c;
   }

   public float f() {
      return this.d;
   }
}
