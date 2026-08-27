public class ewr extends eyg {
   private static eqs<?>[] a(eqt $$0) {
      return new eqs[]{
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

   public ewr(eye $$0, eqt $$1) {
      super($$0, $$1, tl.c("options.accessibility.title"), a($$1));
   }

   @Override
   protected void aH_() {
      super.aH_();
      esi $$0 = this.k.b(this.b.q());
      if ($$0 != null && !this.f.aa().b().contains("high_contrast")) {
         $$0.i = false;
         $$0.a(etv.a(tl.c("options.accessibility.high_contrast.error.tooltip")));
      }
   }

   @Override
   protected void f() {
      this.d(esk.a(tl.c("options.accessibility.link"), $$0 -> this.f.a(new ewx($$0x -> {
            if ($$0x) {
               ac.i().a("https://aka.ms/MinecraftJavaAccessibility");
            }

            this.f.a(this);
         }, "https://aka.ms/MinecraftJavaAccessibility", true))).a(this.g / 2 - 155, this.h - 27, 150, 20).a());
      this.d(esk.a(tk.d, $$0 -> this.f.a(this.a)).a(this.g / 2 + 5, this.h - 27, 150, 20).a());
   }
}
