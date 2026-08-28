import java.util.Comparator;

public class arw<T> {
   private final String i;
   private final Comparator<T> j;
   private final long k;
   public static final arw<bat> a = a("start", ($$0, $$1) -> 0);
   public static final arw<bat> b = a("dragon", ($$0, $$1) -> 0);
   public static final arw<del> c = a("player", Comparator.comparingLong(del::a));
   public static final arw<del> d = a("forced", Comparator.comparingLong(del::a));
   public static final arw<jh> e = a("portal", kl::i, 300);
   public static final arw<del> f = a("ender_pearl", Comparator.comparingLong(del::a), 40);
   public static final arw<Integer> g = a("post_teleport", Integer::compareTo, 5);
   public static final arw<del> h = a("unknown", Comparator.comparingLong(del::a), 1);

   public static <T> arw<T> a(String $$0, Comparator<T> $$1) {
      return new arw<>($$0, $$1, 0L);
   }

   public static <T> arw<T> a(String $$0, Comparator<T> $$1, int $$2) {
      return new arw<>($$0, $$1, (long)$$2);
   }

   protected arw(String $$0, Comparator<T> $$1, long $$2) {
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
