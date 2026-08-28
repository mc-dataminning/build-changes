import java.util.Comparator;

public class arl<T> {
   private final String h;
   private final Comparator<T> i;
   private final long j;
   public static final arl<bah> a = a("start", ($$0, $$1) -> 0);
   public static final arl<bah> b = a("dragon", ($$0, $$1) -> 0);
   public static final arl<dcy> c = a("player", Comparator.comparingLong(dcy::a));
   public static final arl<dcy> d = a("forced", Comparator.comparingLong(dcy::a));
   public static final arl<je> e = a("portal", ki::i, 300);
   public static final arl<Integer> f = a("post_teleport", Integer::compareTo, 5);
   public static final arl<dcy> g = a("unknown", Comparator.comparingLong(dcy::a), 1);

   public static <T> arl<T> a(String $$0, Comparator<T> $$1) {
      return new arl<>($$0, $$1, 0L);
   }

   public static <T> arl<T> a(String $$0, Comparator<T> $$1, int $$2) {
      return new arl<>($$0, $$1, (long)$$2);
   }

   protected arl(String $$0, Comparator<T> $$1, long $$2) {
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
