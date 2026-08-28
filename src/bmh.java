import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class bmh extends bkk {
   public bmh(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   public void registerTypes(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, Map<String, Supplier<TypeTemplate>> $$2) {
      super.registerTypes($$0, $$1, $$2);
      $$0.registerType(
         false,
         biw.c,
         () -> DSL.optionalFields(
               "entities",
               DSL.list(biw.A.in($$0)),
               "block_entities",
               DSL.list(DSL.or(biw.s.in($$0), DSL.remainder())),
               "block_ticks",
               DSL.list(DSL.fields("i", biw.C.in($$0))),
               "sections",
               DSL.list(
                  DSL.optionalFields(
                     "biomes", DSL.optionalFields("palette", DSL.list(biw.K.in($$0))), "block_states", DSL.optionalFields("palette", DSL.list(biw.u.in($$0)))
                  )
               ),
               "structures",
               DSL.optionalFields("starts", DSL.compoundList(biw.G.in($$0)))
            )
      );
   }
}
