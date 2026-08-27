import java.lang.reflect.Constructor;
import java.util.Arrays;

public class bxs<T extends bxm> {
   private static bxs<?>[] l = new bxs[0];
   public static final bxs<bxi> a = a(bxi.class, "HoldingPattern");
   public static final bxs<bxq> b = a(bxq.class, "StrafePlayer");
   public static final bxs<bxk> c = a(bxk.class, "LandingApproach");
   public static final bxs<bxl> d = a(bxl.class, "Landing");
   public static final bxs<bxr> e = a(bxr.class, "Takeoff");
   public static final bxs<bxo> f = a(bxo.class, "SittingFlaming");
   public static final bxs<bxp> g = a(bxp.class, "SittingScanning");
   public static final bxs<bxn> h = a(bxn.class, "SittingAttacking");
   public static final bxs<bxg> i = a(bxg.class, "ChargingPlayer");
   public static final bxs<bxh> j = a(bxh.class, "Dying");
   public static final bxs<bxj> k = a(bxj.class, "Hover");
   private final Class<? extends bxm> m;
   private final int n;
   private final String o;

   private bxs(int $$0, Class<? extends bxm> $$1, String $$2) {
      this.n = $$0;
      this.m = $$1;
      this.o = $$2;
   }

   public bxm a(bxc $$0) {
      try {
         Constructor<? extends bxm> $$1 = this.a();
         return $$1.newInstance($$0);
      } catch (Exception var3) {
         throw new Error(var3);
      }
   }

   protected Constructor<? extends bxm> a() throws NoSuchMethodException {
      return this.m.getConstructor(bxc.class);
   }

   public int b() {
      return this.n;
   }

   @Override
   public String toString() {
      return this.o + " (#" + this.n + ")";
   }

   public static bxs<?> a(int $$0) {
      return $$0 >= 0 && $$0 < l.length ? l[$$0] : a;
   }

   public static int c() {
      return l.length;
   }

   private static <T extends bxm> bxs<T> a(Class<T> $$0, String $$1) {
      bxs<T> $$2 = new bxs<>(l.length, $$0, $$1);
      l = Arrays.copyOf(l, l.length + 1);
      l[$$2.b()] = $$2;
      return $$2;
   }
}
