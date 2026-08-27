import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;

public class bfd<E> extends bfh<bff.b<E>> {
   public static <E> Codec<bfd<E>> a(Codec<E> $$0) {
      return bff.b.a($$0).listOf().xmap(bfd::new, bfh::e);
   }

   public static <E> Codec<bfd<E>> b(Codec<E> $$0) {
      return arb.a(bff.b.a($$0).listOf()).xmap(bfd::new, bfh::e);
   }

   bfd(List<? extends bff.b<E>> $$0) {
      super($$0);
   }

   public static <E> bfd.a<E> a() {
      return new bfd.a<>();
   }

   public static <E> bfd<E> b() {
      return new bfd<>(List.of());
   }

   public static <E> bfd<E> a(E $$0) {
      return new bfd<>(List.of(bff.a($$0, 1)));
   }

   public Optional<E> a(arx $$0) {
      return this.b($$0).map(bff.b::b);
   }

   public static class a<E> {
      private final Builder<bff.b<E>> a = ImmutableList.builder();

      public bfd.a<E> a(E $$0, int $$1) {
         this.a.add(bff.a($$0, $$1));
         return this;
      }

      public bfd<E> a() {
         return new bfd<>(this.a.build());
      }
   }
}
