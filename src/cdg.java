import java.lang.reflect.Constructor;
import java.util.Arrays;

public class cdg<T extends cda> {
   private static cdg<?>[] l = new cdg[0];
   public static final cdg<ccw> a = a(ccw.class, "HoldingPattern");
   public static final cdg<cde> b = a(cde.class, "StrafePlayer");
   public static final cdg<ccy> c = a(ccy.class, "LandingApproach");
   public static final cdg<ccz> d = a(ccz.class, "Landing");
   public static final cdg<cdf> e = a(cdf.class, "Takeoff");
   public static final cdg<cdc> f = a(cdc.class, "SittingFlaming");
   public static final cdg<cdd> g = a(cdd.class, "SittingScanning");
   public static final cdg<cdb> h = a(cdb.class, "SittingAttacking");
   public static final cdg<ccu> i = a(ccu.class, "ChargingPlayer");
   public static final cdg<ccv> j = a(ccv.class, "Dying");
   public static final cdg<ccx> k = a(ccx.class, "Hover");
   private final Class<? extends cda> m;
   private final int n;
   private final String o;

   private cdg(int $$0, Class<? extends cda> $$1, String $$2) {
      this.n = $$0;
      this.m = $$1;
      this.o = $$2;
   }

   public cda a(ccq $$0) {
      try {
         Constructor<? extends cda> $$1 = this.a();
         return $$1.newInstance($$0);
      } catch (Exception var3) {
         throw new Error(var3);
      }
   }

   protected Constructor<? extends cda> a() throws NoSuchMethodException {
      return this.m.getConstructor(ccq.class);
   }

   public int b() {
      return this.n;
   }

   @Override
   public String toString() {
      return this.o + " (#" + this.n + ")";
   }

   public static cdg<?> a(int $$0) {
      return $$0 >= 0 && $$0 < l.length ? l[$$0] : a;
   }

   public static int c() {
      return l.length;
   }

   private static <T extends cda> cdg<T> a(Class<T> $$0, String $$1) {
      cdg<T> $$2 = new cdg<>(l.length, $$0, $$1);
      l = Arrays.copyOf(l, l.length + 1);
      l[$$2.b()] = $$2;
      return $$2;
   }
}
