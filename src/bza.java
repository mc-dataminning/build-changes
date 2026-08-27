import java.lang.reflect.Constructor;
import java.util.Arrays;

public class bza<T extends byu> {
   private static bza<?>[] l = new bza[0];
   public static final bza<byq> a = a(byq.class, "HoldingPattern");
   public static final bza<byy> b = a(byy.class, "StrafePlayer");
   public static final bza<bys> c = a(bys.class, "LandingApproach");
   public static final bza<byt> d = a(byt.class, "Landing");
   public static final bza<byz> e = a(byz.class, "Takeoff");
   public static final bza<byw> f = a(byw.class, "SittingFlaming");
   public static final bza<byx> g = a(byx.class, "SittingScanning");
   public static final bza<byv> h = a(byv.class, "SittingAttacking");
   public static final bza<byo> i = a(byo.class, "ChargingPlayer");
   public static final bza<byp> j = a(byp.class, "Dying");
   public static final bza<byr> k = a(byr.class, "Hover");
   private final Class<? extends byu> m;
   private final int n;
   private final String o;

   private bza(int $$0, Class<? extends byu> $$1, String $$2) {
      this.n = $$0;
      this.m = $$1;
      this.o = $$2;
   }

   public byu a(byk $$0) {
      try {
         Constructor<? extends byu> $$1 = this.a();
         return $$1.newInstance($$0);
      } catch (Exception var3) {
         throw new Error(var3);
      }
   }

   protected Constructor<? extends byu> a() throws NoSuchMethodException {
      return this.m.getConstructor(byk.class);
   }

   public int b() {
      return this.n;
   }

   @Override
   public String toString() {
      return this.o + " (#" + this.n + ")";
   }

   public static bza<?> a(int $$0) {
      return $$0 >= 0 && $$0 < l.length ? l[$$0] : a;
   }

   public static int c() {
      return l.length;
   }

   private static <T extends byu> bza<T> a(Class<T> $$0, String $$1) {
      bza<T> $$2 = new bza<>(l.length, $$0, $$1);
      l = Arrays.copyOf(l, l.length + 1);
      l[$$2.b()] = $$2;
      return $$2;
   }
}
