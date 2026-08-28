import java.lang.reflect.Constructor;
import java.util.Arrays;

public class ciq<T extends cik> {
   private static ciq<?>[] l = new ciq[0];
   public static final ciq<cig> a = a(cig.class, "HoldingPattern");
   public static final ciq<cio> b = a(cio.class, "StrafePlayer");
   public static final ciq<cii> c = a(cii.class, "LandingApproach");
   public static final ciq<cij> d = a(cij.class, "Landing");
   public static final ciq<cip> e = a(cip.class, "Takeoff");
   public static final ciq<cim> f = a(cim.class, "SittingFlaming");
   public static final ciq<cin> g = a(cin.class, "SittingScanning");
   public static final ciq<cil> h = a(cil.class, "SittingAttacking");
   public static final ciq<cie> i = a(cie.class, "ChargingPlayer");
   public static final ciq<cif> j = a(cif.class, "Dying");
   public static final ciq<cih> k = a(cih.class, "Hover");
   private final Class<? extends cik> m;
   private final int n;
   private final String o;

   private ciq(int $$0, Class<? extends cik> $$1, String $$2) {
      this.n = $$0;
      this.m = $$1;
      this.o = $$2;
   }

   public cik a(cia $$0) {
      try {
         Constructor<? extends cik> $$1 = this.a();
         return $$1.newInstance($$0);
      } catch (Exception var3) {
         throw new Error(var3);
      }
   }

   protected Constructor<? extends cik> a() throws NoSuchMethodException {
      return this.m.getConstructor(cia.class);
   }

   public int b() {
      return this.n;
   }

   @Override
   public String toString() {
      return this.o + " (#" + this.n + ")";
   }

   public static ciq<?> a(int $$0) {
      return $$0 >= 0 && $$0 < l.length ? l[$$0] : a;
   }

   public static int c() {
      return l.length;
   }

   private static <T extends cik> ciq<T> a(Class<T> $$0, String $$1) {
      ciq<T> $$2 = new ciq<>(l.length, $$0, $$1);
      l = Arrays.copyOf(l, l.length + 1);
      l[$$2.b()] = $$2;
      return $$2;
   }
}
