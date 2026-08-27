import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;

public class bhp<E extends bhn> {
   private final int a;
   private final ImmutableList<E> b;

   bhp(List<? extends E> $$0) {
      this.b = ImmutableList.copyOf($$0);
      this.a = bho.a($$0);
   }

   public static <E extends bhn> bhp<E> c() {
      return new bhp<>(ImmutableList.of());
   }

   @SafeVarargs
   public static <E extends bhn> bhp<E> a(E... $$0) {
      return new bhp<>(ImmutableList.copyOf($$0));
   }

   public static <E extends bhn> bhp<E> a(List<E> $$0) {
      return new bhp<>($$0);
   }

   public boolean d() {
      return this.b.isEmpty();
   }

   public Optional<E> b(atw $$0) {
      if (this.a == 0) {
         return Optional.empty();
      } else {
         int $$1 = $$0.a(this.a);
         return bho.a(this.b, $$1);
      }
   }

   public List<E> e() {
      return this.b;
   }

   public static <E extends bhn> Codec<bhp<E>> c(Codec<E> $$0) {
      return $$0.listOf().xmap(bhp::a, bhp::e);
   }
}
