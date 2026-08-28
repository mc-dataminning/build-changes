import java.lang.reflect.Constructor;
import java.util.Arrays;

public class cjn<T extends cjh> {
   private static cjn<?>[] l = new cjn[0];
   public static final cjn<cjd> a = a(cjd.class, "HoldingPattern");
   public static final cjn<cjl> b = a(cjl.class, "StrafePlayer");
   public static final cjn<cjf> c = a(cjf.class, "LandingApproach");
   public static final cjn<cjg> d = a(cjg.class, "Landing");
   public static final cjn<cjm> e = a(cjm.class, "Takeoff");
   public static final cjn<cjj> f = a(cjj.class, "SittingFlaming");
   public static final cjn<cjk> g = a(cjk.class, "SittingScanning");
   public static final cjn<cji> h = a(cji.class, "SittingAttacking");
   public static final cjn<cjb> i = a(cjb.class, "ChargingPlayer");
   public static final cjn<cjc> j = a(cjc.class, "Dying");
   public static final cjn<cje> k = a(cje.class, "Hover");
   private final Class<? extends cjh> m;
   private final int n;
   private final String o;

   private cjn(int $$0, Class<? extends cjh> $$1, String $$2) {
      this.n = $$0;
      this.m = $$1;
      this.o = $$2;
   }

   public cjh a(cix $$0) {
      try {
         Constructor<? extends cjh> $$1 = this.a();
         return $$1.newInstance($$0);
      } catch (Exception var3) {
         throw new Error(var3);
      }
   }

   protected Constructor<? extends cjh> a() throws NoSuchMethodException {
      return this.m.getConstructor(cix.class);
   }

   public int b() {
      return this.n;
   }

   @Override
   public String toString() {
      return this.o + " (#" + this.n + ")";
   }

   public static cjn<?> a(int $$0) {
      return $$0 >= 0 && $$0 < l.length ? l[$$0] : a;
   }

   public static int c() {
      return l.length;
   }

   private static <T extends cjh> cjn<T> a(Class<T> $$0, String $$1) {
      cjn<T> $$2 = new cjn<>(l.length, $$0, $$1);
      l = Arrays.copyOf(l, l.length + 1);
      l[$$2.b()] = $$2;
      return $$2;
   }
}
