import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

public class bqg<E extends bqe> {
   private final int a;
   private final ImmutableList<E> b;

   bqg(List<? extends E> $$0) {
      this.b = ImmutableList.copyOf($$0);
      this.a = bqf.a($$0);
   }

   public static <E extends bqe> bqg<E> c() {
      return new bqg<>(ImmutableList.of());
   }

   @SafeVarargs
   public static <E extends bqe> bqg<E> a(E... $$0) {
      return new bqg<>(ImmutableList.copyOf($$0));
   }

   public static <E extends bqe> bqg<E> a(List<E> $$0) {
      return new bqg<>($$0);
   }

   public boolean d() {
      return this.b.isEmpty();
   }

   public Optional<E> b(azn $$0) {
      if (this.a == 0) {
         return Optional.empty();
      } else {
         int $$1 = $$0.a(this.a);
         return bqf.a(this.b, $$1);
      }
   }

   public List<E> e() {
      return this.b;
   }

   public static <E extends bqe> Codec<bqg<E>> c(Codec<E> $$0) {
      return $$0.listOf().xmap(bqg::a, bqg::e);
   }

   @Override
   public boolean equals(@Nullable Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         bqg<?> $$1 = (bqg<?>)$$0;
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
