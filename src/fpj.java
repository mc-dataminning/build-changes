public class fpj extends fqh {
   private static final int a = 8;
   private static final int b = 210;
   private static final xe c = xe.c("credits_and_attribution.screen.title");
   private static final xe d = xe.c("credits_and_attribution.button.credits");
   private static final xe s = xe.c("credits_and_attribution.button.attribution");
   private static final xe u = xe.c("credits_and_attribution.button.licenses");
   private final fqh v;
   private final foc w = new foc(this);

   public fpj(fqh $$0) {
      super(c);
      this.v = $$0;
   }

   @Override
   protected void aS_() {
      this.w.a(c, this.p);
      fog $$0 = this.w.c(fog.d()).a(8);
      $$0.c().b();
      $$0.a(fko.a(d, $$0x -> this.m()).a(210).a());
      $$0.a(fko.a(s, fpe.b(this, ayb.d)).a(210).a());
      $$0.a(fko.a(u, fpe.b(this, ayb.e)).a(210).a());
      this.w.b(fko.a(xd.d, $$0x -> this.d()).a(200).a());
      this.w.a();
      this.w.a(this::c);
   }

   @Override
   protected void c() {
      this.w.a();
   }

   private void m() {
      this.m.a(new fqk(false, () -> this.m.a(this)));
   }

   @Override
   public void d() {
      this.m.a(this.v);
   }
}
