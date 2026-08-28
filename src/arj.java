import java.util.Comparator;

public class arj<T> {
   private final String i;
   private final Comparator<T> j;
   private final long k;
   public static final arj<bab> a = a("start", ($$0, $$1) -> 0);
   public static final arj<bab> b = a("dragon", ($$0, $$1) -> 0);
   public static final arj<dbe> c = a("player", Comparator.comparingLong(dbe::a));
   public static final arj<dbe> d = a("forced", Comparator.comparingLong(dbe::a));
   public static final arj<dbe> e = a("light", Comparator.comparingLong(dbe::a));
   public static final arj<iz> f = a("portal", kd::i, 300);
   public static final arj<Integer> g = a("post_teleport", Integer::compareTo, 5);
   public static final arj<dbe> h = a("unknown", Comparator.comparingLong(dbe::a), 1);

   public static <T> arj<T> a(String $$0, Comparator<T> $$1) {
      return new arj<>($$0, $$1, 0L);
   }

   public static <T> arj<T> a(String $$0, Comparator<T> $$1, int $$2) {
      return new arj<>($$0, $$1, (long)$$2);
   }

   protected arj(String $$0, Comparator<T> $$1, long $$2) {
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
