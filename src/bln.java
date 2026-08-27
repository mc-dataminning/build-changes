import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;

public class bln<E> extends blr<blp.b<E>> {
   public static <E> Codec<bln<E>> a(Codec<E> $$0) {
      return blp.b.a($$0).listOf().xmap(bln::new, blr::e);
   }

   public static <E> Codec<bln<E>> b(Codec<E> $$0) {
      return awe.a(blp.b.a($$0).listOf()).xmap(bln::new, blr::e);
   }

   bln(List<? extends blp.b<E>> $$0) {
      super($$0);
   }

   public static <E> bln.a<E> a() {
      return new bln.a<>();
   }

   public static <E> bln<E> b() {
      return new bln<>(List.of());
   }

   public static <E> bln<E> a(E $$0) {
      return new bln<>(List.of(blp.a($$0, 1)));
   }

   public Optional<E> a(axd $$0) {
      return this.b($$0).map(blp.b::b);
   }

   public static class a<E> {
      private final Builder<blp.b<E>> a = ImmutableList.builder();

      public bln.a<E> a(E $$0) {
         return this.a($$0, 1);
      }

      public bln.a<E> a(E $$0, int $$1) {
         this.a.add(blp.a($$0, $$1));
         return this;
      }

      public bln<E> a() {
         return new bln<>(this.a.build());
      }
   }
}
