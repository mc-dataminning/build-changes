import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;

public class boe<E> extends boi<bog.b<E>> {
   public static <E> Codec<boe<E>> a(Codec<E> $$0) {
      return bog.b.a($$0).listOf().xmap(boe::new, boi::e);
   }

   public static <E> Codec<boe<E>> b(Codec<E> $$0) {
      return axm.a(bog.b.a($$0).listOf()).xmap(boe::new, boi::e);
   }

   boe(List<? extends bog.b<E>> $$0) {
      super($$0);
   }

   public static <E> boe.a<E> a() {
      return new boe.a<>();
   }

   public static <E> boe<E> b() {
      return new boe<>(List.of());
   }

   public static <E> boe<E> a(E $$0) {
      return new boe<>(List.of(bog.a($$0, 1)));
   }

   public Optional<E> a(ayk $$0) {
      return this.b($$0).map(bog.b::b);
   }

   public static class a<E> {
      private final Builder<bog.b<E>> a = ImmutableList.builder();

      public boe.a<E> a(E $$0) {
         return this.a($$0, 1);
      }

      public boe.a<E> a(E $$0, int $$1) {
         this.a.add(bog.a($$0, $$1));
         return this;
      }

      public boe<E> a() {
         return new boe<>(this.a.build());
      }
   }
}
