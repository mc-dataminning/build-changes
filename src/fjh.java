import com.mojang.blaze3d.platform.GlStateManager;
import org.lwjgl.opengl.ARBDirectStateAccess;

public class fjh implements fji {
   @Override
   public int a() {
      return ARBDirectStateAccess.glCreateFramebuffers();
   }

   @Override
   public void a(int $$0, int $$1, int $$2, int $$3, boolean $$4) {
      ARBDirectStateAccess.glNamedFramebufferTexture($$0, 36064, $$1, $$3);
      ARBDirectStateAccess.glNamedFramebufferTexture($$0, 36096, $$2, $$3);
      if ($$4) {
         GlStateManager._glBindFramebuffer(36160, $$0);
      }
   }
}
