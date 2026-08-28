import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

public class bpy<E extends bpw> {
   private final int a;
   private final ImmutableList<E> b;

   bpy(List<? extends E> $$0) {
      this.b = ImmutableList.copyOf($$0);
      this.a = bpx.a($$0);
   }

   public static <E extends bpw> bpy<E> c() {
      return new bpy<>(ImmutableList.of());
   }

   @SafeVarargs
   public static <E extends bpw> bpy<E> a(E... $$0) {
      return new bpy<>(ImmutableList.copyOf($$0));
   }

   public static <E extends bpw> bpy<E> a(List<E> $$0) {
      return new bpy<>($$0);
   }

   public boolean d() {
      return this.b.isEmpty();
   }

   public Optional<E> b(azk $$0) {
      if (this.a == 0) {
         return Optional.empty();
      } else {
         int $$1 = $$0.a(this.a);
         return bpx.a(this.b, $$1);
      }
   }

   public List<E> e() {
      return this.b;
   }

   public static <E extends bpw> Codec<bpy<E>> c(Codec<E> $$0) {
      return $$0.listOf().xmap(bpy::a, bpy::e);
   }

   @Override
   public boolean equals(@Nullable Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         bpy<?> $$1 = (bpy<?>)$$0;
         return this.a == $$1.a && Objects.equals(this.b, $$1.b);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.a, this.b);
   }
}
