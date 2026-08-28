import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;

public class bpa<E> extends bpe<bpc.b<E>> {
   public static <E> Codec<bpa<E>> a(Codec<E> $$0) {
      return bpc.b.a($$0).listOf().xmap(bpa::new, bpe::e);
   }

   public static <E> Codec<bpa<E>> b(Codec<E> $$0) {
      return axv.a(bpc.b.a($$0).listOf()).xmap(bpa::new, bpe::e);
   }

   bpa(List<? extends bpc.b<E>> $$0) {
      super($$0);
   }

   public static <E> bpa.a<E> a() {
      return new bpa.a<>();
   }

   public static <E> bpa<E> b() {
      return new bpa<>(List.of());
   }

   public static <E> bpa<E> a(E $$0) {
      return new bpa<>(List.of(bpc.a($$0, 1)));
   }

   public Optional<E> a(ayv $$0) {
      return this.b($$0).map(bpc.b::b);
   }

   public static class a<E> {
      private final Builder<bpc.b<E>> a = ImmutableList.builder();

      public bpa.a<E> a(E $$0) {
         return this.a($$0, 1);
      }

      public bpa.a<E> a(E $$0, int $$1) {
         this.a.add(bpc.a($$0, $$1));
         return this;
      }

      public bpa<E> a() {
         return new bpa<>(this.a.build());
      }
   }
}
