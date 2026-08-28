import java.lang.reflect.Constructor;
import java.util.Arrays;

public class cid<T extends chx> {
   private static cid<?>[] l = new cid[0];
   public static final cid<cht> a = a(cht.class, "HoldingPattern");
   public static final cid<cib> b = a(cib.class, "StrafePlayer");
   public static final cid<chv> c = a(chv.class, "LandingApproach");
   public static final cid<chw> d = a(chw.class, "Landing");
   public static final cid<cic> e = a(cic.class, "Takeoff");
   public static final cid<chz> f = a(chz.class, "SittingFlaming");
   public static final cid<cia> g = a(cia.class, "SittingScanning");
   public static final cid<chy> h = a(chy.class, "SittingAttacking");
   public static final cid<chr> i = a(chr.class, "ChargingPlayer");
   public static final cid<chs> j = a(chs.class, "Dying");
   public static final cid<chu> k = a(chu.class, "Hover");
   private final Class<? extends chx> m;
   private final int n;
   private final String o;

   private cid(int $$0, Class<? extends chx> $$1, String $$2) {
      this.n = $$0;
      this.m = $$1;
      this.o = $$2;
   }

   public chx a(chn $$0) {
      try {
         Constructor<? extends chx> $$1 = this.a();
         return $$1.newInstance($$0);
      } catch (Exception var3) {
         throw new Error(var3);
      }
   }

   protected Constructor<? extends chx> a() throws NoSuchMethodException {
      return this.m.getConstructor(chn.class);
   }

   public int b() {
      return this.n;
   }

   @Override
   public String toString() {
      return this.o + " (#" + this.n + ")";
   }

   public static cid<?> a(int $$0) {
      return $$0 >= 0 && $$0 < l.length ? l[$$0] : a;
   }

   public static int c() {
      return l.length;
   }

   private static <T extends chx> cid<T> a(Class<T> $$0, String $$1) {
      cid<T> $$2 = new cid<>(l.length, $$0, $$1);
      l = Arrays.copyOf(l, l.length + 1);
      l[$$2.b()] = $$2;
      return $$2;
   }
}
