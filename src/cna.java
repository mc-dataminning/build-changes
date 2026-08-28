import java.lang.reflect.Constructor;
import java.util.Arrays;

public class cna<T extends cmu> {
   private static cna<?>[] l = new cna[0];
   public static final cna<cmq> a = a(cmq.class, "HoldingPattern");
   public static final cna<cmy> b = a(cmy.class, "StrafePlayer");
   public static final cna<cms> c = a(cms.class, "LandingApproach");
   public static final cna<cmt> d = a(cmt.class, "Landing");
   public static final cna<cmz> e = a(cmz.class, "Takeoff");
   public static final cna<cmw> f = a(cmw.class, "SittingFlaming");
   public static final cna<cmx> g = a(cmx.class, "SittingScanning");
   public static final cna<cmv> h = a(cmv.class, "SittingAttacking");
   public static final cna<cmo> i = a(cmo.class, "ChargingPlayer");
   public static final cna<cmp> j = a(cmp.class, "Dying");
   public static final cna<cmr> k = a(cmr.class, "Hover");
   private final Class<? extends cmu> m;
   private final int n;
   private final String o;

   private cna(int $$0, Class<? extends cmu> $$1, String $$2) {
      this.n = $$0;
      this.m = $$1;
      this.o = $$2;
   }

   public cmu a(cmk $$0) {
      try {
         Constructor<? extends cmu> $$1 = this.a();
         return $$1.newInstance($$0);
      } catch (Exception var3) {
         throw new Error(var3);
      }
   }

   protected Constructor<? extends cmu> a() throws NoSuchMethodException {
      return this.m.getConstructor(cmk.class);
   }

   public int b() {
      return this.n;
   }

   @Override
   public String toString() {
      return this.o + " (#" + this.n + ")";
   }

   public static cna<?> a(int $$0) {
      return $$0 >= 0 && $$0 < l.length ? l[$$0] : a;
   }

   public static int c() {
      return l.length;
   }

   private static <T extends cmu> cna<T> a(Class<T> $$0, String $$1) {
      cna<T> $$2 = new cna<>(l.length, $$0, $$1);
      l = Arrays.copyOf(l, l.length + 1);
      l[$$2.b()] = $$2;
      return $$2;
   }
}
