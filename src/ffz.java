import com.mojang.blaze3d.systems.RenderSystem;

public class ffz extends ffy {
   public ffz(int $$0, int $$1, boolean $$2) {
      super($$2);
      RenderSystem.assertOnRenderThreadOrInit();
      this.a($$0, $$1);
   }
}
