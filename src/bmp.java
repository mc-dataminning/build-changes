import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;

public class bmp<E> extends bmt<bmr.b<E>> {
   public static <E> Codec<bmp<E>> a(Codec<E> $$0) {
      return bmr.b.a($$0).listOf().xmap(bmp::new, bmt::e);
   }

   public static <E> Codec<bmp<E>> b(Codec<E> $$0) {
      return awu.a(bmr.b.a($$0).listOf()).xmap(bmp::new, bmt::e);
   }

   bmp(List<? extends bmr.b<E>> $$0) {
      super($$0);
   }

   public static <E> bmp.a<E> a() {
      return new bmp.a<>();
   }

   public static <E> bmp<E> b() {
      return new bmp<>(List.of());
   }

   public static <E> bmp<E> a(E $$0) {
      return new bmp<>(List.of(bmr.a($$0, 1)));
   }

   public Optional<E> a(axt $$0) {
      return this.b($$0).map(bmr.b::b);
   }

   public static class a<E> {
      private final Builder<bmr.b<E>> a = ImmutableList.builder();

      public bmp.a<E> a(E $$0) {
         return this.a($$0, 1);
      }

      public bmp.a<E> a(E $$0, int $$1) {
         this.a.add(bmr.a($$0, $$1));
         return this;
      }

      public bmp<E> a() {
         return new bmp<>(this.a.build());
      }
   }
}
