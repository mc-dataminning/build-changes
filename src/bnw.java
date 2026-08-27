import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;

public class bnw<E> extends boa<bny.b<E>> {
   public static <E> Codec<bnw<E>> a(Codec<E> $$0) {
      return bny.b.a($$0).listOf().xmap(bnw::new, boa::e);
   }

   public static <E> Codec<bnw<E>> b(Codec<E> $$0) {
      return axh.a(bny.b.a($$0).listOf()).xmap(bnw::new, boa::e);
   }

   bnw(List<? extends bny.b<E>> $$0) {
      super($$0);
   }

   public static <E> bnw.a<E> a() {
      return new bnw.a<>();
   }

   public static <E> bnw<E> b() {
      return new bnw<>(List.of());
   }

   public static <E> bnw<E> a(E $$0) {
      return new bnw<>(List.of(bny.a($$0, 1)));
   }

   public Optional<E> a(ayg $$0) {
      return this.b($$0).map(bny.b::b);
   }

   public static class a<E> {
      private final Builder<bny.b<E>> a = ImmutableList.builder();

      public bnw.a<E> a(E $$0) {
         return this.a($$0, 1);
      }

      public bnw.a<E> a(E $$0, int $$1) {
         this.a.add(bny.a($$0, $$1));
         return this;
      }

      public bnw<E> a() {
         return new bnw<>(this.a.build());
      }
   }
}
