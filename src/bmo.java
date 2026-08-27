import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;

public class bmo<E extends bmm> {
   private final int a;
   private final ImmutableList<E> b;

   bmo(List<? extends E> $$0) {
      this.b = ImmutableList.copyOf($$0);
      this.a = bmn.a($$0);
   }

   public static <E extends bmm> bmo<E> c() {
      return new bmo<>(ImmutableList.of());
   }

   @SafeVarargs
   public static <E extends bmm> bmo<E> a(E... $$0) {
      return new bmo<>(ImmutableList.copyOf($$0));
   }

   public static <E extends bmm> bmo<E> a(List<E> $$0) {
      return new bmo<>($$0);
   }

   public boolean d() {
      return this.b.isEmpty();
   }

   public Optional<E> b(axr $$0) {
      if (this.a == 0) {
         return Optional.empty();
      } else {
         int $$1 = $$0.a(this.a);
         return bmn.a(this.b, $$1);
      }
   }

   public List<E> e() {
      return this.b;
   }

   public static <E extends bmm> Codec<bmo<E>> c(Codec<E> $$0) {
      return $$0.listOf().xmap(bmo::a, bmo::e);
   }
}
