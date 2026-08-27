import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;

public class bhh<E> extends bhl<bhj.b<E>> {
   public static <E> Codec<bhh<E>> a(Codec<E> $$0) {
      return bhj.b.a($$0).listOf().xmap(bhh::new, bhl::e);
   }

   public static <E> Codec<bhh<E>> b(Codec<E> $$0) {
      return asu.a(bhj.b.a($$0).listOf()).xmap(bhh::new, bhl::e);
   }

   bhh(List<? extends bhj.b<E>> $$0) {
      super($$0);
   }

   public static <E> bhh.a<E> a() {
      return new bhh.a<>();
   }

   public static <E> bhh<E> b() {
      return new bhh<>(List.of());
   }

   public static <E> bhh<E> a(E $$0) {
      return new bhh<>(List.of(bhj.a($$0, 1)));
   }

   public Optional<E> a(ats $$0) {
      return this.b($$0).map(bhj.b::b);
   }

   public static class a<E> {
      private final Builder<bhj.b<E>> a = ImmutableList.builder();

      public bhh.a<E> a(E $$0) {
         return this.a($$0, 1);
      }

      public bhh.a<E> a(E $$0, int $$1) {
         this.a.add(bhj.a($$0, $$1));
         return this;
      }

      public bhh<E> a() {
         return new bhh<>(this.a.build());
      }
   }
}
