import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;

public class bfm<E extends bfk> {
   private final int a;
   private final ImmutableList<E> b;

   bfm(List<? extends E> $$0) {
      this.b = ImmutableList.copyOf($$0);
      this.a = bfl.a($$0);
   }

   public static <E extends bfk> bfm<E> c() {
      return new bfm<>(ImmutableList.of());
   }

   @SafeVarargs
   public static <E extends bfk> bfm<E> a(E... $$0) {
      return new bfm<>(ImmutableList.copyOf($$0));
   }

   public static <E extends bfk> bfm<E> a(List<E> $$0) {
      return new bfm<>($$0);
   }

   public boolean d() {
      return this.b.isEmpty();
   }

   public Optional<E> b(asc $$0) {
      if (this.a == 0) {
         return Optional.empty();
      } else {
         int $$1 = $$0.a(this.a);
         return bfl.a(this.b, $$1);
      }
   }

   public List<E> e() {
      return this.b;
   }

   public static <E extends bfk> Codec<bfm<E>> c(Codec<E> $$0) {
      return $$0.listOf().xmap(bfm::a, bfm::e);
   }
}
