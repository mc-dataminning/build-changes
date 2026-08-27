import java.util.Comparator;

public class amf<T> {
   private final String i;
   private final Comparator<T> j;
   private final long k;
   public static final amf<auj> a = a("start", ($$0, $$1) -> 0);
   public static final amf<auj> b = a("dragon", ($$0, $$1) -> 0);
   public static final amf<cqz> c = a("player", Comparator.comparingLong(cqz::a));
   public static final amf<cqz> d = a("forced", Comparator.comparingLong(cqz::a));
   public static final amf<cqz> e = a("light", Comparator.comparingLong(cqz::a));
   public static final amf<ht> f = a("portal", iw::i, 300);
   public static final amf<Integer> g = a("post_teleport", Integer::compareTo, 5);
   public static final amf<cqz> h = a("unknown", Comparator.comparingLong(cqz::a), 1);

   public static <T> amf<T> a(String $$0, Comparator<T> $$1) {
      return new amf<>($$0, $$1, 0L);
   }

   public static <T> amf<T> a(String $$0, Comparator<T> $$1, int $$2) {
      return new amf<>($$0, $$1, (long)$$2);
   }

   protected amf(String $$0, Comparator<T> $$1, long $$2) {
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
