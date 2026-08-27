import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;

public class bim<E> extends biq<bio.b<E>> {
   public static <E> Codec<bim<E>> a(Codec<E> $$0) {
      return bio.b.a($$0).listOf().xmap(bim::new, biq::e);
   }

   public static <E> Codec<bim<E>> b(Codec<E> $$0) {
      return atx.a(bio.b.a($$0).listOf()).xmap(bim::new, biq::e);
   }

   bim(List<? extends bio.b<E>> $$0) {
      super($$0);
   }

   public static <E> bim.a<E> a() {
      return new bim.a<>();
   }

   public static <E> bim<E> b() {
      return new bim<>(List.of());
   }

   public static <E> bim<E> a(E $$0) {
      return new bim<>(List.of(bio.a($$0, 1)));
   }

   public Optional<E> a(auw $$0) {
      return this.b($$0).map(bio.b::b);
   }

   public static class a<E> {
      private final Builder<bio.b<E>> a = ImmutableList.builder();

      public bim.a<E> a(E $$0) {
         return this.a($$0, 1);
      }

      public bim.a<E> a(E $$0, int $$1) {
         this.a.add(bio.a($$0, $$1));
         return this;
      }

      public bim<E> a() {
         return new bim<>(this.a.build());
      }
   }
}
