import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.OptionalDynamic;
import java.util.stream.Stream;
import org.apache.commons.lang3.mutable.MutableBoolean;

public class bhk extends DataFix {
   private static final String b = "WorldGenSettingsHeightAndBiomeFix";
   public static final String a = "has_increased_height_already";

   public bhk(Schema $$0) {
      super($$0, true);
   }

   protected TypeRewriteRule makeRule() {
      Type<?> $$0 = this.getInputSchema().getType(bgf.K);
      OpticFinder<?> $$1 = $$0.findField("dimensions");
      Type<?> $$2 = this.getOutputSchema().getType(bgf.K);
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
                  $$3xx -> ad.a(
                        $$3xx,
                        $$3,
                        $$2xxx -> $$2xxx.update(
                              "minecraft:overworld",
                              $$2xxxx -> $$2xxxx.update(
                                    "generator",
                                    $$2xxxxx -> {
                                       String $$3xxx = $$2xxxxx.get("type").asString("");
                                       if ("minecraft:noise".equals($$3xxx)) {
                                          MutableBoolean $$4x = new MutableBoolean();
                                          $$2xxxxx = $$2xxxxx.update(
                                             "biome_source",
                                             $$2xxxxxx -> {
                                                String $$3xxxx = $$2xxxxxx.get("type").asString("");
                                                if ("minecraft:vanilla_layered".equals($$3xxxx) || $$4 && "minecraft:multi_noise".equals($$3xxxx)) {
                                                   if ($$2xxxxxx.get("large_biomes").asBoolean(false)) {
                                                      $$4x.setTrue();
                                                   }

                                                   return $$2xxxxxx.createMap(
                                                      ImmutableMap.of(
                                                         $$2xxxxxx.createString("preset"),
                                                         $$2xxxxxx.createString("minecraft:overworld"),
                                                         $$2xxxxxx.createString("type"),
                                                         $$2xxxxxx.createString("minecraft:multi_noise")
                                                      )
                                                   );
                                                } else {
                                                   return $$2xxxxxx;
                                                }
                                             }
                                          );
                                          return $$4x.booleanValue()
                                             ? $$2xxxxx.update(
                                                "settings",
                                                $$0xxxxxx -> "minecraft:overworld".equals($$0xxxxxx.asString(""))
                                                      ? $$0xxxxxx.createString("minecraft:large_biomes")
                                                      : $$0xxxxxx
                                             )
                                             : $$2xxxxx;
                                       } else if ("minecraft:flat".equals($$3xxx)) {
                                          return $$5 ? $$2xxxxx : $$2xxxxx.update("settings", $$0xxxxxx -> $$0xxxxxx.update("layers", bhk::a));
                                       } else {
                                          return $$2xxxxx;
                                       }
                                    }
                                 )
                           )
                     )
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
