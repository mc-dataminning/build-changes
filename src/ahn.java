public record ahn(fdw b, float c, float d, boolean e) implements zd<agn> {
   public static final yu<vs, ahn> a = yu.a(fdw.b, ahn::b, ys.l, ahn::e, ys.l, ahn::f, ys.b, ahn::g, ahn::new);

   public static ahn a(bwa $$0) {
      return $$0.bR() ? new ahn($$0.N_().a(), $$0.N_().b(), $$0.N_().c(), $$0.aJ()) : new ahn($$0.dt(), $$0.dL(), $$0.dN(), $$0.aJ());
   }

   @Override
   public zf<ahn> a() {
      return agl.bM;
   }

   public void a(agn $$0) {
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
