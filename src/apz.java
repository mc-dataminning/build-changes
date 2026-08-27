import java.util.Comparator;

public class apz<T> {
   private final String i;
   private final Comparator<T> j;
   private final long k;
   public static final apz<ayo> a = a("start", ($$0, $$1) -> 0);
   public static final apz<ayo> b = a("dragon", ($$0, $$1) -> 0);
   public static final apz<cyn> c = a("player", Comparator.comparingLong(cyn::a));
   public static final apz<cyn> d = a("forced", Comparator.comparingLong(cyn::a));
   public static final apz<cyn> e = a("light", Comparator.comparingLong(cyn::a));
   public static final apz<id> f = a("portal", ji::i, 300);
   public static final apz<Integer> g = a("post_teleport", Integer::compareTo, 5);
   public static final apz<cyn> h = a("unknown", Comparator.comparingLong(cyn::a), 1);

   public static <T> apz<T> a(String $$0, Comparator<T> $$1) {
      return new apz<>($$0, $$1, 0L);
   }

   public static <T> apz<T> a(String $$0, Comparator<T> $$1, int $$2) {
      return new apz<>($$0, $$1, (long)$$2);
   }

   protected apz(String $$0, Comparator<T> $$1, long $$2) {
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
