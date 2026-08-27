import java.lang.reflect.Constructor;
import java.util.Arrays;

public class cdv<T extends cdp> {
   private static cdv<?>[] l = new cdv[0];
   public static final cdv<cdl> a = a(cdl.class, "HoldingPattern");
   public static final cdv<cdt> b = a(cdt.class, "StrafePlayer");
   public static final cdv<cdn> c = a(cdn.class, "LandingApproach");
   public static final cdv<cdo> d = a(cdo.class, "Landing");
   public static final cdv<cdu> e = a(cdu.class, "Takeoff");
   public static final cdv<cdr> f = a(cdr.class, "SittingFlaming");
   public static final cdv<cds> g = a(cds.class, "SittingScanning");
   public static final cdv<cdq> h = a(cdq.class, "SittingAttacking");
   public static final cdv<cdj> i = a(cdj.class, "ChargingPlayer");
   public static final cdv<cdk> j = a(cdk.class, "Dying");
   public static final cdv<cdm> k = a(cdm.class, "Hover");
   private final Class<? extends cdp> m;
   private final int n;
   private final String o;

   private cdv(int $$0, Class<? extends cdp> $$1, String $$2) {
      this.n = $$0;
      this.m = $$1;
      this.o = $$2;
   }

   public cdp a(cdf $$0) {
      try {
         Constructor<? extends cdp> $$1 = this.a();
         return $$1.newInstance($$0);
      } catch (Exception var3) {
         throw new Error(var3);
      }
   }

   protected Constructor<? extends cdp> a() throws NoSuchMethodException {
      return this.m.getConstructor(cdf.class);
   }

   public int b() {
      return this.n;
   }

   @Override
   public String toString() {
      return this.o + " (#" + this.n + ")";
   }

   public static cdv<?> a(int $$0) {
      return $$0 >= 0 && $$0 < l.length ? l[$$0] : a;
   }

   public static int c() {
      return l.length;
   }

   private static <T extends cdp> cdv<T> a(Class<T> $$0, String $$1) {
      cdv<T> $$2 = new cdv<>(l.length, $$0, $$1);
      l = Arrays.copyOf(l, l.length + 1);
      l[$$2.b()] = $$2;
      return $$2;
   }
}
