import java.lang.reflect.Constructor;
import java.util.Arrays;

public class cjz<T extends cjt> {
   private static cjz<?>[] l = new cjz[0];
   public static final cjz<cjp> a = a(cjp.class, "HoldingPattern");
   public static final cjz<cjx> b = a(cjx.class, "StrafePlayer");
   public static final cjz<cjr> c = a(cjr.class, "LandingApproach");
   public static final cjz<cjs> d = a(cjs.class, "Landing");
   public static final cjz<cjy> e = a(cjy.class, "Takeoff");
   public static final cjz<cjv> f = a(cjv.class, "SittingFlaming");
   public static final cjz<cjw> g = a(cjw.class, "SittingScanning");
   public static final cjz<cju> h = a(cju.class, "SittingAttacking");
   public static final cjz<cjn> i = a(cjn.class, "ChargingPlayer");
   public static final cjz<cjo> j = a(cjo.class, "Dying");
   public static final cjz<cjq> k = a(cjq.class, "Hover");
   private final Class<? extends cjt> m;
   private final int n;
   private final String o;

   private cjz(int $$0, Class<? extends cjt> $$1, String $$2) {
      this.n = $$0;
      this.m = $$1;
      this.o = $$2;
   }

   public cjt a(cjj $$0) {
      try {
         Constructor<? extends cjt> $$1 = this.a();
         return $$1.newInstance($$0);
      } catch (Exception var3) {
         throw new Error(var3);
      }
   }

   protected Constructor<? extends cjt> a() throws NoSuchMethodException {
      return this.m.getConstructor(cjj.class);
   }

   public int b() {
      return this.n;
   }

   @Override
   public String toString() {
      return this.o + " (#" + this.n + ")";
   }

   public static cjz<?> a(int $$0) {
      return $$0 >= 0 && $$0 < l.length ? l[$$0] : a;
   }

   public static int c() {
      return l.length;
   }

   private static <T extends cjt> cjz<T> a(Class<T> $$0, String $$1) {
      cjz<T> $$2 = new cjz<>(l.length, $$0, $$1);
      l = Arrays.copyOf(l, l.length + 1);
      l[$$2.b()] = $$2;
      return $$2;
   }
}
