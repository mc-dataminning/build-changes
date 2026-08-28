import java.lang.reflect.Constructor;
import java.util.Arrays;

public class cia<T extends chu> {
   private static cia<?>[] l = new cia[0];
   public static final cia<chq> a = a(chq.class, "HoldingPattern");
   public static final cia<chy> b = a(chy.class, "StrafePlayer");
   public static final cia<chs> c = a(chs.class, "LandingApproach");
   public static final cia<cht> d = a(cht.class, "Landing");
   public static final cia<chz> e = a(chz.class, "Takeoff");
   public static final cia<chw> f = a(chw.class, "SittingFlaming");
   public static final cia<chx> g = a(chx.class, "SittingScanning");
   public static final cia<chv> h = a(chv.class, "SittingAttacking");
   public static final cia<cho> i = a(cho.class, "ChargingPlayer");
   public static final cia<chp> j = a(chp.class, "Dying");
   public static final cia<chr> k = a(chr.class, "Hover");
   private final Class<? extends chu> m;
   private final int n;
   private final String o;

   private cia(int $$0, Class<? extends chu> $$1, String $$2) {
      this.n = $$0;
      this.m = $$1;
      this.o = $$2;
   }

   public chu a(chk $$0) {
      try {
         Constructor<? extends chu> $$1 = this.a();
         return $$1.newInstance($$0);
      } catch (Exception var3) {
         throw new Error(var3);
      }
   }

   protected Constructor<? extends chu> a() throws NoSuchMethodException {
      return this.m.getConstructor(chk.class);
   }

   public int b() {
      return this.n;
   }

   @Override
   public String toString() {
      return this.o + " (#" + this.n + ")";
   }

   public static cia<?> a(int $$0) {
      return $$0 >= 0 && $$0 < l.length ? l[$$0] : a;
   }

   public static int c() {
      return l.length;
   }

   private static <T extends chu> cia<T> a(Class<T> $$0, String $$1) {
      cia<T> $$2 = new cia<>(l.length, $$0, $$1);
      l = Arrays.copyOf(l, l.length + 1);
      l[$$2.b()] = $$2;
      return $$2;
   }
}
