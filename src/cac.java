import java.lang.reflect.Constructor;
import java.util.Arrays;

public class cac<T extends bzw> {
   private static cac<?>[] l = new cac[0];
   public static final cac<bzs> a = a(bzs.class, "HoldingPattern");
   public static final cac<caa> b = a(caa.class, "StrafePlayer");
   public static final cac<bzu> c = a(bzu.class, "LandingApproach");
   public static final cac<bzv> d = a(bzv.class, "Landing");
   public static final cac<cab> e = a(cab.class, "Takeoff");
   public static final cac<bzy> f = a(bzy.class, "SittingFlaming");
   public static final cac<bzz> g = a(bzz.class, "SittingScanning");
   public static final cac<bzx> h = a(bzx.class, "SittingAttacking");
   public static final cac<bzq> i = a(bzq.class, "ChargingPlayer");
   public static final cac<bzr> j = a(bzr.class, "Dying");
   public static final cac<bzt> k = a(bzt.class, "Hover");
   private final Class<? extends bzw> m;
   private final int n;
   private final String o;

   private cac(int $$0, Class<? extends bzw> $$1, String $$2) {
      this.n = $$0;
      this.m = $$1;
      this.o = $$2;
   }

   public bzw a(bzm $$0) {
      try {
         Constructor<? extends bzw> $$1 = this.a();
         return $$1.newInstance($$0);
      } catch (Exception var3) {
         throw new Error(var3);
      }
   }

   protected Constructor<? extends bzw> a() throws NoSuchMethodException {
      return this.m.getConstructor(bzm.class);
   }

   public int b() {
      return this.n;
   }

   @Override
   public String toString() {
      return this.o + " (#" + this.n + ")";
   }

   public static cac<?> a(int $$0) {
      return $$0 >= 0 && $$0 < l.length ? l[$$0] : a;
   }

   public static int c() {
      return l.length;
   }

   private static <T extends bzw> cac<T> a(Class<T> $$0, String $$1) {
      cac<T> $$2 = new cac<>(l.length, $$0, $$1);
      l = Arrays.copyOf(l, l.length + 1);
      l[$$2.b()] = $$2;
      return $$2;
   }
}
