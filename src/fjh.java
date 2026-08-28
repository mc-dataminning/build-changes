import com.mojang.blaze3d.platform.GlStateManager;

public class fjh implements fjg {
   @Override
   public int a() {
      return GlStateManager.glGenFramebuffers();
   }

   @Override
   public void a(int $$0, int $$1, int $$2, int $$3) {
      GlStateManager._glBindFramebuffer(36160, $$0);
      GlStateManager._glFramebufferTexture2D(36160, 36064, 3553, $$1, $$3);
      GlStateManager._glFramebufferTexture2D(36160, 36096, 3553, $$2, $$3);
      GlStateManager._glBindFramebuffer(36160, 0);
   }
}
