import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;

public class bfk<E> extends bfo<bfm.b<E>> {
   public static <E> Codec<bfk<E>> a(Codec<E> $$0) {
      return bfm.b.a($$0).listOf().xmap(bfk::new, bfo::e);
   }

   public static <E> Codec<bfk<E>> b(Codec<E> $$0) {
      return arh.a(bfm.b.a($$0).listOf()).xmap(bfk::new, bfo::e);
   }

   bfk(List<? extends bfm.b<E>> $$0) {
      super($$0);
   }

   public static <E> bfk.a<E> a() {
      return new bfk.a<>();
   }

   public static <E> bfk<E> b() {
      return new bfk<>(List.of());
   }

   public static <E> bfk<E> a(E $$0) {
      return new bfk<>(List.of(bfm.a($$0, 1)));
   }

   public Optional<E> a(ase $$0) {
      return this.b($$0).map(bfm.b::b);
   }

   public static class a<E> {
      private final Builder<bfm.b<E>> a = ImmutableList.builder();

      public bfk.a<E> a(E $$0, int $$1) {
         this.a.add(bfm.a($$0, $$1));
         return this;
      }

      public bfk<E> a() {
         return new bfk<>(this.a.build());
      }
   }
}
