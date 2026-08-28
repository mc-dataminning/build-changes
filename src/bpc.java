import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;

public class bpc<E> extends bpg<bpe.b<E>> {
   public static <E> Codec<bpc<E>> a(Codec<E> $$0) {
      return bpe.b.a($$0).listOf().xmap(bpc::new, bpg::e);
   }

   public static <E> Codec<bpc<E>> b(Codec<E> $$0) {
      return ayf.a(bpe.b.a($$0).listOf()).xmap(bpc::new, bpg::e);
   }

   bpc(List<? extends bpe.b<E>> $$0) {
      super($$0);
   }

   public static <E> bpc.a<E> a() {
      return new bpc.a<>();
   }

   public static <E> bpc<E> b() {
      return new bpc<>(List.of());
   }

   public static <E> bpc<E> a(E $$0) {
      return new bpc<>(List.of(bpe.a($$0, 1)));
   }

   public Optional<E> a(azf $$0) {
      return this.b($$0).map(bpe.b::b);
   }

   public static class a<E> {
      private final Builder<bpe.b<E>> a = ImmutableList.builder();

      public bpc.a<E> a(E $$0) {
         return this.a($$0, 1);
      }

      public bpc.a<E> a(E $$0, int $$1) {
         this.a.add(bpe.a($$0, $$1));
         return this;
      }

      public bpc<E> a() {
         return new bpc<>(this.a.build());
      }
   }
}
