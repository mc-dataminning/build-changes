import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.DSL.TypeReference;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import java.util.function.Function;
import java.util.function.IntFunction;

public class baz extends bct {
   private final String a;
   private final IntFunction<String> b;

   public baz(Schema $$0, String $$1, TypeReference $$2, String $$3, String $$4, IntFunction<String> $$5) {
      super($$0, false, $$1, $$2, $$3);
      this.a = $$4;
      this.b = $$5;
   }

   private static <T> Dynamic<T> a(Dynamic<T> $$0, String $$1, String $$2, Function<Dynamic<T>, Dynamic<T>> $$3) {
      return $$0.map($$4 -> {
         DynamicOps<T> $$5 = $$0.getOps();
         Function<T, T> $$6 = $$2xx -> (T)$$3.apply(new Dynamic($$5, $$2xx)).getValue();
         return $$5.get($$4, $$1).map($$4x -> $$5.set($$4, $$2, $$6.apply((T)$$4x))).result().orElse($$4);
      });
   }

   @Override
   protected Typed<?> a(Typed<?> $$0) {
      return $$0.update(
         DSL.remainderFinder(),
         $$0x -> a(
               $$0x,
               this.a,
               "variant",
               $$0xx -> (Dynamic)DataFixUtils.orElse($$0xx.asNumber().map($$1 -> $$0xx.createString(this.b.apply($$1.intValue()))).result(), $$0xx)
            )
      );
   }
}
