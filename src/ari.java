import java.util.Comparator;

public class ari<T> {
   private final String h;
   private final Comparator<T> i;
   private final long j;
   public static final ari<bae> a = a("start", ($$0, $$1) -> 0);
   public static final ari<bae> b = a("dragon", ($$0, $$1) -> 0);
   public static final ari<dfm> c = a("player", Comparator.comparingLong(dfm::a));
   public static final ari<dfm> d = a("forced", Comparator.comparingLong(dfm::a));
   public static final ari<ji> e = a("portal", km::i, 300);
   public static final ari<dfm> f = a("ender_pearl", Comparator.comparingLong(dfm::a), 40);
   public static final ari<dfm> g = a("unknown", Comparator.comparingLong(dfm::a), 1);

   public static <T> ari<T> a(String $$0, Comparator<T> $$1) {
      return new ari<>($$0, $$1, 0L);
   }

   public static <T> ari<T> a(String $$0, Comparator<T> $$1, int $$2) {
      return new ari<>($$0, $$1, (long)$$2);
   }

   protected ari(String $$0, Comparator<T> $$1, long $$2) {
      this.h = $$0;
      this.i = $$1;
      this.j = $$2;
   }

   @Override
   public String toString() {
      return this.h;
   }

   public Comparator<T> a() {
      return this.i;
   }

   public long b() {
      return this.j;
   }
}
