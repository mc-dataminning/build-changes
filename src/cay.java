import java.lang.reflect.Constructor;
import java.util.Arrays;

public class cay<T extends cas> {
   private static cay<?>[] l = new cay[0];
   public static final cay<cao> a = a(cao.class, "HoldingPattern");
   public static final cay<caw> b = a(caw.class, "StrafePlayer");
   public static final cay<caq> c = a(caq.class, "LandingApproach");
   public static final cay<car> d = a(car.class, "Landing");
   public static final cay<cax> e = a(cax.class, "Takeoff");
   public static final cay<cau> f = a(cau.class, "SittingFlaming");
   public static final cay<cav> g = a(cav.class, "SittingScanning");
   public static final cay<cat> h = a(cat.class, "SittingAttacking");
   public static final cay<cam> i = a(cam.class, "ChargingPlayer");
   public static final cay<can> j = a(can.class, "Dying");
   public static final cay<cap> k = a(cap.class, "Hover");
   private final Class<? extends cas> m;
   private final int n;
   private final String o;

   private cay(int $$0, Class<? extends cas> $$1, String $$2) {
      this.n = $$0;
      this.m = $$1;
      this.o = $$2;
   }

   public cas a(cai $$0) {
      try {
         Constructor<? extends cas> $$1 = this.a();
         return $$1.newInstance($$0);
      } catch (Exception var3) {
         throw new Error(var3);
      }
   }

   protected Constructor<? extends cas> a() throws NoSuchMethodException {
      return this.m.getConstructor(cai.class);
   }

   public int b() {
      return this.n;
   }

   @Override
   public String toString() {
      return this.o + " (#" + this.n + ")";
   }

   public static cay<?> a(int $$0) {
      return $$0 >= 0 && $$0 < l.length ? l[$$0] : a;
   }

   public static int c() {
      return l.length;
   }

   private static <T extends cas> cay<T> a(Class<T> $$0, String $$1) {
      cay<T> $$2 = new cay<>(l.length, $$0, $$1);
      l = Arrays.copyOf(l, l.length + 1);
      l[$$2.b()] = $$2;
      return $$2;
   }
}
