import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;

public class bfo<E extends bfm> {
   private final int a;
   private final ImmutableList<E> b;

   bfo(List<? extends E> $$0) {
      this.b = ImmutableList.copyOf($$0);
      this.a = bfn.a($$0);
   }

   public static <E extends bfm> bfo<E> c() {
      return new bfo<>(ImmutableList.of());
   }

   @SafeVarargs
   public static <E extends bfm> bfo<E> a(E... $$0) {
      return new bfo<>(ImmutableList.copyOf($$0));
   }

   public static <E extends bfm> bfo<E> a(List<E> $$0) {
      return new bfo<>($$0);
   }

   public boolean d() {
      return this.b.isEmpty();
   }

   public Optional<E> b(ase $$0) {
      if (this.a == 0) {
         return Optional.empty();
      } else {
         int $$1 = $$0.a(this.a);
         return bfn.a(this.b, $$1);
      }
   }

   public List<E> e() {
      return this.b;
   }

   public static <E extends bfm> Codec<bfo<E>> c(Codec<E> $$0) {
      return $$0.listOf().xmap(bfo::a, bfo::e);
   }
}
