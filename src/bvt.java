import io.netty.buffer.ByteBuf;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;

public enum bvt {
   a(0),
   b(1),
   c(2),
   d(3),
   e(4),
   f(5),
   g(6),
   h(7),
   i(8);

   public static final Set<bvt> j = Set.of(values());
   public static final Set<bvt> k = Set.of(e, d);
   public static final Set<bvt> l = Set.of(f, g, h, i);
   public static final ym<ByteBuf, Set<bvt>> m = yk.g.a(bvt::a, bvt::a);
   private final int n;

   @SafeVarargs
   public static Set<bvt> a(Set<bvt>... $$0) {
      HashSet<bvt> $$1 = new HashSet<>();

      for (Set<bvt> $$2 : $$0) {
         $$1.addAll($$2);
      }

      return $$1;
   }

   private bvt(final int $$0) {
      this.n = $$0;
   }

   private int a() {
      return 1 << this.n;
   }

   private boolean b(int $$0) {
      return ($$0 & this.a()) == this.a();
   }

   public static Set<bvt> a(int $$0) {
      Set<bvt> $$1 = EnumSet.noneOf(bvt.class);

      for (bvt $$2 : values()) {
         if ($$2.b($$0)) {
            $$1.add($$2);
         }
      }

      return $$1;
   }

   public static int a(Set<bvt> $$0) {
      int $$1 = 0;

      for (bvt $$2 : $$0) {
         $$1 |= $$2.a();
      }

      return $$1;
   }
}
