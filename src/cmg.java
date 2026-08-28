import java.lang.reflect.Constructor;
import java.util.Arrays;

public class cmg<T extends cma> {
   private static cmg<?>[] l = new cmg[0];
   public static final cmg<clw> a = a(clw.class, "HoldingPattern");
   public static final cmg<cme> b = a(cme.class, "StrafePlayer");
   public static final cmg<cly> c = a(cly.class, "LandingApproach");
   public static final cmg<clz> d = a(clz.class, "Landing");
   public static final cmg<cmf> e = a(cmf.class, "Takeoff");
   public static final cmg<cmc> f = a(cmc.class, "SittingFlaming");
   public static final cmg<cmd> g = a(cmd.class, "SittingScanning");
   public static final cmg<cmb> h = a(cmb.class, "SittingAttacking");
   public static final cmg<clu> i = a(clu.class, "ChargingPlayer");
   public static final cmg<clv> j = a(clv.class, "Dying");
   public static final cmg<clx> k = a(clx.class, "Hover");
   private final Class<? extends cma> m;
   private final int n;
   private final String o;

   private cmg(int $$0, Class<? extends cma> $$1, String $$2) {
      this.n = $$0;
      this.m = $$1;
      this.o = $$2;
   }

   public cma a(clq $$0) {
      try {
         Constructor<? extends cma> $$1 = this.a();
         return $$1.newInstance($$0);
      } catch (Exception var3) {
         throw new Error(var3);
      }
   }

   protected Constructor<? extends cma> a() throws NoSuchMethodException {
      return this.m.getConstructor(clq.class);
   }

   public int b() {
      return this.n;
   }

   @Override
   public String toString() {
      return this.o + " (#" + this.n + ")";
   }

   public static cmg<?> a(int $$0) {
      return $$0 >= 0 && $$0 < l.length ? l[$$0] : a;
   }

   public static int c() {
      return l.length;
   }

   private static <T extends cma> cmg<T> a(Class<T> $$0, String $$1) {
      cmg<T> $$2 = new cmg<>(l.length, $$0, $$1);
      l = Arrays.copyOf(l, l.length + 1);
      l[$$2.b()] = $$2;
      return $$2;
   }
}
