import java.lang.reflect.Constructor;
import java.util.Arrays;

public class cbd<T extends cax> {
   private static cbd<?>[] l = new cbd[0];
   public static final cbd<cat> a = a(cat.class, "HoldingPattern");
   public static final cbd<cbb> b = a(cbb.class, "StrafePlayer");
   public static final cbd<cav> c = a(cav.class, "LandingApproach");
   public static final cbd<caw> d = a(caw.class, "Landing");
   public static final cbd<cbc> e = a(cbc.class, "Takeoff");
   public static final cbd<caz> f = a(caz.class, "SittingFlaming");
   public static final cbd<cba> g = a(cba.class, "SittingScanning");
   public static final cbd<cay> h = a(cay.class, "SittingAttacking");
   public static final cbd<car> i = a(car.class, "ChargingPlayer");
   public static final cbd<cas> j = a(cas.class, "Dying");
   public static final cbd<cau> k = a(cau.class, "Hover");
   private final Class<? extends cax> m;
   private final int n;
   private final String o;

   private cbd(int $$0, Class<? extends cax> $$1, String $$2) {
      this.n = $$0;
      this.m = $$1;
      this.o = $$2;
   }

   public cax a(can $$0) {
      try {
         Constructor<? extends cax> $$1 = this.a();
         return $$1.newInstance($$0);
      } catch (Exception var3) {
         throw new Error(var3);
      }
   }

   protected Constructor<? extends cax> a() throws NoSuchMethodException {
      return this.m.getConstructor(can.class);
   }

   public int b() {
      return this.n;
   }

   @Override
   public String toString() {
      return this.o + " (#" + this.n + ")";
   }

   public static cbd<?> a(int $$0) {
      return $$0 >= 0 && $$0 < l.length ? l[$$0] : a;
   }

   public static int c() {
      return l.length;
   }

   private static <T extends cax> cbd<T> a(Class<T> $$0, String $$1) {
      cbd<T> $$2 = new cbd<>(l.length, $$0, $$1);
      l = Arrays.copyOf(l, l.length + 1);
      l[$$2.b()] = $$2;
      return $$2;
   }
}
