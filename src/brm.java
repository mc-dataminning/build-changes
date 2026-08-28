import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;

public class brm<E> extends brq<bro.b<E>> {
   public static <E> Codec<brm<E>> a(Codec<E> $$0) {
      return bro.b.a($$0).listOf().xmap(brm::new, brq::e);
   }

   public static <E> Codec<brm<E>> b(Codec<E> $$0) {
      return azn.a(bro.b.a($$0).listOf()).xmap(brm::new, brq::e);
   }

   brm(List<? extends bro.b<E>> $$0) {
      super($$0);
   }

   public static <E> brm.a<E> a() {
      return new brm.a<>();
   }

   public static <E> brm<E> b() {
      return new brm<>(List.of());
   }

   public static <E> brm<E> a(E $$0) {
      return new brm<>(List.of(bro.a($$0, 1)));
   }

   public Optional<E> a(bam $$0) {
      return this.b($$0).map(bro.b::b);
   }

   public static class a<E> {
      private final Builder<bro.b<E>> a = ImmutableList.builder();

      public brm.a<E> a(E $$0) {
         return this.a($$0, 1);
      }

      public brm.a<E> a(E $$0, int $$1) {
         this.a.add(bro.a($$0, $$1));
         return this;
      }

      public brm<E> a() {
         return new brm<>(this.a.build());
      }
   }
}
