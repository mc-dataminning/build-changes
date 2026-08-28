import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

public class bou<E extends bos> {
   private final int a;
   private final ImmutableList<E> b;

   bou(List<? extends E> $$0) {
      this.b = ImmutableList.copyOf($$0);
      this.a = bot.a($$0);
   }

   public static <E extends bos> bou<E> c() {
      return new bou<>(ImmutableList.of());
   }

   @SafeVarargs
   public static <E extends bos> bou<E> a(E... $$0) {
      return new bou<>(ImmutableList.copyOf($$0));
   }

   public static <E extends bos> bou<E> a(List<E> $$0) {
      return new bou<>($$0);
   }

   public boolean d() {
      return this.b.isEmpty();
   }

   public Optional<E> b(ayo $$0) {
      if (this.a == 0) {
         return Optional.empty();
      } else {
         int $$1 = $$0.a(this.a);
         return bot.a(this.b, $$1);
      }
   }

   public List<E> e() {
      return this.b;
   }

   public static <E extends bos> Codec<bou<E>> c(Codec<E> $$0) {
      return $$0.listOf().xmap(bou::a, bou::e);
   }

   @Override
   public boolean equals(@Nullable Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         bou<?> $$1 = (bou<?>)$$0;
         return this.a == $$1.a && Objects.equals(this.b, $$1.b);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.a, this.b);
   }
}
