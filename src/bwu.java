import io.netty.buffer.ByteBuf;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;

public enum bwu {
   a(0),
   b(1),
   c(2),
   d(3),
   e(4),
   f(5),
   g(6),
   h(7),
   i(8);

   public static final Set<bwu> j = Set.of(values());
   public static final Set<bwu> k = Set.of(e, d);
   public static final Set<bwu> l = Set.of(f, g, h, i);
   public static final zt<ByteBuf, Set<bwu>> m = zr.g.a(bwu::a, bwu::a);
   private final int n;

   @SafeVarargs
   public static Set<bwu> a(Set<bwu>... $$0) {
      HashSet<bwu> $$1 = new HashSet<>();

      for (Set<bwu> $$2 : $$0) {
         $$1.addAll($$2);
      }

      return $$1;
   }

   private bwu(final int $$0) {
      this.n = $$0;
   }

   private int a() {
      return 1 << this.n;
   }

   private boolean b(int $$0) {
      return ($$0 & this.a()) == this.a();
   }

   public static Set<bwu> a(int $$0) {
      Set<bwu> $$1 = EnumSet.noneOf(bwu.class);

      for (bwu $$2 : values()) {
         if ($$2.b($$0)) {
            $$1.add($$2);
         }
      }

      return $$1;
   }

   public static int a(Set<bwu> $$0) {
      int $$1 = 0;

      for (bwu $$2 : $$0) {
         $$1 |= $$2.a();
      }

      return $$1;
   }
}
