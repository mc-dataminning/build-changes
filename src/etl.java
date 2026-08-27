import com.mojang.blaze3d.systems.RenderSystem;

public class etl extends etb {
   private static final afw a = new afw("widget/checkbox_selected_highlighted");
   private static final afw b = new afw("widget/checkbox_selected");
   private static final afw c = new afw("widget/checkbox_highlighted");
   private static final afw d = new afw("widget/checkbox");
   private static final int l = 14737632;
   private boolean m;
   private final boolean n;

   public etl(int $$0, int $$1, int $$2, int $$3, ui $$4, boolean $$5) {
      this($$0, $$1, $$2, $$3, $$4, $$5, true);
   }

   public etl(int $$0, int $$1, int $$2, int $$3, ui $$4, boolean $$5, boolean $$6) {
      super($$0, $$1, $$2, $$3, $$4);
      this.m = $$5;
      this.n = $$6;
   }

   @Override
   public void c() {
      this.m = !this.m;
   }

   public boolean a() {
      return this.m;
   }

   @Override
   public void a(exc $$0) {
      $$0.a(exb.a, this.aI_());
      if (this.i) {
         if (this.aG_()) {
            $$0.a(exb.d, ui.c("narration.checkbox.usage.focused"));
         } else {
            $$0.a(exb.d, ui.c("narration.checkbox.usage.hovered"));
         }
      }
   }

   @Override
   public void b(esy $$0, int $$1, int $$2, float $$3) {
      ero $$4 = ero.O();
      RenderSystem.enableDepthTest();
      esw $$5 = $$4.h;
      $$0.a(1.0F, 1.0F, 1.0F, this.k);
      RenderSystem.enableBlend();
      afw $$6;
      if (this.m) {
         $$6 = this.aG_() ? a : b;
      } else {
         $$6 = this.aG_() ? c : d;
      }

      $$0.a($$6, this.p(), this.r(), 20, this.g);
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
      if (this.n) {
         $$0.b($$5, this.l(), this.p() + 24, this.r() + (this.g - 8) / 2, 14737632 | asy.f(this.k * 255.0F) << 24);
      }
   }
}
