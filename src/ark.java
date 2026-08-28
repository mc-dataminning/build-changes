import java.util.Comparator;

public class ark<T> {
   private final String i;
   private final Comparator<T> j;
   private final long k;
   public static final ark<bac> a = a("start", ($$0, $$1) -> 0);
   public static final ark<bac> b = a("dragon", ($$0, $$1) -> 0);
   public static final ark<dbf> c = a("player", Comparator.comparingLong(dbf::a));
   public static final ark<dbf> d = a("forced", Comparator.comparingLong(dbf::a));
   public static final ark<dbf> e = a("light", Comparator.comparingLong(dbf::a));
   public static final ark<iz> f = a("portal", kd::i, 300);
   public static final ark<Integer> g = a("post_teleport", Integer::compareTo, 5);
   public static final ark<dbf> h = a("unknown", Comparator.comparingLong(dbf::a), 1);

   public static <T> ark<T> a(String $$0, Comparator<T> $$1) {
      return new ark<>($$0, $$1, 0L);
   }

   public static <T> ark<T> a(String $$0, Comparator<T> $$1, int $$2) {
      return new ark<>($$0, $$1, (long)$$2);
   }

   protected ark(String $$0, Comparator<T> $$1, long $$2) {
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
