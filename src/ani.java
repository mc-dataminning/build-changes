import java.util.Comparator;

public class ani<T> {
   private final String i;
   private final Comparator<T> j;
   private final long k;
   public static final ani<avr> a = a("start", ($$0, $$1) -> 0);
   public static final ani<avr> b = a("dragon", ($$0, $$1) -> 0);
   public static final ani<csv> c = a("player", Comparator.comparingLong(csv::a));
   public static final ani<csv> d = a("forced", Comparator.comparingLong(csv::a));
   public static final ani<csv> e = a("light", Comparator.comparingLong(csv::a));
   public static final ani<hx> f = a("portal", jb::i, 300);
   public static final ani<Integer> g = a("post_teleport", Integer::compareTo, 5);
   public static final ani<csv> h = a("unknown", Comparator.comparingLong(csv::a), 1);

   public static <T> ani<T> a(String $$0, Comparator<T> $$1) {
      return new ani<>($$0, $$1, 0L);
   }

   public static <T> ani<T> a(String $$0, Comparator<T> $$1, int $$2) {
      return new ani<>($$0, $$1, (long)$$2);
   }

   protected ani(String $$0, Comparator<T> $$1, long $$2) {
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
