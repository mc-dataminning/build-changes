import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;

public class bor<E> extends bov<bot.b<E>> {
   public static <E> Codec<bor<E>> a(Codec<E> $$0) {
      return bot.b.a($$0).listOf().xmap(bor::new, bov::e);
   }

   public static <E> Codec<bor<E>> b(Codec<E> $$0) {
      return axo.a(bot.b.a($$0).listOf()).xmap(bor::new, bov::e);
   }

   bor(List<? extends bot.b<E>> $$0) {
      super($$0);
   }

   public static <E> bor.a<E> a() {
      return new bor.a<>();
   }

   public static <E> bor<E> b() {
      return new bor<>(List.of());
   }

   public static <E> bor<E> a(E $$0) {
      return new bor<>(List.of(bot.a($$0, 1)));
   }

   public Optional<E> a(ayo $$0) {
      return this.b($$0).map(bot.b::b);
   }

   public static class a<E> {
      private final Builder<bot.b<E>> a = ImmutableList.builder();

      public bor.a<E> a(E $$0) {
         return this.a($$0, 1);
      }

      public bor.a<E> a(E $$0, int $$1) {
         this.a.add(bot.a($$0, $$1));
         return this;
      }

      public bor<E> a() {
         return new bor<>(this.a.build());
      }
   }
}
