import java.lang.reflect.Constructor;
import java.util.Arrays;

public class bzx<T extends bzr> {
   private static bzx<?>[] l = new bzx[0];
   public static final bzx<bzn> a = a(bzn.class, "HoldingPattern");
   public static final bzx<bzv> b = a(bzv.class, "StrafePlayer");
   public static final bzx<bzp> c = a(bzp.class, "LandingApproach");
   public static final bzx<bzq> d = a(bzq.class, "Landing");
   public static final bzx<bzw> e = a(bzw.class, "Takeoff");
   public static final bzx<bzt> f = a(bzt.class, "SittingFlaming");
   public static final bzx<bzu> g = a(bzu.class, "SittingScanning");
   public static final bzx<bzs> h = a(bzs.class, "SittingAttacking");
   public static final bzx<bzl> i = a(bzl.class, "ChargingPlayer");
   public static final bzx<bzm> j = a(bzm.class, "Dying");
   public static final bzx<bzo> k = a(bzo.class, "Hover");
   private final Class<? extends bzr> m;
   private final int n;
   private final String o;

   private bzx(int $$0, Class<? extends bzr> $$1, String $$2) {
      this.n = $$0;
      this.m = $$1;
      this.o = $$2;
   }

   public bzr a(bzh $$0) {
      try {
         Constructor<? extends bzr> $$1 = this.a();
         return $$1.newInstance($$0);
      } catch (Exception var3) {
         throw new Error(var3);
      }
   }

   protected Constructor<? extends bzr> a() throws NoSuchMethodException {
      return this.m.getConstructor(bzh.class);
   }

   public int b() {
      return this.n;
   }

   @Override
   public String toString() {
      return this.o + " (#" + this.n + ")";
   }

   public static bzx<?> a(int $$0) {
      return $$0 >= 0 && $$0 < l.length ? l[$$0] : a;
   }

   public static int c() {
      return l.length;
   }

   private static <T extends bzr> bzx<T> a(Class<T> $$0, String $$1) {
      bzx<T> $$2 = new bzx<>(l.length, $$0, $$1);
      l = Arrays.copyOf(l, l.length + 1);
      l[$$2.b()] = $$2;
      return $$2;
   }
}
