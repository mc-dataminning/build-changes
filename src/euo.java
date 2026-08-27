import com.mojang.blaze3d.systems.RenderSystem;

public class euo extends eue {
   private static final agg a = new agg("widget/checkbox_selected_highlighted");
   private static final agg b = new agg("widget/checkbox_selected");
   private static final agg c = new agg("widget/checkbox_highlighted");
   private static final agg d = new agg("widget/checkbox");
   private static final int l = 14737632;
   private boolean m;
   private final boolean n;

   public euo(int $$0, int $$1, int $$2, int $$3, ur $$4, boolean $$5) {
      this($$0, $$1, $$2, $$3, $$4, $$5, true);
   }

   public euo(int $$0, int $$1, int $$2, int $$3, ur $$4, boolean $$5, boolean $$6) {
      super($$0, $$1, $$2, $$3, $$4);
      this.m = $$5;
      this.n = $$6;
   }

   @Override
   public void b() {
      this.m = !this.m;
   }

   public boolean a() {
      return this.m;
   }

   @Override
   public void a(eyf $$0) {
      $$0.a(eye.a, this.aL_());
      if (this.i) {
         if (this.aI_()) {
            $$0.a(eye.d, ur.c("narration.checkbox.usage.focused"));
         } else {
            $$0.a(eye.d, ur.c("narration.checkbox.usage.hovered"));
         }
      }
   }

   @Override
   public void b(eub $$0, int $$1, int $$2, float $$3) {
      esr $$4 = esr.N();
      RenderSystem.enableDepthTest();
      etz $$5 = $$4.h;
      $$0.a(1.0F, 1.0F, 1.0F, this.k);
      RenderSystem.enableBlend();
      agg $$6;
      if (this.m) {
         $$6 = this.aI_() ? a : b;
      } else {
         $$6 = this.aI_() ? c : d;
      }

      $$0.a($$6, this.p(), this.r(), 20, this.g);
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
      if (this.n) {
         $$0.b($$5, this.l(), this.p() + 24, this.r() + (this.g - 8) / 2, 14737632 | ati.f(this.k * 255.0F) << 24);
      }
   }
}
