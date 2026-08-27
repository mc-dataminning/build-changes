import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;

public class bik<E> extends bio<bim.b<E>> {
   public static <E> Codec<bik<E>> a(Codec<E> $$0) {
      return bim.b.a($$0).listOf().xmap(bik::new, bio::e);
   }

   public static <E> Codec<bik<E>> b(Codec<E> $$0) {
      return atv.a(bim.b.a($$0).listOf()).xmap(bik::new, bio::e);
   }

   bik(List<? extends bim.b<E>> $$0) {
      super($$0);
   }

   public static <E> bik.a<E> a() {
      return new bik.a<>();
   }

   public static <E> bik<E> b() {
      return new bik<>(List.of());
   }

   public static <E> bik<E> a(E $$0) {
      return new bik<>(List.of(bim.a($$0, 1)));
   }

   public Optional<E> a(auu $$0) {
      return this.b($$0).map(bim.b::b);
   }

   public static class a<E> {
      private final Builder<bim.b<E>> a = ImmutableList.builder();

      public bik.a<E> a(E $$0) {
         return this.a($$0, 1);
      }

      public bik.a<E> a(E $$0, int $$1) {
         this.a.add(bim.a($$0, $$1));
         return this;
      }

      public bik<E> a() {
         return new bik<>(this.a.build());
      }
   }
}
