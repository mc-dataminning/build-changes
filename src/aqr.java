import java.util.Comparator;

public class aqr<T> {
   private final String h;
   private final Comparator<T> i;
   private final long j;
   public static final aqr<azk> a = a("start", ($$0, $$1) -> 0);
   public static final aqr<azk> b = a("dragon", ($$0, $$1) -> 0);
   public static final aqr<dbn> c = a("player", Comparator.comparingLong(dbn::a));
   public static final aqr<dbn> d = a("forced", Comparator.comparingLong(dbn::a));
   public static final aqr<ja> e = a("portal", ke::i, 300);
   public static final aqr<Integer> f = a("post_teleport", Integer::compareTo, 5);
   public static final aqr<dbn> g = a("unknown", Comparator.comparingLong(dbn::a), 1);

   public static <T> aqr<T> a(String $$0, Comparator<T> $$1) {
      return new aqr<>($$0, $$1, 0L);
   }

   public static <T> aqr<T> a(String $$0, Comparator<T> $$1, int $$2) {
      return new aqr<>($$0, $$1, (long)$$2);
   }

   protected aqr(String $$0, Comparator<T> $$1, long $$2) {
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
