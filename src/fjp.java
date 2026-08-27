public class fjp extends fkt {
   private static final int a = 8;
   private static final int b = 210;
   private static final ws c = ws.c("credits_and_attribution.screen.title");
   private static final ws d = ws.c("credits_and_attribution.button.credits");
   private static final ws r = ws.c("credits_and_attribution.button.attribution");
   private static final ws s = ws.c("credits_and_attribution.button.licenses");
   private final fkt u;
   private final fih v = new fih(this);

   public fjp(fkt $$0) {
      super(c);
      this.u = $$0;
   }

   @Override
   protected void aM_() {
      this.v.a(c, this.p);
      fil $$0 = this.v.c(fil.d()).a(8);
      $$0.c().b();
      $$0.a(feu.a(d, $$0x -> this.m()).a(210).a());
      $$0.a(feu.a(r, fjk.b(this, "https://aka.ms/MinecraftJavaAttribution")).a(210).a());
      $$0.a(feu.a(s, fjk.b(this, "https://aka.ms/MinecraftJavaLicenses")).a(210).a());
      this.v.b(feu.a(wr.d, $$0x -> this.d()).a(200).a());
      this.v.a();
      this.v.a(this::c);
   }

   @Override
   protected void c() {
      this.v.a();
   }

   private void m() {
      this.m.a(new flb(false, () -> this.m.a(this)));
   }

   @Override
   public void d() {
      this.m.a(this.u);
   }
}
