public class exq extends ezf {
   private static err<?>[] a(ers $$0) {
      return new err[]{
         $$0.ao(),
         $$0.S(),
         $$0.q(),
         $$0.E(),
         $$0.o(),
         $$0.U(),
         $$0.m(),
         $$0.n(),
         $$0.x(),
         $$0.y(),
         $$0.Y(),
         $$0.Z(),
         $$0.af(),
         $$0.ag(),
         $$0.ah(),
         $$0.ak(),
         $$0.ai(),
         $$0.aj(),
         $$0.b(),
         $$0.a(),
         $$0.p(),
         $$0.r()
      };
   }

   public exq(ezd $$0, ers $$1) {
      super($$0, $$1, ui.c("options.accessibility.title"), a($$1));
   }

   @Override
   protected void aM_() {
      super.aM_();
      eth $$0 = this.k.b(this.b.q());
      if ($$0 != null && !this.f.aa().b().contains("high_contrast")) {
         $$0.i = false;
         $$0.a(euu.a(ui.c("options.accessibility.high_contrast.error.tooltip")));
      }
   }

   @Override
   protected void f() {
      this.d(etj.a(ui.c("options.accessibility.link"), $$0 -> this.f.a(new exw($$0x -> {
            if ($$0x) {
               ac.i().a("https://aka.ms/MinecraftJavaAccessibility");
            }

            this.f.a(this);
         }, "https://aka.ms/MinecraftJavaAccessibility", true))).a(this.g / 2 - 155, this.h - 27, 150, 20).a());
      this.d(etj.a(uh.d, $$0 -> this.f.a(this.a)).a(this.g / 2 + 5, this.h - 27, 150, 20).a());
   }
}
