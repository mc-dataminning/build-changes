public class fbf extends fcv {
   private static evd<?>[] a(eve $$0) {
      return new evd[]{
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

   public fbf(fct $$0, eve $$1) {
      super($$0, $$1, vd.c("options.accessibility.title"), a($$1));
   }

   @Override
   protected void aN_() {
      super.aN_();
      eww $$0 = this.k.b(this.b.r());
      if ($$0 != null && !this.f.Z().b().contains("high_contrast")) {
         $$0.j = false;
         $$0.a(eyj.a(vd.c("options.accessibility.high_contrast.error.tooltip")));
      }
   }

   @Override
   protected void i() {
      this.d(ewy.a(vd.c("options.accessibility.link"), fbl.b(this, "https://aka.ms/MinecraftJavaAccessibility")).a(this.g / 2 - 155, this.h - 27, 150, 20).a());
      this.d(ewy.a(vc.d, $$0 -> this.f.a(this.a)).a(this.g / 2 + 5, this.h - 27, 150, 20).a());
   }
}
