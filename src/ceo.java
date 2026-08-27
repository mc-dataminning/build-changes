import java.lang.reflect.Constructor;
import java.util.Arrays;

public class ceo<T extends cei> {
   private static ceo<?>[] l = new ceo[0];
   public static final ceo<cee> a = a(cee.class, "HoldingPattern");
   public static final ceo<cem> b = a(cem.class, "StrafePlayer");
   public static final ceo<ceg> c = a(ceg.class, "LandingApproach");
   public static final ceo<ceh> d = a(ceh.class, "Landing");
   public static final ceo<cen> e = a(cen.class, "Takeoff");
   public static final ceo<cek> f = a(cek.class, "SittingFlaming");
   public static final ceo<cel> g = a(cel.class, "SittingScanning");
   public static final ceo<cej> h = a(cej.class, "SittingAttacking");
   public static final ceo<cec> i = a(cec.class, "ChargingPlayer");
   public static final ceo<ced> j = a(ced.class, "Dying");
   public static final ceo<cef> k = a(cef.class, "Hover");
   private final Class<? extends cei> m;
   private final int n;
   private final String o;

   private ceo(int $$0, Class<? extends cei> $$1, String $$2) {
      this.n = $$0;
      this.m = $$1;
      this.o = $$2;
   }

   public cei a(cdy $$0) {
      try {
         Constructor<? extends cei> $$1 = this.a();
         return $$1.newInstance($$0);
      } catch (Exception var3) {
         throw new Error(var3);
      }
   }

   protected Constructor<? extends cei> a() throws NoSuchMethodException {
      return this.m.getConstructor(cdy.class);
   }

   public int b() {
      return this.n;
   }

   @Override
   public String toString() {
      return this.o + " (#" + this.n + ")";
   }

   public static ceo<?> a(int $$0) {
      return $$0 >= 0 && $$0 < l.length ? l[$$0] : a;
   }

   public static int c() {
      return l.length;
   }

   private static <T extends cei> ceo<T> a(Class<T> $$0, String $$1) {
      ceo<T> $$2 = new ceo<>(l.length, $$0, $$1);
      l = Arrays.copyOf(l, l.length + 1);
      l[$$2.b()] = $$2;
      return $$2;
   }
}
