import com.mojang.blaze3d.systems.RenderSystem;

public class eom extends eol {
   public eom(int $$0, int $$1, boolean $$2, boolean $$3) {
      super($$2);
      RenderSystem.assertOnRenderThreadOrInit();
      this.a($$0, $$1, $$3);
   }
}
