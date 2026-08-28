import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class blf extends bji {
   public blf(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   public void registerTypes(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, Map<String, Supplier<TypeTemplate>> $$2) {
      super.registerTypes($$0, $$1, $$2);
      $$0.registerType(
         false,
         bhu.c,
         () -> DSL.optionalFields(
               "entities",
               DSL.list(bhu.A.in($$0)),
               "block_entities",
               DSL.list(DSL.or(bhu.s.in($$0), DSL.remainder())),
               "block_ticks",
               DSL.list(DSL.fields("i", bhu.C.in($$0))),
               "sections",
               DSL.list(
                  DSL.optionalFields(
                     "biomes", DSL.optionalFields("palette", DSL.list(bhu.K.in($$0))), "block_states", DSL.optionalFields("palette", DSL.list(bhu.u.in($$0)))
                  )
               ),
               "structures",
               DSL.optionalFields("starts", DSL.compoundList(bhu.G.in($$0)))
            )
      );
   }
}
