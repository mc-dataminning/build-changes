import java.lang.reflect.Constructor;
import java.util.Arrays;

public class bzp<T extends bzj> {
   private static bzp<?>[] l = new bzp[0];
   public static final bzp<bzf> a = a(bzf.class, "HoldingPattern");
   public static final bzp<bzn> b = a(bzn.class, "StrafePlayer");
   public static final bzp<bzh> c = a(bzh.class, "LandingApproach");
   public static final bzp<bzi> d = a(bzi.class, "Landing");
   public static final bzp<bzo> e = a(bzo.class, "Takeoff");
   public static final bzp<bzl> f = a(bzl.class, "SittingFlaming");
   public static final bzp<bzm> g = a(bzm.class, "SittingScanning");
   public static final bzp<bzk> h = a(bzk.class, "SittingAttacking");
   public static final bzp<bzd> i = a(bzd.class, "ChargingPlayer");
   public static final bzp<bze> j = a(bze.class, "Dying");
   public static final bzp<bzg> k = a(bzg.class, "Hover");
   private final Class<? extends bzj> m;
   private final int n;
   private final String o;

   private bzp(int $$0, Class<? extends bzj> $$1, String $$2) {
      this.n = $$0;
      this.m = $$1;
      this.o = $$2;
   }

   public bzj a(byz $$0) {
      try {
         Constructor<? extends bzj> $$1 = this.a();
         return $$1.newInstance($$0);
      } catch (Exception var3) {
         throw new Error(var3);
      }
   }

   protected Constructor<? extends bzj> a() throws NoSuchMethodException {
      return this.m.getConstructor(byz.class);
   }

   public int b() {
      return this.n;
   }

   @Override
   public String toString() {
      return this.o + " (#" + this.n + ")";
   }

   public static bzp<?> a(int $$0) {
      return $$0 >= 0 && $$0 < l.length ? l[$$0] : a;
   }

   public static int c() {
      return l.length;
   }

   private static <T extends bzj> bzp<T> a(Class<T> $$0, String $$1) {
      bzp<T> $$2 = new bzp<>(l.length, $$0, $$1);
      l = Arrays.copyOf(l, l.length + 1);
      l[$$2.b()] = $$2;
      return $$2;
   }
}
