import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;

public class bfc<E extends bfa> {
   private final int a;
   private final ImmutableList<E> b;

   bfc(List<? extends E> $$0) {
      this.b = ImmutableList.copyOf($$0);
      this.a = bfb.a($$0);
   }

   public static <E extends bfa> bfc<E> c() {
      return new bfc<>(ImmutableList.of());
   }

   @SafeVarargs
   public static <E extends bfa> bfc<E> a(E... $$0) {
      return new bfc<>(ImmutableList.copyOf($$0));
   }

   public static <E extends bfa> bfc<E> a(List<E> $$0) {
      return new bfc<>($$0);
   }

   public boolean d() {
      return this.b.isEmpty();
   }

   public Optional<E> b(art $$0) {
      if (this.a == 0) {
         return Optional.empty();
      } else {
         int $$1 = $$0.a(this.a);
         return bfb.a(this.b, $$1);
      }
   }

   public List<E> e() {
      return this.b;
   }

   public static <E extends bfa> Codec<bfc<E>> c(Codec<E> $$0) {
      return $$0.listOf().xmap(bfc::a, bfc::e);
   }
}
