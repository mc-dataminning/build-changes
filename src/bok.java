import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

public class bok<E extends boi> {
   private final int a;
   private final ImmutableList<E> b;

   bok(List<? extends E> $$0) {
      this.b = ImmutableList.copyOf($$0);
      this.a = boj.a($$0);
   }

   public static <E extends boi> bok<E> c() {
      return new bok<>(ImmutableList.of());
   }

   @SafeVarargs
   public static <E extends boi> bok<E> a(E... $$0) {
      return new bok<>(ImmutableList.copyOf($$0));
   }

   public static <E extends boi> bok<E> a(List<E> $$0) {
      return new bok<>($$0);
   }

   public boolean d() {
      return this.b.isEmpty();
   }

   public Optional<E> b(aym $$0) {
      if (this.a == 0) {
         return Optional.empty();
      } else {
         int $$1 = $$0.a(this.a);
         return boj.a(this.b, $$1);
      }
   }

   public List<E> e() {
      return this.b;
   }

   public static <E extends boi> Codec<bok<E>> c(Codec<E> $$0) {
      return $$0.listOf().xmap(bok::a, bok::e);
   }

   @Override
   public boolean equals(@Nullable Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         bok<?> $$1 = (bok<?>)$$0;
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
