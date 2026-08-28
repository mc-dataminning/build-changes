import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class blj extends bjm {
   public blj(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   public void registerTypes(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, Map<String, Supplier<TypeTemplate>> $$2) {
      super.registerTypes($$0, $$1, $$2);
      $$0.registerType(
         false,
         bhy.c,
         () -> DSL.optionalFields(
               "entities",
               DSL.list(bhy.A.in($$0)),
               "block_entities",
               DSL.list(DSL.or(bhy.s.in($$0), DSL.remainder())),
               "block_ticks",
               DSL.list(DSL.fields("i", bhy.C.in($$0))),
               "sections",
               DSL.list(
                  DSL.optionalFields(
                     "biomes", DSL.optionalFields("palette", DSL.list(bhy.K.in($$0))), "block_states", DSL.optionalFields("palette", DSL.list(bhy.u.in($$0)))
                  )
               ),
               "structures",
               DSL.optionalFields("starts", DSL.compoundList(bhy.G.in($$0)))
            )
      );
   }
}
