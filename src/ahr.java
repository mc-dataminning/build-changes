public record ahr(ffq b, float c, float d, boolean e) implements zh<agr> {
   public static final yy<vw, ahr> a = yy.a(ffq.b, ahr::b, yw.l, ahr::e, yw.l, ahr::f, yw.b, ahr::g, ahr::new);

   public static ahr a(bwt $$0) {
      return $$0.bQ() ? new ahr($$0.R_().a(), $$0.R_().b(), $$0.R_().c(), $$0.aH()) : new ahr($$0.dt(), $$0.dL(), $$0.dN(), $$0.aH());
   }

   @Override
   public zj<ahr> a() {
      return agp.bM;
   }

   public void a(agr $$0) {
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
