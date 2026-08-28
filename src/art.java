import java.util.Comparator;

public class art<T> {
   private final String i;
   private final Comparator<T> j;
   private final long k;
   public static final art<bap> a = a("start", ($$0, $$1) -> 0);
   public static final art<bap> b = a("dragon", ($$0, $$1) -> 0);
   public static final art<deh> c = a("player", Comparator.comparingLong(deh::a));
   public static final art<deh> d = a("forced", Comparator.comparingLong(deh::a));
   public static final art<jh> e = a("portal", kl::i, 300);
   public static final art<deh> f = a("ender_pearl", Comparator.comparingLong(deh::a), 40);
   public static final art<Integer> g = a("post_teleport", Integer::compareTo, 5);
   public static final art<deh> h = a("unknown", Comparator.comparingLong(deh::a), 1);

   public static <T> art<T> a(String $$0, Comparator<T> $$1) {
      return new art<>($$0, $$1, 0L);
   }

   public static <T> art<T> a(String $$0, Comparator<T> $$1, int $$2) {
      return new art<>($$0, $$1, (long)$$2);
   }

   protected art(String $$0, Comparator<T> $$1, long $$2) {
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
