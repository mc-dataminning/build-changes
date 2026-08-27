import java.util.Comparator;

public class apx<T> {
   private final String i;
   private final Comparator<T> j;
   private final long k;
   public static final apx<aym> a = a("start", ($$0, $$1) -> 0);
   public static final apx<aym> b = a("dragon", ($$0, $$1) -> 0);
   public static final apx<cye> c = a("player", Comparator.comparingLong(cye::a));
   public static final apx<cye> d = a("forced", Comparator.comparingLong(cye::a));
   public static final apx<cye> e = a("light", Comparator.comparingLong(cye::a));
   public static final apx<ib> f = a("portal", jg::i, 300);
   public static final apx<Integer> g = a("post_teleport", Integer::compareTo, 5);
   public static final apx<cye> h = a("unknown", Comparator.comparingLong(cye::a), 1);

   public static <T> apx<T> a(String $$0, Comparator<T> $$1) {
      return new apx<>($$0, $$1, 0L);
   }

   public static <T> apx<T> a(String $$0, Comparator<T> $$1, int $$2) {
      return new apx<>($$0, $$1, (long)$$2);
   }

   protected apx(String $$0, Comparator<T> $$1, long $$2) {
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
