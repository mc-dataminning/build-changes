import java.util.Comparator;

public class apf<T> {
   private final String i;
   private final Comparator<T> j;
   private final long k;
   public static final apf<axo> a = a("start", ($$0, $$1) -> 0);
   public static final apf<axo> b = a("dragon", ($$0, $$1) -> 0);
   public static final apf<cvl> c = a("player", Comparator.comparingLong(cvl::a));
   public static final apf<cvl> d = a("forced", Comparator.comparingLong(cvl::a));
   public static final apf<cvl> e = a("light", Comparator.comparingLong(cvl::a));
   public static final apf<ib> f = a("portal", jf::i, 300);
   public static final apf<Integer> g = a("post_teleport", Integer::compareTo, 5);
   public static final apf<cvl> h = a("unknown", Comparator.comparingLong(cvl::a), 1);

   public static <T> apf<T> a(String $$0, Comparator<T> $$1) {
      return new apf<>($$0, $$1, 0L);
   }

   public static <T> apf<T> a(String $$0, Comparator<T> $$1, int $$2) {
      return new apf<>($$0, $$1, (long)$$2);
   }

   protected apf(String $$0, Comparator<T> $$1, long $$2) {
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
