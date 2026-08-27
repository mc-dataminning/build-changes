import java.util.Comparator;

public class aqj<T> {
   private final String i;
   private final Comparator<T> j;
   private final long k;
   public static final aqj<ayy> a = a("start", ($$0, $$1) -> 0);
   public static final aqj<ayy> b = a("dragon", ($$0, $$1) -> 0);
   public static final aqj<czb> c = a("player", Comparator.comparingLong(czb::a));
   public static final aqj<czb> d = a("forced", Comparator.comparingLong(czb::a));
   public static final aqj<czb> e = a("light", Comparator.comparingLong(czb::a));
   public static final aqj<im> f = a("portal", jq::i, 300);
   public static final aqj<Integer> g = a("post_teleport", Integer::compareTo, 5);
   public static final aqj<czb> h = a("unknown", Comparator.comparingLong(czb::a), 1);

   public static <T> aqj<T> a(String $$0, Comparator<T> $$1) {
      return new aqj<>($$0, $$1, 0L);
   }

   public static <T> aqj<T> a(String $$0, Comparator<T> $$1, int $$2) {
      return new aqj<>($$0, $$1, (long)$$2);
   }

   protected aqj(String $$0, Comparator<T> $$1, long $$2) {
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
