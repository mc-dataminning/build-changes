public class fhz extends fjq {
   public static final wg a = wg.c("options.accessibility.title");

   private static fbs<?>[] a(fbt $$0) {
      return new fbs[]{
         $$0.as(),
         $$0.W(),
         $$0.t(),
         $$0.H(),
         $$0.p(),
         $$0.r(),
         $$0.Y(),
         $$0.n(),
         $$0.o(),
         $$0.A(),
         $$0.B(),
         $$0.ac(),
         $$0.ad(),
         $$0.aj(),
         $$0.ak(),
         $$0.al(),
         $$0.ao(),
         $$0.am(),
         $$0.an(),
         $$0.b(),
         $$0.a(),
         $$0.s(),
         $$0.c(),
         $$0.u()
      };
   }

   public fhz(fjo $$0, fbt $$1) {
      super($$0, $$1, a, a($$1));
   }

   @Override
   protected void aN_() {
      super.aN_();
      fdn $$0 = this.p.b(this.c.t());
      if ($$0 != null && !this.j.ac().b().contains("high_contrast")) {
         $$0.j = false;
         $$0.a(ffa.a(wg.c("options.accessibility.high_contrast.error.tooltip")));
      }
   }

   @Override
   protected void h() {
      fhg $$0 = this.d.b(fhg.e().a(8));
      $$0.a(fdp.a(wg.c("options.accessibility.link"), fif.b(this, "https://aka.ms/MinecraftJavaAccessibility")).a());
      $$0.a(fdp.a(wf.d, $$0x -> this.j.a(this.b)).a());
   }
}
