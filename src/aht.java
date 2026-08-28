public record aht(ffs b, float c, float d, boolean e) implements zj<agt> {
   public static final za<vy, aht> a = za.a(ffs.b, aht::b, yy.l, aht::e, yy.l, aht::f, yy.b, aht::g, aht::new);

   public static aht a(bwv $$0) {
      return $$0.bQ() ? new aht($$0.R_().a(), $$0.R_().b(), $$0.R_().c(), $$0.aH()) : new aht($$0.dt(), $$0.dL(), $$0.dN(), $$0.aH());
   }

   @Override
   public zl<aht> a() {
      return agr.bM;
   }

   public void a(agt $$0) {
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
