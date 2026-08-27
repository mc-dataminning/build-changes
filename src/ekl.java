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
import java.util.Locale.Category;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;
import org.lwjgl.PointerBuffer;
import org.lwjgl.glfw.Callbacks;
import org.lwjgl.glfw.GLFW;
import org.lwjgl.glfw.GLFWErrorCallback;
import org.lwjgl.glfw.GLFWImage;
import org.lwjgl.glfw.GLFWImage.Buffer;
import org.lwjgl.opengl.GL;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.util.tinyfd.TinyFileDialogs;
import org.slf4j.Logger;

public final class ekl implements AutoCloseable {
   private static final Logger a = LogUtils.getLogger();
   private final GLFWErrorCallback b = GLFWErrorCallback.create(this::a);
   private final ekm c;
   private final ekj d;
   private final long e;
   private int f;
   private int g;
   private int h;
   private int i;
   private Optional<ekk> j;
   private boolean k;
   private boolean l;
   private int m;
   private int n;
   private int o;
   private int p;
   private int q;
   private int r;
   private int s;
   private int t;
   private double u;
   private String v = "";
   private boolean w;
   private int x;
   private boolean y;

   public ekl(ekm $$0, ekj $$1, ejy $$2, @Nullable String $$3, String $$4) {
      RenderSystem.assertInInitPhase();
      this.d = $$1;
      this.u();
      this.a("Pre startup");
      this.c = $$0;
      Optional<ekk> $$5 = ekk.a($$3);
      if ($$5.isPresent()) {
         this.j = $$5;
      } else if ($$2.c.isPresent() && $$2.d.isPresent()) {
         this.j = Optional.of(new ekk($$2.c.getAsInt(), $$2.d.getAsInt(), 8, 8, 8, 60));
      } else {
         this.j = Optional.empty();
      }

      this.l = this.k = $$2.e;
      ekg $$6 = $$1.a(GLFW.glfwGetPrimaryMonitor());
      this.h = this.o = $$2.a > 0 ? $$2.a : 1;
      this.i = this.p = $$2.b > 0 ? $$2.b : 1;
      GLFW.glfwDefaultWindowHints();
      GLFW.glfwWindowHint(139265, 196609);
      GLFW.glfwWindowHint(139275, 221185);
      GLFW.glfwWindowHint(139266, 3);
      GLFW.glfwWindowHint(139267, 2);
      GLFW.glfwWindowHint(139272, 204801);
      GLFW.glfwWindowHint(139270, 1);
      this.e = GLFW.glfwCreateWindow(this.o, this.p, $$4, this.k && $$6 != null ? $$6.f() : 0L, 0L);
      if ($$6 != null) {
         ekk $$7 = $$6.a(this.k ? this.j : Optional.empty());
         this.f = this.m = $$6.c() + $$7.a() / 2 - this.o / 2;
         this.g = this.n = $$6.d() + $$7.b() / 2 - this.p / 2;
      } else {
         int[] $$8 = new int[1];
         int[] $$9 = new int[1];
         GLFW.glfwGetWindowPos(this.e, $$8, $$9);
         this.f = this.m = $$8[0];
         this.g = this.n = $$9[0];
      }

      GLFW.glfwMakeContextCurrent(this.e);
      Locale $$10 = Locale.getDefault(Category.FORMAT);
      Locale.setDefault(Category.FORMAT, Locale.ROOT);
      GL.createCapabilities();
      Locale.setDefault(Category.FORMAT, $$10);
      this.w();
      this.v();
      GLFW.glfwSetFramebufferSizeCallback(this.e, this::b);
      GLFW.glfwSetWindowPosCallback(this.e, this::a);
      GLFW.glfwSetWindowSizeCallback(this.e, this::c);
      GLFW.glfwSetWindowFocusCallback(this.e, this::a);
      GLFW.glfwSetCursorEnterCallback(this.e, this::b);
   }

   public int a() {
      RenderSystem.assertOnRenderThread();
      return GLX._getRefreshRate(this);
   }

   public boolean b() {
      return GLX._shouldClose(this);
   }

   public static void a(BiConsumer<Integer, String> $$0) {
      RenderSystem.assertInInitPhase();
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

   public void a(aly $$0, ekb $$1) throws IOException {
      RenderSystem.assertInInitPhase();
      int $$2 = GLFW.glfwGetPlatform();
      switch ($$2) {
         case 393217:
         case 393220:
            List<anc<InputStream>> $$3 = $$1.a($$0);
            List<ByteBuffer> $$4 = new ArrayList<>($$3.size());

            try {
               MemoryStack $$5 = MemoryStack.stackPush();

               try {
                  Buffer $$6 = GLFWImage.malloc($$3.size(), $$5);

                  for (int $$7 = 0; $$7 < $$3.size(); $$7++) {
                     try (eki $$8 = eki.a($$3.get($$7).get())) {
                        ByteBuffer $$9 = MemoryUtil.memAlloc($$8.a() * $$8.b() * 4);
                        $$4.add($$9);
                        $$9.asIntBuffer().put($$8.d());
                        $$6.position($$7);
                        $$6.width($$8.a());
                        $$6.height($$8.b());
                        $$6.pixels($$9);
                     }
                  }

                  GLFW.glfwSetWindowIcon(this.e, (Buffer)$$6.position(0));
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
            eke.a($$1.b($$0));
         case 393219:
         case 393221:
            break;
         default:
            a.warn("Not setting icon for unrecognized platform: {}", $$2);
      }
   }

   public void a(String $$0) {
      this.v = $$0;
   }

   private void u() {
      RenderSystem.assertInInitPhase();
      GLFW.glfwSetErrorCallback(ekl::b);
   }

   private static void b(int $$0, long $$1) {
      RenderSystem.assertInInitPhase();
      String $$2 = "GLFW error " + $$0 + ": " + MemoryUtil.memUTF8($$1);
      TinyFileDialogs.tinyfd_messageBox(
         "Minecraft", $$2 + ".\n\nPlease make sure you have up-to-date drivers (see aka.ms/mcdriver for instructions).", "ok", "error", false
      );
      throw new ekl.a($$2);
   }

   public void a(int $$0, long $$1) {
      RenderSystem.assertOnRenderThread();
      String $$2 = MemoryUtil.memUTF8($$1);
      a.error("########## GL ERROR ##########");
      a.error("@ {}", this.v);
      a.error("{}: {}", $$0, $$2);
   }

   public void c() {
      GLFWErrorCallback $$0 = GLFW.glfwSetErrorCallback(this.b);
      if ($$0 != null) {
         $$0.free();
      }
   }

   public void a(boolean $$0) {
      RenderSystem.assertOnRenderThreadOrInit();
      this.y = $$0;
      GLFW.glfwSwapInterval($$0 ? 1 : 0);
   }

   @Override
   public void close() {
      RenderSystem.assertOnRenderThread();
      Callbacks.glfwFreeCallbacks(this.e);
      this.b.close();
      GLFW.glfwDestroyWindow(this.e);
      GLFW.glfwTerminate();
   }

   private void a(long $$0, int $$1, int $$2) {
      this.m = $$1;
      this.n = $$2;
   }

   private void b(long $$0, int $$1, int $$2) {
      if ($$0 == this.e) {
         int $$3 = this.k();
         int $$4 = this.l();
         if ($$1 != 0 && $$2 != 0) {
            this.q = $$1;
            this.r = $$2;
            if (this.k() != $$3 || this.l() != $$4) {
               this.c.a();
            }
         }
      }
   }

   private void v() {
      RenderSystem.assertInInitPhase();
      int[] $$0 = new int[1];
      int[] $$1 = new int[1];
      GLFW.glfwGetFramebufferSize(this.e, $$0, $$1);
      this.q = $$0[0] > 0 ? $$0[0] : 1;
      this.r = $$1[0] > 0 ? $$1[0] : 1;
   }

   private void c(long $$0, int $$1, int $$2) {
      this.o = $$1;
      this.p = $$2;
   }

   private void a(long $$0, boolean $$1) {
      if ($$0 == this.e) {
         this.c.a($$1);
      }
   }

   private void b(long $$0, boolean $$1) {
      if ($$1) {
         this.c.b();
      }
   }

   public void a(int $$0) {
      this.x = $$0;
   }

   public int d() {
      return this.x;
   }

   public void e() {
      RenderSystem.flipFrame(this.e);
      if (this.k != this.l) {
         this.l = this.k;
         this.c(this.y);
      }
   }

   public Optional<ekk> f() {
      return this.j;
   }

   public void a(Optional<ekk> $$0) {
      boolean $$1 = !$$0.equals(this.j);
      this.j = $$0;
      if ($$1) {
         this.w = true;
      }
   }

   public void g() {
      if (this.k && this.w) {
         this.w = false;
         this.w();
         this.c.a();
      }
   }

   private void w() {
      RenderSystem.assertInInitPhase();
      boolean $$0 = GLFW.glfwGetWindowMonitor(this.e) != 0L;
      if (this.k) {
         ekg $$1 = this.d.a(this);
         if ($$1 == null) {
            a.warn("Failed to find suitable monitor for fullscreen mode");
            this.k = false;
         } else {
            if (eqn.a) {
               eke.a(this.e);
            }

            ekk $$2 = $$1.a(this.j);
            if (!$$0) {
               this.f = this.m;
               this.g = this.n;
               this.h = this.o;
               this.i = this.p;
            }

            this.m = 0;
            this.n = 0;
            this.o = $$2.a();
            this.p = $$2.b();
            GLFW.glfwSetWindowMonitor(this.e, $$1.f(), this.m, this.n, this.o, this.p, $$2.f());
         }
      } else {
         this.m = this.f;
         this.n = this.g;
         this.o = this.h;
         this.p = this.i;
         GLFW.glfwSetWindowMonitor(this.e, 0L, this.m, this.n, this.o, this.p, -1);
      }
   }

   public void h() {
      this.k = !this.k;
   }

   public void a(int $$0, int $$1) {
      this.h = $$0;
      this.i = $$1;
      this.k = false;
      this.w();
   }

   private void c(boolean $$0) {
      RenderSystem.assertOnRenderThread();

      try {
         this.w();
         this.c.a();
         this.a($$0);
         this.e();
      } catch (Exception var3) {
         a.error("Couldn't toggle fullscreen", var3);
      }
   }

   public int a(int $$0, boolean $$1) {
      int $$2 = 1;

      while ($$2 != $$0 && $$2 < this.q && $$2 < this.r && this.q / ($$2 + 1) >= 320 && this.r / ($$2 + 1) >= 240) {
         $$2++;
      }

      if ($$1 && $$2 % 2 != 0) {
         $$2++;
      }

      return $$2;
   }

   public void a(double $$0) {
      this.u = $$0;
      int $$1 = (int)((double)this.q / $$0);
      this.s = (double)this.q / $$0 > (double)$$1 ? $$1 + 1 : $$1;
      int $$2 = (int)((double)this.r / $$0);
      this.t = (double)this.r / $$0 > (double)$$2 ? $$2 + 1 : $$2;
   }

   public void b(String $$0) {
      GLFW.glfwSetWindowTitle(this.e, $$0);
   }

   public long i() {
      return this.e;
   }

   public boolean j() {
      return this.k;
   }

   public int k() {
      return this.q;
   }

   public int l() {
      return this.r;
   }

   public void b(int $$0) {
      this.q = $$0;
   }

   public void c(int $$0) {
      this.r = $$0;
   }

   public int m() {
      return this.o;
   }

   public int n() {
      return this.p;
   }

   public int o() {
      return this.s;
   }

   public int p() {
      return this.t;
   }

   public int q() {
      return this.m;
   }

   public int r() {
      return this.n;
   }

   public double s() {
      return this.u;
   }

   @Nullable
   public ekg t() {
      return this.d.a(this);
   }

   public void b(boolean $$0) {
      ekc.a(this.e, $$0);
   }

   public static class a extends fde {
      a(String $$0) {
         super($$0);
      }
   }
}
