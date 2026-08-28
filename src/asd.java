import java.util.Comparator;

public class asd<T> {
   private final String h;
   private final Comparator<T> i;
   private final long j;
   public static final asd<bba> a = a("start", ($$0, $$1) -> 0);
   public static final asd<bba> b = a("dragon", ($$0, $$1) -> 0);
   public static final asd<dgf> c = a("player", Comparator.comparingLong(dgf::a));
   public static final asd<dgf> d = a("forced", Comparator.comparingLong(dgf::a));
   public static final asd<jh> e = a("portal", kl::i, 300);
   public static final asd<dgf> f = a("ender_pearl", Comparator.comparingLong(dgf::a), 40);
   public static final asd<dgf> g = a("unknown", Comparator.comparingLong(dgf::a), 1);

   public static <T> asd<T> a(String $$0, Comparator<T> $$1) {
      return new asd<>($$0, $$1, 0L);
   }

   public static <T> asd<T> a(String $$0, Comparator<T> $$1, int $$2) {
      return new asd<>($$0, $$1, (long)$$2);
   }

   protected asd(String $$0, Comparator<T> $$1, long $$2) {
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
