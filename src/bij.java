import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;

public class bij<E extends bih> {
   private final int a;
   private final ImmutableList<E> b;

   bij(List<? extends E> $$0) {
      this.b = ImmutableList.copyOf($$0);
      this.a = bii.a($$0);
   }

   public static <E extends bih> bij<E> c() {
      return new bij<>(ImmutableList.of());
   }

   @SafeVarargs
   public static <E extends bih> bij<E> a(E... $$0) {
      return new bij<>(ImmutableList.copyOf($$0));
   }

   public static <E extends bih> bij<E> a(List<E> $$0) {
      return new bij<>($$0);
   }

   public boolean d() {
      return this.b.isEmpty();
   }

   public Optional<E> b(aup $$0) {
      if (this.a == 0) {
         return Optional.empty();
      } else {
         int $$1 = $$0.a(this.a);
         return bii.a(this.b, $$1);
      }
   }

   public List<E> e() {
      return this.b;
   }

   public static <E extends bih> Codec<bij<E>> c(Codec<E> $$0) {
      return $$0.listOf().xmap(bij::a, bij::e);
   }
}
