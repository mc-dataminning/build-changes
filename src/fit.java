public class fit extends fjx {
   private static final int a = 8;
   private static final int b = 210;
   private static final wi c = wi.c("credits_and_attribution.screen.title");
   private static final wi d = wi.c("credits_and_attribution.button.credits");
   private static final wi o = wi.c("credits_and_attribution.button.attribution");
   private static final wi p = wi.c("credits_and_attribution.button.licenses");
   private final fjx q;
   private final fhl r = new fhl(this);

   public fit(fjx $$0) {
      super(c);
      this.q = $$0;
   }

   @Override
   protected void aM_() {
      this.r.a(c, this.m);
      fhp $$0 = this.r.c(fhp.d()).a(8);
      $$0.c().b();
      $$0.a(fdy.a(d, $$0x -> this.m()).a(210).a());
      $$0.a(fdy.a(o, fio.b(this, "https://aka.ms/MinecraftJavaAttribution")).a(210).a());
      $$0.a(fdy.a(p, fio.b(this, "https://aka.ms/MinecraftJavaLicenses")).a(210).a());
      this.r.b(fdy.a(wh.d, $$0x -> this.d()).a(200).a());
      this.r.a();
      this.r.a(this::c);
   }

   @Override
   protected void c() {
      this.r.a();
   }

   private void m() {
      this.j.a(new fkf(false, () -> this.j.a(this)));
   }

   @Override
   public void d() {
      this.j.a(this.q);
   }
}
