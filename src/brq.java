import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;

public class brq<E> extends bru<brs.b<E>> {
   public static <E> Codec<brq<E>> a(Codec<E> $$0) {
      return brs.b.a($$0).listOf().xmap(brq::new, bru::e);
   }

   public static <E> Codec<brq<E>> b(Codec<E> $$0) {
      return azn.a(brs.b.a($$0).listOf()).xmap(brq::new, bru::e);
   }

   brq(List<? extends brs.b<E>> $$0) {
      super($$0);
   }

   public static <E> brq.a<E> a() {
      return new brq.a<>();
   }

   public static <E> brq<E> b() {
      return new brq<>(List.of());
   }

   public static <E> brq<E> a(E $$0) {
      return new brq<>(List.of(brs.a($$0, 1)));
   }

   public Optional<E> a(bam $$0) {
      return this.b($$0).map(brs.b::b);
   }

   public static class a<E> {
      private final Builder<brs.b<E>> a = ImmutableList.builder();

      public brq.a<E> a(E $$0) {
         return this.a($$0, 1);
      }

      public brq.a<E> a(E $$0, int $$1) {
         this.a.add(brs.a($$0, $$1));
         return this;
      }

      public brq<E> a() {
         return new brq<>(this.a.build());
      }
   }
}
