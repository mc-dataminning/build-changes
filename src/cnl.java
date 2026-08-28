import java.lang.reflect.Constructor;
import java.util.Arrays;

public class cnl<T extends cnf> {
   private static cnl<?>[] l = new cnl[0];
   public static final cnl<cnb> a = a(cnb.class, "HoldingPattern");
   public static final cnl<cnj> b = a(cnj.class, "StrafePlayer");
   public static final cnl<cnd> c = a(cnd.class, "LandingApproach");
   public static final cnl<cne> d = a(cne.class, "Landing");
   public static final cnl<cnk> e = a(cnk.class, "Takeoff");
   public static final cnl<cnh> f = a(cnh.class, "SittingFlaming");
   public static final cnl<cni> g = a(cni.class, "SittingScanning");
   public static final cnl<cng> h = a(cng.class, "SittingAttacking");
   public static final cnl<cmz> i = a(cmz.class, "ChargingPlayer");
   public static final cnl<cna> j = a(cna.class, "Dying");
   public static final cnl<cnc> k = a(cnc.class, "Hover");
   private final Class<? extends cnf> m;
   private final int n;
   private final String o;

   private cnl(int $$0, Class<? extends cnf> $$1, String $$2) {
      this.n = $$0;
      this.m = $$1;
      this.o = $$2;
   }

   public cnf a(cmv $$0) {
      try {
         Constructor<? extends cnf> $$1 = this.a();
         return $$1.newInstance($$0);
      } catch (Exception var3) {
         throw new Error(var3);
      }
   }

   protected Constructor<? extends cnf> a() throws NoSuchMethodException {
      return this.m.getConstructor(cmv.class);
   }

   public int b() {
      return this.n;
   }

   @Override
   public String toString() {
      return this.o + " (#" + this.n + ")";
   }

   public static cnl<?> a(int $$0) {
      return $$0 >= 0 && $$0 < l.length ? l[$$0] : a;
   }

   public static int c() {
      return l.length;
   }

   private static <T extends cnf> cnl<T> a(Class<T> $$0, String $$1) {
      cnl<T> $$2 = new cnl<>(l.length, $$0, $$1);
      l = Arrays.copyOf(l, l.length + 1);
      l[$$2.b()] = $$2;
      return $$2;
   }
}
