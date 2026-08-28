import com.mojang.blaze3d.platform.GlConst;
import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import org.apache.commons.lang3.StringUtils;

public class fjd implements AutoCloseable {
   private static final int b = -1;
   public static final fjd a = new fjd(-1, alk.b("invalid"), fky.a);
   private final alk c;
   private int d;
   private final fky e;

   public fjd(int $$0, alk $$1, fky $$2) {
      this.c = $$1;
      this.d = $$0;
      this.e = $$2;
   }

   public static fjd a(alk $$0, fky $$1, String $$2) throws gsu.b {
      RenderSystem.assertOnRenderThread();
      int $$3 = GlStateManager.glCreateShader(GlConst.toGl($$1));
      GlStateManager.glShaderSource($$3, $$2);
      GlStateManager.glCompileShader($$3);
      if (GlStateManager.glGetShaderi($$3, 35713) == 0) {
         String $$4 = StringUtils.trim(GlStateManager.glGetShaderInfoLog($$3, 32768));
         throw new gsu.b("Couldn't compile " + $$1.a() + " shader (" + $$0 + ") : " + $$4);
      } else {
         return new fjd($$3, $$0, $$1);
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

   public alk a() {
      return this.c;
   }

   public int b() {
      return this.d;
   }

   public String c() {
      return this.e.b().a(this.c).toString();
   }
}
