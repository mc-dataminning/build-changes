import java.util.Comparator;

public class aqr<T> {
   private final String i;
   private final Comparator<T> j;
   private final long k;
   public static final aqr<azf> a = a("start", ($$0, $$1) -> 0);
   public static final aqr<azf> b = a("dragon", ($$0, $$1) -> 0);
   public static final aqr<dae> c = a("player", Comparator.comparingLong(dae::a));
   public static final aqr<dae> d = a("forced", Comparator.comparingLong(dae::a));
   public static final aqr<dae> e = a("light", Comparator.comparingLong(dae::a));
   public static final aqr<io> f = a("portal", js::i, 300);
   public static final aqr<Integer> g = a("post_teleport", Integer::compareTo, 5);
   public static final aqr<dae> h = a("unknown", Comparator.comparingLong(dae::a), 1);

   public static <T> aqr<T> a(String $$0, Comparator<T> $$1) {
      return new aqr<>($$0, $$1, 0L);
   }

   public static <T> aqr<T> a(String $$0, Comparator<T> $$1, int $$2) {
      return new aqr<>($$0, $$1, (long)$$2);
   }

   protected aqr(String $$0, Comparator<T> $$1, long $$2) {
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
