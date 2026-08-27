public class exh extends eyk {
   private static final int a = 8;
   private static final int b = 210;
   private static final tl c = tl.c("credits_and_attribution.screen.title");
   private static final tl k = tl.c("credits_and_attribution.button.credits");
   private static final tl l = tl.c("credits_and_attribution.button.attribution");
   private static final tl m = tl.c("credits_and_attribution.button.licenses");
   private final eyk n;
   private final evz o = new evz(this);

   public exh(eyk $$0) {
      super(c);
      this.n = $$0;
   }

   @Override
   protected void aH_() {
      this.o.a(new etw(this.m(), this.i));
      ewd $$0 = this.o.c(ewd.d()).a(8);
      $$0.c().b();
      $$0.a(esq.a(k, $$0x -> this.l()).a(210).a());
      $$0.a(esq.a(l, exc.b("https://aka.ms/MinecraftJavaAttribution", this, true)).a(210).a());
      $$0.a(esq.a(m, exc.b("https://aka.ms/MinecraftJavaLicenses", this, true)).a(210).a());
      this.o.b(esq.a(tk.d, $$0x -> this.az_()).a());
      this.o.a();
      this.o.a(this::d);
   }

   @Override
   protected void b() {
      this.o.a();
   }

   private void l() {
      this.f.a(new eyr(false, () -> this.f.a(this)));
   }

   @Override
   public void az_() {
      this.f.a(this.n);
   }
}
