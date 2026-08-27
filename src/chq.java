import java.lang.reflect.Constructor;
import java.util.Arrays;

public class chq<T extends chk> {
   private static chq<?>[] l = new chq[0];
   public static final chq<chg> a = a(chg.class, "HoldingPattern");
   public static final chq<cho> b = a(cho.class, "StrafePlayer");
   public static final chq<chi> c = a(chi.class, "LandingApproach");
   public static final chq<chj> d = a(chj.class, "Landing");
   public static final chq<chp> e = a(chp.class, "Takeoff");
   public static final chq<chm> f = a(chm.class, "SittingFlaming");
   public static final chq<chn> g = a(chn.class, "SittingScanning");
   public static final chq<chl> h = a(chl.class, "SittingAttacking");
   public static final chq<che> i = a(che.class, "ChargingPlayer");
   public static final chq<chf> j = a(chf.class, "Dying");
   public static final chq<chh> k = a(chh.class, "Hover");
   private final Class<? extends chk> m;
   private final int n;
   private final String o;

   private chq(int $$0, Class<? extends chk> $$1, String $$2) {
      this.n = $$0;
      this.m = $$1;
      this.o = $$2;
   }

   public chk a(cha $$0) {
      try {
         Constructor<? extends chk> $$1 = this.a();
         return $$1.newInstance($$0);
      } catch (Exception var3) {
         throw new Error(var3);
      }
   }

   protected Constructor<? extends chk> a() throws NoSuchMethodException {
      return this.m.getConstructor(cha.class);
   }

   public int b() {
      return this.n;
   }

   @Override
   public String toString() {
      return this.o + " (#" + this.n + ")";
   }

   public static chq<?> a(int $$0) {
      return $$0 >= 0 && $$0 < l.length ? l[$$0] : a;
   }

   public static int c() {
      return l.length;
   }

   private static <T extends chk> chq<T> a(Class<T> $$0, String $$1) {
      chq<T> $$2 = new chq<>(l.length, $$0, $$1);
      l = Arrays.copyOf(l, l.length + 1);
      l[$$2.b()] = $$2;
      return $$2;
   }
}
