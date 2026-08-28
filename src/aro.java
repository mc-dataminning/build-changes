import java.util.Comparator;

public class aro<T> {
   private final String h;
   private final Comparator<T> i;
   private final long j;
   public static final aro<bak> a = a("start", ($$0, $$1) -> 0);
   public static final aro<bak> b = a("dragon", ($$0, $$1) -> 0);
   public static final aro<ddp> c = a("player", Comparator.comparingLong(ddp::a));
   public static final aro<ddp> d = a("forced", Comparator.comparingLong(ddp::a));
   public static final aro<jf> e = a("portal", kj::i, 300);
   public static final aro<Integer> f = a("post_teleport", Integer::compareTo, 5);
   public static final aro<ddp> g = a("unknown", Comparator.comparingLong(ddp::a), 1);

   public static <T> aro<T> a(String $$0, Comparator<T> $$1) {
      return new aro<>($$0, $$1, 0L);
   }

   public static <T> aro<T> a(String $$0, Comparator<T> $$1, int $$2) {
      return new aro<>($$0, $$1, (long)$$2);
   }

   protected aro(String $$0, Comparator<T> $$1, long $$2) {
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
