import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;

public class bqt<E> extends bqx<bqv.b<E>> {
   public static <E> Codec<bqt<E>> a(Codec<E> $$0) {
      return bqv.b.a($$0).listOf().xmap(bqt::new, bqx::e);
   }

   public static <E> Codec<bqt<E>> b(Codec<E> $$0) {
      return ayi.b(bqv.b.a($$0).listOf()).xmap(bqt::new, bqx::e);
   }

   bqt(List<? extends bqv.b<E>> $$0) {
      super($$0);
   }

   public static <E> bqt.a<E> a() {
      return new bqt.a<>();
   }

   public static <E> bqt<E> b() {
      return new bqt<>(List.of());
   }

   public static <E> bqt<E> a(E $$0) {
      return new bqt<>(List.of(bqv.a($$0, 1)));
   }

   public Optional<E> a(azh $$0) {
      return this.b($$0).map(bqv.b::b);
   }

   public static class a<E> {
      private final Builder<bqv.b<E>> a = ImmutableList.builder();

      public bqt.a<E> a(E $$0) {
         return this.a($$0, 1);
      }

      public bqt.a<E> a(E $$0, int $$1) {
         this.a.add(bqv.a($$0, $$1));
         return this;
      }

      public bqt<E> a() {
         return new bqt<>(this.a.build());
      }
   }
}
