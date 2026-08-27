import java.util.Comparator;

public class apb<T> {
   private final String i;
   private final Comparator<T> j;
   private final long k;
   public static final apb<axk> a = a("start", ($$0, $$1) -> 0);
   public static final apb<axk> b = a("dragon", ($$0, $$1) -> 0);
   public static final apb<cuy> c = a("player", Comparator.comparingLong(cuy::a));
   public static final apb<cuy> d = a("forced", Comparator.comparingLong(cuy::a));
   public static final apb<cuy> e = a("light", Comparator.comparingLong(cuy::a));
   public static final apb<hz> f = a("portal", jd::i, 300);
   public static final apb<Integer> g = a("post_teleport", Integer::compareTo, 5);
   public static final apb<cuy> h = a("unknown", Comparator.comparingLong(cuy::a), 1);

   public static <T> apb<T> a(String $$0, Comparator<T> $$1) {
      return new apb<>($$0, $$1, 0L);
   }

   public static <T> apb<T> a(String $$0, Comparator<T> $$1, int $$2) {
      return new apb<>($$0, $$1, (long)$$2);
   }

   protected apb(String $$0, Comparator<T> $$1, long $$2) {
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
