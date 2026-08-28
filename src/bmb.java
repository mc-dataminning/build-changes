import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.function.Supplier;

public class bmb extends biz {
   public bmb(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   public void registerTypes(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, Map<String, Supplier<TypeTemplate>> $$2) {
      super.registerTypes($$0, $$1, $$2);
      $$0.registerType(
         true,
         bhm.w,
         () -> DSL.optionalFields(
               new Pair[]{
                  Pair.of("minecraft:bees", DSL.list(DSL.optionalFields("entity_data", bhm.A.in($$0)))),
                  Pair.of("minecraft:block_entity_data", bhm.s.in($$0)),
                  Pair.of("minecraft:bundle_contents", DSL.list(bhm.t.in($$0))),
                  Pair.of(
                     "minecraft:can_break",
                     DSL.optionalFields("predicates", DSL.list(DSL.optionalFields("blocks", DSL.or(bhm.C.in($$0), DSL.list(bhm.C.in($$0))))))
                  ),
                  Pair.of(
                     "minecraft:can_place_on",
                     DSL.optionalFields("predicates", DSL.list(DSL.optionalFields("blocks", DSL.or(bhm.C.in($$0), DSL.list(bhm.C.in($$0))))))
                  ),
                  Pair.of("minecraft:charged_projectiles", DSL.list(bhm.t.in($$0))),
                  Pair.of("minecraft:container", DSL.list(DSL.optionalFields("item", bhm.t.in($$0)))),
                  Pair.of("minecraft:entity_data", bhm.A.in($$0)),
                  Pair.of("minecraft:pot_decorations", DSL.list(bhm.D.in($$0))),
                  Pair.of("minecraft:use_remainder", bhm.t.in($$0))
               }
            )
      );
   }
}
