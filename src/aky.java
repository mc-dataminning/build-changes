import java.util.Comparator;

public class aky<T> {
   private final String i;
   private final Comparator<T> j;
   private final long k;
   public static final aky<atc> a = a("start", ($$0, $$1) -> 0);
   public static final aky<atc> b = a("dragon", ($$0, $$1) -> 0);
   public static final aky<cpi> c = a("player", Comparator.comparingLong(cpi::a));
   public static final aky<cpi> d = a("forced", Comparator.comparingLong(cpi::a));
   public static final aky<cpi> e = a("light", Comparator.comparingLong(cpi::a));
   public static final aky<gw> f = a("portal", hy::i, 300);
   public static final aky<Integer> g = a("post_teleport", Integer::compareTo, 5);
   public static final aky<cpi> h = a("unknown", Comparator.comparingLong(cpi::a), 1);

   public static <T> aky<T> a(String $$0, Comparator<T> $$1) {
      return new aky<>($$0, $$1, 0L);
   }

   public static <T> aky<T> a(String $$0, Comparator<T> $$1, int $$2) {
      return new aky<>($$0, $$1, (long)$$2);
   }

   protected aky(String $$0, Comparator<T> $$1, long $$2) {
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
