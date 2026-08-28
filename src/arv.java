import java.util.Comparator;

public class arv<T> {
   private final String i;
   private final Comparator<T> j;
   private final long k;
   public static final arv<bas> a = a("start", ($$0, $$1) -> 0);
   public static final arv<bas> b = a("dragon", ($$0, $$1) -> 0);
   public static final arv<des> c = a("player", Comparator.comparingLong(des::a));
   public static final arv<des> d = a("forced", Comparator.comparingLong(des::a));
   public static final arv<jh> e = a("portal", kl::i, 300);
   public static final arv<des> f = a("ender_pearl", Comparator.comparingLong(des::a), 40);
   public static final arv<Integer> g = a("post_teleport", Integer::compareTo, 5);
   public static final arv<des> h = a("unknown", Comparator.comparingLong(des::a), 1);

   public static <T> arv<T> a(String $$0, Comparator<T> $$1) {
      return new arv<>($$0, $$1, 0L);
   }

   public static <T> arv<T> a(String $$0, Comparator<T> $$1, int $$2) {
      return new arv<>($$0, $$1, (long)$$2);
   }

   protected arv(String $$0, Comparator<T> $$1, long $$2) {
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
