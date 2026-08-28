import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;

public class boz<E> extends bpd<bpb.b<E>> {
   public static <E> Codec<boz<E>> a(Codec<E> $$0) {
      return bpb.b.a($$0).listOf().xmap(boz::new, bpd::e);
   }

   public static <E> Codec<boz<E>> b(Codec<E> $$0) {
      return ayc.a(bpb.b.a($$0).listOf()).xmap(boz::new, bpd::e);
   }

   boz(List<? extends bpb.b<E>> $$0) {
      super($$0);
   }

   public static <E> boz.a<E> a() {
      return new boz.a<>();
   }

   public static <E> boz<E> b() {
      return new boz<>(List.of());
   }

   public static <E> boz<E> a(E $$0) {
      return new boz<>(List.of(bpb.a($$0, 1)));
   }

   public Optional<E> a(azc $$0) {
      return this.b($$0).map(bpb.b::b);
   }

   public static class a<E> {
      private final Builder<bpb.b<E>> a = ImmutableList.builder();

      public boz.a<E> a(E $$0) {
         return this.a($$0, 1);
      }

      public boz.a<E> a(E $$0, int $$1) {
         this.a.add(bpb.a($$0, $$1));
         return this;
      }

      public boz<E> a() {
         return new boz<>(this.a.build());
      }
   }
}
