import com.mojang.blaze3d.systems.RenderSystem;

public class ezp extends ezo {
   public ezp(int $$0, int $$1, boolean $$2, boolean $$3) {
      super($$2);
      RenderSystem.assertOnRenderThreadOrInit();
      this.a($$0, $$1, $$3);
   }
}
