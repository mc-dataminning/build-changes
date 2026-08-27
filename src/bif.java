import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;

public class bif<E> extends bij<bih.b<E>> {
   public static <E> Codec<bif<E>> a(Codec<E> $$0) {
      return bih.b.a($$0).listOf().xmap(bif::new, bij::e);
   }

   public static <E> Codec<bif<E>> b(Codec<E> $$0) {
      return atq.a(bih.b.a($$0).listOf()).xmap(bif::new, bij::e);
   }

   bif(List<? extends bih.b<E>> $$0) {
      super($$0);
   }

   public static <E> bif.a<E> a() {
      return new bif.a<>();
   }

   public static <E> bif<E> b() {
      return new bif<>(List.of());
   }

   public static <E> bif<E> a(E $$0) {
      return new bif<>(List.of(bih.a($$0, 1)));
   }

   public Optional<E> a(aup $$0) {
      return this.b($$0).map(bih.b::b);
   }

   public static class a<E> {
      private final Builder<bih.b<E>> a = ImmutableList.builder();

      public bif.a<E> a(E $$0) {
         return this.a($$0, 1);
      }

      public bif.a<E> a(E $$0, int $$1) {
         this.a.add(bih.a($$0, $$1));
         return this;
      }

      public bif<E> a() {
         return new bif<>(this.a.build());
      }
   }
}
