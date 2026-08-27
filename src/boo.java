import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;

public class boo<E extends bom> {
   private final int a;
   private final ImmutableList<E> b;

   boo(List<? extends E> $$0) {
      this.b = ImmutableList.copyOf($$0);
      this.a = bon.a($$0);
   }

   public static <E extends bom> boo<E> c() {
      return new boo<>(ImmutableList.of());
   }

   @SafeVarargs
   public static <E extends bom> boo<E> a(E... $$0) {
      return new boo<>(ImmutableList.copyOf($$0));
   }

   public static <E extends bom> boo<E> a(List<E> $$0) {
      return new boo<>($$0);
   }

   public boolean d() {
      return this.b.isEmpty();
   }

   public Optional<E> b(ayt $$0) {
      if (this.a == 0) {
         return Optional.empty();
      } else {
         int $$1 = $$0.a(this.a);
         return bon.a(this.b, $$1);
      }
   }

   public List<E> e() {
      return this.b;
   }

   public static <E extends bom> Codec<boo<E>> c(Codec<E> $$0) {
      return $$0.listOf().xmap(boo::a, boo::e);
   }
}
