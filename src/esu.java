import com.mojang.blaze3d.systems.RenderSystem;

public class esu extends esk {
   private static final aey a = new aey("widget/checkbox_selected_highlighted");
   private static final aey b = new aey("widget/checkbox_selected");
   private static final aey c = new aey("widget/checkbox_highlighted");
   private static final aey d = new aey("widget/checkbox");
   private static final int l = 14737632;
   private boolean m;
   private final boolean n;

   public esu(int $$0, int $$1, int $$2, int $$3, tn $$4, boolean $$5) {
      this($$0, $$1, $$2, $$3, $$4, $$5, true);
   }

   public esu(int $$0, int $$1, int $$2, int $$3, tn $$4, boolean $$5, boolean $$6) {
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
   public void a(ewk $$0) {
      $$0.a(ewj.a, this.aE_());
      if (this.i) {
         if (this.aC_()) {
            $$0.a(ewj.d, tn.c("narration.checkbox.usage.focused"));
         } else {
            $$0.a(ewj.d, tn.c("narration.checkbox.usage.hovered"));
         }
      }
   }

   @Override
   public void b(esh $$0, int $$1, int $$2, float $$3) {
      eqx $$4 = eqx.O();
      RenderSystem.enableDepthTest();
      esf $$5 = $$4.h;
      $$0.a(1.0F, 1.0F, 1.0F, this.k);
      RenderSystem.enableBlend();
      aey $$6;
      if (this.m) {
         $$6 = this.aC_() ? a : b;
      } else {
         $$6 = this.aC_() ? c : d;
      }

      $$0.a($$6, this.r(), this.t(), 20, this.g);
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
      if (this.n) {
         $$0.b($$5, this.m(), this.r() + 24, this.t() + (this.g - 8) / 2, 14737632 | ary.f(this.k * 255.0F) << 24);
      }
   }
}
