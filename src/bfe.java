import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;

public class bfe<E extends bfc> {
   private final int a;
   private final ImmutableList<E> b;

   bfe(List<? extends E> $$0) {
      this.b = ImmutableList.copyOf($$0);
      this.a = bfd.a($$0);
   }

   public static <E extends bfc> bfe<E> c() {
      return new bfe<>(ImmutableList.of());
   }

   @SafeVarargs
   public static <E extends bfc> bfe<E> a(E... $$0) {
      return new bfe<>(ImmutableList.copyOf($$0));
   }

   public static <E extends bfc> bfe<E> a(List<E> $$0) {
      return new bfe<>($$0);
   }

   public boolean d() {
      return this.b.isEmpty();
   }

   public Optional<E> b(aru $$0) {
      if (this.a == 0) {
         return Optional.empty();
      } else {
         int $$1 = $$0.a(this.a);
         return bfd.a(this.b, $$1);
      }
   }

   public List<E> e() {
      return this.b;
   }

   public static <E extends bfc> Codec<bfe<E>> c(Codec<E> $$0) {
      return $$0.listOf().xmap(bfe::a, bfe::e);
   }
}
