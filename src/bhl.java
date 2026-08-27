import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;

public class bhl<E extends bhj> {
   private final int a;
   private final ImmutableList<E> b;

   bhl(List<? extends E> $$0) {
      this.b = ImmutableList.copyOf($$0);
      this.a = bhk.a($$0);
   }

   public static <E extends bhj> bhl<E> c() {
      return new bhl<>(ImmutableList.of());
   }

   @SafeVarargs
   public static <E extends bhj> bhl<E> a(E... $$0) {
      return new bhl<>(ImmutableList.copyOf($$0));
   }

   public static <E extends bhj> bhl<E> a(List<E> $$0) {
      return new bhl<>($$0);
   }

   public boolean d() {
      return this.b.isEmpty();
   }

   public Optional<E> b(ats $$0) {
      if (this.a == 0) {
         return Optional.empty();
      } else {
         int $$1 = $$0.a(this.a);
         return bhk.a(this.b, $$1);
      }
   }

   public List<E> e() {
      return this.b;
   }

   public static <E extends bhj> Codec<bhl<E>> c(Codec<E> $$0) {
      return $$0.listOf().xmap(bhl::a, bhl::e);
   }
}
