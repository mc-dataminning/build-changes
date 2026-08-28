import java.util.Comparator;

public class aqp<T> {
   private final String i;
   private final Comparator<T> j;
   private final long k;
   public static final aqp<azh> a = a("start", ($$0, $$1) -> 0);
   public static final aqp<azh> b = a("dragon", ($$0, $$1) -> 0);
   public static final aqp<dbk> c = a("player", Comparator.comparingLong(dbk::a));
   public static final aqp<dbk> d = a("forced", Comparator.comparingLong(dbk::a));
   public static final aqp<dbk> e = a("light", Comparator.comparingLong(dbk::a));
   public static final aqp<ja> f = a("portal", ke::i, 300);
   public static final aqp<Integer> g = a("post_teleport", Integer::compareTo, 5);
   public static final aqp<dbk> h = a("unknown", Comparator.comparingLong(dbk::a), 1);

   public static <T> aqp<T> a(String $$0, Comparator<T> $$1) {
      return new aqp<>($$0, $$1, 0L);
   }

   public static <T> aqp<T> a(String $$0, Comparator<T> $$1, int $$2) {
      return new aqp<>($$0, $$1, (long)$$2);
   }

   protected aqp(String $$0, Comparator<T> $$1, long $$2) {
      this.i = $$0;
      this.j = $$1;
      this.k = $$2;
   }

   @Override
   public String toString() {
      return this.i;
   }

   public Comparator<T> a() {
      return this.j;
   }

   public long b() {
      return this.k;
   }
}
