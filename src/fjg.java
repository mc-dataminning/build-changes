import com.mojang.blaze3d.buffers.BufferType;
import com.mojang.blaze3d.buffers.BufferUsage;
import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.opengl.GlConst;
import com.mojang.blaze3d.opengl.GlStateManager;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.shaders.ShaderType;
import com.mojang.blaze3d.systems.CommandEncoder;
import com.mojang.blaze3d.systems.GpuDevice;
import com.mojang.blaze3d.textures.GpuTexture;
import com.mojang.blaze3d.textures.TextureFormat;
import com.mojang.logging.LogUtils;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.apache.commons.lang3.StringUtils;
import org.lwjgl.glfw.GLFW;
import org.lwjgl.opengl.GL;
import org.lwjgl.opengl.GLCapabilities;
import org.slf4j.Logger;

public class fjg implements GpuDevice {
   private static final Logger f = LogUtils.getLogger();
   protected static boolean a = true;
   protected static boolean b = true;
   protected static boolean c = true;
   protected static boolean d = true;
   protected static boolean e = true;
   private final CommandEncoder g;
   @Nullable
   private final fje h;
   private final fjf i;
   private final int j;
   private final fjb k;
   private final BiFunction<alr, ShaderType, String> l;
   private final Map<RenderPipeline, fjj> m = new IdentityHashMap<>();
   private final Map<fjg.a, fjk> n = new HashMap<>();
   private final fjn o;
   private final Set<String> p = new HashSet<>();

   public fjg(long $$0, int $$1, boolean $$2, BiFunction<alr, ShaderType, String> $$3, boolean $$4) {
      GLFW.glfwMakeContextCurrent($$0);
      GLCapabilities $$5 = GL.createCapabilities();
      int $$6 = d();
      GLFW.glfwSetWindowSizeLimits($$0, -1, -1, $$6, $$6);
      this.h = fje.a($$1, $$2, this.p);
      this.i = fjf.a($$5, $$4, this.p);
      this.o = fjn.a($$5, this.i, this.p);
      this.k = fjb.a($$5, this.p);
      this.j = $$6;
      this.l = $$3;
      this.g = new fjd(this);
   }

   public fjf a() {
      return this.i;
   }

   @Override
   public CommandEncoder createCommandEncoder() {
      return this.g;
   }

   @Override
   public GpuTexture createTexture(@Nullable Supplier<String> $$0, TextureFormat $$1, int $$2, int $$3, int $$4) {
      return this.createTexture(this.i.a() && $$0 != null ? $$0.get() : null, $$1, $$2, $$3, $$4);
   }

   @Override
   public GpuTexture createTexture(@Nullable String $$0, TextureFormat $$1, int $$2, int $$3, int $$4) {
      if ($$4 < 1) {
         throw new IllegalArgumentException("mipLevels must be at least 1");
      } else {
         GlStateManager.clearGlErrors();
         int $$5 = GlStateManager._genTexture();
         if ($$0 == null) {
            $$0 = String.valueOf($$5);
         }

         GlStateManager._bindTexture($$5);
         GlStateManager._texParameter(3553, 33085, $$4 - 1);
         GlStateManager._texParameter(3553, 33082, 0);
         GlStateManager._texParameter(3553, 33083, $$4 - 1);
         if ($$1.hasDepthAspect()) {
            GlStateManager._texParameter(3553, 34892, 0);
         }

         for (int $$6 = 0; $$6 < $$4; $$6++) {
            GlStateManager._texImage2D(
               3553, $$6, GlConst.toGlInternalId($$1), $$2 >> $$6, $$3 >> $$6, 0, GlConst.toGlExternalId($$1), GlConst.toGlType($$1), null
            );
         }

         int $$7 = GlStateManager._getError();
         if ($$7 == 1285) {
            throw new fie("Could not allocate texture of " + $$2 + "x" + $$3 + " for " + $$0);
         } else if ($$7 != 0) {
            throw new IllegalStateException("OpenGL error " + $$7);
         } else {
            fjl $$8 = new fjl($$0, $$1, $$2, $$3, $$4, $$5);
            this.i.a($$8);
            return $$8;
         }
      }
   }

   @Override
   public GpuBuffer createBuffer(@Nullable Supplier<String> $$0, BufferType $$1, BufferUsage $$2, int $$3) {
      if ($$3 <= 0) {
         throw new IllegalArgumentException("Buffer size must be greater than zero");
      } else {
         return new fjc(this.i, $$0, $$1, $$2, $$3, GlStateManager._glGenBuffers());
      }
   }

   @Override
   public GpuBuffer createBuffer(@Nullable Supplier<String> $$0, BufferType $$1, BufferUsage $$2, ByteBuffer $$3) {
      if (!$$3.hasRemaining()) {
         throw new IllegalArgumentException("Buffer source must not be empty");
      } else {
         fjc $$4 = new fjc(this.i, $$0, $$1, $$2, $$3.remaining(), GlStateManager._glGenBuffers());
         this.g.writeToBuffer($$4, $$3, 0);
         return $$4;
      }
   }

   @Override
   public String getImplementationInformation() {
      return GLFW.glfwGetCurrentContext() == 0L
         ? "NO CONTEXT"
         : GlStateManager._getString(7937) + " GL version " + GlStateManager._getString(7938) + ", " + GlStateManager._getString(7936);
   }

   @Override
   public List<String> getLastDebugMessages() {
      return this.h == null ? Collections.emptyList() : this.h.a();
   }

   @Override
   public boolean isDebuggingEnabled() {
      return this.h != null;
   }

   @Override
   public String getRenderer() {
      return GlStateManager._getString(7937);
   }

   @Override
   public String getVendor() {
      return GlStateManager._getString(7936);
   }

   @Override
   public String getBackendName() {
      return "OpenGL";
   }

   @Override
   public String getVersion() {
      return GlStateManager._getString(7938);
   }

   private static int d() {
      int $$0 = GlStateManager._getInteger(3379);

      for (int $$1 = Math.max(32768, $$0); $$1 >= 1024; $$1 >>= 1) {
         GlStateManager._texImage2D(32868, 0, 6408, $$1, $$1, 0, 6408, 5121, null);
         int $$2 = GlStateManager._getTexLevelParameter(32868, 0, 4096);
         if ($$2 != 0) {
            return $$1;
         }
      }

      int $$3 = Math.max($$0, 1024);
      f.info("Failed to determine maximum texture size by probing, trying GL_MAX_TEXTURE_SIZE = {}", $$3);
      return $$3;
   }

   @Override
   public int getMaxTextureSize() {
      return this.j;
   }

   @Override
   public void clearPipelineCache() {
      for (fjj $$0 : this.m.values()) {
         if ($$0.b() != fjh.b) {
            $$0.b().close();
         }
      }

      this.m.clear();

      for (fjk $$1 : this.n.values()) {
         if ($$1 != fjk.a) {
            $$1.close();
         }
      }

      this.n.clear();
   }

   @Override
   public List<String> getEnabledExtensions() {
      return new ArrayList<>(this.p);
   }

   @Override
   public void close() {
      this.clearPipelineCache();
   }

   public fjb b() {
      return this.k;
   }

   protected fjj a(RenderPipeline $$0) {
      return this.m.computeIfAbsent($$0, $$1 -> this.b($$0, this.l));
   }

   protected fjk a(alr $$0, ShaderType $$1, gse $$2, BiFunction<alr, ShaderType, String> $$3) {
      fjg.a $$4 = new fjg.a($$0, $$1, $$2);
      return this.n.computeIfAbsent($$4, $$2x -> this.a($$4, $$3));
   }

   public fjj a(RenderPipeline $$0, @Nullable BiFunction<alr, ShaderType, String> $$1) {
      BiFunction<alr, ShaderType, String> $$2 = $$1 == null ? this.l : $$1;
      return this.m.computeIfAbsent($$0, $$2x -> this.b($$0, $$2));
   }

   private fjk a(fjg.a $$0, BiFunction<alr, ShaderType, String> $$1) {
      String $$2 = $$1.apply($$0.a, $$0.b);
      if ($$2 == null) {
         f.error("Couldn't find source for {} shader ({})", $$0.b, $$0.a);
         return fjk.a;
      } else {
         String $$3 = fkl.a($$2, $$0.c);
         int $$4 = GlStateManager.glCreateShader(GlConst.toGl($$0.b));
         GlStateManager.glShaderSource($$4, $$3);
         GlStateManager.glCompileShader($$4);
         if (GlStateManager.glGetShaderi($$4, 35713) == 0) {
            String $$5 = StringUtils.trim(GlStateManager.glGetShaderInfoLog($$4, 32768));
            f.error("Couldn't compile {} shader ({}): {}", new Object[]{$$0.b.getName(), $$0.a, $$5});
            return fjk.a;
         } else {
            fjk $$6 = new fjk($$4, $$0.a, $$0.b);
            this.i.a($$6);
            return $$6;
         }
      }
   }

   private fjj b(RenderPipeline $$0, BiFunction<alr, ShaderType, String> $$1) {
      fjk $$2 = this.a($$0.getVertexShader(), ShaderType.VERTEX, $$0.getShaderDefines(), $$1);
      fjk $$3 = this.a($$0.getFragmentShader(), ShaderType.FRAGMENT, $$0.getShaderDefines(), $$1);
      if ($$2 == fjk.a) {
         f.error("Couldn't compile pipeline {}: vertex shader {} was invalid", $$0.getLocation(), $$0.getVertexShader());
         return new fjj($$0, fjh.b);
      } else if ($$3 == fjk.a) {
         f.error("Couldn't compile pipeline {}: fragment shader {} was invalid", $$0.getLocation(), $$0.getFragmentShader());
         return new fjj($$0, fjh.b);
      } else {
         fjh $$4;
         try {
            $$4 = fjh.a($$2, $$3, $$0.getVertexFormat(), $$0.getLocation().toString());
         } catch (gsf.b var7) {
            f.error("Couldn't compile program for pipeline {}: {}", $$0.getLocation(), var7);
            return new fjj($$0, fjh.b);
         }

         $$4.a($$0.getUniforms(), $$0.getSamplers());
         this.i.a($$4);
         return new fjj($$0, $$4);
      }
   }

   public fjn c() {
      return this.o;
   }

   static record a(alr a, ShaderType b, gse c) {

      @Override
      public String toString() {
         String $$0 = this.a + " (" + this.b + ")";
         return !this.c.c() ? $$0 + " with " + this.c : $$0;
      }
   }
}
