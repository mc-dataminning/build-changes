import java.util.Comparator;

public class akx<T> {
   private final String i;
   private final Comparator<T> j;
   private final long k;
   public static final akx<asz> a = a("start", ($$0, $$1) -> 0);
   public static final akx<asz> b = a("dragon", ($$0, $$1) -> 0);
   public static final akx<cpe> c = a("player", Comparator.comparingLong(cpe::a));
   public static final akx<cpe> d = a("forced", Comparator.comparingLong(cpe::a));
   public static final akx<cpe> e = a("light", Comparator.comparingLong(cpe::a));
   public static final akx<gw> f = a("portal", ib::i, 300);
   public static final akx<Integer> g = a("post_teleport", Integer::compareTo, 5);
   public static final akx<cpe> h = a("unknown", Comparator.comparingLong(cpe::a), 1);

   public static <T> akx<T> a(String $$0, Comparator<T> $$1) {
      return new akx<>($$0, $$1, 0L);
   }

   public static <T> akx<T> a(String $$0, Comparator<T> $$1, int $$2) {
      return new akx<>($$0, $$1, (long)$$2);
   }

   protected akx(String $$0, Comparator<T> $$1, long $$2) {
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
