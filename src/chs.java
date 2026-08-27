import java.lang.reflect.Constructor;
import java.util.Arrays;

public class chs<T extends chm> {
   private static chs<?>[] l = new chs[0];
   public static final chs<chi> a = a(chi.class, "HoldingPattern");
   public static final chs<chq> b = a(chq.class, "StrafePlayer");
   public static final chs<chk> c = a(chk.class, "LandingApproach");
   public static final chs<chl> d = a(chl.class, "Landing");
   public static final chs<chr> e = a(chr.class, "Takeoff");
   public static final chs<cho> f = a(cho.class, "SittingFlaming");
   public static final chs<chp> g = a(chp.class, "SittingScanning");
   public static final chs<chn> h = a(chn.class, "SittingAttacking");
   public static final chs<chg> i = a(chg.class, "ChargingPlayer");
   public static final chs<chh> j = a(chh.class, "Dying");
   public static final chs<chj> k = a(chj.class, "Hover");
   private final Class<? extends chm> m;
   private final int n;
   private final String o;

   private chs(int $$0, Class<? extends chm> $$1, String $$2) {
      this.n = $$0;
      this.m = $$1;
      this.o = $$2;
   }

   public chm a(chc $$0) {
      try {
         Constructor<? extends chm> $$1 = this.a();
         return $$1.newInstance($$0);
      } catch (Exception var3) {
         throw new Error(var3);
      }
   }

   protected Constructor<? extends chm> a() throws NoSuchMethodException {
      return this.m.getConstructor(chc.class);
   }

   public int b() {
      return this.n;
   }

   @Override
   public String toString() {
      return this.o + " (#" + this.n + ")";
   }

   public static chs<?> a(int $$0) {
      return $$0 >= 0 && $$0 < l.length ? l[$$0] : a;
   }

   public static int c() {
      return l.length;
   }

   private static <T extends chm> chs<T> a(Class<T> $$0, String $$1) {
      chs<T> $$2 = new chs<>(l.length, $$0, $$1);
      l = Arrays.copyOf(l, l.length + 1);
      l[$$2.b()] = $$2;
      return $$2;
   }
}
