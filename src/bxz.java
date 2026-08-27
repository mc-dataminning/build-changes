import java.lang.reflect.Constructor;
import java.util.Arrays;

public class bxz<T extends bxt> {
   private static bxz<?>[] l = new bxz[0];
   public static final bxz<bxp> a = a(bxp.class, "HoldingPattern");
   public static final bxz<bxx> b = a(bxx.class, "StrafePlayer");
   public static final bxz<bxr> c = a(bxr.class, "LandingApproach");
   public static final bxz<bxs> d = a(bxs.class, "Landing");
   public static final bxz<bxy> e = a(bxy.class, "Takeoff");
   public static final bxz<bxv> f = a(bxv.class, "SittingFlaming");
   public static final bxz<bxw> g = a(bxw.class, "SittingScanning");
   public static final bxz<bxu> h = a(bxu.class, "SittingAttacking");
   public static final bxz<bxn> i = a(bxn.class, "ChargingPlayer");
   public static final bxz<bxo> j = a(bxo.class, "Dying");
   public static final bxz<bxq> k = a(bxq.class, "Hover");
   private final Class<? extends bxt> m;
   private final int n;
   private final String o;

   private bxz(int $$0, Class<? extends bxt> $$1, String $$2) {
      this.n = $$0;
      this.m = $$1;
      this.o = $$2;
   }

   public bxt a(bxj $$0) {
      try {
         Constructor<? extends bxt> $$1 = this.a();
         return $$1.newInstance($$0);
      } catch (Exception var3) {
         throw new Error(var3);
      }
   }

   protected Constructor<? extends bxt> a() throws NoSuchMethodException {
      return this.m.getConstructor(bxj.class);
   }

   public int b() {
      return this.n;
   }

   @Override
   public String toString() {
      return this.o + " (#" + this.n + ")";
   }

   public static bxz<?> a(int $$0) {
      return $$0 >= 0 && $$0 < l.length ? l[$$0] : a;
   }

   public static int c() {
      return l.length;
   }

   private static <T extends bxt> bxz<T> a(Class<T> $$0, String $$1) {
      bxz<T> $$2 = new bxz<>(l.length, $$0, $$1);
      l = Arrays.copyOf(l, l.length + 1);
      l[$$2.b()] = $$2;
      return $$2;
   }
}
