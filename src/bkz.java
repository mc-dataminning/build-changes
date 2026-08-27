import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;

public class bkz<E extends bkx> {
   private final int a;
   private final ImmutableList<E> b;

   bkz(List<? extends E> $$0) {
      this.b = ImmutableList.copyOf($$0);
      this.a = bky.a($$0);
   }

   public static <E extends bkx> bkz<E> c() {
      return new bkz<>(ImmutableList.of());
   }

   @SafeVarargs
   public static <E extends bkx> bkz<E> a(E... $$0) {
      return new bkz<>(ImmutableList.copyOf($$0));
   }

   public static <E extends bkx> bkz<E> a(List<E> $$0) {
      return new bkz<>($$0);
   }

   public boolean d() {
      return this.b.isEmpty();
   }

   public Optional<E> b(awt $$0) {
      if (this.a == 0) {
         return Optional.empty();
      } else {
         int $$1 = $$0.a(this.a);
         return bky.a(this.b, $$1);
      }
   }

   public List<E> e() {
      return this.b;
   }

   public static <E extends bkx> Codec<bkz<E>> c(Codec<E> $$0) {
      return $$0.listOf().xmap(bkz::a, bkz::e);
   }
}
