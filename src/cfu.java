import java.lang.reflect.Constructor;
import java.util.Arrays;

public class cfu<T extends cfo> {
   private static cfu<?>[] l = new cfu[0];
   public static final cfu<cfk> a = a(cfk.class, "HoldingPattern");
   public static final cfu<cfs> b = a(cfs.class, "StrafePlayer");
   public static final cfu<cfm> c = a(cfm.class, "LandingApproach");
   public static final cfu<cfn> d = a(cfn.class, "Landing");
   public static final cfu<cft> e = a(cft.class, "Takeoff");
   public static final cfu<cfq> f = a(cfq.class, "SittingFlaming");
   public static final cfu<cfr> g = a(cfr.class, "SittingScanning");
   public static final cfu<cfp> h = a(cfp.class, "SittingAttacking");
   public static final cfu<cfi> i = a(cfi.class, "ChargingPlayer");
   public static final cfu<cfj> j = a(cfj.class, "Dying");
   public static final cfu<cfl> k = a(cfl.class, "Hover");
   private final Class<? extends cfo> m;
   private final int n;
   private final String o;

   private cfu(int $$0, Class<? extends cfo> $$1, String $$2) {
      this.n = $$0;
      this.m = $$1;
      this.o = $$2;
   }

   public cfo a(cfe $$0) {
      try {
         Constructor<? extends cfo> $$1 = this.a();
         return $$1.newInstance($$0);
      } catch (Exception var3) {
         throw new Error(var3);
      }
   }

   protected Constructor<? extends cfo> a() throws NoSuchMethodException {
      return this.m.getConstructor(cfe.class);
   }

   public int b() {
      return this.n;
   }

   @Override
   public String toString() {
      return this.o + " (#" + this.n + ")";
   }

   public static cfu<?> a(int $$0) {
      return $$0 >= 0 && $$0 < l.length ? l[$$0] : a;
   }

   public static int c() {
      return l.length;
   }

   private static <T extends cfo> cfu<T> a(Class<T> $$0, String $$1) {
      cfu<T> $$2 = new cfu<>(l.length, $$0, $$1);
      l = Arrays.copyOf(l, l.length + 1);
      l[$$2.b()] = $$2;
      return $$2;
   }
}
