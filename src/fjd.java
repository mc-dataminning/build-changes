import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.logging.LogUtils;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import org.joml.Matrix4f;
import org.joml.Vector3f;
import org.lwjgl.system.MemoryUtil;
import org.slf4j.Logger;

public class fjd extends fis implements AutoCloseable {
   private static final Logger a = LogUtils.getLogger();
   private int b;
   private final fkx c;
   private final IntBuffer d;
   private final FloatBuffer e;
   private final String f;
   private boolean g;

   public fjd(String $$0, fkx $$1) {
      this.f = $$0;
      this.c = $$1;
      if ($$1.b()) {
         this.d = MemoryUtil.memAllocInt($$1.a());
         this.e = null;
      } else {
         this.d = null;
         this.e = MemoryUtil.memAllocFloat($$1.a());
      }

      this.b = -1;
   }

   public static int a(int $$0, CharSequence $$1) {
      return GlStateManager._glGetUniformLocation($$0, $$1);
   }

   public static void b(int $$0, int $$1) {
      GlStateManager._glUniform1i($$0, $$1);
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

   public fkx b() {
      return this.c;
   }

   @Override
   public final void a(float $$0) {
      this.e.position(0);
      this.e.put(0, $$0);
      this.g = true;
   }

   @Override
   public final void a(float $$0, float $$1) {
      this.e.position(0);
      this.e.put(0, $$0);
      this.e.put(1, $$1);
      this.g = true;
   }

   @Override
   public final void a(float $$0, float $$1, float $$2) {
      this.e.position(0);
      this.e.put(0, $$0);
      this.e.put(1, $$1);
      this.e.put(2, $$2);
      this.g = true;
   }

   @Override
   public final void a(Vector3f $$0) {
      this.e.position(0);
      $$0.get(this.e);
      this.g = true;
   }

   @Override
   public final void a(float $$0, float $$1, float $$2, float $$3) {
      this.e.position(0);
      this.e.put($$0);
      this.e.put($$1);
      this.e.put($$2);
      this.e.put($$3);
      this.e.flip();
      this.g = true;
   }

   @Override
   public final void a(int $$0) {
      this.d.position(0);
      this.d.put(0, $$0);
      this.g = true;
   }

   @Override
   public final void a(int $$0, int $$1, int $$2) {
      this.d.position(0);
      this.d.put(0, $$0);
      this.d.put(1, $$1);
      this.d.put(2, $$2);
      this.g = true;
   }

   @Override
   public final void a(float[] $$0) {
      if ($$0.length < this.c.a()) {
         a.warn("Uniform.set called with a too-small value array (expected {}, got {}). Ignoring.", this.c.a(), $$0.length);
      } else {
         this.e.position(0);
         this.e.put($$0);
         this.e.position(0);
         this.g = true;
      }
   }

   @Override
   public final void a(int[] $$0) {
      if ($$0.length < this.c.a()) {
         a.warn("Uniform.set called with a too-small value array (expected {}, got {}). Ignoring.", this.c.a(), $$0.length);
      } else {
         this.d.position(0);
         this.d.put($$0);
         this.d.position(0);
         this.g = true;
      }
   }

   @Override
   public final void a(Matrix4f $$0) {
      this.e.position(0);
      $$0.get(this.e);
      this.g = true;
   }

   public void c() {
      if (this.g) {
         if (this.c.b()) {
            switch (this.c) {
               case a:
                  GlStateManager._glUniform1(this.b, this.d);
                  break;
               case b:
                  GlStateManager._glUniform3(this.b, this.d);
            }
         } else {
            switch (this.c) {
               case c:
                  GlStateManager._glUniform1(this.b, this.e);
                  break;
               case d:
                  GlStateManager._glUniform2(this.b, this.e);
                  break;
               case e:
                  GlStateManager._glUniform3(this.b, this.e);
                  break;
               case f:
                  GlStateManager._glUniform4(this.b, this.e);
                  break;
               case g:
                  GlStateManager._glUniformMatrix4(this.b, this.e);
            }
         }

         this.g = false;
      }
   }
}
