import java.lang.reflect.Constructor;
import java.util.Arrays;

public class cim<T extends cig> {
   private static cim<?>[] l = new cim[0];
   public static final cim<cic> a = a(cic.class, "HoldingPattern");
   public static final cim<cik> b = a(cik.class, "StrafePlayer");
   public static final cim<cie> c = a(cie.class, "LandingApproach");
   public static final cim<cif> d = a(cif.class, "Landing");
   public static final cim<cil> e = a(cil.class, "Takeoff");
   public static final cim<cii> f = a(cii.class, "SittingFlaming");
   public static final cim<cij> g = a(cij.class, "SittingScanning");
   public static final cim<cih> h = a(cih.class, "SittingAttacking");
   public static final cim<cia> i = a(cia.class, "ChargingPlayer");
   public static final cim<cib> j = a(cib.class, "Dying");
   public static final cim<cid> k = a(cid.class, "Hover");
   private final Class<? extends cig> m;
   private final int n;
   private final String o;

   private cim(int $$0, Class<? extends cig> $$1, String $$2) {
      this.n = $$0;
      this.m = $$1;
      this.o = $$2;
   }

   public cig a(chw $$0) {
      try {
         Constructor<? extends cig> $$1 = this.a();
         return $$1.newInstance($$0);
      } catch (Exception var3) {
         throw new Error(var3);
      }
   }

   protected Constructor<? extends cig> a() throws NoSuchMethodException {
      return this.m.getConstructor(chw.class);
   }

   public int b() {
      return this.n;
   }

   @Override
   public String toString() {
      return this.o + " (#" + this.n + ")";
   }

   public static cim<?> a(int $$0) {
      return $$0 >= 0 && $$0 < l.length ? l[$$0] : a;
   }

   public static int c() {
      return l.length;
   }

   private static <T extends cig> cim<T> a(Class<T> $$0, String $$1) {
      cim<T> $$2 = new cim<>(l.length, $$0, $$1);
      l = Arrays.copyOf(l, l.length + 1);
      l[$$2.b()] = $$2;
      return $$2;
   }
}
