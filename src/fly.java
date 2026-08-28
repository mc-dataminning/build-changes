public class fly extends fnc {
   private static final int a = 8;
   private static final int b = 210;
   private static final xo c = xo.c("credits_and_attribution.screen.title");
   private static final xo d = xo.c("credits_and_attribution.button.credits");
   private static final xo r = xo.c("credits_and_attribution.button.attribution");
   private static final xo s = xo.c("credits_and_attribution.button.licenses");
   private final fnc u;
   private final fkq v = new fkq(this);

   public fly(fnc $$0) {
      super(c);
      this.u = $$0;
   }

   @Override
   protected void aM_() {
      this.v.a(c, this.p);
      fku $$0 = this.v.c(fku.d()).a(8);
      $$0.c().b();
      $$0.a(fhd.a(d, $$0x -> this.m()).a(210).a());
      $$0.a(fhd.a(r, flt.b(this, "https://aka.ms/MinecraftJavaAttribution")).a(210).a());
      $$0.a(fhd.a(s, flt.b(this, "https://aka.ms/MinecraftJavaLicenses")).a(210).a());
      this.v.b(fhd.a(xn.d, $$0x -> this.d()).a(200).a());
      this.v.a();
      this.v.a(this::c);
   }

   @Override
   protected void c() {
      this.v.a();
   }

   private void m() {
      this.m.a(new fnk(false, () -> this.m.a(this)));
   }

   @Override
   public void d() {
      this.m.a(this.u);
   }
}
