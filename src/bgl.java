import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;

public class bgl<E> extends bgp<bgn.b<E>> {
   public static <E> Codec<bgl<E>> a(Codec<E> $$0) {
      return bgn.b.a($$0).listOf().xmap(bgl::new, bgp::e);
   }

   public static <E> Codec<bgl<E>> b(Codec<E> $$0) {
      return asg.a(bgn.b.a($$0).listOf()).xmap(bgl::new, bgp::e);
   }

   bgl(List<? extends bgn.b<E>> $$0) {
      super($$0);
   }

   public static <E> bgl.a<E> a() {
      return new bgl.a<>();
   }

   public static <E> bgl<E> b() {
      return new bgl<>(List.of());
   }

   public static <E> bgl<E> a(E $$0) {
      return new bgl<>(List.of(bgn.a($$0, 1)));
   }

   public Optional<E> a(ate $$0) {
      return this.b($$0).map(bgn.b::b);
   }

   public static class a<E> {
      private final Builder<bgn.b<E>> a = ImmutableList.builder();

      public bgl.a<E> a(E $$0, int $$1) {
         this.a.add(bgn.a($$0, $$1));
         return this;
      }

      public bgl<E> a() {
         return new bgl<>(this.a.build());
      }
   }
}
