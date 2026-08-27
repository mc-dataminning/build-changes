import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;

public class baz extends DataFix {
   public baz(Schema $$0, boolean $$1) {
      super($$0, $$1);
   }

   protected TypeRewriteRule makeRule() {
      Type<?> $$0 = this.getInputSchema().getType(bbv.D);
      return this.fixTypeEverywhereTyped(
         "ObjectiveDisplayNameFix", $$0, $$0x -> $$0x.update(DSL.remainderFinder(), $$0xx -> $$0xx.update("DisplayName", avu::a))
      );
   }
}
