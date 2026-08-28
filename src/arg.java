import java.util.Comparator;

public class arg<T> {
   private final String i;
   private final Comparator<T> j;
   private final long k;
   public static final arg<azx> a = a("start", ($$0, $$1) -> 0);
   public static final arg<azx> b = a("dragon", ($$0, $$1) -> 0);
   public static final arg<dba> c = a("player", Comparator.comparingLong(dba::a));
   public static final arg<dba> d = a("forced", Comparator.comparingLong(dba::a));
   public static final arg<dba> e = a("light", Comparator.comparingLong(dba::a));
   public static final arg<iz> f = a("portal", kd::i, 300);
   public static final arg<Integer> g = a("post_teleport", Integer::compareTo, 5);
   public static final arg<dba> h = a("unknown", Comparator.comparingLong(dba::a), 1);

   public static <T> arg<T> a(String $$0, Comparator<T> $$1) {
      return new arg<>($$0, $$1, 0L);
   }

   public static <T> arg<T> a(String $$0, Comparator<T> $$1, int $$2) {
      return new arg<>($$0, $$1, (long)$$2);
   }

   protected arg(String $$0, Comparator<T> $$1, long $$2) {
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
