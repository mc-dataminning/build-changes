import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class bjp extends bht {
   public bjp(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   public void registerTypes(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, Map<String, Supplier<TypeTemplate>> $$2) {
      super.registerTypes($$0, $$1, $$2);
      $$0.registerType(
         false,
         bgh.c,
         () -> DSL.fields(
               "Level",
               DSL.optionalFields(
                  "Entities",
                  DSL.list(bgh.A.in($$0)),
                  "TileEntities",
                  DSL.list(DSL.or(bgh.s.in($$0), DSL.remainder())),
                  "TileTicks",
                  DSL.list(DSL.fields("i", bgh.C.in($$0))),
                  "Sections",
                  DSL.list(
                     DSL.optionalFields(
                        "biomes",
                        DSL.optionalFields("palette", DSL.list(bgh.K.in($$0))),
                        "block_states",
                        DSL.optionalFields("palette", DSL.list(bgh.u.in($$0)))
                     )
                  ),
                  "Structures",
                  DSL.optionalFields("Starts", DSL.compoundList(bgh.G.in($$0)))
               )
            )
      );
      $$0.registerType(false, bgh.L, () -> DSL.constType(a()));
      $$0.registerType(
         false,
         bgh.M,
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
                                 "settings", DSL.optionalFields("biome", bgh.K.in($$0), "layers", DSL.list(DSL.optionalFields("block", bgh.C.in($$0))))
                              ),
                           "minecraft:noise",
                           (Supplier<TypeTemplate>)() -> DSL.optionalFields(
                                 "biome_source",
                                 DSL.taggedChoiceLazy(
                                    "type",
                                    DSL.string(),
                                    ImmutableMap.of(
                                       "minecraft:fixed",
                                       (Supplier<TypeTemplate>)() -> DSL.fields("biome", bgh.K.in($$0)),
                                       "minecraft:multi_noise",
                                       (Supplier<TypeTemplate>)() -> DSL.or(DSL.fields("preset", bgh.L.in($$0)), DSL.list(DSL.fields("biome", bgh.K.in($$0)))),
                                       "minecraft:checkerboard",
                                       (Supplier<TypeTemplate>)() -> DSL.fields("biomes", DSL.list(bgh.K.in($$0))),
                                       "minecraft:the_end",
                                       DSL::remainder
                                    )
                                 ),
                                 "settings",
                                 DSL.or(DSL.constType(DSL.string()), DSL.optionalFields("default_block", bgh.C.in($$0), "default_fluid", bgh.C.in($$0)))
                              )
                        )
                     )
                  )
               )
            )
      );
   }
}
