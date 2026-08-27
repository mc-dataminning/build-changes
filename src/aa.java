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
   public static final int b = 3681;
   @Deprecated
   public static final String c = "main";
   @Deprecated
   public static final String d = "23w41a";
   @Deprecated
   public static final int e = 764;
   @Deprecated
   public static final int f = 156;
   public static final int g = 3678;
   private static final int bj = 30;
   public static final boolean h = true;
   @Deprecated
   public static final int i = 18;
   @Deprecated
   public static final int j = 20;
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
   public static boolean aq = false;
   public static boolean ar = false;
   public static final boolean as = false;
   public static final boolean at = false;
   public static final boolean au = false;
   public static final boolean av = false;
   public static final boolean aw = false;
   public static final boolean ax = false;
   public static final boolean ay = false;
   public static final boolean az = false;
   public static final boolean aA = false;
   public static final boolean aB = false;
   public static final int aC = 25565;
   public static final boolean aD = false;
   public static final boolean aE = false;
   public static final int aF = 0;
   public static final int aG = 0;
   public static final Level aH = Level.DISABLED;
   public static final boolean aI = false;
   public static final boolean aJ = false;
   public static final boolean aK = false;
   public static final boolean aL = false;
   public static final boolean aM = false;
   public static final boolean aN = false;
   public static final boolean aO = false;
   public static final boolean aP = false;
   public static final long aQ = Duration.ofMillis(300L).toNanos();
   public static final boolean aR = false;
   public static boolean aS = true;
   public static boolean aT;
   public static Set<TypeReference> aU = Set.of();
   public static final int aV = 16;
   public static final int aW = 256;
   public static final int aX = 32500;
   public static final int aY = 1000000;
   public static final int aZ = 32;
   public static final char[] ba = new char[]{'/', '\n', '\r', '\t', '\u0000', '\f', '`', '?', '*', '\\', '<', '>', '|', '"', ':'};
   public static final int bb = 20;
   public static final int bc = 50;
   public static final int bd = 1200;
   public static final int be = 24000;
   public static final float bf = 1365.3334F;
   public static final float bg = 0.87890625F;
   public static final float bh = 17.578125F;
   public static final int bi = 64;
   @Nullable
   private static ad bk;

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
      if (bk == null) {
         bk = $$0;
      } else if ($$0 != bk) {
         throw new IllegalStateException("Cannot override the current game version!");
      }
   }

   public static void a() {
      if (bk == null) {
         bk = t.a();
      }
   }

   public static ad b() {
      if (bk == null) {
         throw new IllegalStateException("Game version not set");
      } else {
         return bk;
      }
   }

   public static int c() {
      return 1073741980;
   }

   public static boolean a(cqg $$0) {
      int $$1 = $$0.d();
      int $$2 = $$0.e();
      return !aq ? false : $$1 > 8192 || $$1 < 0 || $$2 > 1024 || $$2 < 0;
   }

   public static void d() {
      aU = aud.t;
   }

   static {
      ResourceLeakDetector.setLevel(aH);
      CommandSyntaxException.ENABLE_COMMAND_STACK_TRACES = false;
      CommandSyntaxException.BUILT_IN_EXCEPTIONS = new dm();
   }
}
