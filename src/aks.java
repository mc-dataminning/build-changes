import java.util.Comparator;

public class aks<T> {
   private final String i;
   private final Comparator<T> j;
   private final long k;
   public static final aks<ass> a = a("start", ($$0, $$1) -> 0);
   public static final aks<ass> b = a("dragon", ($$0, $$1) -> 0);
   public static final aks<cox> c = a("player", Comparator.comparingLong(cox::a));
   public static final aks<cox> d = a("forced", Comparator.comparingLong(cox::a));
   public static final aks<cox> e = a("light", Comparator.comparingLong(cox::a));
   public static final aks<gw> f = a("portal", ib::i, 300);
   public static final aks<Integer> g = a("post_teleport", Integer::compareTo, 5);
   public static final aks<cox> h = a("unknown", Comparator.comparingLong(cox::a), 1);

   public static <T> aks<T> a(String $$0, Comparator<T> $$1) {
      return new aks<>($$0, $$1, 0L);
   }

   public static <T> aks<T> a(String $$0, Comparator<T> $$1, int $$2) {
      return new aks<>($$0, $$1, (long)$$2);
   }

   protected aks(String $$0, Comparator<T> $$1, long $$2) {
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
