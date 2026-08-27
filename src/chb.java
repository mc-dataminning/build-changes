import java.lang.reflect.Constructor;
import java.util.Arrays;

public class chb<T extends cgv> {
   private static chb<?>[] l = new chb[0];
   public static final chb<cgr> a = a(cgr.class, "HoldingPattern");
   public static final chb<cgz> b = a(cgz.class, "StrafePlayer");
   public static final chb<cgt> c = a(cgt.class, "LandingApproach");
   public static final chb<cgu> d = a(cgu.class, "Landing");
   public static final chb<cha> e = a(cha.class, "Takeoff");
   public static final chb<cgx> f = a(cgx.class, "SittingFlaming");
   public static final chb<cgy> g = a(cgy.class, "SittingScanning");
   public static final chb<cgw> h = a(cgw.class, "SittingAttacking");
   public static final chb<cgp> i = a(cgp.class, "ChargingPlayer");
   public static final chb<cgq> j = a(cgq.class, "Dying");
   public static final chb<cgs> k = a(cgs.class, "Hover");
   private final Class<? extends cgv> m;
   private final int n;
   private final String o;

   private chb(int $$0, Class<? extends cgv> $$1, String $$2) {
      this.n = $$0;
      this.m = $$1;
      this.o = $$2;
   }

   public cgv a(cgl $$0) {
      try {
         Constructor<? extends cgv> $$1 = this.a();
         return $$1.newInstance($$0);
      } catch (Exception var3) {
         throw new Error(var3);
      }
   }

   protected Constructor<? extends cgv> a() throws NoSuchMethodException {
      return this.m.getConstructor(cgl.class);
   }

   public int b() {
      return this.n;
   }

   @Override
   public String toString() {
      return this.o + " (#" + this.n + ")";
   }

   public static chb<?> a(int $$0) {
      return $$0 >= 0 && $$0 < l.length ? l[$$0] : a;
   }

   public static int c() {
      return l.length;
   }

   private static <T extends cgv> chb<T> a(Class<T> $$0, String $$1) {
      chb<T> $$2 = new chb<>(l.length, $$0, $$1);
      l = Arrays.copyOf(l, l.length + 1);
      l[$$2.b()] = $$2;
      return $$2;
   }
}
