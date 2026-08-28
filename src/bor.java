import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

public class bor<E extends bop> {
   private final int a;
   private final ImmutableList<E> b;

   bor(List<? extends E> $$0) {
      this.b = ImmutableList.copyOf($$0);
      this.a = boq.a($$0);
   }

   public static <E extends bop> bor<E> c() {
      return new bor<>(ImmutableList.of());
   }

   @SafeVarargs
   public static <E extends bop> bor<E> a(E... $$0) {
      return new bor<>(ImmutableList.copyOf($$0));
   }

   public static <E extends bop> bor<E> a(List<E> $$0) {
      return new bor<>($$0);
   }

   public boolean d() {
      return this.b.isEmpty();
   }

   public Optional<E> b(aym $$0) {
      if (this.a == 0) {
         return Optional.empty();
      } else {
         int $$1 = $$0.a(this.a);
         return boq.a(this.b, $$1);
      }
   }

   public List<E> e() {
      return this.b;
   }

   public static <E extends bop> Codec<bor<E>> c(Codec<E> $$0) {
      return $$0.listOf().xmap(bor::a, bor::e);
   }

   @Override
   public boolean equals(@Nullable Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         bor<?> $$1 = (bor<?>)$$0;
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
