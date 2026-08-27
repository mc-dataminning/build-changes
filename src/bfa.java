import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;

public class bfa<E> extends bfe<bfc.b<E>> {
   public static <E> Codec<bfa<E>> a(Codec<E> $$0) {
      return bfc.b.a($$0).listOf().xmap(bfa::new, bfe::e);
   }

   public static <E> Codec<bfa<E>> b(Codec<E> $$0) {
      return aqy.a(bfc.b.a($$0).listOf()).xmap(bfa::new, bfe::e);
   }

   bfa(List<? extends bfc.b<E>> $$0) {
      super($$0);
   }

   public static <E> bfa.a<E> a() {
      return new bfa.a<>();
   }

   public static <E> bfa<E> b() {
      return new bfa<>(List.of());
   }

   public static <E> bfa<E> a(E $$0) {
      return new bfa<>(List.of(bfc.a($$0, 1)));
   }

   public Optional<E> a(aru $$0) {
      return this.b($$0).map(bfc.b::b);
   }

   public static class a<E> {
      private final Builder<bfc.b<E>> a = ImmutableList.builder();

      public bfa.a<E> a(E $$0, int $$1) {
         this.a.add(bfc.a($$0, $$1));
         return this;
      }

      public bfa<E> a() {
         return new bfa<>(this.a.build());
      }
   }
}
