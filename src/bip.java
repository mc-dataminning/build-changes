import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;

public class bip<E extends bin> {
   private final int a;
   private final ImmutableList<E> b;

   bip(List<? extends E> $$0) {
      this.b = ImmutableList.copyOf($$0);
      this.a = bio.a($$0);
   }

   public static <E extends bin> bip<E> c() {
      return new bip<>(ImmutableList.of());
   }

   @SafeVarargs
   public static <E extends bin> bip<E> a(E... $$0) {
      return new bip<>(ImmutableList.copyOf($$0));
   }

   public static <E extends bin> bip<E> a(List<E> $$0) {
      return new bip<>($$0);
   }

   public boolean d() {
      return this.b.isEmpty();
   }

   public Optional<E> b(auv $$0) {
      if (this.a == 0) {
         return Optional.empty();
      } else {
         int $$1 = $$0.a(this.a);
         return bio.a(this.b, $$1);
      }
   }

   public List<E> e() {
      return this.b;
   }

   public static <E extends bin> Codec<bip<E>> c(Codec<E> $$0) {
      return $$0.listOf().xmap(bip::a, bip::e);
   }
}
