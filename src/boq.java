import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;

public class boq<E> extends bou<bos.b<E>> {
   public static <E> Codec<boq<E>> a(Codec<E> $$0) {
      return bos.b.a($$0).listOf().xmap(boq::new, bou::e);
   }

   public static <E> Codec<boq<E>> b(Codec<E> $$0) {
      return axo.a(bos.b.a($$0).listOf()).xmap(boq::new, bou::e);
   }

   boq(List<? extends bos.b<E>> $$0) {
      super($$0);
   }

   public static <E> boq.a<E> a() {
      return new boq.a<>();
   }

   public static <E> boq<E> b() {
      return new boq<>(List.of());
   }

   public static <E> boq<E> a(E $$0) {
      return new boq<>(List.of(bos.a($$0, 1)));
   }

   public Optional<E> a(ayo $$0) {
      return this.b($$0).map(bos.b::b);
   }

   public static class a<E> {
      private final Builder<bos.b<E>> a = ImmutableList.builder();

      public boq.a<E> a(E $$0) {
         return this.a($$0, 1);
      }

      public boq.a<E> a(E $$0, int $$1) {
         this.a.add(bos.a($$0, $$1));
         return this;
      }

      public boq<E> a() {
         return new boq<>(this.a.build());
      }
   }
}
