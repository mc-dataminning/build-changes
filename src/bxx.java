import java.lang.reflect.Constructor;
import java.util.Arrays;

public class bxx<T extends bxr> {
   private static bxx<?>[] l = new bxx[0];
   public static final bxx<bxn> a = a(bxn.class, "HoldingPattern");
   public static final bxx<bxv> b = a(bxv.class, "StrafePlayer");
   public static final bxx<bxp> c = a(bxp.class, "LandingApproach");
   public static final bxx<bxq> d = a(bxq.class, "Landing");
   public static final bxx<bxw> e = a(bxw.class, "Takeoff");
   public static final bxx<bxt> f = a(bxt.class, "SittingFlaming");
   public static final bxx<bxu> g = a(bxu.class, "SittingScanning");
   public static final bxx<bxs> h = a(bxs.class, "SittingAttacking");
   public static final bxx<bxl> i = a(bxl.class, "ChargingPlayer");
   public static final bxx<bxm> j = a(bxm.class, "Dying");
   public static final bxx<bxo> k = a(bxo.class, "Hover");
   private final Class<? extends bxr> m;
   private final int n;
   private final String o;

   private bxx(int $$0, Class<? extends bxr> $$1, String $$2) {
      this.n = $$0;
      this.m = $$1;
      this.o = $$2;
   }

   public bxr a(bxh $$0) {
      try {
         Constructor<? extends bxr> $$1 = this.a();
         return $$1.newInstance($$0);
      } catch (Exception var3) {
         throw new Error(var3);
      }
   }

   protected Constructor<? extends bxr> a() throws NoSuchMethodException {
      return this.m.getConstructor(bxh.class);
   }

   public int b() {
      return this.n;
   }

   @Override
   public String toString() {
      return this.o + " (#" + this.n + ")";
   }

   public static bxx<?> a(int $$0) {
      return $$0 >= 0 && $$0 < l.length ? l[$$0] : a;
   }

   public static int c() {
      return l.length;
   }

   private static <T extends bxr> bxx<T> a(Class<T> $$0, String $$1) {
      bxx<T> $$2 = new bxx<>(l.length, $$0, $$1);
      l = Arrays.copyOf(l, l.length + 1);
      l[$$2.b()] = $$2;
      return $$2;
   }
}
