import java.util.Comparator;

public class ars<T> {
   private final String h;
   private final Comparator<T> i;
   private final long j;
   public static final ars<bao> a = a("start", ($$0, $$1) -> 0);
   public static final ars<bao> b = a("dragon", ($$0, $$1) -> 0);
   public static final ars<deb> c = a("player", Comparator.comparingLong(deb::a));
   public static final ars<deb> d = a("forced", Comparator.comparingLong(deb::a));
   public static final ars<jg> e = a("portal", kk::i, 300);
   public static final ars<Integer> f = a("post_teleport", Integer::compareTo, 5);
   public static final ars<deb> g = a("unknown", Comparator.comparingLong(deb::a), 1);

   public static <T> ars<T> a(String $$0, Comparator<T> $$1) {
      return new ars<>($$0, $$1, 0L);
   }

   public static <T> ars<T> a(String $$0, Comparator<T> $$1, int $$2) {
      return new ars<>($$0, $$1, (long)$$2);
   }

   protected ars(String $$0, Comparator<T> $$1, long $$2) {
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
