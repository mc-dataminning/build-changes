import com.mojang.brigadier.StringReader;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import javax.annotation.Nullable;

public class bqp<T> implements bqa<StringReader, Dynamic<? extends T>> {
   private final DynamicOps<T> a;
   private final uz<T> b;

   public bqp(DynamicOps<T> $$0) {
      this.a = $$0;
      this.b = uz.a($$0);
   }

   @Nullable
   public Dynamic<? extends T> b(bpz<StringReader> $$0) {
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
