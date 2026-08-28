import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

public class bpg<E extends bpe> {
   private final int a;
   private final ImmutableList<E> b;

   bpg(List<? extends E> $$0) {
      this.b = ImmutableList.copyOf($$0);
      this.a = bpf.a($$0);
   }

   public static <E extends bpe> bpg<E> c() {
      return new bpg<>(ImmutableList.of());
   }

   @SafeVarargs
   public static <E extends bpe> bpg<E> a(E... $$0) {
      return new bpg<>(ImmutableList.copyOf($$0));
   }

   public static <E extends bpe> bpg<E> a(List<E> $$0) {
      return new bpg<>($$0);
   }

   public boolean d() {
      return this.b.isEmpty();
   }

   public Optional<E> b(azf $$0) {
      if (this.a == 0) {
         return Optional.empty();
      } else {
         int $$1 = $$0.a(this.a);
         return bpf.a(this.b, $$1);
      }
   }

   public List<E> e() {
      return this.b;
   }

   public static <E extends bpe> Codec<bpg<E>> c(Codec<E> $$0) {
      return $$0.listOf().xmap(bpg::a, bpg::e);
   }

   @Override
   public boolean equals(@Nullable Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         bpg<?> $$1 = (bpg<?>)$$0;
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
