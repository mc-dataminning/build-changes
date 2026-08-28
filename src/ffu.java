import com.mojang.blaze3d.platform.GLX;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;
import org.lwjgl.PointerBuffer;
import org.lwjgl.glfw.Callbacks;
import org.lwjgl.glfw.GLFW;
import org.lwjgl.glfw.GLFWErrorCallback;
import org.lwjgl.glfw.GLFWImage;
import org.lwjgl.glfw.GLFWWindowCloseCallback;
import org.lwjgl.glfw.GLFWImage.Buffer;
import org.lwjgl.opengl.GL;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.util.tinyfd.TinyFileDialogs;
import org.slf4j.Logger;

public final class ffu implements AutoCloseable {
   private static final Logger c = LogUtils.getLogger();
   public static final int a = 320;
   public static final int b = 240;
   private final GLFWErrorCallback d = GLFWErrorCallback.create(this::a);
   private final ffv e;
   private final ffs f;
   private final long g;
   private int h;
   private int i;
   private int j;
   private int k;
   private Optional<fft> l;
   private boolean m;
   private boolean n;
   private int o;
   private int p;
   private int q;
   private int r;
   private int s;
   private int t;
   private int u;
   private int v;
   private double w;
   private String x = "";
   private boolean y;
   private boolean z;
   private boolean A;

   public ffu(ffv $$0, ffs $$1, ffh $$2, @Nullable String $$3, String $$4) {
      this.f = $$1;
      this.u();
      this.a("Pre startup");
      this.e = $$0;
      Optional<fft> $$5 = fft.a($$3);
      if ($$5.isPresent()) {
         this.l = $$5;
      } else if ($$2.c.isPresent() && $$2.d.isPresent()) {
         this.l = Optional.of(new fft($$2.c.getAsInt(), $$2.d.getAsInt(), 8, 8, 8, 60));
      } else {
         this.l = Optional.empty();
      }

      this.n = this.m = $$2.e;
      ffp $$6 = $$1.a(GLFW.glfwGetPrimaryMonitor());
      this.j = this.q = $$2.a > 0 ? $$2.a : 1;
      this.k = this.r = $$2.b > 0 ? $$2.b : 1;
      GLFW.glfwDefaultWindowHints();
      GLFW.glfwWindowHint(139265, 196609);
      GLFW.glfwWindowHint(139275, 221185);
      GLFW.glfwWindowHint(139266, 3);
      GLFW.glfwWindowHint(139267, 2);
      GLFW.glfwWindowHint(139272, 204801);
      GLFW.glfwWindowHint(139270, 1);
      this.g = GLFW.glfwCreateWindow(this.q, this.r, $$4, this.m && $$6 != null ? $$6.f() : 0L, 0L);
      if ($$6 != null) {
         fft $$7 = $$6.a(this.m ? this.l : Optional.empty());
         this.h = this.o = $$6.c() + $$7.a() / 2 - this.q / 2;
         this.i = this.p = $$6.d() + $$7.b() / 2 - this.r / 2;
      } else {
         int[] $$8 = new int[1];
         int[] $$9 = new int[1];
         GLFW.glfwGetWindowPos(this.g, $$8, $$9);
         this.h = this.o = $$8[0];
         this.i = this.p = $$9[0];
      }

      GLFW.glfwMakeContextCurrent(this.g);
      GL.createCapabilities();
      int $$10 = RenderSystem.maxSupportedTextureSize();
      GLFW.glfwSetWindowSizeLimits(this.g, -1, -1, $$10, $$10);
      this.w();
      this.v();
      GLFW.glfwSetFramebufferSizeCallback(this.g, this::b);
      GLFW.glfwSetWindowPosCallback(this.g, this::a);
      GLFW.glfwSetWindowSizeCallback(this.g, this::c);
      GLFW.glfwSetWindowFocusCallback(this.g, this::a);
      GLFW.glfwSetCursorEnterCallback(this.g, this::b);
      GLFW.glfwSetWindowIconifyCallback(this.g, this::c);
   }

   public static String a() {
      int $$0 = GLFW.glfwGetPlatform();

      return switch ($$0) {
         case 0 -> "<error>";
         case 393217 -> "win32";
         case 393218 -> "cocoa";
         case 393219 -> "wayland";
         case 393220 -> "x11";
         case 393221 -> "null";
         default -> String.format(Locale.ROOT, "unknown (%08X)", $$0);
      };
   }

   public int b() {
      RenderSystem.assertOnRenderThread();
      return GLX._getRefreshRate(this);
   }

   public boolean c() {
      return GLX._shouldClose(this);
   }

   public static void a(BiConsumer<Integer, String> $$0) {
      MemoryStack $$1 = MemoryStack.stackPush();

      try {
         PointerBuffer $$2 = $$1.mallocPointer(1);
         int $$3 = GLFW.glfwGetError($$2);
         if ($$3 != 0) {
            long $$4 = $$2.get();
            String $$5 = $$4 == 0L ? "" : MemoryUtil.memUTF8($$4);
            $$0.accept($$3, $$5);
         }
      } catch (Throwable var8) {
         if ($$1 != null) {
            try {
               $$1.close();
            } catch (Throwable var7) {
               var8.addSuppressed(var7);
            }
         }

         throw var8;
      }

      if ($$1 != null) {
         $$1.close();
      }
   }

   public void a(aug $$0, ffl $$1) throws IOException {
      int $$2 = GLFW.glfwGetPlatform();
      switch ($$2) {
         case 393217:
         case 393220:
            List<avn<InputStream>> $$3 = $$1.a($$0);
            List<ByteBuffer> $$4 = new ArrayList<>($$3.size());

            try {
               MemoryStack $$5 = MemoryStack.stackPush();

               try {
                  Buffer $$6 = GLFWImage.malloc($$3.size(), $$5);

                  for (int $$7 = 0; $$7 < $$3.size(); $$7++) {
                     try (ffr $$8 = ffr.a($$3.get($$7).get())) {
                        ByteBuffer $$9 = MemoryUtil.memAlloc($$8.a() * $$8.b() * 4);
                        $$4.add($$9);
                        $$9.asIntBuffer().put($$8.d());
                        $$6.position($$7);
                        $$6.width($$8.a());
                        $$6.height($$8.b());
                        $$6.pixels($$9);
                     }
                  }

                  GLFW.glfwSetWindowIcon(this.g, (Buffer)$$6.position(0));
               } catch (Throwable var21) {
                  if ($$5 != null) {
                     try {
                        $$5.close();
                     } catch (Throwable var18) {
                        var21.addSuppressed(var18);
                     }
                  }

                  throw var21;
               }

               if ($$5 != null) {
                  $$5.close();
               }
               break;
            } finally {
               $$4.forEach(MemoryUtil::memFree);
            }
         case 393218:
            ffo.a($$1.b($$0));
         case 393219:
         case 393221:
            break;
         default:
            c.warn("Not setting icon for unrecognized platform: {}", $$2);
      }
   }

   public void a(String $$0) {
      this.x = $$0;
   }

   private void u() {
      GLFW.glfwSetErrorCallback(ffu::b);
   }

   private static void b(int $$0, long $$1) {
      String $$2 = "GLFW error " + $$0 + ": " + MemoryUtil.memUTF8($$1);
      TinyFileDialogs.tinyfd_messageBox(
         "Minecraft", $$2 + ".\n\nPlease make sure you have up-to-date drivers (see aka.ms/mcdriver for instructions).", "ok", "error", false
      );
      throw new ffu.a($$2);
   }

   public void a(int $$0, long $$1) {
      RenderSystem.assertOnRenderThread();
      String $$2 = MemoryUtil.memUTF8($$1);
      c.error("########## GL ERROR ##########");
      c.error("@ {}", this.x);
      c.error("{}: {}", $$0, $$2);
   }

   public void d() {
      GLFWErrorCallback $$0 = GLFW.glfwSetErrorCallback(this.d);
      if ($$0 != null) {
         $$0.free();
      }
   }

   public void a(boolean $$0) {
      RenderSystem.assertOnRenderThreadOrInit();
      this.z = $$0;
      GLFW.glfwSwapInterval($$0 ? 1 : 0);
   }

   @Override
   public void close() {
      RenderSystem.assertOnRenderThread();
      Callbacks.glfwFreeCallbacks(this.g);
      this.d.close();
      GLFW.glfwDestroyWindow(this.g);
      GLFW.glfwTerminate();
   }

   private void a(long $$0, int $$1, int $$2) {
      this.o = $$1;
      this.p = $$2;
   }

   private void b(long $$0, int $$1, int $$2) {
      if ($$0 == this.g) {
         int $$3 = this.k();
         int $$4 = this.l();
         if ($$1 != 0 && $$2 != 0) {
            this.s = $$1;
            this.t = $$2;
            if (this.k() != $$3 || this.l() != $$4) {
               try {
                  this.e.a();
               } catch (Exception var10) {
                  o $$6 = o.a(var10, "Window resize");
                  p $$7 = $$6.a("Window Dimensions");
                  $$7.a("Old", $$3 + "x" + $$4);
                  $$7.a("New", $$1 + "x" + $$2);
                  throw new z($$6);
               }
            }
         }
      }
   }

   private void v() {
      int[] $$0 = new int[1];
      int[] $$1 = new int[1];
      GLFW.glfwGetFramebufferSize(this.g, $$0, $$1);
      this.s = $$0[0] > 0 ? $$0[0] : 1;
      this.t = $$1[0] > 0 ? $$1[0] : 1;
   }

   private void c(long $$0, int $$1, int $$2) {
      this.q = $$1;
      this.r = $$2;
   }

   private void a(long $$0, boolean $$1) {
      if ($$0 == this.g) {
         this.e.a($$1);
      }
   }

   private void b(long $$0, boolean $$1) {
      if ($$1) {
         this.e.b();
      }
   }

   private void c(long $$0, boolean $$1) {
      this.A = $$1;
   }

   public void a(@Nullable fec $$0) {
      RenderSystem.flipFrame(this.g, $$0);
      if (this.m != this.n) {
         this.n = this.m;
         this.a(this.z, $$0);
      }
   }

   public Optional<fft> e() {
      return this.l;
   }

   public void a(Optional<fft> $$0) {
      boolean $$1 = !$$0.equals(this.l);
      this.l = $$0;
      if ($$1) {
         this.y = true;
      }
   }

   public void f() {
      if (this.m && this.y) {
         this.y = false;
         this.w();
         this.e.a();
      }
   }

   private void w() {
      boolean $$0 = GLFW.glfwGetWindowMonitor(this.g) != 0L;
      if (this.m) {
         ffp $$1 = this.f.a(this);
         if ($$1 == null) {
            c.warn("Failed to find suitable monitor for fullscreen mode");
            this.m = false;
         } else {
            if (ffo.a) {
               ffo.a(this.g);
            }

            fft $$2 = $$1.a(this.l);
            if (!$$0) {
               this.h = this.o;
               this.i = this.p;
               this.j = this.q;
               this.k = this.r;
            }

            this.o = 0;
            this.p = 0;
            this.q = $$2.a();
            this.r = $$2.b();
            GLFW.glfwSetWindowMonitor(this.g, $$1.f(), this.o, this.p, this.q, this.r, $$2.f());
            if (ffo.a) {
               ffo.b(this.g);
            }
         }
      } else {
         this.o = this.h;
         this.p = this.i;
         this.q = this.j;
         this.r = this.k;
         GLFW.glfwSetWindowMonitor(this.g, 0L, this.o, this.p, this.q, this.r, -1);
      }
   }

   public void g() {
      this.m = !this.m;
   }

   public void a(int $$0, int $$1) {
      this.j = $$0;
      this.k = $$1;
      this.m = false;
      this.w();
   }

   private void a(boolean $$0, @Nullable fec $$1) {
      RenderSystem.assertOnRenderThread();

      try {
         this.w();
         this.e.a();
         this.a($$0);
         this.a($$1);
      } catch (Exception var4) {
         c.error("Couldn't toggle fullscreen", var4);
      }
   }

   public int a(int $$0, boolean $$1) {
      int $$2 = 1;

      while ($$2 != $$0 && $$2 < this.s && $$2 < this.t && this.s / ($$2 + 1) >= 320 && this.t / ($$2 + 1) >= 240) {
         $$2++;
      }

      if ($$1 && $$2 % 2 != 0) {
         $$2++;
      }

      return $$2;
   }

   public void a(double $$0) {
      this.w = $$0;
      int $$1 = (int)((double)this.s / $$0);
      this.u = (double)this.s / $$0 > (double)$$1 ? $$1 + 1 : $$1;
      int $$2 = (int)((double)this.t / $$0);
      this.v = (double)this.t / $$0 > (double)$$2 ? $$2 + 1 : $$2;
   }

   public void b(String $$0) {
      GLFW.glfwSetWindowTitle(this.g, $$0);
   }

   public long h() {
      return this.g;
   }

   public boolean i() {
      return this.m;
   }

   public boolean j() {
      return this.A;
   }

   public int k() {
      return this.s;
   }

   public int l() {
      return this.t;
   }

   public void a(int $$0) {
      this.s = $$0;
   }

   public void b(int $$0) {
      this.t = $$0;
   }

   public int m() {
      return this.q;
   }

   public int n() {
      return this.r;
   }

   public int o() {
      return this.u;
   }

   public int p() {
      return this.v;
   }

   public int q() {
      return this.o;
   }

   public int r() {
      return this.p;
   }

   public double s() {
      return this.w;
   }

   @Nullable
   public ffp t() {
      return this.f.a(this);
   }

   public void b(boolean $$0) {
      ffm.a(this.g, $$0);
   }

   public void a(Runnable $$0) {
      GLFWWindowCloseCallback $$1 = GLFW.glfwSetWindowCloseCallback(this.g, $$1x -> $$0.run());
      if ($$1 != null) {
         $$1.free();
      }
   }

   public static class a extends fzy {
      a(String $$0) {
         super($$0);
      }
   }
}
