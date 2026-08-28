import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.function.Supplier;

public class blt extends biw {
   public blt(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   public void registerTypes(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, Map<String, Supplier<TypeTemplate>> $$2) {
      super.registerTypes($$0, $$1, $$2);
      $$0.registerType(
         true,
         bhk.w,
         () -> DSL.optionalFields(
               new Pair[]{
                  Pair.of("minecraft:bees", DSL.list(DSL.optionalFields("entity_data", bhk.A.in($$0)))),
                  Pair.of("minecraft:block_entity_data", bhk.s.in($$0)),
                  Pair.of("minecraft:bundle_contents", DSL.list(bhk.t.in($$0))),
                  Pair.of(
                     "minecraft:can_break",
                     DSL.optionalFields("predicates", DSL.list(DSL.optionalFields("blocks", DSL.or(bhk.C.in($$0), DSL.list(bhk.C.in($$0))))))
                  ),
                  Pair.of(
                     "minecraft:can_place_on",
                     DSL.optionalFields("predicates", DSL.list(DSL.optionalFields("blocks", DSL.or(bhk.C.in($$0), DSL.list(bhk.C.in($$0))))))
                  ),
                  Pair.of("minecraft:charged_projectiles", DSL.list(bhk.t.in($$0))),
                  Pair.of("minecraft:container", DSL.list(DSL.optionalFields("item", bhk.t.in($$0)))),
                  Pair.of("minecraft:entity_data", bhk.A.in($$0)),
                  Pair.of("minecraft:pot_decorations", DSL.list(bhk.D.in($$0))),
                  Pair.of("minecraft:food", DSL.optionalFields("using_converts_to", bhk.t.in($$0)))
               }
            )
      );
   }
}
