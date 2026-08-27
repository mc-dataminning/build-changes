import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;

public class bio<E extends bim> {
   private final int a;
   private final ImmutableList<E> b;

   bio(List<? extends E> $$0) {
      this.b = ImmutableList.copyOf($$0);
      this.a = bin.a($$0);
   }

   public static <E extends bim> bio<E> c() {
      return new bio<>(ImmutableList.of());
   }

   @SafeVarargs
   public static <E extends bim> bio<E> a(E... $$0) {
      return new bio<>(ImmutableList.copyOf($$0));
   }

   public static <E extends bim> bio<E> a(List<E> $$0) {
      return new bio<>($$0);
   }

   public boolean d() {
      return this.b.isEmpty();
   }

   public Optional<E> b(auu $$0) {
      if (this.a == 0) {
         return Optional.empty();
      } else {
         int $$1 = $$0.a(this.a);
         return bin.a(this.b, $$1);
      }
   }

   public List<E> e() {
      return this.b;
   }

   public static <E extends bim> Codec<bio<E>> c(Codec<E> $$0) {
      return $$0.listOf().xmap(bio::a, bio::e);
   }
}
