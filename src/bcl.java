import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;

public class bcl<E extends bcj> {
   private final int a;
   private final ImmutableList<E> b;

   bcl(List<? extends E> $$0) {
      this.b = ImmutableList.copyOf($$0);
      this.a = bck.a($$0);
   }

   public static <E extends bcj> bcl<E> c() {
      return new bcl<>(ImmutableList.of());
   }

   @SafeVarargs
   public static <E extends bcj> bcl<E> a(E... $$0) {
      return new bcl<>(ImmutableList.copyOf($$0));
   }

   public static <E extends bcj> bcl<E> a(List<E> $$0) {
      return new bcl<>($$0);
   }

   public boolean d() {
      return this.b.isEmpty();
   }

   public Optional<E> b(apf $$0) {
      if (this.a == 0) {
         return Optional.empty();
      } else {
         int $$1 = $$0.a(this.a);
         return bck.a(this.b, $$1);
      }
   }

   public List<E> e() {
      return this.b;
   }

   public static <E extends bcj> Codec<bcl<E>> c(Codec<E> $$0) {
      return $$0.listOf().xmap(bcl::a, bcl::e);
   }
}
