import java.util.Comparator;

public class aqy<T> {
   private final String h;
   private final Comparator<T> i;
   private final long j;
   public static final aqy<azr> a = a("start", ($$0, $$1) -> 0);
   public static final aqy<azr> b = a("dragon", ($$0, $$1) -> 0);
   public static final aqy<dcb> c = a("player", Comparator.comparingLong(dcb::a));
   public static final aqy<dcb> d = a("forced", Comparator.comparingLong(dcb::a));
   public static final aqy<jd> e = a("portal", kh::i, 300);
   public static final aqy<Integer> f = a("post_teleport", Integer::compareTo, 5);
   public static final aqy<dcb> g = a("unknown", Comparator.comparingLong(dcb::a), 1);

   public static <T> aqy<T> a(String $$0, Comparator<T> $$1) {
      return new aqy<>($$0, $$1, 0L);
   }

   public static <T> aqy<T> a(String $$0, Comparator<T> $$1, int $$2) {
      return new aqy<>($$0, $$1, (long)$$2);
   }

   protected aqy(String $$0, Comparator<T> $$1, long $$2) {
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
