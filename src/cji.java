import java.lang.reflect.Constructor;
import java.util.Arrays;

public class cji<T extends cjc> {
   private static cji<?>[] l = new cji[0];
   public static final cji<ciy> a = a(ciy.class, "HoldingPattern");
   public static final cji<cjg> b = a(cjg.class, "StrafePlayer");
   public static final cji<cja> c = a(cja.class, "LandingApproach");
   public static final cji<cjb> d = a(cjb.class, "Landing");
   public static final cji<cjh> e = a(cjh.class, "Takeoff");
   public static final cji<cje> f = a(cje.class, "SittingFlaming");
   public static final cji<cjf> g = a(cjf.class, "SittingScanning");
   public static final cji<cjd> h = a(cjd.class, "SittingAttacking");
   public static final cji<ciw> i = a(ciw.class, "ChargingPlayer");
   public static final cji<cix> j = a(cix.class, "Dying");
   public static final cji<ciz> k = a(ciz.class, "Hover");
   private final Class<? extends cjc> m;
   private final int n;
   private final String o;

   private cji(int $$0, Class<? extends cjc> $$1, String $$2) {
      this.n = $$0;
      this.m = $$1;
      this.o = $$2;
   }

   public cjc a(cis $$0) {
      try {
         Constructor<? extends cjc> $$1 = this.a();
         return $$1.newInstance($$0);
      } catch (Exception var3) {
         throw new Error(var3);
      }
   }

   protected Constructor<? extends cjc> a() throws NoSuchMethodException {
      return this.m.getConstructor(cis.class);
   }

   public int b() {
      return this.n;
   }

   @Override
   public String toString() {
      return this.o + " (#" + this.n + ")";
   }

   public static cji<?> a(int $$0) {
      return $$0 >= 0 && $$0 < l.length ? l[$$0] : a;
   }

   public static int c() {
      return l.length;
   }

   private static <T extends cjc> cji<T> a(Class<T> $$0, String $$1) {
      cji<T> $$2 = new cji<>(l.length, $$0, $$1);
      l = Arrays.copyOf(l, l.length + 1);
      l[$$2.b()] = $$2;
      return $$2;
   }
}
