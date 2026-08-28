public class flm extends fnd {
   public static final xo a = xo.c("options.accessibility.title");

   private static ffg<?>[] a(ffh $$0) {
      return new ffg[]{
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

   public flm(fnb $$0, ffh $$1) {
      super($$0, $$1, a, a($$1));
   }

   @Override
   protected void aM_() {
      super.aM_();
      fha $$0 = this.s.b(this.c.t());
      if ($$0 != null && !this.m.ac().b().contains("high_contrast")) {
         $$0.j = false;
         $$0.a(fin.a(xo.c("options.accessibility.high_contrast.error.tooltip")));
      }
   }

   @Override
   protected void h() {
      fkt $$0 = this.d.b(fkt.e().a(8));
      $$0.a(fhc.a(xo.c("options.accessibility.link"), fls.b(this, "https://aka.ms/MinecraftJavaAccessibility")).a());
      $$0.a(fhc.a(xn.d, $$0x -> this.m.a(this.b)).a());
   }
}
