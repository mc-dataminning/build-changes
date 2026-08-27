import java.util.Comparator;

public class amu<T> {
   private final String i;
   private final Comparator<T> j;
   private final long k;
   public static final amu<avc> a = a("start", ($$0, $$1) -> 0);
   public static final amu<avc> b = a("dragon", ($$0, $$1) -> 0);
   public static final amu<csf> c = a("player", Comparator.comparingLong(csf::a));
   public static final amu<csf> d = a("forced", Comparator.comparingLong(csf::a));
   public static final amu<csf> e = a("light", Comparator.comparingLong(csf::a));
   public static final amu<hv> f = a("portal", iz::i, 300);
   public static final amu<Integer> g = a("post_teleport", Integer::compareTo, 5);
   public static final amu<csf> h = a("unknown", Comparator.comparingLong(csf::a), 1);

   public static <T> amu<T> a(String $$0, Comparator<T> $$1) {
      return new amu<>($$0, $$1, 0L);
   }

   public static <T> amu<T> a(String $$0, Comparator<T> $$1, int $$2) {
      return new amu<>($$0, $$1, (long)$$2);
   }

   protected amu(String $$0, Comparator<T> $$1, long $$2) {
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
