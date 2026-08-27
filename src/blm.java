import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;

public class blm<E> extends blq<blo.b<E>> {
   public static <E> Codec<blm<E>> a(Codec<E> $$0) {
      return blo.b.a($$0).listOf().xmap(blm::new, blq::e);
   }

   public static <E> Codec<blm<E>> b(Codec<E> $$0) {
      return awe.a(blo.b.a($$0).listOf()).xmap(blm::new, blq::e);
   }

   blm(List<? extends blo.b<E>> $$0) {
      super($$0);
   }

   public static <E> blm.a<E> a() {
      return new blm.a<>();
   }

   public static <E> blm<E> b() {
      return new blm<>(List.of());
   }

   public static <E> blm<E> a(E $$0) {
      return new blm<>(List.of(blo.a($$0, 1)));
   }

   public Optional<E> a(axd $$0) {
      return this.b($$0).map(blo.b::b);
   }

   public static class a<E> {
      private final Builder<blo.b<E>> a = ImmutableList.builder();

      public blm.a<E> a(E $$0) {
         return this.a($$0, 1);
      }

      public blm.a<E> a(E $$0, int $$1) {
         this.a.add(blo.a($$0, $$1));
         return this;
      }

      public blm<E> a() {
         return new blm<>(this.a.build());
      }
   }
}
