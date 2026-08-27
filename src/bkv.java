import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;

public class bkv<E> extends bkz<bkx.b<E>> {
   public static <E> Codec<bkv<E>> a(Codec<E> $$0) {
      return bkx.b.a($$0).listOf().xmap(bkv::new, bkz::e);
   }

   public static <E> Codec<bkv<E>> b(Codec<E> $$0) {
      return avu.a(bkx.b.a($$0).listOf()).xmap(bkv::new, bkz::e);
   }

   bkv(List<? extends bkx.b<E>> $$0) {
      super($$0);
   }

   public static <E> bkv.a<E> a() {
      return new bkv.a<>();
   }

   public static <E> bkv<E> b() {
      return new bkv<>(List.of());
   }

   public static <E> bkv<E> a(E $$0) {
      return new bkv<>(List.of(bkx.a($$0, 1)));
   }

   public Optional<E> a(awt $$0) {
      return this.b($$0).map(bkx.b::b);
   }

   public static class a<E> {
      private final Builder<bkx.b<E>> a = ImmutableList.builder();

      public bkv.a<E> a(E $$0) {
         return this.a($$0, 1);
      }

      public bkv.a<E> a(E $$0, int $$1) {
         this.a.add(bkx.a($$0, $$1));
         return this;
      }

      public bkv<E> a() {
         return new bkv<>(this.a.build());
      }
   }
}
