import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;

public record fif(GlStateManager.SourceFactor h, GlStateManager.DestFactor i, GlStateManager.SourceFactor j, GlStateManager.DestFactor k) {
   public static final fif a = new fif(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE);
   public static final fif b = new fif(
      GlStateManager.SourceFactor.SRC_COLOR, GlStateManager.DestFactor.ONE, GlStateManager.SourceFactor.ZERO, GlStateManager.DestFactor.ONE
   );
   public static final fif c = new fif(
      GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO
   );
   public static final fif d = new fif(
      GlStateManager.SourceFactor.SRC_ALPHA,
      GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA,
      GlStateManager.SourceFactor.ONE,
      GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA
   );
   public static final fif e = new fif(GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ONE);
   public static final fif f = new fif(
      GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO
   );
   public static final fif g = new fif(
      GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, GlStateManager.SourceFactor.ZERO, GlStateManager.DestFactor.ONE
   );

   public fif(GlStateManager.SourceFactor $$0, GlStateManager.DestFactor $$1) {
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
