import java.lang.reflect.Constructor;
import java.util.Arrays;

public class cio<T extends cii> {
   private static cio<?>[] l = new cio[0];
   public static final cio<cie> a = a(cie.class, "HoldingPattern");
   public static final cio<cim> b = a(cim.class, "StrafePlayer");
   public static final cio<cig> c = a(cig.class, "LandingApproach");
   public static final cio<cih> d = a(cih.class, "Landing");
   public static final cio<cin> e = a(cin.class, "Takeoff");
   public static final cio<cik> f = a(cik.class, "SittingFlaming");
   public static final cio<cil> g = a(cil.class, "SittingScanning");
   public static final cio<cij> h = a(cij.class, "SittingAttacking");
   public static final cio<cic> i = a(cic.class, "ChargingPlayer");
   public static final cio<cid> j = a(cid.class, "Dying");
   public static final cio<cif> k = a(cif.class, "Hover");
   private final Class<? extends cii> m;
   private final int n;
   private final String o;

   private cio(int $$0, Class<? extends cii> $$1, String $$2) {
      this.n = $$0;
      this.m = $$1;
      this.o = $$2;
   }

   public cii a(chy $$0) {
      try {
         Constructor<? extends cii> $$1 = this.a();
         return $$1.newInstance($$0);
      } catch (Exception var3) {
         throw new Error(var3);
      }
   }

   protected Constructor<? extends cii> a() throws NoSuchMethodException {
      return this.m.getConstructor(chy.class);
   }

   public int b() {
      return this.n;
   }

   @Override
   public String toString() {
      return this.o + " (#" + this.n + ")";
   }

   public static cio<?> a(int $$0) {
      return $$0 >= 0 && $$0 < l.length ? l[$$0] : a;
   }

   public static int c() {
      return l.length;
   }

   private static <T extends cii> cio<T> a(Class<T> $$0, String $$1) {
      cio<T> $$2 = new cio<>(l.length, $$0, $$1);
      l = Arrays.copyOf(l, l.length + 1);
      l[$$2.b()] = $$2;
      return $$2;
   }
}
