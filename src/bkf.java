import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.function.Supplier;

public class bkf extends bhj {
   public bkf(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   public void registerTypes(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, Map<String, Supplier<TypeTemplate>> $$2) {
      super.registerTypes($$0, $$1, $$2);
      $$0.registerType(
         true,
         bfy.w,
         () -> DSL.optionalFields(
               new Pair[]{
                  Pair.of("minecraft:bees", DSL.list(DSL.optionalFields("entity_data", bfy.y.in($$0)))),
                  Pair.of("minecraft:block_entity_data", bfy.s.in($$0)),
                  Pair.of("minecraft:bundle_contents", DSL.list(bfy.t.in($$0))),
                  Pair.of(
                     "minecraft:can_break",
                     DSL.optionalFields("predicates", DSL.list(DSL.optionalFields("blocks", DSL.or(bfy.A.in($$0), DSL.list(bfy.A.in($$0))))))
                  ),
                  Pair.of(
                     "minecraft:can_place_on",
                     DSL.optionalFields("predicates", DSL.list(DSL.optionalFields("blocks", DSL.or(bfy.A.in($$0), DSL.list(bfy.A.in($$0))))))
                  ),
                  Pair.of("minecraft:charged_projectiles", DSL.list(bfy.t.in($$0))),
                  Pair.of("minecraft:container", DSL.list(DSL.optionalFields("item", bfy.t.in($$0)))),
                  Pair.of("minecraft:entity_data", bfy.y.in($$0)),
                  Pair.of("minecraft:pot_decorations", DSL.list(bfy.B.in($$0)))
               }
            )
      );
   }
}
