import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class bjm extends bhp {
   public bjm(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   public void registerTypes(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, Map<String, Supplier<TypeTemplate>> $$2) {
      super.registerTypes($$0, $$1, $$2);
      $$0.registerType(
         false,
         bgd.c,
         () -> DSL.optionalFields(
               "entities",
               DSL.list(bgd.A.in($$0)),
               "block_entities",
               DSL.list(DSL.or(bgd.s.in($$0), DSL.remainder())),
               "block_ticks",
               DSL.list(DSL.fields("i", bgd.C.in($$0))),
               "sections",
               DSL.list(
                  DSL.optionalFields(
                     "biomes", DSL.optionalFields("palette", DSL.list(bgd.K.in($$0))), "block_states", DSL.optionalFields("palette", DSL.list(bgd.u.in($$0)))
                  )
               ),
               "structures",
               DSL.optionalFields("starts", DSL.compoundList(bgd.G.in($$0)))
            )
      );
   }
}
