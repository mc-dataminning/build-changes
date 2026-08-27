import java.util.Comparator;

public class akp<T> {
   private final String i;
   private final Comparator<T> j;
   private final long k;
   public static final akp<asp> a = a("start", ($$0, $$1) -> 0);
   public static final akp<asp> b = a("dragon", ($$0, $$1) -> 0);
   public static final akp<cos> c = a("player", Comparator.comparingLong(cos::a));
   public static final akp<cos> d = a("forced", Comparator.comparingLong(cos::a));
   public static final akp<cos> e = a("light", Comparator.comparingLong(cos::a));
   public static final akp<gu> f = a("portal", hz::i, 300);
   public static final akp<Integer> g = a("post_teleport", Integer::compareTo, 5);
   public static final akp<cos> h = a("unknown", Comparator.comparingLong(cos::a), 1);

   public static <T> akp<T> a(String $$0, Comparator<T> $$1) {
      return new akp<>($$0, $$1, 0L);
   }

   public static <T> akp<T> a(String $$0, Comparator<T> $$1, int $$2) {
      return new akp<>($$0, $$1, (long)$$2);
   }

   protected akp(String $$0, Comparator<T> $$1, long $$2) {
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
