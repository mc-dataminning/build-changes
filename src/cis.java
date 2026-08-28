import java.lang.reflect.Constructor;
import java.util.Arrays;

public class cis<T extends cim> {
   private static cis<?>[] l = new cis[0];
   public static final cis<cii> a = a(cii.class, "HoldingPattern");
   public static final cis<ciq> b = a(ciq.class, "StrafePlayer");
   public static final cis<cik> c = a(cik.class, "LandingApproach");
   public static final cis<cil> d = a(cil.class, "Landing");
   public static final cis<cir> e = a(cir.class, "Takeoff");
   public static final cis<cio> f = a(cio.class, "SittingFlaming");
   public static final cis<cip> g = a(cip.class, "SittingScanning");
   public static final cis<cin> h = a(cin.class, "SittingAttacking");
   public static final cis<cig> i = a(cig.class, "ChargingPlayer");
   public static final cis<cih> j = a(cih.class, "Dying");
   public static final cis<cij> k = a(cij.class, "Hover");
   private final Class<? extends cim> m;
   private final int n;
   private final String o;

   private cis(int $$0, Class<? extends cim> $$1, String $$2) {
      this.n = $$0;
      this.m = $$1;
      this.o = $$2;
   }

   public cim a(cic $$0) {
      try {
         Constructor<? extends cim> $$1 = this.a();
         return $$1.newInstance($$0);
      } catch (Exception var3) {
         throw new Error(var3);
      }
   }

   protected Constructor<? extends cim> a() throws NoSuchMethodException {
      return this.m.getConstructor(cic.class);
   }

   public int b() {
      return this.n;
   }

   @Override
   public String toString() {
      return this.o + " (#" + this.n + ")";
   }

   public static cis<?> a(int $$0) {
      return $$0 >= 0 && $$0 < l.length ? l[$$0] : a;
   }

   public static int c() {
      return l.length;
   }

   private static <T extends cim> cis<T> a(Class<T> $$0, String $$1) {
      cis<T> $$2 = new cis<>(l.length, $$0, $$1);
      l = Arrays.copyOf(l, l.length + 1);
      l[$$2.b()] = $$2;
      return $$2;
   }
}
