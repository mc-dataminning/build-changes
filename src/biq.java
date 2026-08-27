import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;

public class biq<E extends bio> {
   private final int a;
   private final ImmutableList<E> b;

   biq(List<? extends E> $$0) {
      this.b = ImmutableList.copyOf($$0);
      this.a = bip.a($$0);
   }

   public static <E extends bio> biq<E> c() {
      return new biq<>(ImmutableList.of());
   }

   @SafeVarargs
   public static <E extends bio> biq<E> a(E... $$0) {
      return new biq<>(ImmutableList.copyOf($$0));
   }

   public static <E extends bio> biq<E> a(List<E> $$0) {
      return new biq<>($$0);
   }

   public boolean d() {
      return this.b.isEmpty();
   }

   public Optional<E> b(auw $$0) {
      if (this.a == 0) {
         return Optional.empty();
      } else {
         int $$1 = $$0.a(this.a);
         return bip.a(this.b, $$1);
      }
   }

   public List<E> e() {
      return this.b;
   }

   public static <E extends bio> Codec<biq<E>> c(Codec<E> $$0) {
      return $$0.listOf().xmap(biq::a, biq::e);
   }
}
