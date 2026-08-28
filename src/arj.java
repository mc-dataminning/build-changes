import java.util.Comparator;

public class arj<T> {
   private final String h;
   private final Comparator<T> i;
   private final long j;
   public static final arj<baf> a = a("start", ($$0, $$1) -> 0);
   public static final arj<baf> b = a("dragon", ($$0, $$1) -> 0);
   public static final arj<dfo> c = a("player", Comparator.comparingLong(dfo::a));
   public static final arj<dfo> d = a("forced", Comparator.comparingLong(dfo::a));
   public static final arj<ji> e = a("portal", km::i, 300);
   public static final arj<dfo> f = a("ender_pearl", Comparator.comparingLong(dfo::a), 40);
   public static final arj<dfo> g = a("unknown", Comparator.comparingLong(dfo::a), 1);

   public static <T> arj<T> a(String $$0, Comparator<T> $$1) {
      return new arj<>($$0, $$1, 0L);
   }

   public static <T> arj<T> a(String $$0, Comparator<T> $$1, int $$2) {
      return new arj<>($$0, $$1, (long)$$2);
   }

   protected arj(String $$0, Comparator<T> $$1, long $$2) {
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
