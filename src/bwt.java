import io.netty.buffer.ByteBuf;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;

public enum bwt {
   a(0),
   b(1),
   c(2),
   d(3),
   e(4),
   f(5),
   g(6),
   h(7),
   i(8);

   public static final Set<bwt> j = Set.of(values());
   public static final Set<bwt> k = Set.of(e, d);
   public static final Set<bwt> l = Set.of(f, g, h, i);
   public static final zt<ByteBuf, Set<bwt>> m = zr.g.a(bwt::a, bwt::a);
   private final int n;

   @SafeVarargs
   public static Set<bwt> a(Set<bwt>... $$0) {
      HashSet<bwt> $$1 = new HashSet<>();

      for (Set<bwt> $$2 : $$0) {
         $$1.addAll($$2);
      }

      return $$1;
   }

   private bwt(final int $$0) {
      this.n = $$0;
   }

   private int a() {
      return 1 << this.n;
   }

   private boolean b(int $$0) {
      return ($$0 & this.a()) == this.a();
   }

   public static Set<bwt> a(int $$0) {
      Set<bwt> $$1 = EnumSet.noneOf(bwt.class);

      for (bwt $$2 : values()) {
         if ($$2.b($$0)) {
            $$1.add($$2);
         }
      }

      return $$1;
   }

   public static int a(Set<bwt> $$0) {
      int $$1 = 0;

      for (bwt $$2 : $$0) {
         $$1 |= $$2.a();
      }

      return $$1;
   }
}
