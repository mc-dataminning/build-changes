import java.lang.reflect.Constructor;
import java.util.Arrays;

public class clj<T extends cld> {
   private static clj<?>[] l = new clj[0];
   public static final clj<ckz> a = a(ckz.class, "HoldingPattern");
   public static final clj<clh> b = a(clh.class, "StrafePlayer");
   public static final clj<clb> c = a(clb.class, "LandingApproach");
   public static final clj<clc> d = a(clc.class, "Landing");
   public static final clj<cli> e = a(cli.class, "Takeoff");
   public static final clj<clf> f = a(clf.class, "SittingFlaming");
   public static final clj<clg> g = a(clg.class, "SittingScanning");
   public static final clj<cle> h = a(cle.class, "SittingAttacking");
   public static final clj<ckx> i = a(ckx.class, "ChargingPlayer");
   public static final clj<cky> j = a(cky.class, "Dying");
   public static final clj<cla> k = a(cla.class, "Hover");
   private final Class<? extends cld> m;
   private final int n;
   private final String o;

   private clj(int $$0, Class<? extends cld> $$1, String $$2) {
      this.n = $$0;
      this.m = $$1;
      this.o = $$2;
   }

   public cld a(ckt $$0) {
      try {
         Constructor<? extends cld> $$1 = this.a();
         return $$1.newInstance($$0);
      } catch (Exception var3) {
         throw new Error(var3);
      }
   }

   protected Constructor<? extends cld> a() throws NoSuchMethodException {
      return this.m.getConstructor(ckt.class);
   }

   public int b() {
      return this.n;
   }

   @Override
   public String toString() {
      return this.o + " (#" + this.n + ")";
   }

   public static clj<?> a(int $$0) {
      return $$0 >= 0 && $$0 < l.length ? l[$$0] : a;
   }

   public static int c() {
      return l.length;
   }

   private static <T extends cld> clj<T> a(Class<T> $$0, String $$1) {
      clj<T> $$2 = new clj<>(l.length, $$0, $$1);
      l = Arrays.copyOf(l, l.length + 1);
      l[$$2.b()] = $$2;
      return $$2;
   }
}
