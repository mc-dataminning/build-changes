import io.netty.buffer.ByteBuf;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;

public enum bwl {
   a(0),
   b(1),
   c(2),
   d(3),
   e(4),
   f(5),
   g(6),
   h(7),
   i(8);

   public static final Set<bwl> j = Set.of(values());
   public static final Set<bwl> k = Set.of(e, d);
   public static final Set<bwl> l = Set.of(f, g, h, i);
   public static final zi<ByteBuf, Set<bwl>> m = zg.g.a(bwl::a, bwl::a);
   private final int n;

   @SafeVarargs
   public static Set<bwl> a(Set<bwl>... $$0) {
      HashSet<bwl> $$1 = new HashSet<>();

      for (Set<bwl> $$2 : $$0) {
         $$1.addAll($$2);
      }

      return $$1;
   }

   private bwl(final int $$0) {
      this.n = $$0;
   }

   private int a() {
      return 1 << this.n;
   }

   private boolean b(int $$0) {
      return ($$0 & this.a()) == this.a();
   }

   public static Set<bwl> a(int $$0) {
      Set<bwl> $$1 = EnumSet.noneOf(bwl.class);

      for (bwl $$2 : values()) {
         if ($$2.b($$0)) {
            $$1.add($$2);
         }
      }

      return $$1;
   }

   public static int a(Set<bwl> $$0) {
      int $$1 = 0;

      for (bwl $$2 : $$0) {
         $$1 |= $$2.a();
      }

      return $$1;
   }
}
