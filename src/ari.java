import java.util.Comparator;

public class ari<T> {
   private final String h;
   private final Comparator<T> i;
   private final long j;
   public static final ari<baf> a = a("start", ($$0, $$1) -> 0);
   public static final ari<baf> b = a("dragon", ($$0, $$1) -> 0);
   public static final ari<dfo> c = a("player", Comparator.comparingLong(dfo::a));
   public static final ari<dfo> d = a("forced", Comparator.comparingLong(dfo::a));
   public static final ari<ji> e = a("portal", km::i, 300);
   public static final ari<dfo> f = a("ender_pearl", Comparator.comparingLong(dfo::a), 40);
   public static final ari<dfo> g = a("unknown", Comparator.comparingLong(dfo::a), 1);

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
