import java.util.Comparator;

public class apa<T> {
   private final String i;
   private final Comparator<T> j;
   private final long k;
   public static final apa<axk> a = a("start", ($$0, $$1) -> 0);
   public static final apa<axk> b = a("dragon", ($$0, $$1) -> 0);
   public static final apa<cuu> c = a("player", Comparator.comparingLong(cuu::a));
   public static final apa<cuu> d = a("forced", Comparator.comparingLong(cuu::a));
   public static final apa<cuu> e = a("light", Comparator.comparingLong(cuu::a));
   public static final apa<hz> f = a("portal", jd::i, 300);
   public static final apa<Integer> g = a("post_teleport", Integer::compareTo, 5);
   public static final apa<cuu> h = a("unknown", Comparator.comparingLong(cuu::a), 1);

   public static <T> apa<T> a(String $$0, Comparator<T> $$1) {
      return new apa<>($$0, $$1, 0L);
   }

   public static <T> apa<T> a(String $$0, Comparator<T> $$1, int $$2) {
      return new apa<>($$0, $$1, (long)$$2);
   }

   protected apa(String $$0, Comparator<T> $$1, long $$2) {
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
