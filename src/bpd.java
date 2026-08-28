import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;

public class bpd<E> extends bph<bpf.b<E>> {
   public static <E> Codec<bpd<E>> a(Codec<E> $$0) {
      return bpf.b.a($$0).listOf().xmap(bpd::new, bph::e);
   }

   public static <E> Codec<bpd<E>> b(Codec<E> $$0) {
      return ayg.a(bpf.b.a($$0).listOf()).xmap(bpd::new, bph::e);
   }

   bpd(List<? extends bpf.b<E>> $$0) {
      super($$0);
   }

   public static <E> bpd.a<E> a() {
      return new bpd.a<>();
   }

   public static <E> bpd<E> b() {
      return new bpd<>(List.of());
   }

   public static <E> bpd<E> a(E $$0) {
      return new bpd<>(List.of(bpf.a($$0, 1)));
   }

   public Optional<E> a(azg $$0) {
      return this.b($$0).map(bpf.b::b);
   }

   public static class a<E> {
      private final Builder<bpf.b<E>> a = ImmutableList.builder();

      public bpd.a<E> a(E $$0) {
         return this.a($$0, 1);
      }

      public bpd.a<E> a(E $$0, int $$1) {
         this.a.add(bpf.a($$0, $$1));
         return this;
      }

      public bpd<E> a() {
         return new bpd<>(this.a.build());
      }
   }
}
