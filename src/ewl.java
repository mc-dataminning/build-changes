public class ewl extends eyb {
   private static eqp<?>[] a(eqq $$0) {
      return new eqp[]{
         $$0.an(),
         $$0.R(),
         $$0.q(),
         $$0.D(),
         $$0.o(),
         $$0.T(),
         $$0.m(),
         $$0.n(),
         $$0.w(),
         $$0.x(),
         $$0.X(),
         $$0.Y(),
         $$0.ae(),
         $$0.af(),
         $$0.ag(),
         $$0.aj(),
         $$0.ah(),
         $$0.ai(),
         $$0.b(),
         $$0.a(),
         $$0.p()
      };
   }

   public ewl(exz $$0, eqq $$1) {
      super($$0, $$1, tf.c("options.accessibility.title"), a($$1));
   }

   @Override
   protected void aE_() {
      super.aE_();
      esf $$0 = this.k.b(this.b.q());
      if ($$0 != null && !this.f.aa().b().contains("high_contrast")) {
         $$0.i = false;
         $$0.a(etq.a(tf.c("options.accessibility.high_contrast.error.tooltip")));
      }
   }

   @Override
   protected void g() {
      this.d(esh.a(tf.c("options.accessibility.link"), $$0 -> this.f.a(new ewr($$0x -> {
            if ($$0x) {
               ac.i().a("https://aka.ms/MinecraftJavaAccessibility");
            }

            this.f.a(this);
         }, "https://aka.ms/MinecraftJavaAccessibility", true))).a(this.g / 2 - 155, this.h - 27, 150, 20).a());
      this.d(esh.a(te.d, $$0 -> this.f.a(this.a)).a(this.g / 2 + 5, this.h - 27, 150, 20).a());
   }
}
