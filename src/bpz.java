import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;

public class bpz<E> extends bqd<bqb.b<E>> {
   public static <E> Codec<bpz<E>> a(Codec<E> $$0) {
      return bqb.b.a($$0).listOf().xmap(bpz::new, bqd::e);
   }

   public static <E> Codec<bpz<E>> b(Codec<E> $$0) {
      return aym.a(bqb.b.a($$0).listOf()).xmap(bpz::new, bqd::e);
   }

   bpz(List<? extends bqb.b<E>> $$0) {
      super($$0);
   }

   public static <E> bpz.a<E> a() {
      return new bpz.a<>();
   }

   public static <E> bpz<E> b() {
      return new bpz<>(List.of());
   }

   public static <E> bpz<E> a(E $$0) {
      return new bpz<>(List.of(bqb.a($$0, 1)));
   }

   public Optional<E> a(azl $$0) {
      return this.b($$0).map(bqb.b::b);
   }

   public static class a<E> {
      private final Builder<bqb.b<E>> a = ImmutableList.builder();

      public bpz.a<E> a(E $$0) {
         return this.a($$0, 1);
      }

      public bpz.a<E> a(E $$0, int $$1) {
         this.a.add(bqb.a($$0, $$1));
         return this;
      }

      public bpz<E> a() {
         return new bpz<>(this.a.build());
      }
   }
}
