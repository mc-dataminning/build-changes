import io.netty.buffer.ByteBuf;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;

public enum bwp {
   a(0),
   b(1),
   c(2),
   d(3),
   e(4),
   f(5),
   g(6),
   h(7),
   i(8);

   public static final Set<bwp> j = Set.of(values());
   public static final Set<bwp> k = Set.of(e, d);
   public static final Set<bwp> l = Set.of(f, g, h, i);
   public static final zt<ByteBuf, Set<bwp>> m = zr.g.a(bwp::a, bwp::a);
   private final int n;

   @SafeVarargs
   public static Set<bwp> a(Set<bwp>... $$0) {
      HashSet<bwp> $$1 = new HashSet<>();

      for (Set<bwp> $$2 : $$0) {
         $$1.addAll($$2);
      }

      return $$1;
   }

   private bwp(final int $$0) {
      this.n = $$0;
   }

   private int a() {
      return 1 << this.n;
   }

   private boolean b(int $$0) {
      return ($$0 & this.a()) == this.a();
   }

   public static Set<bwp> a(int $$0) {
      Set<bwp> $$1 = EnumSet.noneOf(bwp.class);

      for (bwp $$2 : values()) {
         if ($$2.b($$0)) {
            $$1.add($$2);
         }
      }

      return $$1;
   }

   public static int a(Set<bwp> $$0) {
      int $$1 = 0;

      for (bwp $$2 : $$0) {
         $$1 |= $$2.a();
      }

      return $$1;
   }
}
