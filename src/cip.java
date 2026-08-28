import java.lang.reflect.Constructor;
import java.util.Arrays;

public class cip<T extends cij> {
   private static cip<?>[] l = new cip[0];
   public static final cip<cif> a = a(cif.class, "HoldingPattern");
   public static final cip<cin> b = a(cin.class, "StrafePlayer");
   public static final cip<cih> c = a(cih.class, "LandingApproach");
   public static final cip<cii> d = a(cii.class, "Landing");
   public static final cip<cio> e = a(cio.class, "Takeoff");
   public static final cip<cil> f = a(cil.class, "SittingFlaming");
   public static final cip<cim> g = a(cim.class, "SittingScanning");
   public static final cip<cik> h = a(cik.class, "SittingAttacking");
   public static final cip<cid> i = a(cid.class, "ChargingPlayer");
   public static final cip<cie> j = a(cie.class, "Dying");
   public static final cip<cig> k = a(cig.class, "Hover");
   private final Class<? extends cij> m;
   private final int n;
   private final String o;

   private cip(int $$0, Class<? extends cij> $$1, String $$2) {
      this.n = $$0;
      this.m = $$1;
      this.o = $$2;
   }

   public cij a(chz $$0) {
      try {
         Constructor<? extends cij> $$1 = this.a();
         return $$1.newInstance($$0);
      } catch (Exception var3) {
         throw new Error(var3);
      }
   }

   protected Constructor<? extends cij> a() throws NoSuchMethodException {
      return this.m.getConstructor(chz.class);
   }

   public int b() {
      return this.n;
   }

   @Override
   public String toString() {
      return this.o + " (#" + this.n + ")";
   }

   public static cip<?> a(int $$0) {
      return $$0 >= 0 && $$0 < l.length ? l[$$0] : a;
   }

   public static int c() {
      return l.length;
   }

   private static <T extends cij> cip<T> a(Class<T> $$0, String $$1) {
      cip<T> $$2 = new cip<>(l.length, $$0, $$1);
      l = Arrays.copyOf(l, l.length + 1);
      l[$$2.b()] = $$2;
      return $$2;
   }
}
