public class fbn extends fdd {
   private static evl<?>[] a(evm $$0) {
      return new evl[]{
         $$0.ap(),
         $$0.T(),
         $$0.r(),
         $$0.F(),
         $$0.p(),
         $$0.V(),
         $$0.n(),
         $$0.o(),
         $$0.y(),
         $$0.z(),
         $$0.Z(),
         $$0.aa(),
         $$0.ag(),
         $$0.ah(),
         $$0.ai(),
         $$0.al(),
         $$0.aj(),
         $$0.ak(),
         $$0.b(),
         $$0.a(),
         $$0.q(),
         $$0.c(),
         $$0.s()
      };
   }

   public fbn(fdb $$0, evm $$1) {
      super($$0, $$1, vf.c("options.accessibility.title"), a($$1));
   }

   @Override
   protected void aN_() {
      super.aN_();
      exe $$0 = this.k.b(this.b.r());
      if ($$0 != null && !this.f.aa().b().contains("high_contrast")) {
         $$0.j = false;
         $$0.a(eyr.a(vf.c("options.accessibility.high_contrast.error.tooltip")));
      }
   }

   @Override
   protected void i() {
      this.d(exg.a(vf.c("options.accessibility.link"), fbt.b(this, "https://aka.ms/MinecraftJavaAccessibility")).a(this.g / 2 - 155, this.h - 27, 150, 20).a());
      this.d(exg.a(ve.d, $$0 -> this.f.a(this.a)).a(this.g / 2 + 5, this.h - 27, 150, 20).a());
   }
}
