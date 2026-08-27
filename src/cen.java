import java.lang.reflect.Constructor;
import java.util.Arrays;

public class cen<T extends ceh> {
   private static cen<?>[] l = new cen[0];
   public static final cen<ced> a = a(ced.class, "HoldingPattern");
   public static final cen<cel> b = a(cel.class, "StrafePlayer");
   public static final cen<cef> c = a(cef.class, "LandingApproach");
   public static final cen<ceg> d = a(ceg.class, "Landing");
   public static final cen<cem> e = a(cem.class, "Takeoff");
   public static final cen<cej> f = a(cej.class, "SittingFlaming");
   public static final cen<cek> g = a(cek.class, "SittingScanning");
   public static final cen<cei> h = a(cei.class, "SittingAttacking");
   public static final cen<ceb> i = a(ceb.class, "ChargingPlayer");
   public static final cen<cec> j = a(cec.class, "Dying");
   public static final cen<cee> k = a(cee.class, "Hover");
   private final Class<? extends ceh> m;
   private final int n;
   private final String o;

   private cen(int $$0, Class<? extends ceh> $$1, String $$2) {
      this.n = $$0;
      this.m = $$1;
      this.o = $$2;
   }

   public ceh a(cdx $$0) {
      try {
         Constructor<? extends ceh> $$1 = this.a();
         return $$1.newInstance($$0);
      } catch (Exception var3) {
         throw new Error(var3);
      }
   }

   protected Constructor<? extends ceh> a() throws NoSuchMethodException {
      return this.m.getConstructor(cdx.class);
   }

   public int b() {
      return this.n;
   }

   @Override
   public String toString() {
      return this.o + " (#" + this.n + ")";
   }

   public static cen<?> a(int $$0) {
      return $$0 >= 0 && $$0 < l.length ? l[$$0] : a;
   }

   public static int c() {
      return l.length;
   }

   private static <T extends ceh> cen<T> a(Class<T> $$0, String $$1) {
      cen<T> $$2 = new cen<>(l.length, $$0, $$1);
      l = Arrays.copyOf(l, l.length + 1);
      l[$$2.b()] = $$2;
      return $$2;
   }
}
