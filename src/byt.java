import io.netty.buffer.ByteBuf;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;

public enum byt {
   a(0),
   b(1),
   c(2),
   d(3),
   e(4),
   f(5),
   g(6),
   h(7),
   i(8);

   public static final Set<byt> j = Set.of(values());
   public static final Set<byt> k = Set.of(e, d);
   public static final Set<byt> l = Set.of(f, g, h, i);
   public static final ze<ByteBuf, Set<byt>> m = zc.g.a(byt::a, byt::a);
   private final int n;

   @SafeVarargs
   public static Set<byt> a(Set<byt>... $$0) {
      HashSet<byt> $$1 = new HashSet<>();

      for (Set<byt> $$2 : $$0) {
         $$1.addAll($$2);
      }

      return $$1;
   }

   private byt(final int $$0) {
      this.n = $$0;
   }

   private int a() {
      return 1 << this.n;
   }

   private boolean b(int $$0) {
      return ($$0 & this.a()) == this.a();
   }

   public static Set<byt> a(int $$0) {
      Set<byt> $$1 = EnumSet.noneOf(byt.class);

      for (byt $$2 : values()) {
         if ($$2.b($$0)) {
            $$1.add($$2);
         }
      }

      return $$1;
   }

   public static int a(Set<byt> $$0) {
      int $$1 = 0;

      for (byt $$2 : $$0) {
         $$1 |= $$2.a();
      }

      return $$1;
   }
}
