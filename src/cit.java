import java.lang.reflect.Constructor;
import java.util.Arrays;

public class cit<T extends cin> {
   private static cit<?>[] l = new cit[0];
   public static final cit<cij> a = a(cij.class, "HoldingPattern");
   public static final cit<cir> b = a(cir.class, "StrafePlayer");
   public static final cit<cil> c = a(cil.class, "LandingApproach");
   public static final cit<cim> d = a(cim.class, "Landing");
   public static final cit<cis> e = a(cis.class, "Takeoff");
   public static final cit<cip> f = a(cip.class, "SittingFlaming");
   public static final cit<ciq> g = a(ciq.class, "SittingScanning");
   public static final cit<cio> h = a(cio.class, "SittingAttacking");
   public static final cit<cih> i = a(cih.class, "ChargingPlayer");
   public static final cit<cii> j = a(cii.class, "Dying");
   public static final cit<cik> k = a(cik.class, "Hover");
   private final Class<? extends cin> m;
   private final int n;
   private final String o;

   private cit(int $$0, Class<? extends cin> $$1, String $$2) {
      this.n = $$0;
      this.m = $$1;
      this.o = $$2;
   }

   public cin a(cid $$0) {
      try {
         Constructor<? extends cin> $$1 = this.a();
         return $$1.newInstance($$0);
      } catch (Exception var3) {
         throw new Error(var3);
      }
   }

   protected Constructor<? extends cin> a() throws NoSuchMethodException {
      return this.m.getConstructor(cid.class);
   }

   public int b() {
      return this.n;
   }

   @Override
   public String toString() {
      return this.o + " (#" + this.n + ")";
   }

   public static cit<?> a(int $$0) {
      return $$0 >= 0 && $$0 < l.length ? l[$$0] : a;
   }

   public static int c() {
      return l.length;
   }

   private static <T extends cin> cit<T> a(Class<T> $$0, String $$1) {
      cit<T> $$2 = new cit<>(l.length, $$0, $$1);
      l = Arrays.copyOf(l, l.length + 1);
      l[$$2.b()] = $$2;
      return $$2;
   }
}
