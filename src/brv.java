import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

public class brv<E extends brt> {
   private final int a;
   private final ImmutableList<E> b;

   brv(List<? extends E> $$0) {
      this.b = ImmutableList.copyOf($$0);
      this.a = bru.a($$0);
   }

   public static <E extends brt> brv<E> c() {
      return new brv<>(ImmutableList.of());
   }

   @SafeVarargs
   public static <E extends brt> brv<E> a(E... $$0) {
      return new brv<>(ImmutableList.copyOf($$0));
   }

   public static <E extends brt> brv<E> a(List<E> $$0) {
      return new brv<>($$0);
   }

   public boolean d() {
      return this.b.isEmpty();
   }

   public Optional<E> b(bam $$0) {
      if (this.a == 0) {
         return Optional.empty();
      } else {
         int $$1 = $$0.a(this.a);
         return bru.a(this.b, $$1);
      }
   }

   public List<E> e() {
      return this.b;
   }

   public static <E extends brt> Codec<brv<E>> c(Codec<E> $$0) {
      return $$0.listOf().xmap(brv::a, brv::e);
   }

   @Override
   public boolean equals(@Nullable Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         brv<?> $$1 = (brv<?>)$$0;
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
