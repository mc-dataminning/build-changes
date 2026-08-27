public class ezl extends fbb {
   private static etl<?>[] a(etm $$0) {
      return new etl[]{
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

   public ezl(faz $$0, etm $$1) {
      super($$0, $$1, uv.c("options.accessibility.title"), a($$1));
   }

   @Override
   protected void aQ_() {
      super.aQ_();
      evc $$0 = this.k.b(this.b.r());
      if ($$0 != null && !this.f.Z().b().contains("high_contrast")) {
         $$0.i = false;
         $$0.a(ewp.a(uv.c("options.accessibility.high_contrast.error.tooltip")));
      }
   }

   @Override
   protected void f() {
      this.d(eve.a(uv.c("options.accessibility.link"), ezr.b(this, "https://aka.ms/MinecraftJavaAccessibility")).a(this.g / 2 - 155, this.h - 27, 150, 20).a());
      this.d(eve.a(uu.d, $$0 -> this.f.a(this.a)).a(this.g / 2 + 5, this.h - 27, 150, 20).a());
   }
}
