import io.netty.buffer.ByteBuf;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;

public enum bwm {
   a(0),
   b(1),
   c(2),
   d(3),
   e(4),
   f(5),
   g(6),
   h(7),
   i(8);

   public static final Set<bwm> j = Set.of(values());
   public static final Set<bwm> k = Set.of(e, d);
   public static final Set<bwm> l = Set.of(f, g, h, i);
   public static final yn<ByteBuf, Set<bwm>> m = yl.g.a(bwm::a, bwm::a);
   private final int n;

   @SafeVarargs
   public static Set<bwm> a(Set<bwm>... $$0) {
      HashSet<bwm> $$1 = new HashSet<>();

      for (Set<bwm> $$2 : $$0) {
         $$1.addAll($$2);
      }

      return $$1;
   }

   private bwm(final int $$0) {
      this.n = $$0;
   }

   private int a() {
      return 1 << this.n;
   }

   private boolean b(int $$0) {
      return ($$0 & this.a()) == this.a();
   }

   public static Set<bwm> a(int $$0) {
      Set<bwm> $$1 = EnumSet.noneOf(bwm.class);

      for (bwm $$2 : values()) {
         if ($$2.b($$0)) {
            $$1.add($$2);
         }
      }

      return $$1;
   }

   public static int a(Set<bwm> $$0) {
      int $$1 = 0;

      for (bwm $$2 : $$0) {
         $$1 |= $$2.a();
      }

      return $$1;
   }
}
