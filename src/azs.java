import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.OptionalDynamic;
import java.util.stream.Stream;
import org.apache.commons.lang3.mutable.MutableBoolean;

public class azs extends DataFix {
   private static final String b = "WorldGenSettingsHeightAndBiomeFix";
   public static final String a = "has_increased_height_already";

   public azs(Schema $$0) {
      super($$0, true);
   }

   protected TypeRewriteRule makeRule() {
      Type<?> $$0 = this.getInputSchema().getType(ayp.I);
      OpticFinder<?> $$1 = $$0.findField("dimensions");
      Type<?> $$2 = this.getOutputSchema().getType(ayp.I);
      Type<?> $$3 = $$2.findFieldType("dimensions");
      return this.fixTypeEverywhereTyped(
         "WorldGenSettingsHeightAndBiomeFix",
         $$0,
         $$2,
         $$2x -> {
            OptionalDynamic<?> $$3x = ((Dynamic)$$2x.get(DSL.remainderFinder())).get("has_increased_height_already");
            boolean $$4 = $$3x.result().isEmpty();
            boolean $$5 = $$3x.asBoolean(true);
            return $$2x.update(DSL.remainderFinder(), $$0xx -> $$0xx.remove("has_increased_height_already"))
               .updateTyped(
                  $$1,
                  $$3,
                  $$3xx -> {
                     Dynamic<?> $$4x = (Dynamic<?>)$$3xx.write().result().orElseThrow(() -> new IllegalStateException("Malformed WorldGenSettings.dimensions"));
                     $$4x = $$4x.update(
                        "minecraft:overworld",
                        $$2xxx -> $$2xxx.update(
                              "generator",
                              $$2xxxx -> {
                                 String $$3xxx = $$2xxxx.get("type").asString("");
                                 if ("minecraft:noise".equals($$3xxx)) {
                                    MutableBoolean $$4xx = new MutableBoolean();
                                    $$2xxxx = $$2xxxx.update(
                                       "biome_source",
                                       $$2xxxxx -> {
                                          String $$3xxxx = $$2xxxxx.get("type").asString("");
                                          if ("minecraft:vanilla_layered".equals($$3xxxx) || $$4 && "minecraft:multi_noise".equals($$3xxxx)) {
                                             if ($$2xxxxx.get("large_biomes").asBoolean(false)) {
                                                $$4xx.setTrue();
                                             }

                                             return $$2xxxxx.createMap(
                                                ImmutableMap.of(
                                                   $$2xxxxx.createString("preset"),
                                                   $$2xxxxx.createString("minecraft:overworld"),
                                                   $$2xxxxx.createString("type"),
                                                   $$2xxxxx.createString("minecraft:multi_noise")
                                                )
                                             );
                                          } else {
                                             return $$2xxxxx;
                                          }
                                       }
                                    );
                                    return $$4xx.booleanValue()
                                       ? $$2xxxx.update(
                                          "settings",
                                          $$0xxxxx -> "minecraft:overworld".equals($$0xxxxx.asString(""))
                                                ? $$0xxxxx.createString("minecraft:large_biomes")
                                                : $$0xxxxx
                                       )
                                       : $$2xxxx;
                                 } else if ("minecraft:flat".equals($$3xxx)) {
                                    return $$5 ? $$2xxxx : $$2xxxx.update("settings", $$0xxxxx -> $$0xxxxx.update("layers", azs::a));
                                 } else {
                                    return $$2xxxx;
                                 }
                              }
                           )
                     );
                     return (Typed)((Pair)$$3.readTyped($$4x)
                           .result()
                           .orElseThrow(() -> new IllegalStateException("WorldGenSettingsHeightAndBiomeFix failed.")))
                        .getFirst();
                  }
               );
         }
      );
   }

   private static Dynamic<?> a(Dynamic<?> $$0) {
      Dynamic<?> $$1 = $$0.createMap(
         ImmutableMap.of($$0.createString("height"), $$0.createInt(64), $$0.createString("block"), $$0.createString("minecraft:air"))
      );
      return $$0.createList(Stream.concat(Stream.of($$1), $$0.asStream()));
   }
}
