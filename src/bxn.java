import io.netty.buffer.ByteBuf;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;

public enum bxn {
   a(0),
   b(1),
   c(2),
   d(3),
   e(4),
   f(5),
   g(6),
   h(7),
   i(8);

   public static final Set<bxn> j = Set.of(values());
   public static final Set<bxn> k = Set.of(e, d);
   public static final Set<bxn> l = Set.of(f, g, h, i);
   public static final yu<ByteBuf, Set<bxn>> m = ys.g.a(bxn::a, bxn::a);
   private final int n;

   @SafeVarargs
   public static Set<bxn> a(Set<bxn>... $$0) {
      HashSet<bxn> $$1 = new HashSet<>();

      for (Set<bxn> $$2 : $$0) {
         $$1.addAll($$2);
      }

      return $$1;
   }

   private bxn(final int $$0) {
      this.n = $$0;
   }

   private int a() {
      return 1 << this.n;
   }

   private boolean b(int $$0) {
      return ($$0 & this.a()) == this.a();
   }

   public static Set<bxn> a(int $$0) {
      Set<bxn> $$1 = EnumSet.noneOf(bxn.class);

      for (bxn $$2 : values()) {
         if ($$2.b($$0)) {
            $$1.add($$2);
         }
      }

      return $$1;
   }

   public static int a(Set<bxn> $$0) {
      int $$1 = 0;

      for (bxn $$2 : $$0) {
         $$1 |= $$2.a();
      }

      return $$1;
   }
}
