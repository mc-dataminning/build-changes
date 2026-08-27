import java.util.Comparator;

public class ane<T> {
   private final String i;
   private final Comparator<T> j;
   private final long k;
   public static final ane<avm> a = a("start", ($$0, $$1) -> 0);
   public static final ane<avm> b = a("dragon", ($$0, $$1) -> 0);
   public static final ane<csp> c = a("player", Comparator.comparingLong(csp::a));
   public static final ane<csp> d = a("forced", Comparator.comparingLong(csp::a));
   public static final ane<csp> e = a("light", Comparator.comparingLong(csp::a));
   public static final ane<hx> f = a("portal", jb::i, 300);
   public static final ane<Integer> g = a("post_teleport", Integer::compareTo, 5);
   public static final ane<csp> h = a("unknown", Comparator.comparingLong(csp::a), 1);

   public static <T> ane<T> a(String $$0, Comparator<T> $$1) {
      return new ane<>($$0, $$1, 0L);
   }

   public static <T> ane<T> a(String $$0, Comparator<T> $$1, int $$2) {
      return new ane<>($$0, $$1, (long)$$2);
   }

   protected ane(String $$0, Comparator<T> $$1, long $$2) {
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
