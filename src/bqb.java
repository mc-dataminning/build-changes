import com.mojang.brigadier.StringReader;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import java.util.Optional;

public class bqb<T> implements bpr<StringReader, Dynamic<? extends T>> {
   private final DynamicOps<T> a;

   public bqb(DynamicOps<T> $$0) {
      this.a = $$0;
   }

   @Override
   public Optional<Dynamic<? extends T>> a(bpq<StringReader> $$0) {
      $$0.b().skipWhitespace();
      int $$1 = $$0.c();

      try {
         return Optional.of(new Dynamic(this.a, ux.b(this.a, $$0.b())));
      } catch (Exception var4) {
         $$0.a().a($$1, var4);
         return Optional.empty();
      }
   }
}
