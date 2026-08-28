import com.mojang.brigadier.StringReader;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import javax.annotation.Nullable;

public class bqr<T> implements bqc<StringReader, Dynamic<? extends T>> {
   private final DynamicOps<T> a;
   private final vb<T> b;

   public bqr(DynamicOps<T> $$0) {
      this.a = $$0;
      this.b = vb.a($$0);
   }

   @Nullable
   public Dynamic<? extends T> b(bqb<StringReader> $$0) {
      $$0.f().skipWhitespace();
      int $$1 = $$0.g();

      try {
         return new Dynamic(this.a, this.b.b($$0.f()));
      } catch (Exception var4) {
         $$0.b().a($$1, var4);
         return null;
      }
   }
}
