public class exj extends eym {
   private static final int a = 8;
   private static final int b = 210;
   private static final tn c = tn.c("credits_and_attribution.screen.title");
   private static final tn k = tn.c("credits_and_attribution.button.credits");
   private static final tn l = tn.c("credits_and_attribution.button.attribution");
   private static final tn m = tn.c("credits_and_attribution.button.licenses");
   private final eym n;
   private final ewb o = new ewb(this);

   public exj(eym $$0) {
      super(c);
      this.n = $$0;
   }

   @Override
   protected void aH_() {
      this.o.a(new ety(this.m(), this.i));
      ewf $$0 = this.o.c(ewf.d()).a(8);
      $$0.c().b();
      $$0.a(ess.a(k, $$0x -> this.l()).a(210).a());
      $$0.a(ess.a(l, exe.b("https://aka.ms/MinecraftJavaAttribution", this, true)).a(210).a());
      $$0.a(ess.a(m, exe.b("https://aka.ms/MinecraftJavaLicenses", this, true)).a(210).a());
      this.o.b(ess.a(tm.d, $$0x -> this.az_()).a());
      this.o.a();
      this.o.a(this::d);
   }

   @Override
   protected void b() {
      this.o.a();
   }

   private void l() {
      this.f.a(new eyt(false, () -> this.f.a(this)));
   }

   @Override
   public void az_() {
      this.f.a(this.n);
   }
}
