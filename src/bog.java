import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;

public class bog<E> extends bok<boi.b<E>> {
   public static <E> Codec<bog<E>> a(Codec<E> $$0) {
      return boi.b.a($$0).listOf().xmap(bog::new, bok::e);
   }

   public static <E> Codec<bog<E>> b(Codec<E> $$0) {
      return axn.a(boi.b.a($$0).listOf()).xmap(bog::new, bok::e);
   }

   bog(List<? extends boi.b<E>> $$0) {
      super($$0);
   }

   public static <E> bog.a<E> a() {
      return new bog.a<>();
   }

   public static <E> bog<E> b() {
      return new bog<>(List.of());
   }

   public static <E> bog<E> a(E $$0) {
      return new bog<>(List.of(boi.a($$0, 1)));
   }

   public Optional<E> a(aym $$0) {
      return this.b($$0).map(boi.b::b);
   }

   public static class a<E> {
      private final Builder<boi.b<E>> a = ImmutableList.builder();

      public bog.a<E> a(E $$0) {
         return this.a($$0, 1);
      }

      public bog.a<E> a(E $$0, int $$1) {
         this.a.add(boi.a($$0, $$1));
         return this;
      }

      public bog<E> a() {
         return new bog<>(this.a.build());
      }
   }
}
