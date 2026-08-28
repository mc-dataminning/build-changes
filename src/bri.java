import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;

public class bri<E> extends brm<brk.b<E>> {
   public static <E> Codec<bri<E>> a(Codec<E> $$0) {
      return brk.b.a($$0).listOf().xmap(bri::new, brm::e);
   }

   public static <E> Codec<bri<E>> b(Codec<E> $$0) {
      return azd.a(brk.b.a($$0).listOf()).xmap(bri::new, brm::e);
   }

   bri(List<? extends brk.b<E>> $$0) {
      super($$0);
   }

   public static <E> bri.a<E> a() {
      return new bri.a<>();
   }

   public static <E> bri<E> b() {
      return new bri<>(List.of());
   }

   public static <E> bri<E> a(E $$0) {
      return new bri<>(List.of(brk.a($$0, 1)));
   }

   public Optional<E> a(bac $$0) {
      return this.b($$0).map(brk.b::b);
   }

   public static class a<E> {
      private final Builder<brk.b<E>> a = ImmutableList.builder();

      public bri.a<E> a(E $$0) {
         return this.a($$0, 1);
      }

      public bri.a<E> a(E $$0, int $$1) {
         this.a.add(brk.a($$0, $$1));
         return this;
      }

      public bri<E> a() {
         return new bri<>(this.a.build());
      }
   }
}
