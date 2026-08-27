import java.lang.reflect.Constructor;
import java.util.Arrays;

public class bxp<T extends bxj> {
   private static bxp<?>[] l = new bxp[0];
   public static final bxp<bxf> a = a(bxf.class, "HoldingPattern");
   public static final bxp<bxn> b = a(bxn.class, "StrafePlayer");
   public static final bxp<bxh> c = a(bxh.class, "LandingApproach");
   public static final bxp<bxi> d = a(bxi.class, "Landing");
   public static final bxp<bxo> e = a(bxo.class, "Takeoff");
   public static final bxp<bxl> f = a(bxl.class, "SittingFlaming");
   public static final bxp<bxm> g = a(bxm.class, "SittingScanning");
   public static final bxp<bxk> h = a(bxk.class, "SittingAttacking");
   public static final bxp<bxd> i = a(bxd.class, "ChargingPlayer");
   public static final bxp<bxe> j = a(bxe.class, "Dying");
   public static final bxp<bxg> k = a(bxg.class, "Hover");
   private final Class<? extends bxj> m;
   private final int n;
   private final String o;

   private bxp(int $$0, Class<? extends bxj> $$1, String $$2) {
      this.n = $$0;
      this.m = $$1;
      this.o = $$2;
   }

   public bxj a(bwz $$0) {
      try {
         Constructor<? extends bxj> $$1 = this.a();
         return $$1.newInstance($$0);
      } catch (Exception var3) {
         throw new Error(var3);
      }
   }

   protected Constructor<? extends bxj> a() throws NoSuchMethodException {
      return this.m.getConstructor(bwz.class);
   }

   public int b() {
      return this.n;
   }

   @Override
   public String toString() {
      return this.o + " (#" + this.n + ")";
   }

   public static bxp<?> a(int $$0) {
      return $$0 >= 0 && $$0 < l.length ? l[$$0] : a;
   }

   public static int c() {
      return l.length;
   }

   private static <T extends bxj> bxp<T> a(Class<T> $$0, String $$1) {
      bxp<T> $$2 = new bxp<>(l.length, $$0, $$1);
      l = Arrays.copyOf(l, l.length + 1);
      l[$$2.b()] = $$2;
      return $$2;
   }
}
