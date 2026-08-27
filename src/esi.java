import com.mojang.blaze3d.systems.RenderSystem;

public class esi extends ery {
   private static final aer a = new aer("widget/checkbox_selected_highlighted");
   private static final aer b = new aer("widget/checkbox_selected");
   private static final aer c = new aer("widget/checkbox_highlighted");
   private static final aer d = new aer("widget/checkbox");
   private static final int l = 14737632;
   private boolean m;
   private final boolean n;

   public esi(int $$0, int $$1, int $$2, int $$3, tf $$4, boolean $$5) {
      this($$0, $$1, $$2, $$3, $$4, $$5, true);
   }

   public esi(int $$0, int $$1, int $$2, int $$3, tf $$4, boolean $$5, boolean $$6) {
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
   public void a(evy $$0) {
      $$0.a(evx.a, this.az_());
      if (this.i) {
         if (this.aw_()) {
            $$0.a(evx.d, tf.c("narration.checkbox.usage.focused"));
         } else {
            $$0.a(evx.d, tf.c("narration.checkbox.usage.hovered"));
         }
      }
   }

   @Override
   public void b(erv $$0, int $$1, int $$2, float $$3) {
      eql $$4 = eql.O();
      RenderSystem.enableDepthTest();
      ert $$5 = $$4.h;
      $$0.a(1.0F, 1.0F, 1.0F, this.k);
      RenderSystem.enableBlend();
      aer $$6;
      if (this.m) {
         $$6 = this.aw_() ? a : b;
      } else {
         $$6 = this.aw_() ? c : d;
      }

      $$0.a($$6, this.r(), this.t(), 20, this.g);
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
      if (this.n) {
         $$0.b($$5, this.m(), this.r() + 24, this.t() + (this.g - 8) / 2, 14737632 | arp.f(this.k * 255.0F) << 24);
      }
   }
}
