import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;

public class bmt<E extends bmr> {
   private final int a;
   private final ImmutableList<E> b;

   bmt(List<? extends E> $$0) {
      this.b = ImmutableList.copyOf($$0);
      this.a = bms.a($$0);
   }

   public static <E extends bmr> bmt<E> c() {
      return new bmt<>(ImmutableList.of());
   }

   @SafeVarargs
   public static <E extends bmr> bmt<E> a(E... $$0) {
      return new bmt<>(ImmutableList.copyOf($$0));
   }

   public static <E extends bmr> bmt<E> a(List<E> $$0) {
      return new bmt<>($$0);
   }

   public boolean d() {
      return this.b.isEmpty();
   }

   public Optional<E> b(axt $$0) {
      if (this.a == 0) {
         return Optional.empty();
      } else {
         int $$1 = $$0.a(this.a);
         return bms.a(this.b, $$1);
      }
   }

   public List<E> e() {
      return this.b;
   }

   public static <E extends bmr> Codec<bmt<E>> c(Codec<E> $$0) {
      return $$0.listOf().xmap(bmt::a, bmt::e);
   }
}
