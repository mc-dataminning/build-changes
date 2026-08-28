import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;

public class brr<E> extends brv<brt.b<E>> {
   public static <E> Codec<brr<E>> a(Codec<E> $$0) {
      return brt.b.a($$0).listOf().xmap(brr::new, brv::e);
   }

   public static <E> Codec<brr<E>> b(Codec<E> $$0) {
      return azn.a(brt.b.a($$0).listOf()).xmap(brr::new, brv::e);
   }

   brr(List<? extends brt.b<E>> $$0) {
      super($$0);
   }

   public static <E> brr.a<E> a() {
      return new brr.a<>();
   }

   public static <E> brr<E> b() {
      return new brr<>(List.of());
   }

   public static <E> brr<E> a(E $$0) {
      return new brr<>(List.of(brt.a($$0, 1)));
   }

   public Optional<E> a(bam $$0) {
      return this.b($$0).map(brt.b::b);
   }

   public static class a<E> {
      private final Builder<brt.b<E>> a = ImmutableList.builder();

      public brr.a<E> a(E $$0) {
         return this.a($$0, 1);
      }

      public brr.a<E> a(E $$0, int $$1) {
         this.a.add(brt.a($$0, $$1));
         return this;
      }

      public brr<E> a() {
         return new brr<>(this.a.build());
      }
   }
}
