import io.netty.buffer.ByteBuf;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;

public enum bvo {
   a(0),
   b(1),
   c(2),
   d(3),
   e(4),
   f(5),
   g(6),
   h(7),
   i(8);

   public static final Set<bvo> j = Set.of(values());
   public static final Set<bvo> k = Set.of(e, d);
   public static final Set<bvo> l = Set.of(f, g, h, i);
   public static final zg<ByteBuf, Set<bvo>> m = ze.g.a(bvo::a, bvo::a);
   private final int n;

   @SafeVarargs
   public static Set<bvo> a(Set<bvo>... $$0) {
      HashSet<bvo> $$1 = new HashSet<>();

      for (Set<bvo> $$2 : $$0) {
         $$1.addAll($$2);
      }

      return $$1;
   }

   private bvo(final int $$0) {
      this.n = $$0;
   }

   private int a() {
      return 1 << this.n;
   }

   private boolean b(int $$0) {
      return ($$0 & this.a()) == this.a();
   }

   public static Set<bvo> a(int $$0) {
      Set<bvo> $$1 = EnumSet.noneOf(bvo.class);

      for (bvo $$2 : values()) {
         if ($$2.b($$0)) {
            $$1.add($$2);
         }
      }

      return $$1;
   }

   public static int a(Set<bvo> $$0) {
      int $$1 = 0;

      for (bvo $$2 : $$0) {
         $$1 |= $$2.a();
      }

      return $$1;
   }
}
