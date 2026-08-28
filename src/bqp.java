import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;

public class bqp<E> extends bqt<bqr.b<E>> {
   public static <E> Codec<bqp<E>> a(Codec<E> $$0) {
      return bqr.b.a($$0).listOf().xmap(bqp::new, bqt::e);
   }

   public static <E> Codec<bqp<E>> b(Codec<E> $$0) {
      return ayw.a(bqr.b.a($$0).listOf()).xmap(bqp::new, bqt::e);
   }

   bqp(List<? extends bqr.b<E>> $$0) {
      super($$0);
   }

   public static <E> bqp.a<E> a() {
      return new bqp.a<>();
   }

   public static <E> bqp<E> b() {
      return new bqp<>(List.of());
   }

   public static <E> bqp<E> a(E $$0) {
      return new bqp<>(List.of(bqr.a($$0, 1)));
   }

   public Optional<E> a(azv $$0) {
      return this.b($$0).map(bqr.b::b);
   }

   public static class a<E> {
      private final Builder<bqr.b<E>> a = ImmutableList.builder();

      public bqp.a<E> a(E $$0) {
         return this.a($$0, 1);
      }

      public bqp.a<E> a(E $$0, int $$1) {
         this.a.add(bqr.a($$0, $$1));
         return this;
      }

      public bqp<E> a() {
         return new bqp<>(this.a.build());
      }
   }
}
