import java.lang.reflect.Constructor;
import java.util.Arrays;

public class cmm<T extends cmg> {
   private static cmm<?>[] l = new cmm[0];
   public static final cmm<cmc> a = a(cmc.class, "HoldingPattern");
   public static final cmm<cmk> b = a(cmk.class, "StrafePlayer");
   public static final cmm<cme> c = a(cme.class, "LandingApproach");
   public static final cmm<cmf> d = a(cmf.class, "Landing");
   public static final cmm<cml> e = a(cml.class, "Takeoff");
   public static final cmm<cmi> f = a(cmi.class, "SittingFlaming");
   public static final cmm<cmj> g = a(cmj.class, "SittingScanning");
   public static final cmm<cmh> h = a(cmh.class, "SittingAttacking");
   public static final cmm<cma> i = a(cma.class, "ChargingPlayer");
   public static final cmm<cmb> j = a(cmb.class, "Dying");
   public static final cmm<cmd> k = a(cmd.class, "Hover");
   private final Class<? extends cmg> m;
   private final int n;
   private final String o;

   private cmm(int $$0, Class<? extends cmg> $$1, String $$2) {
      this.n = $$0;
      this.m = $$1;
      this.o = $$2;
   }

   public cmg a(clw $$0) {
      try {
         Constructor<? extends cmg> $$1 = this.a();
         return $$1.newInstance($$0);
      } catch (Exception var3) {
         throw new Error(var3);
      }
   }

   protected Constructor<? extends cmg> a() throws NoSuchMethodException {
      return this.m.getConstructor(clw.class);
   }

   public int b() {
      return this.n;
   }

   @Override
   public String toString() {
      return this.o + " (#" + this.n + ")";
   }

   public static cmm<?> a(int $$0) {
      return $$0 >= 0 && $$0 < l.length ? l[$$0] : a;
   }

   public static int c() {
      return l.length;
   }

   private static <T extends cmg> cmm<T> a(Class<T> $$0, String $$1) {
      cmm<T> $$2 = new cmm<>(l.length, $$0, $$1);
      l = Arrays.copyOf(l, l.length + 1);
      l[$$2.b()] = $$2;
      return $$2;
   }
}
