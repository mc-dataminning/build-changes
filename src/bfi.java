import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;

public class bfi<E> extends bfm<bfk.b<E>> {
   public static <E> Codec<bfi<E>> a(Codec<E> $$0) {
      return bfk.b.a($$0).listOf().xmap(bfi::new, bfm::e);
   }

   public static <E> Codec<bfi<E>> b(Codec<E> $$0) {
      return arg.a(bfk.b.a($$0).listOf()).xmap(bfi::new, bfm::e);
   }

   bfi(List<? extends bfk.b<E>> $$0) {
      super($$0);
   }

   public static <E> bfi.a<E> a() {
      return new bfi.a<>();
   }

   public static <E> bfi<E> b() {
      return new bfi<>(List.of());
   }

   public static <E> bfi<E> a(E $$0) {
      return new bfi<>(List.of(bfk.a($$0, 1)));
   }

   public Optional<E> a(asc $$0) {
      return this.b($$0).map(bfk.b::b);
   }

   public static class a<E> {
      private final Builder<bfk.b<E>> a = ImmutableList.builder();

      public bfi.a<E> a(E $$0, int $$1) {
         this.a.add(bfk.a($$0, $$1));
         return this;
      }

      public bfi<E> a() {
         return new bfi<>(this.a.build());
      }
   }
}
