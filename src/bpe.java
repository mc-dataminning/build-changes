import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;

public class bpe<E> extends bpi<bpg.b<E>> {
   public static <E> Codec<bpe<E>> a(Codec<E> $$0) {
      return bpg.b.a($$0).listOf().xmap(bpe::new, bpi::e);
   }

   public static <E> Codec<bpe<E>> b(Codec<E> $$0) {
      return ayh.a(bpg.b.a($$0).listOf()).xmap(bpe::new, bpi::e);
   }

   bpe(List<? extends bpg.b<E>> $$0) {
      super($$0);
   }

   public static <E> bpe.a<E> a() {
      return new bpe.a<>();
   }

   public static <E> bpe<E> b() {
      return new bpe<>(List.of());
   }

   public static <E> bpe<E> a(E $$0) {
      return new bpe<>(List.of(bpg.a($$0, 1)));
   }

   public Optional<E> a(azh $$0) {
      return this.b($$0).map(bpg.b::b);
   }

   public static class a<E> {
      private final Builder<bpg.b<E>> a = ImmutableList.builder();

      public bpe.a<E> a(E $$0) {
         return this.a($$0, 1);
      }

      public bpe.a<E> a(E $$0, int $$1) {
         this.a.add(bpg.a($$0, $$1));
         return this;
      }

      public bpe<E> a() {
         return new bpe<>(this.a.build());
      }
   }
}
