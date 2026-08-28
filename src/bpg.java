import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;

public class bpg<E> extends bpk<bpi.b<E>> {
   public static <E> Codec<bpg<E>> a(Codec<E> $$0) {
      return bpi.b.a($$0).listOf().xmap(bpg::new, bpk::e);
   }

   public static <E> Codec<bpg<E>> b(Codec<E> $$0) {
      return ayh.a(bpi.b.a($$0).listOf()).xmap(bpg::new, bpk::e);
   }

   bpg(List<? extends bpi.b<E>> $$0) {
      super($$0);
   }

   public static <E> bpg.a<E> a() {
      return new bpg.a<>();
   }

   public static <E> bpg<E> b() {
      return new bpg<>(List.of());
   }

   public static <E> bpg<E> a(E $$0) {
      return new bpg<>(List.of(bpi.a($$0, 1)));
   }

   public Optional<E> a(azh $$0) {
      return this.b($$0).map(bpi.b::b);
   }

   public static class a<E> {
      private final Builder<bpi.b<E>> a = ImmutableList.builder();

      public bpg.a<E> a(E $$0) {
         return this.a($$0, 1);
      }

      public bpg.a<E> a(E $$0, int $$1) {
         this.a.add(bpi.a($$0, $$1));
         return this;
      }

      public bpg<E> a() {
         return new bpg<>(this.a.build());
      }
   }
}
