import io.netty.buffer.ByteBuf;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;

public enum bxs {
   a(0),
   b(1),
   c(2),
   d(3),
   e(4),
   f(5),
   g(6),
   h(7),
   i(8);

   public static final Set<bxs> j = Set.of(values());
   public static final Set<bxs> k = Set.of(e, d);
   public static final Set<bxs> l = Set.of(f, g, h, i);
   public static final yw<ByteBuf, Set<bxs>> m = yu.g.a(bxs::a, bxs::a);
   private final int n;

   @SafeVarargs
   public static Set<bxs> a(Set<bxs>... $$0) {
      HashSet<bxs> $$1 = new HashSet<>();

      for (Set<bxs> $$2 : $$0) {
         $$1.addAll($$2);
      }

      return $$1;
   }

   private bxs(final int $$0) {
      this.n = $$0;
   }

   private int a() {
      return 1 << this.n;
   }

   private boolean b(int $$0) {
      return ($$0 & this.a()) == this.a();
   }

   public static Set<bxs> a(int $$0) {
      Set<bxs> $$1 = EnumSet.noneOf(bxs.class);

      for (bxs $$2 : values()) {
         if ($$2.b($$0)) {
            $$1.add($$2);
         }
      }

      return $$1;
   }

   public static int a(Set<bxs> $$0) {
      int $$1 = 0;

      for (bxs $$2 : $$0) {
         $$1 |= $$2.a();
      }

      return $$1;
   }
}
