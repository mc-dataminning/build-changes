import io.netty.buffer.ByteBuf;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;

public enum byi {
   a(0),
   b(1),
   c(2),
   d(3),
   e(4),
   f(5),
   g(6),
   h(7),
   i(8);

   public static final Set<byi> j = Set.of(values());
   public static final Set<byi> k = Set.of(e, d);
   public static final Set<byi> l = Set.of(f, g, h, i);
   public static final yy<ByteBuf, Set<byi>> m = yw.g.a(byi::a, byi::a);
   private final int n;

   @SafeVarargs
   public static Set<byi> a(Set<byi>... $$0) {
      HashSet<byi> $$1 = new HashSet<>();

      for (Set<byi> $$2 : $$0) {
         $$1.addAll($$2);
      }

      return $$1;
   }

   private byi(final int $$0) {
      this.n = $$0;
   }

   private int a() {
      return 1 << this.n;
   }

   private boolean b(int $$0) {
      return ($$0 & this.a()) == this.a();
   }

   public static Set<byi> a(int $$0) {
      Set<byi> $$1 = EnumSet.noneOf(byi.class);

      for (byi $$2 : values()) {
         if ($$2.b($$0)) {
            $$1.add($$2);
         }
      }

      return $$1;
   }

   public static int a(Set<byi> $$0) {
      int $$1 = 0;

      for (byi $$2 : $$0) {
         $$1 |= $$2.a();
      }

      return $$1;
   }
}
