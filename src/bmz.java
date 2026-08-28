import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class bmz extends bky {
   public bmz(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   public void registerTypes(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, Map<String, Supplier<TypeTemplate>> $$2) {
      super.registerTypes($$0, $$1, $$2);
      $$0.registerType(
         false,
         bjd.c,
         () -> DSL.optionalFields(
               "entities",
               DSL.list(bjd.C.in($$0)),
               "block_entities",
               DSL.list(DSL.or(bjd.s.in($$0), DSL.remainder())),
               "block_ticks",
               DSL.list(DSL.fields("i", bjd.E.in($$0))),
               "sections",
               DSL.list(
                  DSL.optionalFields(
                     "biomes", DSL.optionalFields("palette", DSL.list(bjd.M.in($$0))), "block_states", DSL.optionalFields("palette", DSL.list(bjd.u.in($$0)))
                  )
               ),
               "structures",
               DSL.optionalFields("starts", DSL.compoundList(bjd.I.in($$0)))
            )
      );
   }
}
