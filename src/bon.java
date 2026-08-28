import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;

public class bon<E> extends bor<bop.b<E>> {
   public static <E> Codec<bon<E>> a(Codec<E> $$0) {
      return bop.b.a($$0).listOf().xmap(bon::new, bor::e);
   }

   public static <E> Codec<bon<E>> b(Codec<E> $$0) {
      return axm.a(bop.b.a($$0).listOf()).xmap(bon::new, bor::e);
   }

   bon(List<? extends bop.b<E>> $$0) {
      super($$0);
   }

   public static <E> bon.a<E> a() {
      return new bon.a<>();
   }

   public static <E> bon<E> b() {
      return new bon<>(List.of());
   }

   public static <E> bon<E> a(E $$0) {
      return new bon<>(List.of(bop.a($$0, 1)));
   }

   public Optional<E> a(aym $$0) {
      return this.b($$0).map(bop.b::b);
   }

   public static class a<E> {
      private final Builder<bop.b<E>> a = ImmutableList.builder();

      public bon.a<E> a(E $$0) {
         return this.a($$0, 1);
      }

      public bon.a<E> a(E $$0, int $$1) {
         this.a.add(bop.a($$0, $$1));
         return this;
      }

      public bon<E> a() {
         return new bon<>(this.a.build());
      }
   }
}
