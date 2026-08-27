import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;

public class bne<E extends bnc> {
   private final int a;
   private final ImmutableList<E> b;

   bne(List<? extends E> $$0) {
      this.b = ImmutableList.copyOf($$0);
      this.a = bnd.a($$0);
   }

   public static <E extends bnc> bne<E> c() {
      return new bne<>(ImmutableList.of());
   }

   @SafeVarargs
   public static <E extends bnc> bne<E> a(E... $$0) {
      return new bne<>(ImmutableList.copyOf($$0));
   }

   public static <E extends bnc> bne<E> a(List<E> $$0) {
      return new bne<>($$0);
   }

   public boolean d() {
      return this.b.isEmpty();
   }

   public Optional<E> b(ayd $$0) {
      if (this.a == 0) {
         return Optional.empty();
      } else {
         int $$1 = $$0.a(this.a);
         return bnd.a(this.b, $$1);
      }
   }

   public List<E> e() {
      return this.b;
   }

   public static <E extends bnc> Codec<bne<E>> c(Codec<E> $$0) {
      return $$0.listOf().xmap(bne::a, bne::e);
   }
}
