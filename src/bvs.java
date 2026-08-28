import io.netty.buffer.ByteBuf;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;

public enum bvs {
   a(0),
   b(1),
   c(2),
   d(3),
   e(4),
   f(5),
   g(6),
   h(7),
   i(8);

   public static final Set<bvs> j = Set.of(values());
   public static final Set<bvs> k = Set.of(e, d);
   public static final Set<bvs> l = Set.of(f, g, h, i);
   public static final zj<ByteBuf, Set<bvs>> m = zh.g.a(bvs::a, bvs::a);
   private final int n;

   @SafeVarargs
   public static Set<bvs> a(Set<bvs>... $$0) {
      HashSet<bvs> $$1 = new HashSet<>();

      for (Set<bvs> $$2 : $$0) {
         $$1.addAll($$2);
      }

      return $$1;
   }

   private bvs(final int $$0) {
      this.n = $$0;
   }

   private int a() {
      return 1 << this.n;
   }

   private boolean b(int $$0) {
      return ($$0 & this.a()) == this.a();
   }

   public static Set<bvs> a(int $$0) {
      Set<bvs> $$1 = EnumSet.noneOf(bvs.class);

      for (bvs $$2 : values()) {
         if ($$2.b($$0)) {
            $$1.add($$2);
         }
      }

      return $$1;
   }

   public static int a(Set<bvs> $$0) {
      int $$1 = 0;

      for (bvs $$2 : $$0) {
         $$1 |= $$2.a();
      }

      return $$1;
   }
}
