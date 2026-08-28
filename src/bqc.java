import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;

public class bqc<E> extends bqg<bqe.b<E>> {
   public static <E> Codec<bqc<E>> a(Codec<E> $$0) {
      return bqe.b.a($$0).listOf().xmap(bqc::new, bqg::e);
   }

   public static <E> Codec<bqc<E>> b(Codec<E> $$0) {
      return ayo.a(bqe.b.a($$0).listOf()).xmap(bqc::new, bqg::e);
   }

   bqc(List<? extends bqe.b<E>> $$0) {
      super($$0);
   }

   public static <E> bqc.a<E> a() {
      return new bqc.a<>();
   }

   public static <E> bqc<E> b() {
      return new bqc<>(List.of());
   }

   public static <E> bqc<E> a(E $$0) {
      return new bqc<>(List.of(bqe.a($$0, 1)));
   }

   public Optional<E> a(azn $$0) {
      return this.b($$0).map(bqe.b::b);
   }

   public static class a<E> {
      private final Builder<bqe.b<E>> a = ImmutableList.builder();

      public bqc.a<E> a(E $$0) {
         return this.a($$0, 1);
      }

      public bqc.a<E> a(E $$0, int $$1) {
         this.a.add(bqe.a($$0, $$1));
         return this;
      }

      public bqc<E> a() {
         return new bqc<>(this.a.build());
      }
   }
}
