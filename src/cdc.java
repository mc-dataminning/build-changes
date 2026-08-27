import java.lang.reflect.Constructor;
import java.util.Arrays;

public class cdc<T extends ccw> {
   private static cdc<?>[] l = new cdc[0];
   public static final cdc<ccs> a = a(ccs.class, "HoldingPattern");
   public static final cdc<cda> b = a(cda.class, "StrafePlayer");
   public static final cdc<ccu> c = a(ccu.class, "LandingApproach");
   public static final cdc<ccv> d = a(ccv.class, "Landing");
   public static final cdc<cdb> e = a(cdb.class, "Takeoff");
   public static final cdc<ccy> f = a(ccy.class, "SittingFlaming");
   public static final cdc<ccz> g = a(ccz.class, "SittingScanning");
   public static final cdc<ccx> h = a(ccx.class, "SittingAttacking");
   public static final cdc<ccq> i = a(ccq.class, "ChargingPlayer");
   public static final cdc<ccr> j = a(ccr.class, "Dying");
   public static final cdc<cct> k = a(cct.class, "Hover");
   private final Class<? extends ccw> m;
   private final int n;
   private final String o;

   private cdc(int $$0, Class<? extends ccw> $$1, String $$2) {
      this.n = $$0;
      this.m = $$1;
      this.o = $$2;
   }

   public ccw a(ccm $$0) {
      try {
         Constructor<? extends ccw> $$1 = this.a();
         return $$1.newInstance($$0);
      } catch (Exception var3) {
         throw new Error(var3);
      }
   }

   protected Constructor<? extends ccw> a() throws NoSuchMethodException {
      return this.m.getConstructor(ccm.class);
   }

   public int b() {
      return this.n;
   }

   @Override
   public String toString() {
      return this.o + " (#" + this.n + ")";
   }

   public static cdc<?> a(int $$0) {
      return $$0 >= 0 && $$0 < l.length ? l[$$0] : a;
   }

   public static int c() {
      return l.length;
   }

   private static <T extends ccw> cdc<T> a(Class<T> $$0, String $$1) {
      cdc<T> $$2 = new cdc<>(l.length, $$0, $$1);
      l = Arrays.copyOf(l, l.length + 1);
      l[$$2.b()] = $$2;
      return $$2;
   }
}
