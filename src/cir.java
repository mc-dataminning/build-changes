import java.lang.reflect.Constructor;
import java.util.Arrays;

public class cir<T extends cil> {
   private static cir<?>[] l = new cir[0];
   public static final cir<cih> a = a(cih.class, "HoldingPattern");
   public static final cir<cip> b = a(cip.class, "StrafePlayer");
   public static final cir<cij> c = a(cij.class, "LandingApproach");
   public static final cir<cik> d = a(cik.class, "Landing");
   public static final cir<ciq> e = a(ciq.class, "Takeoff");
   public static final cir<cin> f = a(cin.class, "SittingFlaming");
   public static final cir<cio> g = a(cio.class, "SittingScanning");
   public static final cir<cim> h = a(cim.class, "SittingAttacking");
   public static final cir<cif> i = a(cif.class, "ChargingPlayer");
   public static final cir<cig> j = a(cig.class, "Dying");
   public static final cir<cii> k = a(cii.class, "Hover");
   private final Class<? extends cil> m;
   private final int n;
   private final String o;

   private cir(int $$0, Class<? extends cil> $$1, String $$2) {
      this.n = $$0;
      this.m = $$1;
      this.o = $$2;
   }

   public cil a(cib $$0) {
      try {
         Constructor<? extends cil> $$1 = this.a();
         return $$1.newInstance($$0);
      } catch (Exception var3) {
         throw new Error(var3);
      }
   }

   protected Constructor<? extends cil> a() throws NoSuchMethodException {
      return this.m.getConstructor(cib.class);
   }

   public int b() {
      return this.n;
   }

   @Override
   public String toString() {
      return this.o + " (#" + this.n + ")";
   }

   public static cir<?> a(int $$0) {
      return $$0 >= 0 && $$0 < l.length ? l[$$0] : a;
   }

   public static int c() {
      return l.length;
   }

   private static <T extends cil> cir<T> a(Class<T> $$0, String $$1) {
      cir<T> $$2 = new cir<>(l.length, $$0, $$1);
      l = Arrays.copyOf(l, l.length + 1);
      l[$$2.b()] = $$2;
      return $$2;
   }
}
