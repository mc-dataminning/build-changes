import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;

public class bha<E> extends bhe<bhc.b<E>> {
   public static <E> Codec<bha<E>> a(Codec<E> $$0) {
      return bhc.b.a($$0).listOf().xmap(bha::new, bhe::e);
   }

   public static <E> Codec<bha<E>> b(Codec<E> $$0) {
      return asq.a(bhc.b.a($$0).listOf()).xmap(bha::new, bhe::e);
   }

   bha(List<? extends bhc.b<E>> $$0) {
      super($$0);
   }

   public static <E> bha.a<E> a() {
      return new bha.a<>();
   }

   public static <E> bha<E> b() {
      return new bha<>(List.of());
   }

   public static <E> bha<E> a(E $$0) {
      return new bha<>(List.of(bhc.a($$0, 1)));
   }

   public Optional<E> a(ato $$0) {
      return this.b($$0).map(bhc.b::b);
   }

   public static class a<E> {
      private final Builder<bhc.b<E>> a = ImmutableList.builder();

      public bha.a<E> a(E $$0) {
         return this.a($$0, 1);
      }

      public bha.a<E> a(E $$0, int $$1) {
         this.a.add(bhc.a($$0, $$1));
         return this;
      }

      public bha<E> a() {
         return new bha<>(this.a.build());
      }
   }
}
