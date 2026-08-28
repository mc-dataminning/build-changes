import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;

public class bqs<E> extends bqw<bqu.b<E>> {
   public static <E> Codec<bqs<E>> a(Codec<E> $$0) {
      return bqu.b.a($$0).listOf().xmap(bqs::new, bqw::e);
   }

   public static <E> Codec<bqs<E>> b(Codec<E> $$0) {
      return ayi.b(bqu.b.a($$0).listOf()).xmap(bqs::new, bqw::e);
   }

   bqs(List<? extends bqu.b<E>> $$0) {
      super($$0);
   }

   public static <E> bqs.a<E> a() {
      return new bqs.a<>();
   }

   public static <E> bqs<E> b() {
      return new bqs<>(List.of());
   }

   public static <E> bqs<E> a(E $$0) {
      return new bqs<>(List.of(bqu.a($$0, 1)));
   }

   public Optional<E> a(azh $$0) {
      return this.b($$0).map(bqu.b::b);
   }

   public static class a<E> {
      private final Builder<bqu.b<E>> a = ImmutableList.builder();

      public bqs.a<E> a(E $$0) {
         return this.a($$0, 1);
      }

      public bqs.a<E> a(E $$0, int $$1) {
         this.a.add(bqu.a($$0, $$1));
         return this;
      }

      public bqs<E> a() {
         return new bqs<>(this.a.build());
      }
   }
}
