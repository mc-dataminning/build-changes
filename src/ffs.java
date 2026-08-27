public class ffs extends fhj {
   private static ezl<?>[] a(ezm $$0) {
      return new ezl[]{
         $$0.aq(),
         $$0.U(),
         $$0.r(),
         $$0.F(),
         $$0.p(),
         $$0.W(),
         $$0.n(),
         $$0.o(),
         $$0.y(),
         $$0.z(),
         $$0.aa(),
         $$0.ab(),
         $$0.ah(),
         $$0.ai(),
         $$0.aj(),
         $$0.am(),
         $$0.ak(),
         $$0.al(),
         $$0.b(),
         $$0.a(),
         $$0.q(),
         $$0.c(),
         $$0.s()
      };
   }

   public ffs(fhh $$0, ezm $$1) {
      super($$0, $$1, vu.c("options.accessibility.title"), a($$1));
   }

   @Override
   protected void aO_() {
      super.aO_();
      fbg $$0 = this.k.b(this.b.r());
      if ($$0 != null && !this.f.ac().b().contains("high_contrast")) {
         $$0.j = false;
         $$0.a(fct.a(vu.c("options.accessibility.high_contrast.error.tooltip")));
      }
   }

   @Override
   protected void j() {
      this.c(fbi.a(vu.c("options.accessibility.link"), ffy.b(this, "https://aka.ms/MinecraftJavaAccessibility")).a(this.g / 2 - 155, this.h - 27, 150, 20).a());
      this.c(fbi.a(vt.d, $$0 -> this.f.a(this.a)).a(this.g / 2 + 5, this.h - 27, 150, 20).a());
   }
}
