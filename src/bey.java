import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;

public class bey<E> extends bfc<bfa.b<E>> {
   public static <E> Codec<bey<E>> a(Codec<E> $$0) {
      return bfa.b.a($$0).listOf().xmap(bey::new, bfc::e);
   }

   public static <E> Codec<bey<E>> b(Codec<E> $$0) {
      return aqw.a(bfa.b.a($$0).listOf()).xmap(bey::new, bfc::e);
   }

   bey(List<? extends bfa.b<E>> $$0) {
      super($$0);
   }

   public static <E> bey.a<E> a() {
      return new bey.a<>();
   }

   public static <E> bey<E> b() {
      return new bey<>(List.of());
   }

   public static <E> bey<E> a(E $$0) {
      return new bey<>(List.of(bfa.a($$0, 1)));
   }

   public Optional<E> a(art $$0) {
      return this.b($$0).map(bfa.b::b);
   }

   public static class a<E> {
      private final Builder<bfa.b<E>> a = ImmutableList.builder();

      public bey.a<E> a(E $$0, int $$1) {
         this.a.add(bfa.a($$0, $$1));
         return this;
      }

      public bey<E> a() {
         return new bey<>(this.a.build());
      }
   }
}
