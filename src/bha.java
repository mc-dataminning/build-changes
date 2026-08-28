import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.OptionalDynamic;

public class bha extends DataFix {
   public bha(Schema $$0) {
      super($$0, false);
   }

   private static <T> Dynamic<T> a(Dynamic<T> $$0) {
      return $$0.update("ExitPortalLocation", bbq::a);
   }

   protected TypeRewriteRule makeRule() {
      return this.fixTypeEverywhereTyped("LegacyDragonFightFix", this.getInputSchema().getType(bis.a), $$0 -> $$0.update(DSL.remainderFinder(), $$0x -> {
            OptionalDynamic<?> $$1 = $$0x.get("DragonFight");
            if ($$1.result().isPresent()) {
               return $$0x;
            } else {
               Dynamic<?> $$2 = $$0x.get("DimensionData").get("1").get("DragonFight").orElseEmptyMap();
               return $$0x.set("DragonFight", a($$2));
            }
         }));
   }
}
