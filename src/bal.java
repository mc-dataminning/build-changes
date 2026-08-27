import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;

public class bal extends DataFix {
   public bal(Schema $$0, boolean $$1) {
      super($$0, $$1);
   }

   protected TypeRewriteRule makeRule() {
      return this.fixTypeEverywhereTyped(
         "Map id fix",
         this.getInputSchema().getType(bbq.j),
         $$0 -> $$0.update(DSL.remainderFinder(), $$0x -> $$0x.createMap(ImmutableMap.of($$0x.createString("data"), $$0x)))
      );
   }
}
