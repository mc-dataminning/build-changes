import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.OptionalInt;
import java.util.function.BiFunction;
import javax.annotation.Nullable;
import org.lwjgl.glfw.GLFW;
import org.lwjgl.glfw.GLFWCharModsCallbackI;
import org.lwjgl.glfw.GLFWCursorPosCallbackI;
import org.lwjgl.glfw.GLFWDropCallbackI;
import org.lwjgl.glfw.GLFWKeyCallbackI;
import org.lwjgl.glfw.GLFWMouseButtonCallbackI;
import org.lwjgl.glfw.GLFWScrollCallbackI;

public class elc {
   @Nullable
   private static final MethodHandle bw;
   private static final int bx;
   public static final int a = 48;
   public static final int b = 49;
   public static final int c = 50;
   public static final int d = 51;
   public static final int e = 52;
   public static final int f = 53;
   public static final int g = 54;
   public static final int h = 55;
   public static final int i = 56;
   public static final int j = 57;
   public static final int k = 65;
   public static final int l = 66;
   public static final int m = 67;
   public static final int n = 68;
   public static final int o = 69;
   public static final int p = 70;
   public static final int q = 71;
   public static final int r = 72;
   public static final int s = 73;
   public static final int t = 74;
   public static final int u = 75;
   public static final int v = 76;
   public static final int w = 77;
   public static final int x = 78;
   public static final int y = 79;
   public static final int z = 80;
   public static final int A = 81;
   public static final int B = 82;
   public static final int C = 83;
   public static final int D = 84;
   public static final int E = 85;
   public static final int F = 86;
   public static final int G = 87;
   public static final int H = 88;
   public static final int I = 89;
   public static final int J = 90;
   public static final int K = 290;
   public static final int L = 291;
   public static final int M = 292;
   public static final int N = 293;
   public static final int O = 294;
   public static final int P = 295;
   public static final int Q = 296;
   public static final int R = 297;
   public static final int S = 298;
   public static final int T = 299;
   public static final int U = 300;
   public static final int V = 301;
   public static final int W = 302;
   public static final int X = 303;
   public static final int Y = 304;
   public static final int Z = 305;
   public static final int aa = 306;
   public static final int ab = 307;
   public static final int ac = 308;
   public static final int ad = 309;
   public static final int ae = 310;
   public static final int af = 311;
   public static final int ag = 312;
   public static final int ah = 313;
   public static final int ai = 314;
   public static final int aj = 282;
   public static final int ak = 320;
   public static final int al = 321;
   public static final int am = 322;
   public static final int an = 323;
   public static final int ao = 324;
   public static final int ap = 325;
   public static final int aq = 326;
   public static final int ar = 327;
   public static final int as = 328;
   public static final int at = 329;
   public static final int au = 330;
   public static final int av = 335;
   public static final int aw = 336;
   public static final int ax = 264;
   public static final int ay = 263;
   public static final int az = 262;
   public static final int aA = 265;
   public static final int aB = 334;
   public static final int aC = 39;
   public static final int aD = 92;
   public static final int aE = 44;
   public static final int aF = 61;
   public static final int aG = 96;
   public static final int aH = 91;
   public static final int aI = 45;
   public static final int aJ = 332;
   public static final int aK = 46;
   public static final int aL = 93;
   public static final int aM = 59;
   public static final int aN = 47;
   public static final int aO = 32;
   public static final int aP = 258;
   public static final int aQ = 342;
   public static final int aR = 341;
   public static final int aS = 340;
   public static final int aT = 343;
   public static final int aU = 346;
   public static final int aV = 345;
   public static final int aW = 344;
   public static final int aX = 347;
   public static final int aY = 257;
   public static final int aZ = 256;
   public static final int ba = 259;
   public static final int bb = 261;
   public static final int bc = 269;
   public static final int bd = 268;
   public static final int be = 260;
   public static final int bf = 267;
   public static final int bg = 266;
   public static final int bh = 280;
   public static final int bi = 284;
   public static final int bj = 281;
   public static final int bk = 283;
   public static final int bl = 1;
   public static final int bm = 0;
   public static final int bn = 2;
   public static final int bo = 0;
   public static final int bp = 2;
   public static final int bq = 1;
   public static final int br = 2;
   public static final int bs = 208897;
   public static final int bt = 212995;
   public static final int bu = 212993;
   public static final elc.a bv;

   public static elc.a a(int $$0, int $$1) {
      return $$0 == -1 ? elc.b.b.a($$1) : elc.b.a.a($$0);
   }

   public static elc.a a(String $$0) {
      if (elc.a.e.containsKey($$0)) {
         return elc.a.e.get($$0);
      } else {
         for (elc.b $$1 : elc.b.values()) {
            if ($$0.startsWith($$1.f)) {
               String $$2 = $$0.substring($$1.f.length() + 1);
               int $$3 = Integer.parseInt($$2);
               if ($$1 == elc.b.c) {
                  $$3--;
               }

               return $$1.a($$3);
            }
         }

         throw new IllegalArgumentException("Unknown key name: " + $$0);
      }
   }

   public static boolean a(long $$0, int $$1) {
      return GLFW.glfwGetKey($$0, $$1) == 1;
   }

   public static void a(long $$0, GLFWKeyCallbackI $$1, GLFWCharModsCallbackI $$2) {
      GLFW.glfwSetKeyCallback($$0, $$1);
      GLFW.glfwSetCharModsCallback($$0, $$2);
   }

   public static void a(long $$0, GLFWCursorPosCallbackI $$1, GLFWMouseButtonCallbackI $$2, GLFWScrollCallbackI $$3, GLFWDropCallbackI $$4) {
      GLFW.glfwSetCursorPosCallback($$0, $$1);
      GLFW.glfwSetMouseButtonCallback($$0, $$2);
      GLFW.glfwSetScrollCallback($$0, $$3);
      GLFW.glfwSetDropCallback($$0, $$4);
   }

   public static void a(long $$0, int $$1, double $$2, double $$3) {
      GLFW.glfwSetCursorPos($$0, $$2, $$3);
      GLFW.glfwSetInputMode($$0, 208897, $$1);
   }

   public static boolean a() {
      try {
         return bw != null && (boolean)bw.invokeExact();
      } catch (Throwable var1) {
         throw new RuntimeException(var1);
      }
   }

   public static void a(long $$0, boolean $$1) {
      if (a()) {
         GLFW.glfwSetInputMode($$0, bx, $$1 ? 1 : 0);
      }
   }

   static {
      Lookup $$0 = MethodHandles.lookup();
      MethodType $$1 = MethodType.methodType(boolean.class);
      MethodHandle $$2 = null;
      int $$3 = 0;

      try {
         $$2 = $$0.findStatic(GLFW.class, "glfwRawMouseMotionSupported", $$1);
         MethodHandle $$4 = $$0.findStaticGetter(GLFW.class, "GLFW_RAW_MOUSE_MOTION", int.class);
         $$3 = (int)$$4.invokeExact();
      } catch (NoSuchFieldException | NoSuchMethodException var5) {
      } catch (Throwable var6) {
         throw new RuntimeException(var6);
      }

      bw = $$2;
      bx = $$3;
      bv = elc.b.a.a(-1);
   }

   public static final class a {
      private final String a;
      private final elc.b b;
      private final int c;
      private final ast<ui> d;
      static final Map<String, elc.a> e = Maps.newHashMap();

      a(String $$0, elc.b $$1, int $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = new ast<>(() -> $$1.g.apply($$2, $$0));
         e.put($$0, this);
      }

      public elc.b a() {
         return this.b;
      }

      public int b() {
         return this.c;
      }

      public String c() {
         return this.a;
      }

      public ui d() {
         return this.d.a();
      }

      public OptionalInt e() {
         if (this.c >= 48 && this.c <= 57) {
            return OptionalInt.of(this.c - 48);
         } else {
            return this.c >= 320 && this.c <= 329 ? OptionalInt.of(this.c - 320) : OptionalInt.empty();
         }
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else if ($$0 != null && this.getClass() == $$0.getClass()) {
            elc.a $$1 = (elc.a)$$0;
            return this.c == $$1.c && this.b == $$1.b;
         } else {
            return false;
         }
      }

      @Override
      public int hashCode() {
         return Objects.hash(this.b, this.c);
      }

      @Override
      public String toString() {
         return this.a;
      }
   }

   public static enum b {
      a("key.keyboard", ($$0, $$1) -> {
         if ("key.keyboard.unknown".equals($$1)) {
            return ui.c($$1);
         } else {
            String $$2 = GLFW.glfwGetKeyName($$0, -1);
            return $$2 != null ? ui.b($$2.toUpperCase(Locale.ROOT)) : ui.c($$1);
         }
      }),
      b("scancode", ($$0, $$1) -> {
         String $$2 = GLFW.glfwGetKeyName(-1, $$0);
         return $$2 != null ? ui.b($$2) : ui.c($$1);
      }),
      c("key.mouse", ($$0, $$1) -> ro.a().b($$1) ? ui.c($$1) : ui.a("key.mouse", $$0 + 1));

      private static final String d = "key.keyboard.unknown";
      private final Int2ObjectMap<elc.a> e = new Int2ObjectOpenHashMap();
      final String f;
      final BiFunction<Integer, String, ui> g;

      private static void a(elc.b $$0, String $$1, int $$2) {
         elc.a $$3 = new elc.a($$1, $$0, $$2);
         $$0.e.put($$2, $$3);
      }

      private b(String $$0, BiFunction<Integer, String, ui> $$1) {
         this.f = $$0;
         this.g = $$1;
      }

      public elc.a a(int $$0) {
         return (elc.a)this.e.computeIfAbsent($$0, $$0x -> {
            int $$1 = $$0x;
            if (this == c) {
               $$1 = $$0x + 1;
            }

            String $$2 = this.f + "." + $$1;
            return new elc.a($$2, this, $$0x);
         });
      }

      static {
         a(a, "key.keyboard.unknown", -1);
         a(c, "key.mouse.left", 0);
         a(c, "key.mouse.right", 1);
         a(c, "key.mouse.middle", 2);
         a(c, "key.mouse.4", 3);
         a(c, "key.mouse.5", 4);
         a(c, "key.mouse.6", 5);
         a(c, "key.mouse.7", 6);
         a(c, "key.mouse.8", 7);
         a(a, "key.keyboard.0", 48);
         a(a, "key.keyboard.1", 49);
         a(a, "key.keyboard.2", 50);
         a(a, "key.keyboard.3", 51);
         a(a, "key.keyboard.4", 52);
         a(a, "key.keyboard.5", 53);
         a(a, "key.keyboard.6", 54);
         a(a, "key.keyboard.7", 55);
         a(a, "key.keyboard.8", 56);
         a(a, "key.keyboard.9", 57);
         a(a, "key.keyboard.a", 65);
         a(a, "key.keyboard.b", 66);
         a(a, "key.keyboard.c", 67);
         a(a, "key.keyboard.d", 68);
         a(a, "key.keyboard.e", 69);
         a(a, "key.keyboard.f", 70);
         a(a, "key.keyboard.g", 71);
         a(a, "key.keyboard.h", 72);
         a(a, "key.keyboard.i", 73);
         a(a, "key.keyboard.j", 74);
         a(a, "key.keyboard.k", 75);
         a(a, "key.keyboard.l", 76);
         a(a, "key.keyboard.m", 77);
         a(a, "key.keyboard.n", 78);
         a(a, "key.keyboard.o", 79);
         a(a, "key.keyboard.p", 80);
         a(a, "key.keyboard.q", 81);
         a(a, "key.keyboard.r", 82);
         a(a, "key.keyboard.s", 83);
         a(a, "key.keyboard.t", 84);
         a(a, "key.keyboard.u", 85);
         a(a, "key.keyboard.v", 86);
         a(a, "key.keyboard.w", 87);
         a(a, "key.keyboard.x", 88);
         a(a, "key.keyboard.y", 89);
         a(a, "key.keyboard.z", 90);
         a(a, "key.keyboard.f1", 290);
         a(a, "key.keyboard.f2", 291);
         a(a, "key.keyboard.f3", 292);
         a(a, "key.keyboard.f4", 293);
         a(a, "key.keyboard.f5", 294);
         a(a, "key.keyboard.f6", 295);
         a(a, "key.keyboard.f7", 296);
         a(a, "key.keyboard.f8", 297);
         a(a, "key.keyboard.f9", 298);
         a(a, "key.keyboard.f10", 299);
         a(a, "key.keyboard.f11", 300);
         a(a, "key.keyboard.f12", 301);
         a(a, "key.keyboard.f13", 302);
         a(a, "key.keyboard.f14", 303);
         a(a, "key.keyboard.f15", 304);
         a(a, "key.keyboard.f16", 305);
         a(a, "key.keyboard.f17", 306);
         a(a, "key.keyboard.f18", 307);
         a(a, "key.keyboard.f19", 308);
         a(a, "key.keyboard.f20", 309);
         a(a, "key.keyboard.f21", 310);
         a(a, "key.keyboard.f22", 311);
         a(a, "key.keyboard.f23", 312);
         a(a, "key.keyboard.f24", 313);
         a(a, "key.keyboard.f25", 314);
         a(a, "key.keyboard.num.lock", 282);
         a(a, "key.keyboard.keypad.0", 320);
         a(a, "key.keyboard.keypad.1", 321);
         a(a, "key.keyboard.keypad.2", 322);
         a(a, "key.keyboard.keypad.3", 323);
         a(a, "key.keyboard.keypad.4", 324);
         a(a, "key.keyboard.keypad.5", 325);
         a(a, "key.keyboard.keypad.6", 326);
         a(a, "key.keyboard.keypad.7", 327);
         a(a, "key.keyboard.keypad.8", 328);
         a(a, "key.keyboard.keypad.9", 329);
         a(a, "key.keyboard.keypad.add", 334);
         a(a, "key.keyboard.keypad.decimal", 330);
         a(a, "key.keyboard.keypad.enter", 335);
         a(a, "key.keyboard.keypad.equal", 336);
         a(a, "key.keyboard.keypad.multiply", 332);
         a(a, "key.keyboard.keypad.divide", 331);
         a(a, "key.keyboard.keypad.subtract", 333);
         a(a, "key.keyboard.down", 264);
         a(a, "key.keyboard.left", 263);
         a(a, "key.keyboard.right", 262);
         a(a, "key.keyboard.up", 265);
         a(a, "key.keyboard.apostrophe", 39);
         a(a, "key.keyboard.backslash", 92);
         a(a, "key.keyboard.comma", 44);
         a(a, "key.keyboard.equal", 61);
         a(a, "key.keyboard.grave.accent", 96);
         a(a, "key.keyboard.left.bracket", 91);
         a(a, "key.keyboard.minus", 45);
         a(a, "key.keyboard.period", 46);
         a(a, "key.keyboard.right.bracket", 93);
         a(a, "key.keyboard.semicolon", 59);
         a(a, "key.keyboard.slash", 47);
         a(a, "key.keyboard.space", 32);
         a(a, "key.keyboard.tab", 258);
         a(a, "key.keyboard.left.alt", 342);
         a(a, "key.keyboard.left.control", 341);
         a(a, "key.keyboard.left.shift", 340);
         a(a, "key.keyboard.left.win", 343);
         a(a, "key.keyboard.right.alt", 346);
         a(a, "key.keyboard.right.control", 345);
         a(a, "key.keyboard.right.shift", 344);
         a(a, "key.keyboard.right.win", 347);
         a(a, "key.keyboard.enter", 257);
         a(a, "key.keyboard.escape", 256);
         a(a, "key.keyboard.backspace", 259);
         a(a, "key.keyboard.delete", 261);
         a(a, "key.keyboard.end", 269);
         a(a, "key.keyboard.home", 268);
         a(a, "key.keyboard.insert", 260);
         a(a, "key.keyboard.page.down", 267);
         a(a, "key.keyboard.page.up", 266);
         a(a, "key.keyboard.caps.lock", 280);
         a(a, "key.keyboard.pause", 284);
         a(a, "key.keyboard.scroll.lock", 281);
         a(a, "key.keyboard.menu", 348);
         a(a, "key.keyboard.print.screen", 283);
         a(a, "key.keyboard.world.1", 161);
         a(a, "key.keyboard.world.2", 162);
      }
   }
}
