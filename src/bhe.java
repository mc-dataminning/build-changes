import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;

public class bhe<E extends bhc> {
   private final int a;
   private final ImmutableList<E> b;

   bhe(List<? extends E> $$0) {
      this.b = ImmutableList.copyOf($$0);
      this.a = bhd.a($$0);
   }

   public static <E extends bhc> bhe<E> c() {
      return new bhe<>(ImmutableList.of());
   }

   @SafeVarargs
   public static <E extends bhc> bhe<E> a(E... $$0) {
      return new bhe<>(ImmutableList.copyOf($$0));
   }

   public static <E extends bhc> bhe<E> a(List<E> $$0) {
      return new bhe<>($$0);
   }

   public boolean d() {
      return this.b.isEmpty();
   }

   public Optional<E> b(ato $$0) {
      if (this.a == 0) {
         return Optional.empty();
      } else {
         int $$1 = $$0.a(this.a);
         return bhd.a(this.b, $$1);
      }
   }

   public List<E> e() {
      return this.b;
   }

   public static <E extends bhc> Codec<bhe<E>> c(Codec<E> $$0) {
      return $$0.listOf().xmap(bhe::a, bhe::e);
   }
}
