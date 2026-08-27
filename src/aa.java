import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.datafixers.DSL.TypeReference;
import io.netty.util.ResourceLeakDetector;
import io.netty.util.ResourceLeakDetector.Level;
import java.time.Duration;
import java.util.Set;
import javax.annotation.Nullable;

public class aa {
   @Deprecated
   public static final boolean a = true;
   @Deprecated
   public static final int b = 3817;
   @Deprecated
   public static final String c = "main";
   @Deprecated
   public static final String d = "24w07a";
   @Deprecated
   public static final int e = 766;
   @Deprecated
   public static final int f = 177;
   public static final int g = 3798;
   private static final int bn = 30;
   public static final boolean h = true;
   @Deprecated
   public static final int i = 26;
   @Deprecated
   public static final int j = 32;
   @Deprecated
   public static final int k = 1;
   public static final int l = 1;
   public static final String m = "DataVersion";
   public static final boolean n = false;
   public static final boolean o = false;
   public static final boolean p = false;
   public static final boolean q = false;
   public static final boolean r = false;
   public static final boolean s = false;
   public static final boolean t = false;
   public static final boolean u = false;
   public static final boolean v = false;
   public static final boolean w = false;
   public static final boolean x = false;
   public static final boolean y = false;
   public static final boolean z = false;
   public static final boolean A = false;
   public static final boolean B = false;
   public static final boolean C = false;
   public static final boolean D = false;
   public static final boolean E = false;
   public static final boolean F = false;
   public static final boolean G = false;
   public static final boolean H = false;
   public static final boolean I = false;
   public static final boolean J = false;
   public static final boolean K = false;
   public static final boolean L = false;
   public static final boolean M = false;
   public static final boolean N = false;
   public static final boolean O = false;
   public static final boolean P = false;
   public static final boolean Q = false;
   public static final boolean R = false;
   public static final boolean S = false;
   public static final boolean T = false;
   public static final boolean U = false;
   public static final boolean V = false;
   public static final boolean W = false;
   public static final boolean X = false;
   public static final boolean Y = false;
   public static final boolean Z = false;
   public static final boolean aa = false;
   public static final boolean ab = false;
   public static final boolean ac = false;
   public static final boolean ad = false;
   public static final boolean ae = false;
   public static final boolean af = false;
   public static final boolean ag = false;
   public static final boolean ah = false;
   public static final boolean ai = false;
   public static final boolean aj = false;
   public static final boolean ak = false;
   public static final boolean al = false;
   public static final boolean am = false;
   public static final boolean an = false;
   public static final boolean ao = false;
   public static final boolean ap = false;
   public static final boolean aq = false;
   public static final boolean ar = false;
   public static boolean as = false;
   public static boolean at = false;
   public static final boolean au = false;
   public static final boolean av = false;
   public static final boolean aw = false;
   public static final boolean ax = false;
   public static final boolean ay = false;
   public static final boolean az = false;
   public static final boolean aA = false;
   public static final boolean aB = false;
   public static final boolean aC = false;
   public static final boolean aD = false;
   public static final int aE = 25565;
   public static final boolean aF = false;
   public static final boolean aG = false;
   public static final int aH = 0;
   public static final int aI = 0;
   public static final Level aJ = Level.DISABLED;
   public static final boolean aK = false;
   public static final boolean aL = false;
   public static final boolean aM = false;
   public static final boolean aN = false;
   public static final boolean aO = false;
   public static final boolean aP = false;
   public static final boolean aQ = false;
   public static final boolean aR = false;
   public static final long aS = Duration.ofMillis(300L).toNanos();
   public static final float aT = 3600000.0F;
   public static final boolean aU = false;
   public static boolean aV = true;
   public static boolean aW;
   public static Set<TypeReference> aX = Set.of();
   public static final int aY = 16;
   public static final int aZ = 256;
   public static final int ba = 32500;
   public static final int bb = 2000000;
   public static final int bc = 1000000;
   public static final int bd = 32;
   public static final char[] be = new char[]{'/', '\n', '\r', '\t', '\u0000', '\f', '`', '?', '*', '\\', '<', '>', '|', '"', ':'};
   public static final int bf = 20;
   public static final int bg = 50;
   public static final int bh = 1200;
   public static final int bi = 24000;
   public static final float bj = 1365.3334F;
   public static final float bk = 0.87890625F;
   public static final float bl = 17.578125F;
   public static final int bm = 64;
   @Nullable
   private static ad bo;

   public static boolean a(char $$0) {
      return $$0 != 167 && $$0 >= ' ' && $$0 != 127;
   }

   public static String a(String $$0) {
      return a($$0, false);
   }

   public static String a(String $$0, boolean $$1) {
      StringBuilder $$2 = new StringBuilder();

      for (char $$3 : $$0.toCharArray()) {
         if (a($$3)) {
            $$2.append($$3);
         } else if ($$1 && $$3 == '\n') {
            $$2.append($$3);
         }
      }

      return $$2.toString();
   }

   public static void a(ad $$0) {
      if (bo == null) {
         bo = $$0;
      } else if ($$0 != bo) {
         throw new IllegalStateException("Cannot override the current game version!");
      }
   }

   public static void a() {
      if (bo == null) {
         bo = t.a();
      }
   }

   public static ad b() {
      if (bo == null) {
         throw new IllegalStateException("Game version not set");
      } else {
         return bo;
      }
   }

   public static int c() {
      return 1073742001;
   }

   public static boolean a(cwi $$0) {
      int $$1 = $$0.d();
      int $$2 = $$0.e();
      return !as ? false : $$1 > 8192 || $$1 < 0 || $$2 > 1024 || $$2 < 0;
   }

   public static void d() {
      aX = ayc.t;
   }

   static {
      ResourceLeakDetector.setLevel(aJ);
      CommandSyntaxException.ENABLE_COMMAND_STACK_TRACES = false;
      CommandSyntaxException.BUILT_IN_EXCEPTIONS = new dn();
   }
}
