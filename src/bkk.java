import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;

public class bkk<E extends bki> {
   private final int a;
   private final ImmutableList<E> b;

   bkk(List<? extends E> $$0) {
      this.b = ImmutableList.copyOf($$0);
      this.a = bkj.a($$0);
   }

   public static <E extends bki> bkk<E> c() {
      return new bkk<>(ImmutableList.of());
   }

   @SafeVarargs
   public static <E extends bki> bkk<E> a(E... $$0) {
      return new bkk<>(ImmutableList.copyOf($$0));
   }

   public static <E extends bki> bkk<E> a(List<E> $$0) {
      return new bkk<>($$0);
   }

   public boolean d() {
      return this.b.isEmpty();
   }

   public Optional<E> b(awp $$0) {
      if (this.a == 0) {
         return Optional.empty();
      } else {
         int $$1 = $$0.a(this.a);
         return bkj.a(this.b, $$1);
      }
   }

   public List<E> e() {
      return this.b;
   }

   public static <E extends bki> Codec<bkk<E>> c(Codec<E> $$0) {
      return $$0.listOf().xmap(bkk::a, bkk::e);
   }
}
