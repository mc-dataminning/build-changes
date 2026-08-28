import java.lang.reflect.Constructor;
import java.util.Arrays;

public class cmq<T extends cmk> {
   private static cmq<?>[] l = new cmq[0];
   public static final cmq<cmg> a = a(cmg.class, "HoldingPattern");
   public static final cmq<cmo> b = a(cmo.class, "StrafePlayer");
   public static final cmq<cmi> c = a(cmi.class, "LandingApproach");
   public static final cmq<cmj> d = a(cmj.class, "Landing");
   public static final cmq<cmp> e = a(cmp.class, "Takeoff");
   public static final cmq<cmm> f = a(cmm.class, "SittingFlaming");
   public static final cmq<cmn> g = a(cmn.class, "SittingScanning");
   public static final cmq<cml> h = a(cml.class, "SittingAttacking");
   public static final cmq<cme> i = a(cme.class, "ChargingPlayer");
   public static final cmq<cmf> j = a(cmf.class, "Dying");
   public static final cmq<cmh> k = a(cmh.class, "Hover");
   private final Class<? extends cmk> m;
   private final int n;
   private final String o;

   private cmq(int $$0, Class<? extends cmk> $$1, String $$2) {
      this.n = $$0;
      this.m = $$1;
      this.o = $$2;
   }

   public cmk a(cma $$0) {
      try {
         Constructor<? extends cmk> $$1 = this.a();
         return $$1.newInstance($$0);
      } catch (Exception var3) {
         throw new Error(var3);
      }
   }

   protected Constructor<? extends cmk> a() throws NoSuchMethodException {
      return this.m.getConstructor(cma.class);
   }

   public int b() {
      return this.n;
   }

   @Override
   public String toString() {
      return this.o + " (#" + this.n + ")";
   }

   public static cmq<?> a(int $$0) {
      return $$0 >= 0 && $$0 < l.length ? l[$$0] : a;
   }

   public static int c() {
      return l.length;
   }

   private static <T extends cmk> cmq<T> a(Class<T> $$0, String $$1) {
      cmq<T> $$2 = new cmq<>(l.length, $$0, $$1);
      l = Arrays.copyOf(l, l.length + 1);
      l[$$2.b()] = $$2;
      return $$2;
   }
}
