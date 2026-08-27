import java.util.Comparator;

public class apk<T> {
   private final String i;
   private final Comparator<T> j;
   private final long k;
   public static final apk<axy> a = a("start", ($$0, $$1) -> 0);
   public static final apk<axy> b = a("dragon", ($$0, $$1) -> 0);
   public static final apk<cwi> c = a("player", Comparator.comparingLong(cwi::a));
   public static final apk<cwi> d = a("forced", Comparator.comparingLong(cwi::a));
   public static final apk<cwi> e = a("light", Comparator.comparingLong(cwi::a));
   public static final apk<ib> f = a("portal", jg::i, 300);
   public static final apk<Integer> g = a("post_teleport", Integer::compareTo, 5);
   public static final apk<cwi> h = a("unknown", Comparator.comparingLong(cwi::a), 1);

   public static <T> apk<T> a(String $$0, Comparator<T> $$1) {
      return new apk<>($$0, $$1, 0L);
   }

   public static <T> apk<T> a(String $$0, Comparator<T> $$1, int $$2) {
      return new apk<>($$0, $$1, (long)$$2);
   }

   protected apk(String $$0, Comparator<T> $$1, long $$2) {
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
