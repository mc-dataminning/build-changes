public class ftm extends fuk {
   private static final int a = 8;
   private static final int b = 210;
   private static final wp c = wp.c("credits_and_attribution.screen.title");
   private static final wp d = wp.c("credits_and_attribution.button.credits");
   private static final wp s = wp.c("credits_and_attribution.button.attribution");
   private static final wp u = wp.c("credits_and_attribution.button.licenses");
   private final fuk v;
   private final fsg w = new fsg(this);

   public ftm(fuk $$0) {
      super(c);
      this.v = $$0;
   }

   @Override
   protected void aR_() {
      this.w.a(c, this.p);
      fsk $$0 = this.w.c(fsk.d()).a(8);
      $$0.c().b();
      $$0.a(fos.a(d, $$0x -> this.m()).a(210).a());
      $$0.a(fos.a(s, fth.b(this, axv.d)).a(210).a());
      $$0.a(fos.a(u, fth.b(this, axv.e)).a(210).a());
      this.w.b(fos.a(wo.d, $$0x -> this.aO_()).a(200).a());
      this.w.a();
      this.w.a(this::c);
   }

   @Override
   protected void c() {
      this.w.a();
   }

   private void m() {
      this.m.a(new fun(false, () -> this.m.a(this)));
   }

   @Override
   public void aO_() {
      this.m.a(this.v);
   }
}
