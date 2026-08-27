import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;

public class boa<E extends bny> {
   private final int a;
   private final ImmutableList<E> b;

   boa(List<? extends E> $$0) {
      this.b = ImmutableList.copyOf($$0);
      this.a = bnz.a($$0);
   }

   public static <E extends bny> boa<E> c() {
      return new boa<>(ImmutableList.of());
   }

   @SafeVarargs
   public static <E extends bny> boa<E> a(E... $$0) {
      return new boa<>(ImmutableList.copyOf($$0));
   }

   public static <E extends bny> boa<E> a(List<E> $$0) {
      return new boa<>($$0);
   }

   public boolean d() {
      return this.b.isEmpty();
   }

   public Optional<E> b(ayg $$0) {
      if (this.a == 0) {
         return Optional.empty();
      } else {
         int $$1 = $$0.a(this.a);
         return bnz.a(this.b, $$1);
      }
   }

   public List<E> e() {
      return this.b;
   }

   public static <E extends bny> Codec<boa<E>> c(Codec<E> $$0) {
      return $$0.listOf().xmap(boa::a, boa::e);
   }
}
