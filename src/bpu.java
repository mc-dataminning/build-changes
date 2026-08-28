import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;

public class bpu<E> extends bpy<bpw.b<E>> {
   public static <E> Codec<bpu<E>> a(Codec<E> $$0) {
      return bpw.b.a($$0).listOf().xmap(bpu::new, bpy::e);
   }

   public static <E> Codec<bpu<E>> b(Codec<E> $$0) {
      return ayl.a(bpw.b.a($$0).listOf()).xmap(bpu::new, bpy::e);
   }

   bpu(List<? extends bpw.b<E>> $$0) {
      super($$0);
   }

   public static <E> bpu.a<E> a() {
      return new bpu.a<>();
   }

   public static <E> bpu<E> b() {
      return new bpu<>(List.of());
   }

   public static <E> bpu<E> a(E $$0) {
      return new bpu<>(List.of(bpw.a($$0, 1)));
   }

   public Optional<E> a(azk $$0) {
      return this.b($$0).map(bpw.b::b);
   }

   public static class a<E> {
      private final Builder<bpw.b<E>> a = ImmutableList.builder();

      public bpu.a<E> a(E $$0) {
         return this.a($$0, 1);
      }

      public bpu.a<E> a(E $$0, int $$1) {
         this.a.add(bpw.a($$0, $$1));
         return this;
      }

      public bpu<E> a() {
         return new bpu<>(this.a.build());
      }
   }
}
