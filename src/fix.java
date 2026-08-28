import com.mojang.blaze3d.platform.GlConst;
import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.logging.LogUtils;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.apache.commons.lang3.StringUtils;
import org.lwjgl.glfw.GLFW;
import org.lwjgl.opengl.GL;
import org.lwjgl.opengl.GLCapabilities;
import org.slf4j.Logger;

public class fix implements fla {
   private static final Logger a = LogUtils.getLogger();
   private final fkz b;
   @Nullable
   private final fiv c;
   private final fiw d;
   private final int e;
   private final fjg f;
   private final BiFunction<ali, fkw, String> g;
   private final Map<fjp, fja> h = new IdentityHashMap<>();
   private final Map<fix.a, fjb> i = new HashMap<>();
   private final fje j;

   public fix(long $$0, int $$1, boolean $$2, BiFunction<ali, fkw, String> $$3, boolean $$4) {
      GLFW.glfwMakeContextCurrent($$0);
      GLCapabilities $$5 = GL.createCapabilities();
      int $$6 = n();
      GLFW.glfwSetWindowSizeLimits($$0, -1, -1, $$6, $$6);
      this.c = fiv.a($$1, $$2);
      this.d = fiw.a($$5, $$4);
      this.j = fje.a($$5, this.d);
      this.e = $$6;
      if ($$5.GL_ARB_direct_state_access) {
         this.f = new fjf();
      } else {
         this.f = new fjh();
      }

      this.g = $$3;
      this.b = new fiu(this);
   }

   public fiw a() {
      return this.d;
   }

   @Override
   public fkz b() {
      return this.b;
   }

   @Override
   public flh a(@Nullable Supplier<String> $$0, fli $$1, int $$2, int $$3, int $$4) {
      return this.a(this.d.a() && $$0 != null ? $$0.get() : null, $$1, $$2, $$3, $$4);
   }

   @Override
   public flh a(@Nullable String $$0, fli $$1, int $$2, int $$3, int $$4) {
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
         if ($$1 == fli.c) {
            GlStateManager._texParameter(3553, 34892, 0);
         }

         for (int $$6 = 0; $$6 < $$4; $$6++) {
            GlStateManager._texImage2D(
               3553, $$6, GlConst.toGlInternalId($$1), $$2 >> $$6, $$3 >> $$6, 0, GlConst.toGlExternalId($$1), GlConst.toGlType($$1), null
            );
         }

         int $$7 = GlStateManager._getError();
         if ($$7 == 1285) {
            throw new fhs("Could not allocate texture of " + $$2 + "x" + $$3 + " for " + $$0);
         } else if ($$7 != 0) {
            throw new IllegalStateException("OpenGL error " + $$7);
         } else {
            fjc $$8 = new fjc($$0, $$1, $$2, $$3, $$4, $$5);
            this.d.a($$8);
            return $$8;
         }
      }
   }

   @Override
   public fig a(@Nullable Supplier<String> $$0, fie $$1, fif $$2, int $$3) {
      return new fit(this.d, $$0, $$1, $$2, $$3, GlStateManager._glGenBuffers());
   }

   @Override
   public fig a(@Nullable Supplier<String> $$0, fie $$1, fif $$2, ByteBuffer $$3) {
      fit $$4 = new fit(this.d, $$0, $$1, $$2, $$3.remaining(), GlStateManager._glGenBuffers());
      this.b.a($$4, $$3, 0);
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
      return this.c == null ? Collections.emptyList() : this.c.a();
   }

   @Override
   public boolean e() {
      return this.c != null;
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

   private static int n() {
      int $$0 = GlStateManager._getInteger(3379);

      for (int $$1 = Math.max(32768, $$0); $$1 >= 1024; $$1 >>= 1) {
         GlStateManager._texImage2D(32868, 0, 6408, $$1, $$1, 0, 6408, 5121, null);
         int $$2 = GlStateManager._getTexLevelParameter(32868, 0, 4096);
         if ($$2 != 0) {
            return $$1;
         }
      }

      int $$3 = Math.max($$0, 1024);
      a.info("Failed to determine maximum texture size by probing, trying GL_MAX_TEXTURE_SIZE = {}", $$3);
      return $$3;
   }

   @Override
   public int j() {
      return this.e;
   }

   @Override
   public void k() {
      for (fja $$0 : this.h.values()) {
         if ($$0.c() != fiy.b) {
            $$0.c().close();
         }
      }

      this.h.clear();

      for (fjb $$1 : this.i.values()) {
         if ($$1 != fjb.a) {
            $$1.close();
         }
      }

      this.i.clear();
   }

   public fjg l() {
      return this.f;
   }

   protected fja a(fjp $$0) {
      return this.h.computeIfAbsent($$0, $$1 -> this.c($$0, this.g));
   }

   protected fjb a(ali $$0, fkw $$1, gsr $$2, BiFunction<ali, fkw, String> $$3) {
      fix.a $$4 = new fix.a($$0, $$1, $$2);
      return this.i.computeIfAbsent($$4, $$2x -> this.a($$4, $$3));
   }

   public fja a(fjp $$0, @Nullable BiFunction<ali, fkw, String> $$1) {
      BiFunction<ali, fkw, String> $$2 = $$1 == null ? this.g : $$1;
      return this.h.computeIfAbsent($$0, $$2x -> this.c($$0, $$2));
   }

   private fjb a(fix.a $$0, BiFunction<ali, fkw, String> $$1) {
      String $$2 = $$1.apply($$0.a, $$0.b);
      if ($$2 == null) {
         a.error("Couldn't find source for {} shader ({})", $$0.b, $$0.a);
         return fjb.a;
      } else {
         String $$3 = fkn.a($$2, $$0.c);
         int $$4 = GlStateManager.glCreateShader(GlConst.toGl($$0.b));
         GlStateManager.glShaderSource($$4, $$3);
         GlStateManager.glCompileShader($$4);
         if (GlStateManager.glGetShaderi($$4, 35713) == 0) {
            String $$5 = StringUtils.trim(GlStateManager.glGetShaderInfoLog($$4, 32768));
            a.error("Couldn't compile {} shader ({}): {}", new Object[]{$$0.b.a(), $$0.a, $$5});
            return fjb.a;
         } else {
            fjb $$6 = new fjb($$4, $$0.a, $$0.b);
            this.d.a($$6);
            return $$6;
         }
      }
   }

   private fja c(fjp $$0, BiFunction<ali, fkw, String> $$1) {
      fjb $$2 = this.a($$0.n(), fkw.a, $$0.p(), $$1);
      fjb $$3 = this.a($$0.o(), fkw.b, $$0.p(), $$1);
      if ($$2 == fjb.a) {
         a.error("Couldn't compile pipeline {}: vertex shader {} was invalid", $$0.k(), $$0.n());
         return new fja($$0, fiy.b);
      } else if ($$3 == fjb.a) {
         a.error("Couldn't compile pipeline {}: fragment shader {} was invalid", $$0.k(), $$0.o());
         return new fja($$0, fiy.b);
      } else {
         fiy $$4;
         try {
            $$4 = fiy.a($$2, $$3, $$0.l(), $$0.k().toString());
         } catch (gss.b var7) {
            a.error("Couldn't compile program for pipeline {}: {}", $$0.k(), var7);
            return new fja($$0, fiy.b);
         }

         $$4.a($$0.r(), $$0.q());
         this.d.a($$4);
         return new fja($$0, $$4);
      }
   }

   public fje m() {
      return this.j;
   }

   static record a(ali a, fkw b, gsr c) {

      @Override
      public String toString() {
         String $$0 = this.a + " (" + this.b + ")";
         return !this.c.c() ? $$0 + " with " + this.c : $$0;
      }
   }
}
