import com.mojang.blaze3d.systems.RenderSystem;

public class esn extends esd {
   private static final aeu a = new aeu("widget/checkbox_selected_highlighted");
   private static final aeu b = new aeu("widget/checkbox_selected");
   private static final aeu c = new aeu("widget/checkbox_highlighted");
   private static final aeu d = new aeu("widget/checkbox");
   private static final int l = 14737632;
   private boolean m;
   private final boolean n;

   public esn(int $$0, int $$1, int $$2, int $$3, ti $$4, boolean $$5) {
      this($$0, $$1, $$2, $$3, $$4, $$5, true);
   }

   public esn(int $$0, int $$1, int $$2, int $$3, ti $$4, boolean $$5, boolean $$6) {
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
   public void a(ewd $$0) {
      $$0.a(ewc.a, this.aA_());
      if (this.i) {
         if (this.ay_()) {
            $$0.a(ewc.d, ti.c("narration.checkbox.usage.focused"));
         } else {
            $$0.a(ewc.d, ti.c("narration.checkbox.usage.hovered"));
         }
      }
   }

   @Override
   public void b(esa $$0, int $$1, int $$2, float $$3) {
      eqq $$4 = eqq.O();
      RenderSystem.enableDepthTest();
      ery $$5 = $$4.h;
      $$0.a(1.0F, 1.0F, 1.0F, this.k);
      RenderSystem.enableBlend();
      aeu $$6;
      if (this.m) {
         $$6 = this.ay_() ? a : b;
      } else {
         $$6 = this.ay_() ? c : d;
      }

      $$0.a($$6, this.r(), this.t(), 20, this.g);
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
      if (this.n) {
         $$0.b($$5, this.m(), this.r() + 24, this.t() + (this.g - 8) / 2, 14737632 | ars.f(this.k * 255.0F) << 24);
      }
   }
}
