import io.netty.buffer.ByteBuf;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;

public enum bxq {
   a(0),
   b(1),
   c(2),
   d(3),
   e(4),
   f(5),
   g(6),
   h(7),
   i(8);

   public static final Set<bxq> j = Set.of(values());
   public static final Set<bxq> k = Set.of(e, d);
   public static final Set<bxq> l = Set.of(f, g, h, i);
   public static final yw<ByteBuf, Set<bxq>> m = yu.g.a(bxq::a, bxq::a);
   private final int n;

   @SafeVarargs
   public static Set<bxq> a(Set<bxq>... $$0) {
      HashSet<bxq> $$1 = new HashSet<>();

      for (Set<bxq> $$2 : $$0) {
         $$1.addAll($$2);
      }

      return $$1;
   }

   private bxq(final int $$0) {
      this.n = $$0;
   }

   private int a() {
      return 1 << this.n;
   }

   private boolean b(int $$0) {
      return ($$0 & this.a()) == this.a();
   }

   public static Set<bxq> a(int $$0) {
      Set<bxq> $$1 = EnumSet.noneOf(bxq.class);

      for (bxq $$2 : values()) {
         if ($$2.b($$0)) {
            $$1.add($$2);
         }
      }

      return $$1;
   }

   public static int a(Set<bxq> $$0) {
      int $$1 = 0;

      for (bxq $$2 : $$0) {
         $$1 |= $$2.a();
      }

      return $$1;
   }
}
