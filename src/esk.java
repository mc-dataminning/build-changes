import com.mojang.blaze3d.systems.RenderSystem;

public class esk extends esa {
   private static final aep a = new aep("widget/checkbox_selected_highlighted");
   private static final aep b = new aep("widget/checkbox_selected");
   private static final aep c = new aep("widget/checkbox_highlighted");
   private static final aep d = new aep("widget/checkbox");
   private static final int l = 14737632;
   private boolean m;
   private final boolean n;

   public esk(int $$0, int $$1, int $$2, int $$3, te $$4, boolean $$5) {
      this($$0, $$1, $$2, $$3, $$4, $$5, true);
   }

   public esk(int $$0, int $$1, int $$2, int $$3, te $$4, boolean $$5, boolean $$6) {
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
   public void a(evt $$0) {
      $$0.a(evs.a, this.aB_());
      if (this.i) {
         if (this.ax_()) {
            $$0.a(evs.d, te.c("narration.checkbox.usage.focused"));
         } else {
            $$0.a(evs.d, te.c("narration.checkbox.usage.hovered"));
         }
      }
   }

   @Override
   public void b(erx $$0, int $$1, int $$2, float $$3) {
      eqn $$4 = eqn.N();
      RenderSystem.enableDepthTest();
      erv $$5 = $$4.h;
      $$0.a(1.0F, 1.0F, 1.0F, this.k);
      RenderSystem.enableBlend();
      aep $$6;
      if (this.m) {
         $$6 = this.ax_() ? a : b;
      } else {
         $$6 = this.ax_() ? c : d;
      }

      $$0.a($$6, this.p(), this.r(), 20, this.g);
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
      if (this.n) {
         $$0.b($$5, this.l(), this.p() + 24, this.r() + (this.g - 8) / 2, 14737632 | aro.f(this.k * 255.0F) << 24);
      }
   }
}
