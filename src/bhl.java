import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;

public class bhl<E> extends bhp<bhn.b<E>> {
   public static <E> Codec<bhl<E>> a(Codec<E> $$0) {
      return bhn.b.a($$0).listOf().xmap(bhl::new, bhp::e);
   }

   public static <E> Codec<bhl<E>> b(Codec<E> $$0) {
      return asy.a(bhn.b.a($$0).listOf()).xmap(bhl::new, bhp::e);
   }

   bhl(List<? extends bhn.b<E>> $$0) {
      super($$0);
   }

   public static <E> bhl.a<E> a() {
      return new bhl.a<>();
   }

   public static <E> bhl<E> b() {
      return new bhl<>(List.of());
   }

   public static <E> bhl<E> a(E $$0) {
      return new bhl<>(List.of(bhn.a($$0, 1)));
   }

   public Optional<E> a(atw $$0) {
      return this.b($$0).map(bhn.b::b);
   }

   public static class a<E> {
      private final Builder<bhn.b<E>> a = ImmutableList.builder();

      public bhl.a<E> a(E $$0) {
         return this.a($$0, 1);
      }

      public bhl.a<E> a(E $$0, int $$1) {
         this.a.add(bhn.a($$0, $$1));
         return this;
      }

      public bhl<E> a() {
         return new bhl<>(this.a.build());
      }
   }
}
