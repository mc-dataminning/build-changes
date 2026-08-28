import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;

public class bqg<E> extends bqk<bqi.b<E>> {
   public static <E> Codec<bqg<E>> a(Codec<E> $$0) {
      return bqi.b.a($$0).listOf().xmap(bqg::new, bqk::e);
   }

   public static <E> Codec<bqg<E>> b(Codec<E> $$0) {
      return ays.a(bqi.b.a($$0).listOf()).xmap(bqg::new, bqk::e);
   }

   bqg(List<? extends bqi.b<E>> $$0) {
      super($$0);
   }

   public static <E> bqg.a<E> a() {
      return new bqg.a<>();
   }

   public static <E> bqg<E> b() {
      return new bqg<>(List.of());
   }

   public static <E> bqg<E> a(E $$0) {
      return new bqg<>(List.of(bqi.a($$0, 1)));
   }

   public Optional<E> a(azr $$0) {
      return this.b($$0).map(bqi.b::b);
   }

   public static class a<E> {
      private final Builder<bqi.b<E>> a = ImmutableList.builder();

      public bqg.a<E> a(E $$0) {
         return this.a($$0, 1);
      }

      public bqg.a<E> a(E $$0, int $$1) {
         this.a.add(bqi.a($$0, $$1));
         return this;
      }

      public bqg<E> a() {
         return new bqg<>(this.a.build());
      }
   }
}
