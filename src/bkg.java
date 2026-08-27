import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;

public class bkg<E> extends bkk<bki.b<E>> {
   public static <E> Codec<bkg<E>> a(Codec<E> $$0) {
      return bki.b.a($$0).listOf().xmap(bkg::new, bkk::e);
   }

   public static <E> Codec<bkg<E>> b(Codec<E> $$0) {
      return avq.a(bki.b.a($$0).listOf()).xmap(bkg::new, bkk::e);
   }

   bkg(List<? extends bki.b<E>> $$0) {
      super($$0);
   }

   public static <E> bkg.a<E> a() {
      return new bkg.a<>();
   }

   public static <E> bkg<E> b() {
      return new bkg<>(List.of());
   }

   public static <E> bkg<E> a(E $$0) {
      return new bkg<>(List.of(bki.a($$0, 1)));
   }

   public Optional<E> a(awp $$0) {
      return this.b($$0).map(bki.b::b);
   }

   public static class a<E> {
      private final Builder<bki.b<E>> a = ImmutableList.builder();

      public bkg.a<E> a(E $$0) {
         return this.a($$0, 1);
      }

      public bkg.a<E> a(E $$0, int $$1) {
         this.a.add(bki.a($$0, $$1));
         return this;
      }

      public bkg<E> a() {
         return new bkg<>(this.a.build());
      }
   }
}
