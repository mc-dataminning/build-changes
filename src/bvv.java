import io.netty.buffer.ByteBuf;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;

public enum bvv {
   a(0),
   b(1),
   c(2),
   d(3),
   e(4),
   f(5),
   g(6),
   h(7),
   i(8);

   public static final Set<bvv> j = Set.of(values());
   public static final Set<bvv> k = Set.of(e, d);
   public static final Set<bvv> l = Set.of(f, g, h, i);
   public static final zh<ByteBuf, Set<bvv>> m = zf.g.a(bvv::a, bvv::a);
   private final int n;

   @SafeVarargs
   public static Set<bvv> a(Set<bvv>... $$0) {
      HashSet<bvv> $$1 = new HashSet<>();

      for (Set<bvv> $$2 : $$0) {
         $$1.addAll($$2);
      }

      return $$1;
   }

   private bvv(final int $$0) {
      this.n = $$0;
   }

   private int a() {
      return 1 << this.n;
   }

   private boolean b(int $$0) {
      return ($$0 & this.a()) == this.a();
   }

   public static Set<bvv> a(int $$0) {
      Set<bvv> $$1 = EnumSet.noneOf(bvv.class);

      for (bvv $$2 : values()) {
         if ($$2.b($$0)) {
            $$1.add($$2);
         }
      }

      return $$1;
   }

   public static int a(Set<bvv> $$0) {
      int $$1 = 0;

      for (bvv $$2 : $$0) {
         $$1 |= $$2.a();
      }

      return $$1;
   }
}
