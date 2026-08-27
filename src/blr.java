import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;

public class blr<E extends blp> {
   private final int a;
   private final ImmutableList<E> b;

   blr(List<? extends E> $$0) {
      this.b = ImmutableList.copyOf($$0);
      this.a = blq.a($$0);
   }

   public static <E extends blp> blr<E> c() {
      return new blr<>(ImmutableList.of());
   }

   @SafeVarargs
   public static <E extends blp> blr<E> a(E... $$0) {
      return new blr<>(ImmutableList.copyOf($$0));
   }

   public static <E extends blp> blr<E> a(List<E> $$0) {
      return new blr<>($$0);
   }

   public boolean d() {
      return this.b.isEmpty();
   }

   public Optional<E> b(axd $$0) {
      if (this.a == 0) {
         return Optional.empty();
      } else {
         int $$1 = $$0.a(this.a);
         return blq.a(this.b, $$1);
      }
   }

   public List<E> e() {
      return this.b;
   }

   public static <E extends blp> Codec<blr<E>> c(Codec<E> $$0) {
      return $$0.listOf().xmap(blr::a, blr::e);
   }
}
