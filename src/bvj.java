import io.netty.buffer.ByteBuf;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;

public enum bvj {
   a(0),
   b(1),
   c(2),
   d(3),
   e(4),
   f(5),
   g(6),
   h(7),
   i(8);

   public static final Set<bvj> j = Set.of(values());
   public static final Set<bvj> k = Set.of(e, d);
   public static final Set<bvj> l = Set.of(f, g, h, i);
   public static final zf<ByteBuf, Set<bvj>> m = zd.g.a(bvj::a, bvj::a);
   private final int n;

   @SafeVarargs
   public static Set<bvj> a(Set<bvj>... $$0) {
      HashSet<bvj> $$1 = new HashSet<>();

      for (Set<bvj> $$2 : $$0) {
         $$1.addAll($$2);
      }

      return $$1;
   }

   private bvj(final int $$0) {
      this.n = $$0;
   }

   private int a() {
      return 1 << this.n;
   }

   private boolean b(int $$0) {
      return ($$0 & this.a()) == this.a();
   }

   public static Set<bvj> a(int $$0) {
      Set<bvj> $$1 = EnumSet.noneOf(bvj.class);

      for (bvj $$2 : values()) {
         if ($$2.b($$0)) {
            $$1.add($$2);
         }
      }

      return $$1;
   }

   public static int a(Set<bvj> $$0) {
      int $$1 = 0;

      for (bvj $$2 : $$0) {
         $$1 |= $$2.a();
      }

      return $$1;
   }
}
