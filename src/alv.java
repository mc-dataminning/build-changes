import java.util.Comparator;

public class alv<T> {
   private final String i;
   private final Comparator<T> j;
   private final long k;
   public static final alv<atz> a = a("start", ($$0, $$1) -> 0);
   public static final alv<atz> b = a("dragon", ($$0, $$1) -> 0);
   public static final alv<cqg> c = a("player", Comparator.comparingLong(cqg::a));
   public static final alv<cqg> d = a("forced", Comparator.comparingLong(cqg::a));
   public static final alv<cqg> e = a("light", Comparator.comparingLong(cqg::a));
   public static final alv<ht> f = a("portal", iw::i, 300);
   public static final alv<Integer> g = a("post_teleport", Integer::compareTo, 5);
   public static final alv<cqg> h = a("unknown", Comparator.comparingLong(cqg::a), 1);

   public static <T> alv<T> a(String $$0, Comparator<T> $$1) {
      return new alv<>($$0, $$1, 0L);
   }

   public static <T> alv<T> a(String $$0, Comparator<T> $$1, int $$2) {
      return new alv<>($$0, $$1, (long)$$2);
   }

   protected alv(String $$0, Comparator<T> $$1, long $$2) {
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
