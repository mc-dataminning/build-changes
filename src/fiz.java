import com.mojang.blaze3d.platform.GlConst;
import com.mojang.blaze3d.platform.GlStateManager;
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

public class fiz implements flc {
   private static final Logger f = LogUtils.getLogger();
   protected static boolean a = true;
   protected static boolean b = true;
   protected static boolean c = true;
   protected static boolean d = true;
   protected static boolean e = true;
   private final flb g;
   @Nullable
   private final fix h;
   private final fiy i;
   private final int j;
   private final fji k;
   private final BiFunction<alk, fky, String> l;
   private final Map<fjr, fjc> m = new IdentityHashMap<>();
   private final Map<fiz.a, fjd> n = new HashMap<>();
   private final fjg o;
   private final Set<String> p = new HashSet<>();

   public fiz(long $$0, int $$1, boolean $$2, BiFunction<alk, fky, String> $$3, boolean $$4) {
      GLFW.glfwMakeContextCurrent($$0);
      GLCapabilities $$5 = GL.createCapabilities();
      int $$6 = o();
      GLFW.glfwSetWindowSizeLimits($$0, -1, -1, $$6, $$6);
      this.h = fix.a($$1, $$2, this.p);
      this.i = fiy.a($$5, $$4, this.p);
      this.o = fjg.a($$5, this.i, this.p);
      this.j = $$6;
      if ($$5.GL_ARB_direct_state_access && e) {
         this.p.add("GL_ARB_direct_state_access");
         this.k = new fjh();
      } else {
         this.k = new fjj();
      }

      this.l = $$3;
      this.g = new fiw(this);
   }

   public fiy a() {
      return this.i;
   }

   @Override
   public flb b() {
      return this.g;
   }

   @Override
   public flj a(@Nullable Supplier<String> $$0, flk $$1, int $$2, int $$3, int $$4) {
      return this.a(this.i.a() && $$0 != null ? $$0.get() : null, $$1, $$2, $$3, $$4);
   }

   @Override
   public flj a(@Nullable String $$0, flk $$1, int $$2, int $$3, int $$4) {
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
         if ($$1.c()) {
            GlStateManager._texParameter(3553, 34892, 0);
         }

         for (int $$6 = 0; $$6 < $$4; $$6++) {
            GlStateManager._texImage2D(
               3553, $$6, GlConst.toGlInternalId($$1), $$2 >> $$6, $$3 >> $$6, 0, GlConst.toGlExternalId($$1), GlConst.toGlType($$1), null
            );
         }

         int $$7 = GlStateManager._getError();
         if ($$7 == 1285) {
            throw new fhu("Could not allocate texture of " + $$2 + "x" + $$3 + " for " + $$0);
         } else if ($$7 != 0) {
            throw new IllegalStateException("OpenGL error " + $$7);
         } else {
            fje $$8 = new fje($$0, $$1, $$2, $$3, $$4, $$5);
            this.i.a($$8);
            return $$8;
         }
      }
   }

   @Override
   public fii a(@Nullable Supplier<String> $$0, fig $$1, fih $$2, int $$3) {
      return new fiv(this.i, $$0, $$1, $$2, $$3, GlStateManager._glGenBuffers());
   }

   @Override
   public fii a(@Nullable Supplier<String> $$0, fig $$1, fih $$2, ByteBuffer $$3) {
      fiv $$4 = new fiv(this.i, $$0, $$1, $$2, $$3.remaining(), GlStateManager._glGenBuffers());
      this.g.a($$4, $$3, 0);
      return $$4;
   }

   @Override
   public String c() {
      return GLFW.glfwGetCurrentContext() == 0L
         ? "NO CONTEXT"
         : GlStateManager._getString(7937) + " GL version " + GlStateManager._getString(7938) + ", " + GlStateManager._getString(7936);
   }

   @Override
   public List<String> d() {
      return this.h == null ? Collections.emptyList() : this.h.a();
   }

   @Override
   public boolean e() {
      return this.h != null;
   }

   @Override
   public String f() {
      return GlStateManager._getString(7937);
   }

   @Override
   public String g() {
      return GlStateManager._getString(7936);
   }

   @Override
   public String h() {
      return "OpenGL";
   }

   @Override
   public String i() {
      return GlStateManager._getString(7938);
   }

   private static int o() {
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
   public int j() {
      return this.j;
   }

   @Override
   public void k() {
      for (fjc $$0 : this.m.values()) {
         if ($$0.c() != fja.b) {
            $$0.c().close();
         }
      }

      this.m.clear();

      for (fjd $$1 : this.n.values()) {
         if ($$1 != fjd.a) {
            $$1.close();
         }
      }

      this.n.clear();
   }

   @Override
   public List<String> l() {
      return new ArrayList<>(this.p);
   }

   public fji m() {
      return this.k;
   }

   protected fjc a(fjr $$0) {
      return this.m.computeIfAbsent($$0, $$1 -> this.c($$0, this.l));
   }

   protected fjd a(alk $$0, fky $$1, gst $$2, BiFunction<alk, fky, String> $$3) {
      fiz.a $$4 = new fiz.a($$0, $$1, $$2);
      return this.n.computeIfAbsent($$4, $$2x -> this.a($$4, $$3));
   }

   public fjc a(fjr $$0, @Nullable BiFunction<alk, fky, String> $$1) {
      BiFunction<alk, fky, String> $$2 = $$1 == null ? this.l : $$1;
      return this.m.computeIfAbsent($$0, $$2x -> this.c($$0, $$2));
   }

   private fjd a(fiz.a $$0, BiFunction<alk, fky, String> $$1) {
      String $$2 = $$1.apply($$0.a, $$0.b);
      if ($$2 == null) {
         f.error("Couldn't find source for {} shader ({})", $$0.b, $$0.a);
         return fjd.a;
      } else {
         String $$3 = fkp.a($$2, $$0.c);
         int $$4 = GlStateManager.glCreateShader(GlConst.toGl($$0.b));
         GlStateManager.glShaderSource($$4, $$3);
         GlStateManager.glCompileShader($$4);
         if (GlStateManager.glGetShaderi($$4, 35713) == 0) {
            String $$5 = StringUtils.trim(GlStateManager.glGetShaderInfoLog($$4, 32768));
            f.error("Couldn't compile {} shader ({}): {}", new Object[]{$$0.b.a(), $$0.a, $$5});
            return fjd.a;
         } else {
            fjd $$6 = new fjd($$4, $$0.a, $$0.b);
            this.i.a($$6);
            return $$6;
         }
      }
   }

   private fjc c(fjr $$0, BiFunction<alk, fky, String> $$1) {
      fjd $$2 = this.a($$0.n(), fky.a, $$0.p(), $$1);
      fjd $$3 = this.a($$0.o(), fky.b, $$0.p(), $$1);
      if ($$2 == fjd.a) {
         f.error("Couldn't compile pipeline {}: vertex shader {} was invalid", $$0.k(), $$0.n());
         return new fjc($$0, fja.b);
      } else if ($$3 == fjd.a) {
         f.error("Couldn't compile pipeline {}: fragment shader {} was invalid", $$0.k(), $$0.o());
         return new fjc($$0, fja.b);
      } else {
         fja $$4;
         try {
            $$4 = fja.a($$2, $$3, $$0.l(), $$0.k().toString());
         } catch (gsu.b var7) {
            f.error("Couldn't compile program for pipeline {}: {}", $$0.k(), var7);
            return new fjc($$0, fja.b);
         }

         $$4.a($$0.r(), $$0.q());
         this.i.a($$4);
         return new fjc($$0, $$4);
      }
   }

   public fjg n() {
      return this.o;
   }

   static record a(alk a, fky b, gst c) {

      @Override
      public String toString() {
         String $$0 = this.a + " (" + this.b + ")";
         return !this.c.c() ? $$0 + " with " + this.c : $$0;
      }
   }
}
