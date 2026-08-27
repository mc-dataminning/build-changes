import java.util.Comparator;

public class akn<T> {
   private final String i;
   private final Comparator<T> j;
   private final long k;
   public static final akn<asn> a = a("start", ($$0, $$1) -> 0);
   public static final akn<asn> b = a("dragon", ($$0, $$1) -> 0);
   public static final akn<cor> c = a("player", Comparator.comparingLong(cor::a));
   public static final akn<cor> d = a("forced", Comparator.comparingLong(cor::a));
   public static final akn<cor> e = a("light", Comparator.comparingLong(cor::a));
   public static final akn<gv> f = a("portal", ia::i, 300);
   public static final akn<Integer> g = a("post_teleport", Integer::compareTo, 5);
   public static final akn<cor> h = a("unknown", Comparator.comparingLong(cor::a), 1);

   public static <T> akn<T> a(String $$0, Comparator<T> $$1) {
      return new akn<>($$0, $$1, 0L);
   }

   public static <T> akn<T> a(String $$0, Comparator<T> $$1, int $$2) {
      return new akn<>($$0, $$1, (long)$$2);
   }

   protected akn(String $$0, Comparator<T> $$1, long $$2) {
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
