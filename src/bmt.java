import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class bmt extends bks {
   public bmt(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   public void registerTypes(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, Map<String, Supplier<TypeTemplate>> $$2) {
      super.registerTypes($$0, $$1, $$2);
      $$0.registerType(
         false,
         bix.c,
         () -> DSL.optionalFields(
               "entities",
               DSL.list(bix.C.in($$0)),
               "block_entities",
               DSL.list(DSL.or(bix.s.in($$0), DSL.remainder())),
               "block_ticks",
               DSL.list(DSL.fields("i", bix.E.in($$0))),
               "sections",
               DSL.list(
                  DSL.optionalFields(
                     "biomes", DSL.optionalFields("palette", DSL.list(bix.M.in($$0))), "block_states", DSL.optionalFields("palette", DSL.list(bix.u.in($$0)))
                  )
               ),
               "structures",
               DSL.optionalFields("starts", DSL.compoundList(bix.I.in($$0)))
            )
      );
   }
}
