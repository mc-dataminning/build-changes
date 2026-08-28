public class flo extends fnf {
   public static final xp a = xp.c("options.accessibility.title");

   private static ffi<?>[] a(ffj $$0) {
      return new ffi[]{
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

   public flo(fnd $$0, ffj $$1) {
      super($$0, $$1, a, a($$1));
   }

   @Override
   protected void aM_() {
      super.aM_();
      fhc $$0 = this.s.b(this.c.t());
      if ($$0 != null && !this.m.ac().b().contains("high_contrast")) {
         $$0.j = false;
         $$0.a(fip.a(xp.c("options.accessibility.high_contrast.error.tooltip")));
      }
   }

   @Override
   protected void h() {
      fkv $$0 = this.d.b(fkv.e().a(8));
      $$0.a(fhe.a(xp.c("options.accessibility.link"), flu.b(this, "https://aka.ms/MinecraftJavaAccessibility")).a());
      $$0.a(fhe.a(xo.d, $$0x -> this.m.a(this.b)).a());
   }
}
