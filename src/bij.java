import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;

public class bij extends DataFix {
   public bij(Schema $$0) {
      super($$0, false);
   }

   public TypeRewriteRule makeRule() {
      return this.fixTypeEverywhereTyped(
         "OptionsProgrammerArtFix",
         this.getInputSchema().getType(biz.e),
         $$0 -> $$0.update(DSL.remainderFinder(), $$0x -> $$0x.update("resourcePacks", this::a).update("incompatibleResourcePacks", this::a))
      );
   }

   private <T> Dynamic<T> a(Dynamic<T> $$0) {
      return $$0.asString().result().map($$1 -> $$0.createString($$1.replace("\"programer_art\"", "\"programmer_art\""))).orElse($$0);
   }
}
