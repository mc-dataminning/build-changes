import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import java.util.List;
import java.util.Optional;

public class bhm extends DataFix {
   private static final String a = "WorldGenSettings";
   private static final List<String> b = List.of(
      "RandomSeed", "generatorName", "generatorOptions", "generatorVersion", "legacy_custom_options", "MapFeatures", "BonusChest"
   );

   public bhm(Schema $$0) {
      super($$0, false);
   }

   protected TypeRewriteRule makeRule() {
      return this.fixTypeEverywhereTyped(
         "LevelLegacyWorldGenSettingsFix", this.getInputSchema().getType(bjd.a), $$0 -> $$0.update(DSL.remainderFinder(), $$0x -> {
               Dynamic<?> $$1 = $$0x.get("WorldGenSettings").orElseEmptyMap();

               for (String $$2 : b) {
                  Optional<? extends Dynamic<?>> $$3 = $$0x.get($$2).result();
                  if ($$3.isPresent()) {
                     $$0x = $$0x.remove($$2);
                     $$1 = $$1.set($$2, $$3.get());
                  }
               }

               return $$0x.set("WorldGenSettings", $$1);
            })
      );
   }
}
