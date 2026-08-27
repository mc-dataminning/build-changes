import java.util.Comparator;

public class anj<T> {
   private final String i;
   private final Comparator<T> j;
   private final long k;
   public static final anj<avt> a = a("start", ($$0, $$1) -> 0);
   public static final anj<avt> b = a("dragon", ($$0, $$1) -> 0);
   public static final anj<cte> c = a("player", Comparator.comparingLong(cte::a));
   public static final anj<cte> d = a("forced", Comparator.comparingLong(cte::a));
   public static final anj<cte> e = a("light", Comparator.comparingLong(cte::a));
   public static final anj<hx> f = a("portal", jb::i, 300);
   public static final anj<Integer> g = a("post_teleport", Integer::compareTo, 5);
   public static final anj<cte> h = a("unknown", Comparator.comparingLong(cte::a), 1);

   public static <T> anj<T> a(String $$0, Comparator<T> $$1) {
      return new anj<>($$0, $$1, 0L);
   }

   public static <T> anj<T> a(String $$0, Comparator<T> $$1, int $$2) {
      return new anj<>($$0, $$1, (long)$$2);
   }

   protected anj(String $$0, Comparator<T> $$1, long $$2) {
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
