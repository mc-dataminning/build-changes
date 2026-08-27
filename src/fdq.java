public class fdq extends ffg {
   private static exk<?>[] a(exl $$0) {
      return new exk[]{
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

   public fdq(ffe $$0, exl $$1) {
      super($$0, $$1, vq.c("options.accessibility.title"), a($$1));
   }

   @Override
   protected void aQ_() {
      super.aQ_();
      ezf $$0 = this.k.b(this.b.r());
      if ($$0 != null && !this.f.aa().b().contains("high_contrast")) {
         $$0.j = false;
         $$0.a(fas.a(vq.c("options.accessibility.high_contrast.error.tooltip")));
      }
   }

   @Override
   protected void j() {
      this.d(ezh.a(vq.c("options.accessibility.link"), fdw.b(this, "https://aka.ms/MinecraftJavaAccessibility")).a(this.g / 2 - 155, this.h - 27, 150, 20).a());
      this.d(ezh.a(vp.d, $$0 -> this.f.a(this.a)).a(this.g / 2 + 5, this.h - 27, 150, 20).a());
   }
}
