import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;

public class bna<E> extends bne<bnc.b<E>> {
   public static <E> Codec<bna<E>> a(Codec<E> $$0) {
      return bnc.b.a($$0).listOf().xmap(bna::new, bne::e);
   }

   public static <E> Codec<bna<E>> b(Codec<E> $$0) {
      return axe.a(bnc.b.a($$0).listOf()).xmap(bna::new, bne::e);
   }

   bna(List<? extends bnc.b<E>> $$0) {
      super($$0);
   }

   public static <E> bna.a<E> a() {
      return new bna.a<>();
   }

   public static <E> bna<E> b() {
      return new bna<>(List.of());
   }

   public static <E> bna<E> a(E $$0) {
      return new bna<>(List.of(bnc.a($$0, 1)));
   }

   public Optional<E> a(ayd $$0) {
      return this.b($$0).map(bnc.b::b);
   }

   public static class a<E> {
      private final Builder<bnc.b<E>> a = ImmutableList.builder();

      public bna.a<E> a(E $$0) {
         return this.a($$0, 1);
      }

      public bna.a<E> a(E $$0, int $$1) {
         this.a.add(bnc.a($$0, $$1));
         return this;
      }

      public bna<E> a() {
         return new bna<>(this.a.build());
      }
   }
}
