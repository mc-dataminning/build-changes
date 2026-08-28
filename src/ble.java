import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class ble extends bji {
   public ble(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   public void registerTypes(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, Map<String, Supplier<TypeTemplate>> $$2) {
      super.registerTypes($$0, $$1, $$2);
      $$0.registerType(
         false,
         bhu.c,
         () -> DSL.fields(
               "Level",
               DSL.optionalFields(
                  "Entities",
                  DSL.list(bhu.A.in($$0)),
                  "TileEntities",
                  DSL.list(DSL.or(bhu.s.in($$0), DSL.remainder())),
                  "TileTicks",
                  DSL.list(DSL.fields("i", bhu.C.in($$0))),
                  "Sections",
                  DSL.list(
                     DSL.optionalFields(
                        "biomes",
                        DSL.optionalFields("palette", DSL.list(bhu.K.in($$0))),
                        "block_states",
                        DSL.optionalFields("palette", DSL.list(bhu.u.in($$0)))
                     )
                  ),
                  "Structures",
                  DSL.optionalFields("Starts", DSL.compoundList(bhu.G.in($$0)))
               )
            )
      );
      $$0.registerType(false, bhu.L, () -> DSL.constType(a()));
      $$0.registerType(
         false,
         bhu.M,
         () -> DSL.fields(
               "dimensions",
               DSL.compoundList(
                  DSL.constType(a()),
                  DSL.fields(
                     "generator",
                     DSL.taggedChoiceLazy(
                        "type",
                        DSL.string(),
                        ImmutableMap.of(
                           "minecraft:debug",
                           DSL::remainder,
                           "minecraft:flat",
                           (Supplier<TypeTemplate>)() -> DSL.optionalFields(
                                 "settings", DSL.optionalFields("biome", bhu.K.in($$0), "layers", DSL.list(DSL.optionalFields("block", bhu.C.in($$0))))
                              ),
                           "minecraft:noise",
                           (Supplier<TypeTemplate>)() -> DSL.optionalFields(
                                 "biome_source",
                                 DSL.taggedChoiceLazy(
                                    "type",
                                    DSL.string(),
                                    ImmutableMap.of(
                                       "minecraft:fixed",
                                       (Supplier<TypeTemplate>)() -> DSL.fields("biome", bhu.K.in($$0)),
                                       "minecraft:multi_noise",
                                       (Supplier<TypeTemplate>)() -> DSL.or(DSL.fields("preset", bhu.L.in($$0)), DSL.list(DSL.fields("biome", bhu.K.in($$0)))),
                                       "minecraft:checkerboard",
                                       (Supplier<TypeTemplate>)() -> DSL.fields("biomes", DSL.list(bhu.K.in($$0))),
                                       "minecraft:the_end",
                                       DSL::remainder
                                    )
                                 ),
                                 "settings",
                                 DSL.or(DSL.constType(DSL.string()), DSL.optionalFields("default_block", bhu.C.in($$0), "default_fluid", bhu.C.in($$0)))
                              )
                        )
                     )
                  )
               )
            )
      );
   }
}
