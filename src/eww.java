public class eww extends exz {
   private static final int a = 8;
   private static final int b = 210;
   private static final tf c = tf.c("credits_and_attribution.screen.title");
   private static final tf k = tf.c("credits_and_attribution.button.credits");
   private static final tf l = tf.c("credits_and_attribution.button.attribution");
   private static final tf m = tf.c("credits_and_attribution.button.licenses");
   private final exz n;
   private final evo o = new evo(this);

   public eww(exz $$0) {
      super(c);
      this.n = $$0;
   }

   @Override
   protected void aE_() {
      this.o.a(new etm(this.m(), this.i));
      evs $$0 = this.o.c(evs.d()).a(8);
      $$0.c().b();
      $$0.a(esh.a(k, $$0x -> this.l()).a(210).a());
      $$0.a(esh.a(l, ewr.b("https://aka.ms/MinecraftJavaAttribution", this, true)).a(210).a());
      $$0.a(esh.a(m, ewr.b("https://aka.ms/MinecraftJavaLicenses", this, true)).a(210).a());
      this.o.b(esh.a(te.d, $$0x -> this.au_()).a());
      this.o.a();
      this.o.a(this::d);
   }

   @Override
   protected void b() {
      this.o.a();
   }

   private void l() {
      this.f.a(new eyg(false, () -> this.f.a(this)));
   }

   @Override
   public void au_() {
      this.f.a(this.n);
   }
}
