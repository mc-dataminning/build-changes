import java.lang.reflect.Constructor;
import java.util.Arrays;

public class cbe<T extends cay> {
   private static cbe<?>[] l = new cbe[0];
   public static final cbe<cau> a = a(cau.class, "HoldingPattern");
   public static final cbe<cbc> b = a(cbc.class, "StrafePlayer");
   public static final cbe<caw> c = a(caw.class, "LandingApproach");
   public static final cbe<cax> d = a(cax.class, "Landing");
   public static final cbe<cbd> e = a(cbd.class, "Takeoff");
   public static final cbe<cba> f = a(cba.class, "SittingFlaming");
   public static final cbe<cbb> g = a(cbb.class, "SittingScanning");
   public static final cbe<caz> h = a(caz.class, "SittingAttacking");
   public static final cbe<cas> i = a(cas.class, "ChargingPlayer");
   public static final cbe<cat> j = a(cat.class, "Dying");
   public static final cbe<cav> k = a(cav.class, "Hover");
   private final Class<? extends cay> m;
   private final int n;
   private final String o;

   private cbe(int $$0, Class<? extends cay> $$1, String $$2) {
      this.n = $$0;
      this.m = $$1;
      this.o = $$2;
   }

   public cay a(cao $$0) {
      try {
         Constructor<? extends cay> $$1 = this.a();
         return $$1.newInstance($$0);
      } catch (Exception var3) {
         throw new Error(var3);
      }
   }

   protected Constructor<? extends cay> a() throws NoSuchMethodException {
      return this.m.getConstructor(cao.class);
   }

   public int b() {
      return this.n;
   }

   @Override
   public String toString() {
      return this.o + " (#" + this.n + ")";
   }

   public static cbe<?> a(int $$0) {
      return $$0 >= 0 && $$0 < l.length ? l[$$0] : a;
   }

   public static int c() {
      return l.length;
   }

   private static <T extends cay> cbe<T> a(Class<T> $$0, String $$1) {
      cbe<T> $$2 = new cbe<>(l.length, $$0, $$1);
      l = Arrays.copyOf(l, l.length + 1);
      l[$$2.b()] = $$2;
      return $$2;
   }
}
