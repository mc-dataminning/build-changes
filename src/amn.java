import java.util.Comparator;

public class amn<T> {
   private final String i;
   private final Comparator<T> j;
   private final long k;
   public static final amn<aus> a = a("start", ($$0, $$1) -> 0);
   public static final amn<aus> b = a("dragon", ($$0, $$1) -> 0);
   public static final amn<crm> c = a("player", Comparator.comparingLong(crm::a));
   public static final amn<crm> d = a("forced", Comparator.comparingLong(crm::a));
   public static final amn<crm> e = a("light", Comparator.comparingLong(crm::a));
   public static final amn<hx> f = a("portal", ja::i, 300);
   public static final amn<Integer> g = a("post_teleport", Integer::compareTo, 5);
   public static final amn<crm> h = a("unknown", Comparator.comparingLong(crm::a), 1);

   public static <T> amn<T> a(String $$0, Comparator<T> $$1) {
      return new amn<>($$0, $$1, 0L);
   }

   public static <T> amn<T> a(String $$0, Comparator<T> $$1, int $$2) {
      return new amn<>($$0, $$1, (long)$$2);
   }

   protected amn(String $$0, Comparator<T> $$1, long $$2) {
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
