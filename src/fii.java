public class fii extends fjz {
   public static final wi a = wi.c("options.accessibility.title");

   private static fcb<?>[] a(fcc $$0) {
      return new fcb[]{
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

   public fii(fjx $$0, fcc $$1) {
      super($$0, $$1, a, a($$1));
   }

   @Override
   protected void aM_() {
      super.aM_();
      fdw $$0 = this.p.b(this.c.t());
      if ($$0 != null && !this.j.ac().b().contains("high_contrast")) {
         $$0.j = false;
         $$0.a(ffj.a(wi.c("options.accessibility.high_contrast.error.tooltip")));
      }
   }

   @Override
   protected void h() {
      fhp $$0 = this.d.b(fhp.e().a(8));
      $$0.a(fdy.a(wi.c("options.accessibility.link"), fio.b(this, "https://aka.ms/MinecraftJavaAccessibility")).a());
      $$0.a(fdy.a(wh.d, $$0x -> this.j.a(this.b)).a());
   }
}
