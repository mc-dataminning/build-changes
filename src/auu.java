import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import java.util.Optional;

public class auu extends DataFix {
   public auu(Schema $$0, boolean $$1) {
      super($$0, $$1);
   }

   protected TypeRewriteRule makeRule() {
      Type<?> $$0 = this.getInputSchema().getType(avw.h);
      OpticFinder<?> $$1 = $$0.findField("data");
      return this.fixTypeEverywhereTyped("Map id fix", $$0, $$1x -> {
         Optional<? extends Typed<?>> $$2 = $$1x.getOptionalTyped($$1);
         return $$2.isPresent() ? $$1x : $$1x.update(DSL.remainderFinder(), $$0xx -> $$0xx.createMap(ImmutableMap.of($$0xx.createString("data"), $$0xx)));
      });
   }
}
