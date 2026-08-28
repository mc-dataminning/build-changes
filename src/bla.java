import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.function.Supplier;

public class bla extends bid {
   public bla(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   public void registerTypes(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, Map<String, Supplier<TypeTemplate>> $$2) {
      super.registerTypes($$0, $$1, $$2);
      $$0.registerType(
         true,
         bgr.w,
         () -> DSL.optionalFields(
               new Pair[]{
                  Pair.of("minecraft:bees", DSL.list(DSL.optionalFields("entity_data", bgr.A.in($$0)))),
                  Pair.of("minecraft:block_entity_data", bgr.s.in($$0)),
                  Pair.of("minecraft:bundle_contents", DSL.list(bgr.t.in($$0))),
                  Pair.of(
                     "minecraft:can_break",
                     DSL.optionalFields("predicates", DSL.list(DSL.optionalFields("blocks", DSL.or(bgr.C.in($$0), DSL.list(bgr.C.in($$0))))))
                  ),
                  Pair.of(
                     "minecraft:can_place_on",
                     DSL.optionalFields("predicates", DSL.list(DSL.optionalFields("blocks", DSL.or(bgr.C.in($$0), DSL.list(bgr.C.in($$0))))))
                  ),
                  Pair.of("minecraft:charged_projectiles", DSL.list(bgr.t.in($$0))),
                  Pair.of("minecraft:container", DSL.list(DSL.optionalFields("item", bgr.t.in($$0)))),
                  Pair.of("minecraft:entity_data", bgr.A.in($$0)),
                  Pair.of("minecraft:pot_decorations", DSL.list(bgr.D.in($$0))),
                  Pair.of("minecraft:food", DSL.optionalFields("using_converts_to", bgr.t.in($$0)))
               }
            )
      );
   }
}
