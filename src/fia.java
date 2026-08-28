import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;

public record fia(GlStateManager.SourceFactor h, GlStateManager.DestFactor i, GlStateManager.SourceFactor j, GlStateManager.DestFactor k) {
   public static final fia a = new fia(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE);
   public static final fia b = new fia(
      GlStateManager.SourceFactor.SRC_COLOR, GlStateManager.DestFactor.ONE, GlStateManager.SourceFactor.ZERO, GlStateManager.DestFactor.ONE
   );
   public static final fia c = new fia(
      GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO
   );
   public static final fia d = new fia(
      GlStateManager.SourceFactor.SRC_ALPHA,
      GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA,
      GlStateManager.SourceFactor.ONE,
      GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA
   );
   public static final fia e = new fia(GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ONE);
   public static final fia f = new fia(
      GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO
   );
   public static final fia g = new fia(
      GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, GlStateManager.SourceFactor.ZERO, GlStateManager.DestFactor.ONE
   );

   public fia(GlStateManager.SourceFactor $$0, GlStateManager.DestFactor $$1) {
      this($$0, $$1, $$0, $$1);
   }

   public void a() {
      RenderSystem.blendFuncSeparate(this.h, this.i, this.j, this.k);
   }

   public GlStateManager.SourceFactor b() {
      return this.h;
   }

   public GlStateManager.DestFactor c() {
      return this.i;
   }

   public GlStateManager.SourceFactor d() {
      return this.j;
   }

   public GlStateManager.DestFactor e() {
      return this.k;
   }
}
