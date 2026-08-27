import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;

public class bhv<E> extends bhz<bhx.b<E>> {
   public static <E> Codec<bhv<E>> a(Codec<E> $$0) {
      return bhx.b.a($$0).listOf().xmap(bhv::new, bhz::e);
   }

   public static <E> Codec<bhv<E>> b(Codec<E> $$0) {
      return atg.a(bhx.b.a($$0).listOf()).xmap(bhv::new, bhz::e);
   }

   bhv(List<? extends bhx.b<E>> $$0) {
      super($$0);
   }

   public static <E> bhv.a<E> a() {
      return new bhv.a<>();
   }

   public static <E> bhv<E> b() {
      return new bhv<>(List.of());
   }

   public static <E> bhv<E> a(E $$0) {
      return new bhv<>(List.of(bhx.a($$0, 1)));
   }

   public Optional<E> a(auf $$0) {
      return this.b($$0).map(bhx.b::b);
   }

   public static class a<E> {
      private final Builder<bhx.b<E>> a = ImmutableList.builder();

      public bhv.a<E> a(E $$0) {
         return this.a($$0, 1);
      }

      public bhv.a<E> a(E $$0, int $$1) {
         this.a.add(bhx.a($$0, $$1));
         return this;
      }

      public bhv<E> a() {
         return new bhv<>(this.a.build());
      }
   }
}
