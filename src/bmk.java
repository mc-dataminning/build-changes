import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;

public class bmk<E> extends bmo<bmm.b<E>> {
   public static <E> Codec<bmk<E>> a(Codec<E> $$0) {
      return bmm.b.a($$0).listOf().xmap(bmk::new, bmo::e);
   }

   public static <E> Codec<bmk<E>> b(Codec<E> $$0) {
      return aws.a(bmm.b.a($$0).listOf()).xmap(bmk::new, bmo::e);
   }

   bmk(List<? extends bmm.b<E>> $$0) {
      super($$0);
   }

   public static <E> bmk.a<E> a() {
      return new bmk.a<>();
   }

   public static <E> bmk<E> b() {
      return new bmk<>(List.of());
   }

   public static <E> bmk<E> a(E $$0) {
      return new bmk<>(List.of(bmm.a($$0, 1)));
   }

   public Optional<E> a(axr $$0) {
      return this.b($$0).map(bmm.b::b);
   }

   public static class a<E> {
      private final Builder<bmm.b<E>> a = ImmutableList.builder();

      public bmk.a<E> a(E $$0) {
         return this.a($$0, 1);
      }

      public bmk.a<E> a(E $$0, int $$1) {
         this.a.add(bmm.a($$0, $$1));
         return this;
      }

      public bmk<E> a() {
         return new bmk<>(this.a.build());
      }
   }
}
