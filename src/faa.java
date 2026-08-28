import com.google.common.collect.Maps;
import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;

public class faa {
   private static final int a = 32768;
   private final faa.a b;
   private final String c;
   private int d;

   protected faa(faa.a $$0, int $$1, String $$2) {
      this.b = $$0;
      this.d = $$1;
      this.c = $$2;
   }

   public void a(fac $$0) {
      RenderSystem.assertOnRenderThread();
      GlStateManager.glAttachShader($$0.a(), this.c());
   }

   public void a() {
      if (this.d != -1) {
         RenderSystem.assertOnRenderThread();
         GlStateManager.glDeleteShader(this.d);
         this.d = -1;
         this.b.c().remove(this.c);
      }
   }

   public String b() {
      return this.c;
   }

   public static faa a(faa.a $$0, String $$1, InputStream $$2, String $$3, ezt $$4) throws IOException {
      RenderSystem.assertOnRenderThread();
      int $$5 = b($$0, $$1, $$2, $$3, $$4);
      faa $$6 = new faa($$0, $$5, $$1);
      $$0.c().put($$1, $$6);
      return $$6;
   }

   protected static int b(faa.a $$0, String $$1, InputStream $$2, String $$3, ezt $$4) throws IOException {
      String $$5 = IOUtils.toString($$2, StandardCharsets.UTF_8);
      if ($$5 == null) {
         throw new IOException("Could not load program " + $$0.a());
      } else {
         int $$6 = GlStateManager.glCreateShader($$0.d());
         GlStateManager.glShaderSource($$6, $$4.a($$5));
         GlStateManager.glCompileShader($$6);
         if (GlStateManager.glGetShaderi($$6, 35713) == 0) {
            String $$7 = StringUtils.trim(GlStateManager.glGetShaderInfoLog($$6, 32768));
            throw new IOException("Couldn't compile " + $$0.a() + " program (" + $$3 + ", " + $$1 + ") : " + $$7);
         } else {
            return $$6;
         }
      }
   }

   protected int c() {
      return this.d;
   }

   public static enum a {
      a("vertex", ".vsh", 35633),
      b("fragment", ".fsh", 35632);

      private final String c;
      private final String d;
      private final int e;
      private final Map<String, faa> f = Maps.newHashMap();

      private a(final String $$0, final String $$1, final int $$2) {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
      }

      public String a() {
         return this.c;
      }

      public String b() {
         return this.d;
      }

      int d() {
         return this.e;
      }

      public Map<String, faa> c() {
         return this.f;
      }
   }
}
