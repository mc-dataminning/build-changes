import com.mojang.blaze3d.systems.RenderSystem;

public class fdc extends fdb {
   public fdc(int $$0, int $$1, boolean $$2) {
      super($$2);
      RenderSystem.assertOnRenderThreadOrInit();
      this.a($$0, $$1);
   }
}
