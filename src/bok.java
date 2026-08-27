import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;

public class bok<E> extends boo<bom.b<E>> {
   public static <E> Codec<bok<E>> a(Codec<E> $$0) {
      return bom.b.a($$0).listOf().xmap(bok::new, boo::e);
   }

   public static <E> Codec<bok<E>> b(Codec<E> $$0) {
      return axu.a(bom.b.a($$0).listOf()).xmap(bok::new, boo::e);
   }

   bok(List<? extends bom.b<E>> $$0) {
      super($$0);
   }

   public static <E> bok.a<E> a() {
      return new bok.a<>();
   }

   public static <E> bok<E> b() {
      return new bok<>(List.of());
   }

   public static <E> bok<E> a(E $$0) {
      return new bok<>(List.of(bom.a($$0, 1)));
   }

   public Optional<E> a(ayt $$0) {
      return this.b($$0).map(bom.b::b);
   }

   public static class a<E> {
      private final Builder<bom.b<E>> a = ImmutableList.builder();

      public bok.a<E> a(E $$0) {
         return this.a($$0, 1);
      }

      public bok.a<E> a(E $$0, int $$1) {
         this.a.add(bom.a($$0, $$1));
         return this;
      }

      public bok<E> a() {
         return new bok<>(this.a.build());
      }
   }
}
