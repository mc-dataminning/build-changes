import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;

public class bfo<E> extends bfs<bfq.b<E>> {
   public static <E> Codec<bfo<E>> a(Codec<E> $$0) {
      return bfq.b.a($$0).listOf().xmap(bfo::new, bfs::e);
   }

   public static <E> Codec<bfo<E>> b(Codec<E> $$0) {
      return arj.a(bfq.b.a($$0).listOf()).xmap(bfo::new, bfs::e);
   }

   bfo(List<? extends bfq.b<E>> $$0) {
      super($$0);
   }

   public static <E> bfo.a<E> a() {
      return new bfo.a<>();
   }

   public static <E> bfo<E> b() {
      return new bfo<>(List.of());
   }

   public static <E> bfo<E> a(E $$0) {
      return new bfo<>(List.of(bfq.a($$0, 1)));
   }

   public Optional<E> a(ash $$0) {
      return this.b($$0).map(bfq.b::b);
   }

   public static class a<E> {
      private final Builder<bfq.b<E>> a = ImmutableList.builder();

      public bfo.a<E> a(E $$0, int $$1) {
         this.a.add(bfq.a($$0, $$1));
         return this;
      }

      public bfo<E> a() {
         return new bfo<>(this.a.build());
      }
   }
}
