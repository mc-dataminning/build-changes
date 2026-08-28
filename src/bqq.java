import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;

public class bqq<E> extends bqu<bqs.b<E>> {
   public static <E> Codec<bqq<E>> a(Codec<E> $$0) {
      return bqs.b.a($$0).listOf().xmap(bqq::new, bqu::e);
   }

   public static <E> Codec<bqq<E>> b(Codec<E> $$0) {
      return ayh.b(bqs.b.a($$0).listOf()).xmap(bqq::new, bqu::e);
   }

   bqq(List<? extends bqs.b<E>> $$0) {
      super($$0);
   }

   public static <E> bqq.a<E> a() {
      return new bqq.a<>();
   }

   public static <E> bqq<E> b() {
      return new bqq<>(List.of());
   }

   public static <E> bqq<E> a(E $$0) {
      return new bqq<>(List.of(bqs.a($$0, 1)));
   }

   public Optional<E> a(azg $$0) {
      return this.b($$0).map(bqs.b::b);
   }

   public static class a<E> {
      private final Builder<bqs.b<E>> a = ImmutableList.builder();

      public bqq.a<E> a(E $$0) {
         return this.a($$0, 1);
      }

      public bqq.a<E> a(E $$0, int $$1) {
         this.a.add(bqs.a($$0, $$1));
         return this;
      }

      public bqq<E> a() {
         return new bqq<>(this.a.build());
      }
   }
}
