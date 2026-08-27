import java.lang.reflect.Constructor;
import java.util.Arrays;

public class bur<T extends bul> {
   private static bur<?>[] l = new bur[0];
   public static final bur<buh> a = a(buh.class, "HoldingPattern");
   public static final bur<bup> b = a(bup.class, "StrafePlayer");
   public static final bur<buj> c = a(buj.class, "LandingApproach");
   public static final bur<buk> d = a(buk.class, "Landing");
   public static final bur<buq> e = a(buq.class, "Takeoff");
   public static final bur<bun> f = a(bun.class, "SittingFlaming");
   public static final bur<buo> g = a(buo.class, "SittingScanning");
   public static final bur<bum> h = a(bum.class, "SittingAttacking");
   public static final bur<buf> i = a(buf.class, "ChargingPlayer");
   public static final bur<bug> j = a(bug.class, "Dying");
   public static final bur<bui> k = a(bui.class, "Hover");
   private final Class<? extends bul> m;
   private final int n;
   private final String o;

   private bur(int $$0, Class<? extends bul> $$1, String $$2) {
      this.n = $$0;
      this.m = $$1;
      this.o = $$2;
   }

   public bul a(bub $$0) {
      try {
         Constructor<? extends bul> $$1 = this.a();
         return $$1.newInstance($$0);
      } catch (Exception var3) {
         throw new Error(var3);
      }
   }

   protected Constructor<? extends bul> a() throws NoSuchMethodException {
      return this.m.getConstructor(bub.class);
   }

   public int b() {
      return this.n;
   }

   @Override
   public String toString() {
      return this.o + " (#" + this.n + ")";
   }

   public static bur<?> a(int $$0) {
      return $$0 >= 0 && $$0 < l.length ? l[$$0] : a;
   }

   public static int c() {
      return l.length;
   }

   private static <T extends bul> bur<T> a(Class<T> $$0, String $$1) {
      bur<T> $$2 = new bur<>(l.length, $$0, $$1);
      l = Arrays.copyOf(l, l.length + 1);
      l[$$2.b()] = $$2;
      return $$2;
   }
}
