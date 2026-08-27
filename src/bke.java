import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;

public class bke<E> extends bki<bkg.b<E>> {
   public static <E> Codec<bke<E>> a(Codec<E> $$0) {
      return bkg.b.a($$0).listOf().xmap(bke::new, bki::e);
   }

   public static <E> Codec<bke<E>> b(Codec<E> $$0) {
      return avp.a(bkg.b.a($$0).listOf()).xmap(bke::new, bki::e);
   }

   bke(List<? extends bkg.b<E>> $$0) {
      super($$0);
   }

   public static <E> bke.a<E> a() {
      return new bke.a<>();
   }

   public static <E> bke<E> b() {
      return new bke<>(List.of());
   }

   public static <E> bke<E> a(E $$0) {
      return new bke<>(List.of(bkg.a($$0, 1)));
   }

   public Optional<E> a(awo $$0) {
      return this.b($$0).map(bkg.b::b);
   }

   public static class a<E> {
      private final Builder<bkg.b<E>> a = ImmutableList.builder();

      public bke.a<E> a(E $$0) {
         return this.a($$0, 1);
      }

      public bke.a<E> a(E $$0, int $$1) {
         this.a.add(bkg.a($$0, $$1));
         return this;
      }

      public bke<E> a() {
         return new bke<>(this.a.build());
      }
   }
}
