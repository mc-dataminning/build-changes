import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;

public class bkc extends DataFix {
   public bkc(Schema $$0) {
      super($$0, false);
   }

   protected TypeRewriteRule makeRule() {
      Type<?> $$0 = this.getInputSchema().getType(biq.O);
      OpticFinder<?> $$1 = $$0.findField("dimensions");
      return this.fixTypeEverywhereTyped(
         "WorldGenSettingsDisallowOldCustomWorldsFix_" + this.getOutputSchema().getVersionKey(), $$0, $$1x -> $$1x.updateTyped($$1, $$0xx -> {
               $$0xx.write().map($$0xxx -> $$0xxx.getMapValues().map($$0xxxx -> {
                     $$0xxxx.forEach(($$0xxxxx, $$1xx) -> {
                        if ($$1xx.get("type").asString().result().isEmpty()) {
                           throw new ui("Unable load old custom worlds.");
                        }
                     });
                     return $$0xxxx;
                  }));
               return $$0xx;
            })
      );
   }
}
