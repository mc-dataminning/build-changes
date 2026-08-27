import com.mojang.blaze3d.systems.RenderSystem;

public class ess extends esi {
   private static final aew a = new aew("widget/checkbox_selected_highlighted");
   private static final aew b = new aew("widget/checkbox_selected");
   private static final aew c = new aew("widget/checkbox_highlighted");
   private static final aew d = new aew("widget/checkbox");
   private static final int l = 14737632;
   private boolean m;
   private final boolean n;

   public ess(int $$0, int $$1, int $$2, int $$3, tl $$4, boolean $$5) {
      this($$0, $$1, $$2, $$3, $$4, $$5, true);
   }

   public ess(int $$0, int $$1, int $$2, int $$3, tl $$4, boolean $$5, boolean $$6) {
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
   public void a(ewi $$0) {
      $$0.a(ewh.a, this.aE_());
      if (this.i) {
         if (this.aC_()) {
            $$0.a(ewh.d, tl.c("narration.checkbox.usage.focused"));
         } else {
            $$0.a(ewh.d, tl.c("narration.checkbox.usage.hovered"));
         }
      }
   }

   @Override
   public void b(esf $$0, int $$1, int $$2, float $$3) {
      eqv $$4 = eqv.O();
      RenderSystem.enableDepthTest();
      esd $$5 = $$4.h;
      $$0.a(1.0F, 1.0F, 1.0F, this.k);
      RenderSystem.enableBlend();
      aew $$6;
      if (this.m) {
         $$6 = this.aC_() ? a : b;
      } else {
         $$6 = this.aC_() ? c : d;
      }

      $$0.a($$6, this.r(), this.t(), 20, this.g);
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
      if (this.n) {
         $$0.b($$5, this.m(), this.r() + 24, this.t() + (this.g - 8) / 2, 14737632 | arw.f(this.k * 255.0F) << 24);
      }
   }
}
