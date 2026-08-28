import io.netty.buffer.ByteBuf;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;

public enum bxx {
   a(0),
   b(1),
   c(2),
   d(3),
   e(4),
   f(5),
   g(6),
   h(7),
   i(8);

   public static final Set<bxx> j = Set.of(values());
   public static final Set<bxx> k = Set.of(e, d);
   public static final Set<bxx> l = Set.of(f, g, h, i);
   public static final yw<ByteBuf, Set<bxx>> m = yu.g.a(bxx::a, bxx::a);
   private final int n;

   @SafeVarargs
   public static Set<bxx> a(Set<bxx>... $$0) {
      HashSet<bxx> $$1 = new HashSet<>();

      for (Set<bxx> $$2 : $$0) {
         $$1.addAll($$2);
      }

      return $$1;
   }

   private bxx(final int $$0) {
      this.n = $$0;
   }

   private int a() {
      return 1 << this.n;
   }

   private boolean b(int $$0) {
      return ($$0 & this.a()) == this.a();
   }

   public static Set<bxx> a(int $$0) {
      Set<bxx> $$1 = EnumSet.noneOf(bxx.class);

      for (bxx $$2 : values()) {
         if ($$2.b($$0)) {
            $$1.add($$2);
         }
      }

      return $$1;
   }

   public static int a(Set<bxx> $$0) {
      int $$1 = 0;

      for (bxx $$2 : $$0) {
         $$1 |= $$2.a();
      }

      return $$1;
   }
}
