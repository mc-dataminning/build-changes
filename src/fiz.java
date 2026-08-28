import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import javax.annotation.Nullable;
import org.apache.commons.lang3.StringUtils;

public class fiz implements AutoCloseable {
   private static final int a = -1;
   private final alg b;
   private int c;

   private fiz(int $$0, alg $$1) {
      this.b = $$1;
      this.c = $$0;
   }

   public static fiz a(alg $$0, fiz.a $$1, String $$2) throws gqr.b {
      RenderSystem.assertOnRenderThread();
      int $$3 = GlStateManager.glCreateShader($$1.b());
      GlStateManager.glShaderSource($$3, $$2);
      GlStateManager.glCompileShader($$3);
      if (GlStateManager.glGetShaderi($$3, 35713) == 0) {
         String $$4 = StringUtils.trim(GlStateManager.glGetShaderInfoLog($$3, 32768));
         throw new gqr.b("Couldn't compile " + $$1.a() + " shader (" + $$0 + ") : " + $$4);
      } else {
         return new fiz($$3, $$0);
      }
   }

   @Override
   public void close() {
      if (this.c == -1) {
         throw new IllegalStateException("Already closed");
      } else {
         RenderSystem.assertOnRenderThread();
         GlStateManager.glDeleteShader(this.c);
         this.c = -1;
      }
   }

   public alg a() {
      return this.b;
   }

   public int b() {
      return this.c;
   }

   public static enum a {
      a("vertex", ".vsh", 35633),
      b("fragment", ".fsh", 35632);

      private static final fiz.a[] c = values();
      private final String d;
      private final String e;
      private final int f;

      private a(final String $$0, final String $$1, final int $$2) {
         this.d = $$0;
         this.e = $$1;
         this.f = $$2;
      }

      @Nullable
      public static fiz.a a(alg $$0) {
         for (fiz.a $$1 : c) {
            if ($$0.a().endsWith($$1.e)) {
               return $$1;
            }
         }

         return null;
      }

      public String a() {
         return this.d;
      }

      public int b() {
         return this.f;
      }

      public akz c() {
         return new akz("shaders", this.e);
      }
   }
}
