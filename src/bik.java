import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.DSL.TypeReference;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import java.util.Map;

public class bik extends bgh {
   private final Map<String, String> a;

   public bik(Schema $$0, String $$1, TypeReference $$2, String $$3, Map<String, String> $$4) {
      super($$0, false, $$1, $$2, $$3);
      this.a = $$4;
   }

   @Override
   protected Typed<?> a(Typed<?> $$0) {
      return $$0.update(
         DSL.remainderFinder(),
         $$0x -> $$0x.update(
               "variant", $$0xx -> (Dynamic)DataFixUtils.orElse($$0xx.asString().map($$1 -> $$0xx.createString(this.a.getOrDefault($$1, $$1))).result(), $$0xx)
            )
      );
   }
}
