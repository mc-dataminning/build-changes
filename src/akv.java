import java.util.Comparator;

public class akv<T> {
   private final String i;
   private final Comparator<T> j;
   private final long k;
   public static final akv<asx> a = a("start", ($$0, $$1) -> 0);
   public static final akv<asx> b = a("dragon", ($$0, $$1) -> 0);
   public static final akv<cpc> c = a("player", Comparator.comparingLong(cpc::a));
   public static final akv<cpc> d = a("forced", Comparator.comparingLong(cpc::a));
   public static final akv<cpc> e = a("light", Comparator.comparingLong(cpc::a));
   public static final akv<gw> f = a("portal", hy::i, 300);
   public static final akv<Integer> g = a("post_teleport", Integer::compareTo, 5);
   public static final akv<cpc> h = a("unknown", Comparator.comparingLong(cpc::a), 1);

   public static <T> akv<T> a(String $$0, Comparator<T> $$1) {
      return new akv<>($$0, $$1, 0L);
   }

   public static <T> akv<T> a(String $$0, Comparator<T> $$1, int $$2) {
      return new akv<>($$0, $$1, (long)$$2);
   }

   protected akv(String $$0, Comparator<T> $$1, long $$2) {
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
