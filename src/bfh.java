import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;

public class bfh<E extends bff> {
   private final int a;
   private final ImmutableList<E> b;

   bfh(List<? extends E> $$0) {
      this.b = ImmutableList.copyOf($$0);
      this.a = bfg.a($$0);
   }

   public static <E extends bff> bfh<E> c() {
      return new bfh<>(ImmutableList.of());
   }

   @SafeVarargs
   public static <E extends bff> bfh<E> a(E... $$0) {
      return new bfh<>(ImmutableList.copyOf($$0));
   }

   public static <E extends bff> bfh<E> a(List<E> $$0) {
      return new bfh<>($$0);
   }

   public boolean d() {
      return this.b.isEmpty();
   }

   public Optional<E> b(arx $$0) {
      if (this.a == 0) {
         return Optional.empty();
      } else {
         int $$1 = $$0.a(this.a);
         return bfg.a(this.b, $$1);
      }
   }

   public List<E> e() {
      return this.b;
   }

   public static <E extends bff> Codec<bfh<E>> c(Codec<E> $$0) {
      return $$0.listOf().xmap(bfh::a, bfh::e);
   }
}
