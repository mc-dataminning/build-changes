import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;

public class bpf<E> extends bpj<bph.b<E>> {
   public static <E> Codec<bpf<E>> a(Codec<E> $$0) {
      return bph.b.a($$0).listOf().xmap(bpf::new, bpj::e);
   }

   public static <E> Codec<bpf<E>> b(Codec<E> $$0) {
      return ayh.a(bph.b.a($$0).listOf()).xmap(bpf::new, bpj::e);
   }

   bpf(List<? extends bph.b<E>> $$0) {
      super($$0);
   }

   public static <E> bpf.a<E> a() {
      return new bpf.a<>();
   }

   public static <E> bpf<E> b() {
      return new bpf<>(List.of());
   }

   public static <E> bpf<E> a(E $$0) {
      return new bpf<>(List.of(bph.a($$0, 1)));
   }

   public Optional<E> a(azh $$0) {
      return this.b($$0).map(bph.b::b);
   }

   public static class a<E> {
      private final Builder<bph.b<E>> a = ImmutableList.builder();

      public bpf.a<E> a(E $$0) {
         return this.a($$0, 1);
      }

      public bpf.a<E> a(E $$0, int $$1) {
         this.a.add(bph.a($$0, $$1));
         return this;
      }

      public bpf<E> a() {
         return new bpf<>(this.a.build());
      }
   }
}
