import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;

public class bql<E> extends bqp<bqn.b<E>> {
   public static <E> Codec<bql<E>> a(Codec<E> $$0) {
      return bqn.b.a($$0).listOf().xmap(bql::new, bqp::e);
   }

   public static <E> Codec<bql<E>> b(Codec<E> $$0) {
      return ayt.a(bqn.b.a($$0).listOf()).xmap(bql::new, bqp::e);
   }

   bql(List<? extends bqn.b<E>> $$0) {
      super($$0);
   }

   public static <E> bql.a<E> a() {
      return new bql.a<>();
   }

   public static <E> bql<E> b() {
      return new bql<>(List.of());
   }

   public static <E> bql<E> a(E $$0) {
      return new bql<>(List.of(bqn.a($$0, 1)));
   }

   public Optional<E> a(azs $$0) {
      return this.b($$0).map(bqn.b::b);
   }

   public static class a<E> {
      private final Builder<bqn.b<E>> a = ImmutableList.builder();

      public bql.a<E> a(E $$0) {
         return this.a($$0, 1);
      }

      public bql.a<E> a(E $$0, int $$1) {
         this.a.add(bqn.a($$0, $$1));
         return this;
      }

      public bql<E> a() {
         return new bql<>(this.a.build());
      }
   }
}
