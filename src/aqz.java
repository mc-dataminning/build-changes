import java.util.Comparator;

public class aqz<T> {
   private final String h;
   private final Comparator<T> i;
   private final long j;
   public static final aqz<azs> a = a("start", ($$0, $$1) -> 0);
   public static final aqz<azs> b = a("dragon", ($$0, $$1) -> 0);
   public static final aqz<dcd> c = a("player", Comparator.comparingLong(dcd::a));
   public static final aqz<dcd> d = a("forced", Comparator.comparingLong(dcd::a));
   public static final aqz<jd> e = a("portal", kh::i, 300);
   public static final aqz<Integer> f = a("post_teleport", Integer::compareTo, 5);
   public static final aqz<dcd> g = a("unknown", Comparator.comparingLong(dcd::a), 1);

   public static <T> aqz<T> a(String $$0, Comparator<T> $$1) {
      return new aqz<>($$0, $$1, 0L);
   }

   public static <T> aqz<T> a(String $$0, Comparator<T> $$1, int $$2) {
      return new aqz<>($$0, $$1, (long)$$2);
   }

   protected aqz(String $$0, Comparator<T> $$1, long $$2) {
      this.h = $$0;
      this.i = $$1;
      this.j = $$2;
   }

   @Override
   public String toString() {
      return this.h;
   }

   public Comparator<T> a() {
      return this.i;
   }

   public long b() {
      return this.j;
   }
}
