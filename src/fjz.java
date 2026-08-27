public class fjz extends fld {
   private static final int a = 8;
   private static final int b = 210;
   private static final wu c = wu.c("credits_and_attribution.screen.title");
   private static final wu d = wu.c("credits_and_attribution.button.credits");
   private static final wu r = wu.c("credits_and_attribution.button.attribution");
   private static final wu s = wu.c("credits_and_attribution.button.licenses");
   private final fld u;
   private final fir v = new fir(this);

   public fjz(fld $$0) {
      super(c);
      this.u = $$0;
   }

   @Override
   protected void aM_() {
      this.v.a(c, this.p);
      fiv $$0 = this.v.c(fiv.d()).a(8);
      $$0.c().b();
      $$0.a(ffe.a(d, $$0x -> this.m()).a(210).a());
      $$0.a(ffe.a(r, fju.b(this, "https://aka.ms/MinecraftJavaAttribution")).a(210).a());
      $$0.a(ffe.a(s, fju.b(this, "https://aka.ms/MinecraftJavaLicenses")).a(210).a());
      this.v.b(ffe.a(wt.d, $$0x -> this.d()).a(200).a());
      this.v.a();
      this.v.a(this::c);
   }

   @Override
   protected void c() {
      this.v.a();
   }

   private void m() {
      this.m.a(new fll(false, () -> this.m.a(this)));
   }

   @Override
   public void d() {
      this.m.a(this.u);
   }
}
