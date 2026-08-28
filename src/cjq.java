import java.lang.reflect.Constructor;
import java.util.Arrays;

public class cjq<T extends cjk> {
   private static cjq<?>[] l = new cjq[0];
   public static final cjq<cjg> a = a(cjg.class, "HoldingPattern");
   public static final cjq<cjo> b = a(cjo.class, "StrafePlayer");
   public static final cjq<cji> c = a(cji.class, "LandingApproach");
   public static final cjq<cjj> d = a(cjj.class, "Landing");
   public static final cjq<cjp> e = a(cjp.class, "Takeoff");
   public static final cjq<cjm> f = a(cjm.class, "SittingFlaming");
   public static final cjq<cjn> g = a(cjn.class, "SittingScanning");
   public static final cjq<cjl> h = a(cjl.class, "SittingAttacking");
   public static final cjq<cje> i = a(cje.class, "ChargingPlayer");
   public static final cjq<cjf> j = a(cjf.class, "Dying");
   public static final cjq<cjh> k = a(cjh.class, "Hover");
   private final Class<? extends cjk> m;
   private final int n;
   private final String o;

   private cjq(int $$0, Class<? extends cjk> $$1, String $$2) {
      this.n = $$0;
      this.m = $$1;
      this.o = $$2;
   }

   public cjk a(cja $$0) {
      try {
         Constructor<? extends cjk> $$1 = this.a();
         return $$1.newInstance($$0);
      } catch (Exception var3) {
         throw new Error(var3);
      }
   }

   protected Constructor<? extends cjk> a() throws NoSuchMethodException {
      return this.m.getConstructor(cja.class);
   }

   public int b() {
      return this.n;
   }

   @Override
   public String toString() {
      return this.o + " (#" + this.n + ")";
   }

   public static cjq<?> a(int $$0) {
      return $$0 >= 0 && $$0 < l.length ? l[$$0] : a;
   }

   public static int c() {
      return l.length;
   }

   private static <T extends cjk> cjq<T> a(Class<T> $$0, String $$1) {
      cjq<T> $$2 = new cjq<>(l.length, $$0, $$1);
      l = Arrays.copyOf(l, l.length + 1);
      l[$$2.b()] = $$2;
      return $$2;
   }
}
