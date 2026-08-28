import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;

public class bqr<E> extends bqv<bqt.b<E>> {
   public static <E> Codec<bqr<E>> a(Codec<E> $$0) {
      return bqt.b.a($$0).listOf().xmap(bqr::new, bqv::e);
   }

   public static <E> Codec<bqr<E>> b(Codec<E> $$0) {
      return ayi.b(bqt.b.a($$0).listOf()).xmap(bqr::new, bqv::e);
   }

   bqr(List<? extends bqt.b<E>> $$0) {
      super($$0);
   }

   public static <E> bqr.a<E> a() {
      return new bqr.a<>();
   }

   public static <E> bqr<E> b() {
      return new bqr<>(List.of());
   }

   public static <E> bqr<E> a(E $$0) {
      return new bqr<>(List.of(bqt.a($$0, 1)));
   }

   public Optional<E> a(azh $$0) {
      return this.b($$0).map(bqt.b::b);
   }

   public static class a<E> {
      private final Builder<bqt.b<E>> a = ImmutableList.builder();

      public bqr.a<E> a(E $$0) {
         return this.a($$0, 1);
      }

      public bqr.a<E> a(E $$0, int $$1) {
         this.a.add(bqt.a($$0, $$1));
         return this;
      }

      public bqr<E> a() {
         return new bqr<>(this.a.build());
      }
   }
}
