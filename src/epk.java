import com.mojang.blaze3d.systems.RenderSystem;

public class epk extends eoz {
   private static final acq a = new acq("textures/gui/checkbox.png");
   private static final int b = 14737632;
   private boolean c;
   private final boolean d;

   public epk(int $$0, int $$1, int $$2, int $$3, sw $$4, boolean $$5) {
      this($$0, $$1, $$2, $$3, $$4, $$5, true);
   }

   public epk(int $$0, int $$1, int $$2, int $$3, sw $$4, boolean $$5, boolean $$6) {
      super($$0, $$1, $$2, $$3, $$4);
      this.c = $$5;
      this.d = $$6;
   }

   @Override
   public void c() {
      this.c = !this.c;
   }

   public boolean a() {
      return this.c;
   }

   @Override
   public void a(esp $$0) {
      $$0.a(eso.a, this.aE_());
      if (this.r) {
         if (this.aB_()) {
            $$0.a(eso.d, sw.c("narration.checkbox.usage.focused"));
         } else {
            $$0.a(eso.d, sw.c("narration.checkbox.usage.hovered"));
         }
      }
   }

   @Override
   public void b(eox $$0, int $$1, int $$2, float $$3) {
      enn $$4 = enn.N();
      RenderSystem.enableDepthTest();
      eov $$5 = $$4.h;
      $$0.a(1.0F, 1.0F, 1.0F, this.t);
      RenderSystem.enableBlend();
      $$0.a(a, this.p(), this.r(), this.aB_() ? 20.0F : 0.0F, this.c ? 20.0F : 0.0F, 20, this.p, 64, 64);
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
      if (this.d) {
         $$0.b($$5, this.l(), this.p() + 24, this.r() + (this.p - 8) / 2, 14737632 | apa.f(this.t * 255.0F) << 24);
      }
   }
}
