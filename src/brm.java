import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

public class brm<E extends brk> {
   private final int a;
   private final ImmutableList<E> b;

   brm(List<? extends E> $$0) {
      this.b = ImmutableList.copyOf($$0);
      this.a = brl.a($$0);
   }

   public static <E extends brk> brm<E> c() {
      return new brm<>(ImmutableList.of());
   }

   @SafeVarargs
   public static <E extends brk> brm<E> a(E... $$0) {
      return new brm<>(ImmutableList.copyOf($$0));
   }

   public static <E extends brk> brm<E> a(List<E> $$0) {
      return new brm<>($$0);
   }

   public boolean d() {
      return this.b.isEmpty();
   }

   public Optional<E> b(bac $$0) {
      if (this.a == 0) {
         return Optional.empty();
      } else {
         int $$1 = $$0.a(this.a);
         return brl.a(this.b, $$1);
      }
   }

   public List<E> e() {
      return this.b;
   }

   public static <E extends brk> Codec<brm<E>> c(Codec<E> $$0) {
      return $$0.listOf().xmap(brm::a, brm::e);
   }

   @Override
   public boolean equals(@Nullable Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         brm<?> $$1 = (brm<?>)$$0;
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
