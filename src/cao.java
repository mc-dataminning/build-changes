import java.lang.reflect.Constructor;
import java.util.Arrays;

public class cao<T extends cai> {
   private static cao<?>[] l = new cao[0];
   public static final cao<cae> a = a(cae.class, "HoldingPattern");
   public static final cao<cam> b = a(cam.class, "StrafePlayer");
   public static final cao<cag> c = a(cag.class, "LandingApproach");
   public static final cao<cah> d = a(cah.class, "Landing");
   public static final cao<can> e = a(can.class, "Takeoff");
   public static final cao<cak> f = a(cak.class, "SittingFlaming");
   public static final cao<cal> g = a(cal.class, "SittingScanning");
   public static final cao<caj> h = a(caj.class, "SittingAttacking");
   public static final cao<cac> i = a(cac.class, "ChargingPlayer");
   public static final cao<cad> j = a(cad.class, "Dying");
   public static final cao<caf> k = a(caf.class, "Hover");
   private final Class<? extends cai> m;
   private final int n;
   private final String o;

   private cao(int $$0, Class<? extends cai> $$1, String $$2) {
      this.n = $$0;
      this.m = $$1;
      this.o = $$2;
   }

   public cai a(bzy $$0) {
      try {
         Constructor<? extends cai> $$1 = this.a();
         return $$1.newInstance($$0);
      } catch (Exception var3) {
         throw new Error(var3);
      }
   }

   protected Constructor<? extends cai> a() throws NoSuchMethodException {
      return this.m.getConstructor(bzy.class);
   }

   public int b() {
      return this.n;
   }

   @Override
   public String toString() {
      return this.o + " (#" + this.n + ")";
   }

   public static cao<?> a(int $$0) {
      return $$0 >= 0 && $$0 < l.length ? l[$$0] : a;
   }

   public static int c() {
      return l.length;
   }

   private static <T extends cai> cao<T> a(Class<T> $$0, String $$1) {
      cao<T> $$2 = new cao<>(l.length, $$0, $$1);
      l = Arrays.copyOf(l, l.length + 1);
      l[$$2.b()] = $$2;
      return $$2;
   }
}
