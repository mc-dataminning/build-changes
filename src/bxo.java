import java.lang.reflect.Constructor;
import java.util.Arrays;

public class bxo<T extends bxi> {
   private static bxo<?>[] l = new bxo[0];
   public static final bxo<bxe> a = a(bxe.class, "HoldingPattern");
   public static final bxo<bxm> b = a(bxm.class, "StrafePlayer");
   public static final bxo<bxg> c = a(bxg.class, "LandingApproach");
   public static final bxo<bxh> d = a(bxh.class, "Landing");
   public static final bxo<bxn> e = a(bxn.class, "Takeoff");
   public static final bxo<bxk> f = a(bxk.class, "SittingFlaming");
   public static final bxo<bxl> g = a(bxl.class, "SittingScanning");
   public static final bxo<bxj> h = a(bxj.class, "SittingAttacking");
   public static final bxo<bxc> i = a(bxc.class, "ChargingPlayer");
   public static final bxo<bxd> j = a(bxd.class, "Dying");
   public static final bxo<bxf> k = a(bxf.class, "Hover");
   private final Class<? extends bxi> m;
   private final int n;
   private final String o;

   private bxo(int $$0, Class<? extends bxi> $$1, String $$2) {
      this.n = $$0;
      this.m = $$1;
      this.o = $$2;
   }

   public bxi a(bwy $$0) {
      try {
         Constructor<? extends bxi> $$1 = this.a();
         return $$1.newInstance($$0);
      } catch (Exception var3) {
         throw new Error(var3);
      }
   }

   protected Constructor<? extends bxi> a() throws NoSuchMethodException {
      return this.m.getConstructor(bwy.class);
   }

   public int b() {
      return this.n;
   }

   @Override
   public String toString() {
      return this.o + " (#" + this.n + ")";
   }

   public static bxo<?> a(int $$0) {
      return $$0 >= 0 && $$0 < l.length ? l[$$0] : a;
   }

   public static int c() {
      return l.length;
   }

   private static <T extends bxi> bxo<T> a(Class<T> $$0, String $$1) {
      bxo<T> $$2 = new bxo<>(l.length, $$0, $$1);
      l = Arrays.copyOf(l, l.length + 1);
      l[$$2.b()] = $$2;
      return $$2;
   }
}
