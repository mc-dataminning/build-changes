import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;

public class bdv extends DataFix {
   public bdv(Schema $$0, boolean $$1) {
      super($$0, $$1);
   }

   protected TypeRewriteRule makeRule() {
      return this.fixTypeEverywhereTyped(
         "Map id fix",
         this.getInputSchema().getType(bfa.j),
         $$0 -> $$0.update(DSL.remainderFinder(), $$0x -> $$0x.createMap(ImmutableMap.of($$0x.createString("data"), $$0x)))
      );
   }
}
