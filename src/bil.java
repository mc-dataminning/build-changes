import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;

public class bil<E> extends bip<bin.b<E>> {
   public static <E> Codec<bil<E>> a(Codec<E> $$0) {
      return bin.b.a($$0).listOf().xmap(bil::new, bip::e);
   }

   public static <E> Codec<bil<E>> b(Codec<E> $$0) {
      return atw.a(bin.b.a($$0).listOf()).xmap(bil::new, bip::e);
   }

   bil(List<? extends bin.b<E>> $$0) {
      super($$0);
   }

   public static <E> bil.a<E> a() {
      return new bil.a<>();
   }

   public static <E> bil<E> b() {
      return new bil<>(List.of());
   }

   public static <E> bil<E> a(E $$0) {
      return new bil<>(List.of(bin.a($$0, 1)));
   }

   public Optional<E> a(auv $$0) {
      return this.b($$0).map(bin.b::b);
   }

   public static class a<E> {
      private final Builder<bin.b<E>> a = ImmutableList.builder();

      public bil.a<E> a(E $$0) {
         return this.a($$0, 1);
      }

      public bil.a<E> a(E $$0, int $$1) {
         this.a.add(bin.a($$0, $$1));
         return this;
      }

      public bil<E> a() {
         return new bil<>(this.a.build());
      }
   }
}
