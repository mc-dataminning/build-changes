import java.lang.reflect.Constructor;
import java.util.Arrays;

public class bxq<T extends bxk> {
   private static bxq<?>[] l = new bxq[0];
   public static final bxq<bxg> a = a(bxg.class, "HoldingPattern");
   public static final bxq<bxo> b = a(bxo.class, "StrafePlayer");
   public static final bxq<bxi> c = a(bxi.class, "LandingApproach");
   public static final bxq<bxj> d = a(bxj.class, "Landing");
   public static final bxq<bxp> e = a(bxp.class, "Takeoff");
   public static final bxq<bxm> f = a(bxm.class, "SittingFlaming");
   public static final bxq<bxn> g = a(bxn.class, "SittingScanning");
   public static final bxq<bxl> h = a(bxl.class, "SittingAttacking");
   public static final bxq<bxe> i = a(bxe.class, "ChargingPlayer");
   public static final bxq<bxf> j = a(bxf.class, "Dying");
   public static final bxq<bxh> k = a(bxh.class, "Hover");
   private final Class<? extends bxk> m;
   private final int n;
   private final String o;

   private bxq(int $$0, Class<? extends bxk> $$1, String $$2) {
      this.n = $$0;
      this.m = $$1;
      this.o = $$2;
   }

   public bxk a(bxa $$0) {
      try {
         Constructor<? extends bxk> $$1 = this.a();
         return $$1.newInstance($$0);
      } catch (Exception var3) {
         throw new Error(var3);
      }
   }

   protected Constructor<? extends bxk> a() throws NoSuchMethodException {
      return this.m.getConstructor(bxa.class);
   }

   public int b() {
      return this.n;
   }

   @Override
   public String toString() {
      return this.o + " (#" + this.n + ")";
   }

   public static bxq<?> a(int $$0) {
      return $$0 >= 0 && $$0 < l.length ? l[$$0] : a;
   }

   public static int c() {
      return l.length;
   }

   private static <T extends bxk> bxq<T> a(Class<T> $$0, String $$1) {
      bxq<T> $$2 = new bxq<>(l.length, $$0, $$1);
      l = Arrays.copyOf(l, l.length + 1);
      l[$$2.b()] = $$2;
      return $$2;
   }
}
