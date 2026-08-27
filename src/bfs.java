import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;

public class bfs<E extends bfq> {
   private final int a;
   private final ImmutableList<E> b;

   bfs(List<? extends E> $$0) {
      this.b = ImmutableList.copyOf($$0);
      this.a = bfr.a($$0);
   }

   public static <E extends bfq> bfs<E> c() {
      return new bfs<>(ImmutableList.of());
   }

   @SafeVarargs
   public static <E extends bfq> bfs<E> a(E... $$0) {
      return new bfs<>(ImmutableList.copyOf($$0));
   }

   public static <E extends bfq> bfs<E> a(List<E> $$0) {
      return new bfs<>($$0);
   }

   public boolean d() {
      return this.b.isEmpty();
   }

   public Optional<E> b(ash $$0) {
      if (this.a == 0) {
         return Optional.empty();
      } else {
         int $$1 = $$0.a(this.a);
         return bfr.a(this.b, $$1);
      }
   }

   public List<E> e() {
      return this.b;
   }

   public static <E extends bfq> Codec<bfs<E>> c(Codec<E> $$0) {
      return $$0.listOf().xmap(bfs::a, bfs::e);
   }
}
