import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.logging.LogUtils;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.Arrays;
import java.util.List;
import org.joml.Matrix4f;
import org.joml.Vector3f;
import org.lwjgl.system.MemoryUtil;
import org.slf4j.Logger;

public class fjq extends fjn implements AutoCloseable {
   private static final Logger a = LogUtils.getLogger();
   private int b;
   private final fjq.a c;
   private final IntBuffer d;
   private final FloatBuffer e;
   private final String f;

   public fjq(String $$0, fjq.a $$1) {
      this.f = $$0;
      this.c = $$1;
      if ($$1.a()) {
         this.d = MemoryUtil.memAllocInt($$1.i);
         this.e = null;
      } else {
         this.d = null;
         this.e = MemoryUtil.memAllocFloat($$1.i);
      }

      this.b = -1;
   }

   public static int a(int $$0, CharSequence $$1) {
      return GlStateManager._glGetUniformLocation($$0, $$1);
   }

   public static void b(int $$0, int $$1) {
      RenderSystem.glUniform1i($$0, $$1);
   }

   public void a(List<Float> $$0, int $$1) {
      float[] $$2 = new float[Math.max($$1, 16)];
      if ($$0.size() == 1) {
         Arrays.fill($$2, $$0.getFirst().floatValue());
      } else {
         for (int $$3 = 0; $$3 < $$0.size(); $$3++) {
            $$2[$$3] = $$0.get($$3);
         }
      }

      if (this.c.a()) {
         this.b((int)$$2[0], (int)$$2[1], (int)$$2[2]);
      } else {
         this.a(Arrays.copyOfRange($$2, 0, $$1));
      }
   }

   @Override
   public void close() {
      if (this.d != null) {
         MemoryUtil.memFree(this.d);
      }

      if (this.e != null) {
         MemoryUtil.memFree(this.e);
      }
   }

   public void b(int $$0) {
      this.b = $$0;
   }

   public String a() {
      return this.f;
   }

   public fjq.a b() {
      return this.c;
   }

   @Override
   public final void a(float $$0) {
      this.e.position(0);
      this.e.put(0, $$0);
   }

   @Override
   public final void a(float $$0, float $$1) {
      this.e.position(0);
      this.e.put(0, $$0);
      this.e.put(1, $$1);
   }

   @Override
   public final void a(float $$0, float $$1, float $$2) {
      this.e.position(0);
      this.e.put(0, $$0);
      this.e.put(1, $$1);
      this.e.put(2, $$2);
   }

   @Override
   public final void a(Vector3f $$0) {
      this.e.position(0);
      $$0.get(this.e);
   }

   @Override
   public final void a(float $$0, float $$1, float $$2, float $$3) {
      this.e.position(0);
      this.e.put($$0);
      this.e.put($$1);
      this.e.put($$2);
      this.e.put($$3);
      this.e.flip();
   }

   private void b(int $$0, int $$1, int $$2) {
      this.d.position(0);
      if (this.c == fjq.a.a || this.c == fjq.a.b) {
         this.d.put(0, $$0);
      }

      if (this.c == fjq.a.b) {
         this.d.put(1, $$1);
         this.d.put(2, $$2);
      }
   }

   @Override
   public final void a(int $$0) {
      this.d.position(0);
      this.d.put(0, $$0);
   }

   @Override
   public final void a(int $$0, int $$1, int $$2) {
      this.d.position(0);
      this.d.put(0, $$0);
      this.d.put(1, $$1);
      this.d.put(2, $$2);
   }

   @Override
   public final void a(float[] $$0) {
      if ($$0.length < this.c.i) {
         a.warn("Uniform.set called with a too-small value array (expected {}, got {}). Ignoring.", this.c.i, $$0.length);
      } else {
         this.e.position(0);
         this.e.put($$0);
         this.e.position(0);
      }
   }

   @Override
   public final void a(Matrix4f $$0) {
      this.e.position(0);
      $$0.get(this.e);
   }

   public void c() {
      if (this.c.a()) {
         this.c.a(this.b, this.d);
      } else {
         this.c.a(this.b, this.e);
      }
   }

   public static enum a implements bak {
      a(1, "int"),
      b(3, "ivec3"),
      c(1, "float"),
      d(2, "vec2"),
      e(3, "vec3"),
      f(4, "vec4"),
      g(16, "matrix4x4");

      public static final bak.a<fjq.a> h = bak.a(fjq.a::values);
      final int i;
      final String j;

      private a(final int $$0, final String $$1) {
         this.i = $$0;
         this.j = $$1;
      }

      boolean a() {
         return this == a || this == b;
      }

      void a(int $$0, IntBuffer $$1) {
         switch (this) {
            case a:
               RenderSystem.glUniform1($$0, $$1);
               break;
            case b:
               RenderSystem.glUniform3($$0, $$1);
         }
      }

      void a(int $$0, FloatBuffer $$1) {
         switch (this) {
            case c:
               RenderSystem.glUniform1($$0, $$1);
               break;
            case d:
               RenderSystem.glUniform2($$0, $$1);
               break;
            case e:
               RenderSystem.glUniform3($$0, $$1);
               break;
            case f:
               RenderSystem.glUniform4($$0, $$1);
               break;
            case g:
               RenderSystem.glUniformMatrix4($$0, $$1);
         }
      }

      @Override
      public String c() {
         return this.j;
      }
   }
}
