import java.util.Comparator;

public class asn<T> {
   private final String i;
   private final Comparator<T> j;
   private final long k;
   public static final asn<bbk> a = a("start", ($$0, $$1) -> 0);
   public static final asn<bbk> b = a("dragon", ($$0, $$1) -> 0);
   public static final asn<dgg> c = a("player", Comparator.comparingLong(dgg::a));
   public static final asn<dgg> d = a("forced", Comparator.comparingLong(dgg::a));
   public static final asn<jh> e = a("portal", kl::i, 300);
   public static final asn<dgg> f = a("ender_pearl", Comparator.comparingLong(dgg::a), 40);
   public static final asn<Integer> g = a("post_teleport", Integer::compareTo, 5);
   public static final asn<dgg> h = a("unknown", Comparator.comparingLong(dgg::a), 1);

   public static <T> asn<T> a(String $$0, Comparator<T> $$1) {
      return new asn<>($$0, $$1, 0L);
   }

   public static <T> asn<T> a(String $$0, Comparator<T> $$1, int $$2) {
      return new asn<>($$0, $$1, (long)$$2);
   }

   protected asn(String $$0, Comparator<T> $$1, long $$2) {
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
