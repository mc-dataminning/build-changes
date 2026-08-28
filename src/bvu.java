import io.netty.buffer.ByteBuf;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;

public enum bvu {
   a(0),
   b(1),
   c(2),
   d(3),
   e(4),
   f(5),
   g(6),
   h(7),
   i(8);

   public static final Set<bvu> j = Set.of(values());
   public static final Set<bvu> k = Set.of(e, d);
   public static final Set<bvu> l = Set.of(f, g, h, i);
   public static final ym<ByteBuf, Set<bvu>> m = yk.g.a(bvu::a, bvu::a);
   private final int n;

   @SafeVarargs
   public static Set<bvu> a(Set<bvu>... $$0) {
      HashSet<bvu> $$1 = new HashSet<>();

      for (Set<bvu> $$2 : $$0) {
         $$1.addAll($$2);
      }

      return $$1;
   }

   private bvu(final int $$0) {
      this.n = $$0;
   }

   private int a() {
      return 1 << this.n;
   }

   private boolean b(int $$0) {
      return ($$0 & this.a()) == this.a();
   }

   public static Set<bvu> a(int $$0) {
      Set<bvu> $$1 = EnumSet.noneOf(bvu.class);

      for (bvu $$2 : values()) {
         if ($$2.b($$0)) {
            $$1.add($$2);
         }
      }

      return $$1;
   }

   public static int a(Set<bvu> $$0) {
      int $$1 = 0;

      for (bvu $$2 : $$0) {
         $$1 |= $$2.a();
      }

      return $$1;
   }
}
