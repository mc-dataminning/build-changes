import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;

public class bhz<E extends bhx> {
   private final int a;
   private final ImmutableList<E> b;

   bhz(List<? extends E> $$0) {
      this.b = ImmutableList.copyOf($$0);
      this.a = bhy.a($$0);
   }

   public static <E extends bhx> bhz<E> c() {
      return new bhz<>(ImmutableList.of());
   }

   @SafeVarargs
   public static <E extends bhx> bhz<E> a(E... $$0) {
      return new bhz<>(ImmutableList.copyOf($$0));
   }

   public static <E extends bhx> bhz<E> a(List<E> $$0) {
      return new bhz<>($$0);
   }

   public boolean d() {
      return this.b.isEmpty();
   }

   public Optional<E> b(auf $$0) {
      if (this.a == 0) {
         return Optional.empty();
      } else {
         int $$1 = $$0.a(this.a);
         return bhy.a(this.b, $$1);
      }
   }

   public List<E> e() {
      return this.b;
   }

   public static <E extends bhx> Codec<bhz<E>> c(Codec<E> $$0) {
      return $$0.listOf().xmap(bhz::a, bhz::e);
   }
}
