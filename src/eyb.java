public class eyb extends ezd {
   private static final int a = 8;
   private static final int b = 210;
   private static final ui c = ui.c("credits_and_attribution.screen.title");
   private static final ui k = ui.c("credits_and_attribution.button.credits");
   private static final ui l = ui.c("credits_and_attribution.button.attribution");
   private static final ui m = ui.c("credits_and_attribution.button.licenses");
   private final ezd n;
   private final ewt o = new ewt(this);

   public eyb(ezd $$0) {
      super(c);
      this.n = $$0;
   }

   @Override
   protected void aM_() {
      this.o.a(new euq(this.m(), this.i));
      ewx $$0 = this.o.c(ewx.d()).a(8);
      $$0.c().b();
      $$0.a(etj.a(k, $$0x -> this.l()).a(210).a());
      $$0.a(etj.a(l, exw.b("https://aka.ms/MinecraftJavaAttribution", this, true)).a(210).a());
      $$0.a(etj.a(m, exw.b("https://aka.ms/MinecraftJavaLicenses", this, true)).a(210).a());
      this.o.b(etj.a(uh.d, $$0x -> this.aC_()).a());
      this.o.a();
      this.o.a(this::d);
   }

   @Override
   protected void c() {
      this.o.a();
   }

   private void l() {
      this.f.a(new ezl(false, () -> this.f.a(this)));
   }

   @Override
   public void aC_() {
      this.f.a(this.n);
   }
}
