import java.util.Comparator;

public class arm<T> {
   private final String h;
   private final Comparator<T> i;
   private final long j;
   public static final arm<bai> a = a("start", ($$0, $$1) -> 0);
   public static final arm<bai> b = a("dragon", ($$0, $$1) -> 0);
   public static final arm<ddm> c = a("player", Comparator.comparingLong(ddm::a));
   public static final arm<ddm> d = a("forced", Comparator.comparingLong(ddm::a));
   public static final arm<je> e = a("portal", ki::i, 300);
   public static final arm<Integer> f = a("post_teleport", Integer::compareTo, 5);
   public static final arm<ddm> g = a("unknown", Comparator.comparingLong(ddm::a), 1);

   public static <T> arm<T> a(String $$0, Comparator<T> $$1) {
      return new arm<>($$0, $$1, 0L);
   }

   public static <T> arm<T> a(String $$0, Comparator<T> $$1, int $$2) {
      return new arm<>($$0, $$1, (long)$$2);
   }

   protected arm(String $$0, Comparator<T> $$1, long $$2) {
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
