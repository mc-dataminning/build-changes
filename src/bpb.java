import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;

public class bpb<E> extends bpf<bpd.b<E>> {
   public static <E> Codec<bpb<E>> a(Codec<E> $$0) {
      return bpd.b.a($$0).listOf().xmap(bpb::new, bpf::e);
   }

   public static <E> Codec<bpb<E>> b(Codec<E> $$0) {
      return axw.a(bpd.b.a($$0).listOf()).xmap(bpb::new, bpf::e);
   }

   bpb(List<? extends bpd.b<E>> $$0) {
      super($$0);
   }

   public static <E> bpb.a<E> a() {
      return new bpb.a<>();
   }

   public static <E> bpb<E> b() {
      return new bpb<>(List.of());
   }

   public static <E> bpb<E> a(E $$0) {
      return new bpb<>(List.of(bpd.a($$0, 1)));
   }

   public Optional<E> a(ayw $$0) {
      return this.b($$0).map(bpd.b::b);
   }

   public static class a<E> {
      private final Builder<bpd.b<E>> a = ImmutableList.builder();

      public bpb.a<E> a(E $$0) {
         return this.a($$0, 1);
      }

      public bpb.a<E> a(E $$0, int $$1) {
         this.a.add(bpd.a($$0, $$1));
         return this;
      }

      public bpb<E> a() {
         return new bpb<>(this.a.build());
      }
   }
}
