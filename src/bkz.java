import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.function.Supplier;

public class bkz extends bic {
   public bkz(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   public void registerTypes(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, Map<String, Supplier<TypeTemplate>> $$2) {
      super.registerTypes($$0, $$1, $$2);
      $$0.registerType(
         true,
         bgq.w,
         () -> DSL.optionalFields(
               new Pair[]{
                  Pair.of("minecraft:bees", DSL.list(DSL.optionalFields("entity_data", bgq.A.in($$0)))),
                  Pair.of("minecraft:block_entity_data", bgq.s.in($$0)),
                  Pair.of("minecraft:bundle_contents", DSL.list(bgq.t.in($$0))),
                  Pair.of(
                     "minecraft:can_break",
                     DSL.optionalFields("predicates", DSL.list(DSL.optionalFields("blocks", DSL.or(bgq.C.in($$0), DSL.list(bgq.C.in($$0))))))
                  ),
                  Pair.of(
                     "minecraft:can_place_on",
                     DSL.optionalFields("predicates", DSL.list(DSL.optionalFields("blocks", DSL.or(bgq.C.in($$0), DSL.list(bgq.C.in($$0))))))
                  ),
                  Pair.of("minecraft:charged_projectiles", DSL.list(bgq.t.in($$0))),
                  Pair.of("minecraft:container", DSL.list(DSL.optionalFields("item", bgq.t.in($$0)))),
                  Pair.of("minecraft:entity_data", bgq.A.in($$0)),
                  Pair.of("minecraft:pot_decorations", DSL.list(bgq.D.in($$0))),
                  Pair.of("minecraft:food", DSL.optionalFields("using_converts_to", bgq.t.in($$0)))
               }
            )
      );
   }
}
