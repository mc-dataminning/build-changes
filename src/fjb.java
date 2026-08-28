import com.mojang.blaze3d.opengl.GlStateManager;
import java.util.Set;
import org.lwjgl.opengl.ARBDirectStateAccess;
import org.lwjgl.opengl.GLCapabilities;

public abstract class fjb {
   public static fjb a(GLCapabilities $$0, Set<String> $$1) {
      if ($$0.GL_ARB_direct_state_access && fjg.e) {
         $$1.add("GL_ARB_direct_state_access");
         return new fjb.a();
      } else {
         return new fjb.b();
      }
   }

   abstract int a();

   abstract void a(int var1, int var2, int var3, int var4, int var5);

   abstract void a(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12);

   static class a extends fjb {
      @Override
      public int a() {
         return ARBDirectStateAccess.glCreateFramebuffers();
      }

      @Override
      public void a(int $$0, int $$1, int $$2, int $$3, int $$4) {
         ARBDirectStateAccess.glNamedFramebufferTexture($$0, 36064, $$1, $$3);
         ARBDirectStateAccess.glNamedFramebufferTexture($$0, 36096, $$2, $$3);
         if ($$4 != 0) {
            GlStateManager._glBindFramebuffer($$4, $$0);
         }
      }

      @Override
      public void a(int $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, int $$8, int $$9, int $$10, int $$11) {
         ARBDirectStateAccess.glBlitNamedFramebuffer($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10, $$11);
      }
   }

   static class b extends fjb {
      @Override
      public int a() {
         return GlStateManager.glGenFramebuffers();
      }

      @Override
      public void a(int $$0, int $$1, int $$2, int $$3, int $$4) {
         int $$5 = $$4 == 0 ? '販' : $$4;
         int $$6 = GlStateManager.getFrameBuffer($$5);
         GlStateManager._glBindFramebuffer($$5, $$0);
         GlStateManager._glFramebufferTexture2D($$5, 36064, 3553, $$1, $$3);
         GlStateManager._glFramebufferTexture2D($$5, 36096, 3553, $$2, $$3);
         if ($$4 == 0) {
            GlStateManager._glBindFramebuffer($$5, $$6);
         }
      }

      @Override
      public void a(int $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, int $$8, int $$9, int $$10, int $$11) {
         int $$12 = GlStateManager.getFrameBuffer(36008);
         int $$13 = GlStateManager.getFrameBuffer(36009);
         GlStateManager._glBindFramebuffer(36008, $$0);
         GlStateManager._glBindFramebuffer(36009, $$1);
         GlStateManager._glBlitFrameBuffer($$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10, $$11);
         GlStateManager._glBindFramebuffer(36008, $$12);
         GlStateManager._glBindFramebuffer(36009, $$13);
      }
   }
}
