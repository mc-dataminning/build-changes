import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.OptionalDynamic;

public class baw extends DataFix {
   public baw(Schema $$0) {
      super($$0, false);
   }

   protected TypeRewriteRule makeRule() {
      Type<?> $$0 = this.getOutputSchema().getType(bgs.c);
      return this.fixTypeEverywhereTyped(
         "BlendingDataRemoveFromNetherEndFix", $$0, $$0x -> $$0x.update(DSL.remainderFinder(), $$0xx -> a($$0xx, $$0xx.get("__context")))
      );
   }

   private static Dynamic<?> a(Dynamic<?> $$0, OptionalDynamic<?> $$1) {
      boolean $$2 = "minecraft:overworld".equals($$1.get("dimension").asString().result().orElse(""));
      return $$2 ? $$0 : $$0.remove("blending_data");
   }
}
