import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.logging.LogUtils;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import org.joml.Matrix3f;
import org.joml.Matrix4f;
import org.joml.Vector3f;
import org.joml.Vector4f;
import org.lwjgl.system.MemoryUtil;
import org.slf4j.Logger;

public class ekx extends ekp implements AutoCloseable {
   private static final Logger l = LogUtils.getLogger();
   public static final int a = 0;
   public static final int b = 1;
   public static final int c = 2;
   public static final int d = 3;
   public static final int e = 4;
   public static final int f = 5;
   public static final int g = 6;
   public static final int h = 7;
   public static final int i = 8;
   public static final int j = 9;
   public static final int k = 10;
   private static final boolean m = false;
   private int n;
   private final int o;
   private final int p;
   private final IntBuffer q;
   private final FloatBuffer r;
   private final String s;
   private boolean t;
   private final ekw u;

   public ekx(String $$0, int $$1, int $$2, ekw $$3) {
      this.s = $$0;
      this.o = $$2;
      this.p = $$1;
      this.u = $$3;
      if ($$1 <= 3) {
         this.q = MemoryUtil.memAllocInt($$2);
         this.r = null;
      } else {
         this.q = null;
         this.r = MemoryUtil.memAllocFloat($$2);
      }

      this.n = -1;
      this.h();
   }

   public static int a(int $$0, CharSequence $$1) {
      return GlStateManager._glGetUniformLocation($$0, $$1);
   }

   public static void b(int $$0, int $$1) {
      RenderSystem.glUniform1i($$0, $$1);
   }

   public static int b(int $$0, CharSequence $$1) {
      return GlStateManager._glGetAttribLocation($$0, $$1);
   }

   public static void a(int $$0, int $$1, CharSequence $$2) {
      GlStateManager._glBindAttribLocation($$0, $$1, $$2);
   }

   @Override
   public void close() {
      if (this.q != null) {
         MemoryUtil.memFree(this.q);
      }

      if (this.r != null) {
         MemoryUtil.memFree(this.r);
      }
   }

   private void h() {
      this.t = true;
      if (this.u != null) {
         this.u.b();
      }
   }

   public static int a(String $$0) {
      int $$1 = -1;
      if ("int".equals($$0)) {
         $$1 = 0;
      } else if ("float".equals($$0)) {
         $$1 = 4;
      } else if ($$0.startsWith("matrix")) {
         if ($$0.endsWith("2x2")) {
            $$1 = 8;
         } else if ($$0.endsWith("3x3")) {
            $$1 = 9;
         } else if ($$0.endsWith("4x4")) {
            $$1 = 10;
         }
      }

      return $$1;
   }

   public void b(int $$0) {
      this.n = $$0;
   }

   public String a() {
      return this.s;
   }

   @Override
   public final void a(float $$0) {
      this.r.position(0);
      this.r.put(0, $$0);
      this.h();
   }

   @Override
   public final void a(float $$0, float $$1) {
      this.r.position(0);
      this.r.put(0, $$0);
      this.r.put(1, $$1);
      this.h();
   }

   public final void a(int $$0, float $$1) {
      this.r.position(0);
      this.r.put($$0, $$1);
      this.h();
   }

   @Override
   public final void a(float $$0, float $$1, float $$2) {
      this.r.position(0);
      this.r.put(0, $$0);
      this.r.put(1, $$1);
      this.r.put(2, $$2);
      this.h();
   }

   @Override
   public final void a(Vector3f $$0) {
      this.r.position(0);
      $$0.get(this.r);
      this.h();
   }

   @Override
   public final void a(float $$0, float $$1, float $$2, float $$3) {
      this.r.position(0);
      this.r.put($$0);
      this.r.put($$1);
      this.r.put($$2);
      this.r.put($$3);
      this.r.flip();
      this.h();
   }

   @Override
   public final void a(Vector4f $$0) {
      this.r.position(0);
      $$0.get(this.r);
      this.h();
   }

   @Override
   public final void b(float $$0, float $$1, float $$2, float $$3) {
      this.r.position(0);
      if (this.p >= 4) {
         this.r.put(0, $$0);
      }

      if (this.p >= 5) {
         this.r.put(1, $$1);
      }

      if (this.p >= 6) {
         this.r.put(2, $$2);
      }

      if (this.p >= 7) {
         this.r.put(3, $$3);
      }

      this.h();
   }

   @Override
   public final void a(int $$0, int $$1, int $$2, int $$3) {
      this.q.position(0);
      if (this.p >= 0) {
         this.q.put(0, $$0);
      }

      if (this.p >= 1) {
         this.q.put(1, $$1);
      }

      if (this.p >= 2) {
         this.q.put(2, $$2);
      }

      if (this.p >= 3) {
         this.q.put(3, $$3);
      }

      this.h();
   }

   @Override
   public final void a(int $$0) {
      this.q.position(0);
      this.q.put(0, $$0);
      this.h();
   }

   @Override
   public final void a(int $$0, int $$1) {
      this.q.position(0);
      this.q.put(0, $$0);
      this.q.put(1, $$1);
      this.h();
   }

   @Override
   public final void a(int $$0, int $$1, int $$2) {
      this.q.position(0);
      this.q.put(0, $$0);
      this.q.put(1, $$1);
      this.q.put(2, $$2);
      this.h();
   }

   @Override
   public final void b(int $$0, int $$1, int $$2, int $$3) {
      this.q.position(0);
      this.q.put(0, $$0);
      this.q.put(1, $$1);
      this.q.put(2, $$2);
      this.q.put(3, $$3);
      this.h();
   }

   @Override
   public final void a(float[] $$0) {
      if ($$0.length < this.o) {
         l.warn("Uniform.set called with a too-small value array (expected {}, got {}). Ignoring.", this.o, $$0.length);
      } else {
         this.r.position(0);
         this.r.put($$0);
         this.r.position(0);
         this.h();
      }
   }

   @Override
   public final void c(float $$0, float $$1, float $$2, float $$3) {
      this.r.position(0);
      this.r.put(0, $$0);
      this.r.put(1, $$1);
      this.r.put(2, $$2);
      this.r.put(3, $$3);
      this.h();
   }

   @Override
   public final void a(float $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.r.position(0);
      this.r.put(0, $$0);
      this.r.put(1, $$1);
      this.r.put(2, $$2);
      this.r.put(3, $$3);
      this.r.put(4, $$4);
      this.r.put(5, $$5);
      this.h();
   }

   @Override
   public final void a(float $$0, float $$1, float $$2, float $$3, float $$4, float $$5, float $$6, float $$7) {
      this.r.position(0);
      this.r.put(0, $$0);
      this.r.put(1, $$1);
      this.r.put(2, $$2);
      this.r.put(3, $$3);
      this.r.put(4, $$4);
      this.r.put(5, $$5);
      this.r.put(6, $$6);
      this.r.put(7, $$7);
      this.h();
   }

   @Override
   public final void b(float $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.r.position(0);
      this.r.put(0, $$0);
      this.r.put(1, $$1);
      this.r.put(2, $$2);
      this.r.put(3, $$3);
      this.r.put(4, $$4);
      this.r.put(5, $$5);
      this.h();
   }

   @Override
   public final void a(float $$0, float $$1, float $$2, float $$3, float $$4, float $$5, float $$6, float $$7, float $$8) {
      this.r.position(0);
      this.r.put(0, $$0);
      this.r.put(1, $$1);
      this.r.put(2, $$2);
      this.r.put(3, $$3);
      this.r.put(4, $$4);
      this.r.put(5, $$5);
      this.r.put(6, $$6);
      this.r.put(7, $$7);
      this.r.put(8, $$8);
      this.h();
   }

   @Override
   public final void a(float $$0, float $$1, float $$2, float $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9, float $$10, float $$11) {
      this.r.position(0);
      this.r.put(0, $$0);
      this.r.put(1, $$1);
      this.r.put(2, $$2);
      this.r.put(3, $$3);
      this.r.put(4, $$4);
      this.r.put(5, $$5);
      this.r.put(6, $$6);
      this.r.put(7, $$7);
      this.r.put(8, $$8);
      this.r.put(9, $$9);
      this.r.put(10, $$10);
      this.r.put(11, $$11);
      this.h();
   }

   @Override
   public final void b(float $$0, float $$1, float $$2, float $$3, float $$4, float $$5, float $$6, float $$7) {
      this.r.position(0);
      this.r.put(0, $$0);
      this.r.put(1, $$1);
      this.r.put(2, $$2);
      this.r.put(3, $$3);
      this.r.put(4, $$4);
      this.r.put(5, $$5);
      this.r.put(6, $$6);
      this.r.put(7, $$7);
      this.h();
   }

   @Override
   public final void b(float $$0, float $$1, float $$2, float $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9, float $$10, float $$11) {
      this.r.position(0);
      this.r.put(0, $$0);
      this.r.put(1, $$1);
      this.r.put(2, $$2);
      this.r.put(3, $$3);
      this.r.put(4, $$4);
      this.r.put(5, $$5);
      this.r.put(6, $$6);
      this.r.put(7, $$7);
      this.r.put(8, $$8);
      this.r.put(9, $$9);
      this.r.put(10, $$10);
      this.r.put(11, $$11);
      this.h();
   }

   @Override
   public final void a(
      float $$0,
      float $$1,
      float $$2,
      float $$3,
      float $$4,
      float $$5,
      float $$6,
      float $$7,
      float $$8,
      float $$9,
      float $$10,
      float $$11,
      float $$12,
      float $$13,
      float $$14,
      float $$15
   ) {
      this.r.position(0);
      this.r.put(0, $$0);
      this.r.put(1, $$1);
      this.r.put(2, $$2);
      this.r.put(3, $$3);
      this.r.put(4, $$4);
      this.r.put(5, $$5);
      this.r.put(6, $$6);
      this.r.put(7, $$7);
      this.r.put(8, $$8);
      this.r.put(9, $$9);
      this.r.put(10, $$10);
      this.r.put(11, $$11);
      this.r.put(12, $$12);
      this.r.put(13, $$13);
      this.r.put(14, $$14);
      this.r.put(15, $$15);
      this.h();
   }

   @Override
   public final void a(Matrix4f $$0) {
      this.r.position(0);
      $$0.get(this.r);
      this.h();
   }

   @Override
   public final void a(Matrix3f $$0) {
      this.r.position(0);
      $$0.get(this.r);
      this.h();
   }

   public void b() {
      if (!this.t) {
      }

      this.t = false;
      if (this.p <= 3) {
         this.i();
      } else if (this.p <= 7) {
         this.j();
      } else {
         if (this.p > 10) {
            l.warn("Uniform.upload called, but type value ({}) is not a valid type. Ignoring.", this.p);
            return;
         }

         this.k();
      }
   }

   private void i() {
      this.q.rewind();
      switch (this.p) {
         case 0:
            RenderSystem.glUniform1(this.n, this.q);
            break;
         case 1:
            RenderSystem.glUniform2(this.n, this.q);
            break;
         case 2:
            RenderSystem.glUniform3(this.n, this.q);
            break;
         case 3:
            RenderSystem.glUniform4(this.n, this.q);
            break;
         default:
            l.warn("Uniform.upload called, but count value ({}) is  not in the range of 1 to 4. Ignoring.", this.o);
      }
   }

   private void j() {
      this.r.rewind();
      switch (this.p) {
         case 4:
            RenderSystem.glUniform1(this.n, this.r);
            break;
         case 5:
            RenderSystem.glUniform2(this.n, this.r);
            break;
         case 6:
            RenderSystem.glUniform3(this.n, this.r);
            break;
         case 7:
            RenderSystem.glUniform4(this.n, this.r);
            break;
         default:
            l.warn("Uniform.upload called, but count value ({}) is not in the range of 1 to 4. Ignoring.", this.o);
      }
   }

   private void k() {
      this.r.clear();
      switch (this.p) {
         case 8:
            RenderSystem.glUniformMatrix2(this.n, false, this.r);
            break;
         case 9:
            RenderSystem.glUniformMatrix3(this.n, false, this.r);
            break;
         case 10:
            RenderSystem.glUniformMatrix4(this.n, false, this.r);
      }
   }

   public int c() {
      return this.n;
   }

   public int d() {
      return this.o;
   }

   public int e() {
      return this.p;
   }

   public IntBuffer f() {
      return this.q;
   }

   public FloatBuffer g() {
      return this.r;
   }
}
