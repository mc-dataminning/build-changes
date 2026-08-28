import com.mojang.blaze3d.opengl.GlConst;
import com.mojang.blaze3d.opengl.GlStateManager;
import com.mojang.blaze3d.shaders.ShaderType;
import com.mojang.blaze3d.systems.RenderSystem;
import org.apache.commons.lang3.StringUtils;

public class fjk implements AutoCloseable {
   private static final int b = -1;
   public static final fjk a = new fjk(-1, alr.b("invalid"), ShaderType.VERTEX);
   private final alr c;
   private int d;
   private final ShaderType e;

   public fjk(int $$0, alr $$1, ShaderType $$2) {
      this.c = $$1;
      this.d = $$0;
      this.e = $$2;
   }

   public static fjk a(alr $$0, ShaderType $$1, String $$2) throws gsf.b {
      RenderSystem.assertOnRenderThread();
      int $$3 = GlStateManager.glCreateShader(GlConst.toGl($$1));
      GlStateManager.glShaderSource($$3, $$2);
      GlStateManager.glCompileShader($$3);
      if (GlStateManager.glGetShaderi($$3, 35713) == 0) {
         String $$4 = StringUtils.trim(GlStateManager.glGetShaderInfoLog($$3, 32768));
         throw new gsf.b("Couldn't compile " + $$1.getName() + " shader (" + $$0 + ") : " + $$4);
      } else {
         return new fjk($$3, $$0, $$1);
      }
   }

   @Override
   public void close() {
      if (this.d == -1) {
         throw new IllegalStateException("Already closed");
      } else {
         RenderSystem.assertOnRenderThread();
         GlStateManager.glDeleteShader(this.d);
         this.d = -1;
      }
   }

   public alr a() {
      return this.c;
   }

   public int b() {
      return this.d;
   }

   public String c() {
      return this.e.idConverter().a(this.c).toString();
   }
}
