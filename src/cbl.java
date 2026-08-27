import java.lang.reflect.Constructor;
import java.util.Arrays;

public class cbl<T extends cbf> {
   private static cbl<?>[] l = new cbl[0];
   public static final cbl<cbb> a = a(cbb.class, "HoldingPattern");
   public static final cbl<cbj> b = a(cbj.class, "StrafePlayer");
   public static final cbl<cbd> c = a(cbd.class, "LandingApproach");
   public static final cbl<cbe> d = a(cbe.class, "Landing");
   public static final cbl<cbk> e = a(cbk.class, "Takeoff");
   public static final cbl<cbh> f = a(cbh.class, "SittingFlaming");
   public static final cbl<cbi> g = a(cbi.class, "SittingScanning");
   public static final cbl<cbg> h = a(cbg.class, "SittingAttacking");
   public static final cbl<caz> i = a(caz.class, "ChargingPlayer");
   public static final cbl<cba> j = a(cba.class, "Dying");
   public static final cbl<cbc> k = a(cbc.class, "Hover");
   private final Class<? extends cbf> m;
   private final int n;
   private final String o;

   private cbl(int $$0, Class<? extends cbf> $$1, String $$2) {
      this.n = $$0;
      this.m = $$1;
      this.o = $$2;
   }

   public cbf a(cav $$0) {
      try {
         Constructor<? extends cbf> $$1 = this.a();
         return $$1.newInstance($$0);
      } catch (Exception var3) {
         throw new Error(var3);
      }
   }

   protected Constructor<? extends cbf> a() throws NoSuchMethodException {
      return this.m.getConstructor(cav.class);
   }

   public int b() {
      return this.n;
   }

   @Override
   public String toString() {
      return this.o + " (#" + this.n + ")";
   }

   public static cbl<?> a(int $$0) {
      return $$0 >= 0 && $$0 < l.length ? l[$$0] : a;
   }

   public static int c() {
      return l.length;
   }

   private static <T extends cbf> cbl<T> a(Class<T> $$0, String $$1) {
      cbl<T> $$2 = new cbl<>(l.length, $$0, $$1);
      l = Arrays.copyOf(l, l.length + 1);
      l[$$2.b()] = $$2;
      return $$2;
   }
}
