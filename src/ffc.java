import com.mojang.blaze3d.systems.RenderSystem;

public class ffc extends ffb {
   public ffc(int $$0, int $$1, boolean $$2) {
      super($$2);
      RenderSystem.assertOnRenderThreadOrInit();
      this.a($$0, $$1);
   }
}
