import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;

public class blq<E extends blo> {
   private final int a;
   private final ImmutableList<E> b;

   blq(List<? extends E> $$0) {
      this.b = ImmutableList.copyOf($$0);
      this.a = blp.a($$0);
   }

   public static <E extends blo> blq<E> c() {
      return new blq<>(ImmutableList.of());
   }

   @SafeVarargs
   public static <E extends blo> blq<E> a(E... $$0) {
      return new blq<>(ImmutableList.copyOf($$0));
   }

   public static <E extends blo> blq<E> a(List<E> $$0) {
      return new blq<>($$0);
   }

   public boolean d() {
      return this.b.isEmpty();
   }

   public Optional<E> b(axd $$0) {
      if (this.a == 0) {
         return Optional.empty();
      } else {
         int $$1 = $$0.a(this.a);
         return blp.a(this.b, $$1);
      }
   }

   public List<E> e() {
      return this.b;
   }

   public static <E extends blo> Codec<blq<E>> c(Codec<E> $$0) {
      return $$0.listOf().xmap(blq::a, blq::e);
   }
}
