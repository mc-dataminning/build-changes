import java.util.Comparator;

public class amj<T> {
   private final String i;
   private final Comparator<T> j;
   private final long k;
   public static final amj<auo> a = a("start", ($$0, $$1) -> 0);
   public static final amj<auo> b = a("dragon", ($$0, $$1) -> 0);
   public static final amj<crh> c = a("player", Comparator.comparingLong(crh::a));
   public static final amj<crh> d = a("forced", Comparator.comparingLong(crh::a));
   public static final amj<crh> e = a("light", Comparator.comparingLong(crh::a));
   public static final amj<ht> f = a("portal", iw::i, 300);
   public static final amj<Integer> g = a("post_teleport", Integer::compareTo, 5);
   public static final amj<crh> h = a("unknown", Comparator.comparingLong(crh::a), 1);

   public static <T> amj<T> a(String $$0, Comparator<T> $$1) {
      return new amj<>($$0, $$1, 0L);
   }

   public static <T> amj<T> a(String $$0, Comparator<T> $$1, int $$2) {
      return new amj<>($$0, $$1, (long)$$2);
   }

   protected amj(String $$0, Comparator<T> $$1, long $$2) {
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
